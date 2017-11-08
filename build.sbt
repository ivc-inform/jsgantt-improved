import org.scalajs.sbtplugin.ScalaJSPlugin

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
      libraryDependencies ++= Seq(
          "org.scala-js" %%% "scalajs-dom" % "0.9.4-SNAPSHOT"
      )
  )

name := "jsgantt-improved-scalajs"

crossScalaVersions in ThisBuild := Seq("2.12.4" /*, "2.11.11", "2.10.6", "2.13.0-M2"*/)
scalaVersion in ThisBuild := crossScalaVersions.value.head

val commonSettings = Seq(
    version := "0.9.4-SNAPSHOT",
    organization := "org.scala-js",
    scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings")
)

commonSettings

scalacOptions ++= {
    if (scalaJSVersion.startsWith("0.6."))
        Seq("-P:scalajs:sjsDefinedByDefault")
    else
        Nil
}

publishMavenStyle := true

publishTo := {
    val corporateRepo = "http://toucan.simplesys.lan/"
    if (isSnapshot.value)
        Some("snapshots" at corporateRepo + "artifactory/libs-snapshot-local")
    else
        Some("releases" at corporateRepo + "artifactory/libs-release-local")
}
credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")


