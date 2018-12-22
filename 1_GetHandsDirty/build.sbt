import ComponentDependencies._

organization := "training.finagle"
version := "1.0-SNAPSHOT"
scalaVersion := "2.12."
parallelExecution in Test := true
fork in Test := true
testForkedParallel in Test := true
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-q", "-v"))

name := "get-started"

version := "0.1"

scalaVersion := "2.12.7"


libraryDependencies ++= compressionServiceDependecies

unmanagedClasspath in Test += baseDirectory.value / "resources"
