name := """taikoban"""
organization := "colehall.dev"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.14"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test
libraryDependencies += "cn.playscala" % "play-mongo_2.12" % "0.3.1"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "colehall.dev.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "colehall.dev.binders._"
