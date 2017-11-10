import sbt.Keys._
import sbt._
import sbt.{Credentials, Path}

object CommonSettings {
    object settingValues {

        val version = "0.9.4-SNAPSHOT"
        val scalaVersion = "2.12.4"
        val organization = "com.simplesys"
        val scalacOptions = Seq(
            "-feature",
            "-language:higherKinds",
            "-language:implicitConversions",
            "-language:postfixOps",
            "-deprecation",
            "-unchecked")
    }


    val defaultSettings = {
        import sbt.Keys._
        Seq(
            version := settingValues.version,
            scalacOptions := settingValues.scalacOptions,
            organization := settingValues.organization
        )
    }

    val publishSettings = Seq(
        publishArtifact in Compile := true,
        publishArtifact in Test := false,
        publishTo := {
            val corporateRepo = "http://toucan.simplesys.lan/"
            if (isSnapshot.value)
                Some("snapshots" at corporateRepo + "artifactory/libs-snapshot-local")
            else
                Some("releases" at corporateRepo + "artifactory/libs-release-local")
        },
        credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
    )

    val noPublishSettings = Seq(
        publishArtifact := false,
        packagedArtifacts := Map.empty,
        publish := {},
        publishLocal := {}
    )
}
