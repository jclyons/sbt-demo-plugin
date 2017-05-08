name := "sbt-demo-tester"

version := "0.1.0"

lazy val root = (project in file("."))

name in Compile := "Different Name"
version in Test := "0.2.0"