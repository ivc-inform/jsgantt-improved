import sbtcrossproject.{CrossType, crossProject}

lazy val root = crossProject(JSPlatform, JVMPlatform)
  .settings(CommonSettings.noPublishSettings)
  .settings(
      inThisBuild(Seq(
          scalaVersion := CommonSettings.settingValues.scalaVersion,
          scalacOptions := CommonSettings.settingValues.scalacOptions,
          organization := CommonSettings.settingValues.organization
      ) ++ CommonSettings.defaultSettings)
  )
  .aggregate(ganttImproved)
  .dependsOn(ganttImproved)

val sysCirceExtenderVersion = "1.5-SNAPSHOT"
lazy val ganttImproved = crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Pure)
  .settings(CommonSettings.publishSettings)
  .settings(
      name := "jsgantt-improved",
      libraryDependencies ++= Seq(
          "com.simplesys.core" %% "circe-extender" % sysCirceExtenderVersion,
          "org.scalatest" %% "scalatest" % "3.0.4" % Test
      )
  )
  .settings(CommonSettings.defaultSettings)
  .jvmSettings(
      libraryDependencies ++= Seq(
          "com.simplesys.core" %% "circe-extender" % sysCirceExtenderVersion,
          "org.scalatest" %% "scalatest" % "3.0.4" % Test
      )
  )
  .jsSettings(
      crossTarget in fastOptJS := (sourceDirectory in Compile).value / "javascriptJS",
      crossTarget in fullOptJS := (sourceDirectory in Compile).value / "javascriptJS",
      crossTarget in packageJSDependencies := (sourceDirectory in Compile).value / "javascriptJS",
      libraryDependencies ++= Seq(
          "org.scalatest" %%% "scalatest" % "3.0.4" % Test,
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





