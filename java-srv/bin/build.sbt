lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "(java-cli-sbt)",

  // orgnization name (e.g., the package name of the project)
  organization := "example",

  version := "1.0-SNAPSHOT",

  // project description
  description := "SQL Server Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  libraryDependencies ++= Seq(
    "com.ibm.db2" % "jcc" % "11.1.4.4",
"org.hibernate" % "hibernate-core" % "5.4.23.Final",
"jakarta.xml.bind" % "jakarta.xml.bind-api" % "2.3.3",
"org.glassfish.jaxb" % "jaxb-runtime" % "2.3.3",
"log4j" % "log4j" % "1.2.17",
"org.slf4j" % "slf4j-api" % "1.7.5",
"org.slf4j" % "slf4j-log4j12" % "1.7.5"
   ),

  mainClass := Some("example.Main")
)
