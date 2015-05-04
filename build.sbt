name := "hello-play-2_3-scala"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.3.0-3",
  "org.webjars" % "bootstrap" % "3.0.0",
  "org.webjars" % "requirejs" % "2.1.11-1"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)
