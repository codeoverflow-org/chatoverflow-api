organization := "org.codeoverflow"
name := "chatoverflow-api"
lazy val apiVersionGenerator = TaskKey[Unit]("apiVersionGenerator")
lazy val requirementsGenerator = TaskKey[Unit]("requirementsGenerator")

// Convention: majorVersion++ on api signature update (else: minorVersion ++)
val majorVersion = 3
val minorVersion = 0
val patchVersion = 0
// The patch version is ignored and only used for the package version
version := s"$majorVersion.$minorVersion.$patchVersion"

// The API doesn't use scala. We can safely drop the scala version suffix from the jar and
// drop the dependency on the scala library.
autoScalaLibrary := false
crossPaths := false

import org.codeoverflow.chatoverflow.build.BuildUtils
javacOptions ++= BuildUtils.getJava8CrossOptions


// ---------------------------------------------------------------------------------------------------------------------
// ---------------------------------------------------------------------------------------------------------------------
// ---------------------------------------------------------------------------------------------------------------------

import org.codeoverflow.chatoverflow.build.api.APIUtility

apiVersionGenerator := new APIUtility(streams.value.log)
  .generateAPIVersionFile(sourceDirectory.value, majorVersion, minorVersion)

requirementsGenerator := new APIUtility(streams.value.log).generatedRequirements(sourceDirectory.value)


// Update the compile process to generate the api version java class
compile in Compile := {
  apiVersionGenerator.value
  requirementsGenerator.value
  (compile in Compile).value
}

packageBin / includePom := false