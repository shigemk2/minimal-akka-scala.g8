name := "my-$pattern$-$name$-sample"

organization := "$organization$"

version := "1.0"

scalaVersion := "$scala_version$"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "$akka_version$",
  "org.scalatest" %% "scalatest" % "$scala_test_version$" % "test"
)
