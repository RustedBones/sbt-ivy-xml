val scala3Version = "3.6.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "sbt-ivy-xml",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-api" % "managed",
      "org.scalameta" %% "munit" % "1.0.0" % Test
    ),
    dependencyOverrides ++= Seq(
      "org.slf4j" % "slf4j-api" % "2.0.16"
    )
  )
