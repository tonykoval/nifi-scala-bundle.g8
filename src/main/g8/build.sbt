name := "$name$"
organization := "$organization$"
version := "$version$"

scalaVersion := "$scala_version$"
nifiVersion := "$nifi_version$"

enablePlugins(NarPlugin)

libraryDependencies ++= Seq(
  "org.apache.nifi" % "nifi-api",
  "org.apache.nifi" % "nifi-dbcp-service-api",
  "org.apache.nifi" % "nifi-record-serialization-service-api",
  "org.apache.nifi" % "nifi-schema-registry-service-api",
  "org.apache.nifi" % "nifi-ssl-context-service-api",
  "org.apache.nifi" % "nifi-processor-utils",
  "org.apache.nifi" % "nifi-standard-record-utils",
  "org.apache.nifi" % "nifi-record"
).map(_ % nifiVersion.value)

libraryDependencies ++= Seq(
  "org.apache.nifi" % "nifi-record-serialization-services"
).map(_ % nifiVersion.value % "provided")

libraryDependencies ++= Seq(
  "org.apache.nifi"  % "nifi-record-serialization-services",
  "org.apache.nifi"  % "nifi-mock",
  "org.apache.nifi"  % "nifi-mock-record-utils",
  "org.apache.nifi"  % "nifi-framework-nar-utils"
).map(_ % nifiVersion.value % Test)

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library"  % scalaVersion.value,
  "org.scalatest"  %% "scalatest"     % "3.0.8"      % Test
)

// workaround in scala 2.12 (obsolete in scala 2.13)
libraryDependencies ++= Seq(
  compilerPlugin("com.github.ghik" % "silencer-plugin" % "1.7.0" cross CrossVersion.full),
  "com.github.ghik" % "silencer-lib" % "1.7.0" % Provided cross CrossVersion.full
)

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-encoding", "UTF-8",
  "-Xlint",
  "-Xverify",
  "-feature",
  "-language:_"
)

resolvers +=
  "Spring.io" at "https://repo.spring.io/libs-release" //simple-syslog-5424 - missing in maven