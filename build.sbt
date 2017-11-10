import sbtcrossproject.{CrossType, crossProject}

lazy val root = crossProject(JSPlatform, JVMPlatform)
  .settings(
      inThisBuild(Seq(
          scalaVersion := CommonSettings.settingValues.scalaVersion,
          scalacOptions := CommonSettings.settingValues.scalacOptions,
          organization := CommonSettings.settingValues.organization
      )
        ++ CommonSettings.defaultSettings)
  )
  .settings(CommonSettings.noPublishSettings)
  .aggregate(ganttImproved)
  .dependsOn(ganttImproved)

lazy val ganttImproved = crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Pure)
  .settings(
      name := "jsgantt-improved",
  )
  .settings(CommonSettings.defaultSettings)
  .settings(CommonSettings.publishSettings)
  .jvmSettings(
      // Add JVM-specific settings here
  )
  .jsSettings(
      crossTarget in fastOptJS := (sourceDirectory in Compile).value / "javascriptJS",
      crossTarget in fullOptJS := (sourceDirectory in Compile).value / "javascriptJS",
      crossTarget in packageJSDependencies := (sourceDirectory in Compile).value / "javascriptJS",
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





