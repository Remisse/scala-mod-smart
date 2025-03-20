ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion := "3.6.2"

ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Wunused:implicits",
  "-Wunused:explicits",
  "-Wunused:imports",
  "-Wunused:locals",
  "-Wunused:params",
  "-Wunused:privates",
  "-Wvalue-discard",
  "-Xkind-projector",
  "-Ycheck:all", 
)

val testDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.2.18" % Test,
)

lazy val core = project
  .settings(
    name := "core",
    libraryDependencies ++= testDependencies,

    scalacOptions ++= Seq(
      "-experimental",
      "-language:experimental.macros",
      "-Xcheck-macros", 
    ),

    assembly / assemblyJarName := "scala-mod-smart.jar",
  )
