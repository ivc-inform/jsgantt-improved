
//val scalaJSVersion = "0.6.21"
val scalaCrossProjectPluginVersion = "0.3.3-SNAPSHOT"

//addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)
addSbtPlugin("org.scala-native" % "sbt-scalajs-crossproject" % scalaCrossProjectPluginVersion)
addSbtPlugin("org.scala-native" % "sbt-crossproject" % scalaCrossProjectPluginVersion)
