import sbtcrossproject.{CrossType, crossProject}

lazy val root = crossProject(JSPlatform, JVMPlatform)
  .settings(
      scalaVersion in ThisBuild := "2.12.4",
      publishMavenStyle := true,
      publishTo := {
          val corporateRepo = "http://toucan.simplesys.lan/"
          if (isSnapshot.value)
              Some("snapshots" at corporateRepo + "artifactory/libs-snapshot-local")
          else
              Some("releases" at corporateRepo + "artifactory/libs-release-local")
      },
      credentials += Credentials(Path.userHome / ".ivy2" / ".credentials"),
      name := "jsgantt-improved-scalajs",
      version := "0.9.4-SNAPSHOT",
      organization := "org.scala-js",
      scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings"),
      crossTarget in fastOptJS := (sourceDirectory in Compile).value / "javascriptJS",
      crossTarget in fullOptJS := (sourceDirectory in Compile).value / "javascriptJS",
      crossTarget in packageJSDependencies := (sourceDirectory in Compile).value / "javascriptJS"
  )
  .aggregate(ganttImproved)
  .dependsOn(ganttImproved)

lazy val ganttImproved = crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Pure)
  .settings(
  )
  .jvmSettings(
      // Add JVM-specific settings here
  )
  .jsSettings(
      libraryDependencies ++= Seq(
          "org.scala-js" %%% "scalajs-dom" % "0.9.4-SNAPSHOT",
          "com.lihaoyi" %%% "scalatags" % "0.6.7"
      ),
      scalacOptions ++= {
          if (scalaJSVersion.startsWith("0.6."))
              Seq("-P:scalajs:sjsDefinedByDefault")
          else
              Nil
      }
  )

lazy val ganttImprovedJS = ganttImproved.js
lazy val ganttImprovedJVM = ganttImproved.jvm




