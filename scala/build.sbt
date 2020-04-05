organization := "org.codeoverflow"
name := "chatoverflow-api-scala"
version := "4.0.0"

packageBin / includePom := false

scalacOptions ++= Seq("-language:implicitConversions")

// Currently only plugins that use the same Scala major version as the framework can use the implicits, because
// only one version of this lib can be on the classpath.

// Plugins using a different version than the framework should still be able to use the api without the implicits
// so we disable the scala major suffix from the name, because otherwise sbt can't resolve the dependency to the
// implicits as the scala suffix is wrong and it wouldn't build.

// That way plugins of other scala versions can also use some features where the code of the scala lib
// isn't different and therefore doesn't throw a exception.

// Using implicits with a different scala version is still not recommended and probably will throw an exception at some point.
crossPaths := false