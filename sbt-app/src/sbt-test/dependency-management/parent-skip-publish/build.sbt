organization := "com.example"
ivyPaths := IvyPaths((ThisBuild / baseDirectory).value.toString, Some(((ThisBuild / baseDirectory).value / "ivy" / "cache").toString))

name := "root"

lazy val core = project
  .settings(
    name := "core",
  )