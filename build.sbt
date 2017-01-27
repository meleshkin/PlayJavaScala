name := "PlayJavaScala"

version := "1.0"

lazy val `playjavascala` = (project in file(".")).enablePlugins(PlayScala, PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq()

routesGenerator := InjectedRoutesGenerator