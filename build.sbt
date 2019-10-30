name := "agent-scala-scalatest"

organization := "com.epam.reportportal"

scalaVersion := "2.11.12"

crossScalaVersions := Seq("2.10.7", "2.11.12", "2.12.10")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

licenses += "Apache License 2.0" -> url("https://opensource.org/licenses/Apache-2.0")

resolvers ++= Seq(
  Resolver.jcenterRepo,
  "EPAM bintray" at "https://dl.bintray.com/epam/reportportal"
)

libraryDependencies ++= Seq("com.google.inject" % "guice" % "3.0",
  "org.scalatest" %% "scalatest" % "3.0.8",
  "com.epam.reportportal" % "client-java" % "5.0.0-BETA-4",
  "com.epam.reportportal" % "commons-model" % "5.0.0-BETA-12",
  "com.epam.reportportal" % "logger-java-log4j" % "5.0.0-BETA-2",
  "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.12.1",
  "org.slf4j" % "slf4j-api" % "1.7.28",
  "com.google.guava" % "guava" % "22.0"
)

releaseCrossBuild := true

bintrayOrganization := Some("epam")

bintrayRepository := "reportportal"

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-C", "com.epam.reportportal.scalatest.RPReporter", "-P1")

parallelExecution in Test := false

logBuffered in Test := false
