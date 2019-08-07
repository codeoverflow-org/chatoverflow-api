name := "chatoverflow-api"
lazy val apiVersionGenerator = TaskKey[Unit]("apiVersionGenerator")
lazy val requirementsGenerator = TaskKey[Unit]("requirementsGenerator")

// Convention: majorVersion++ on api signature update (else: minorVersion ++)
val majorVersion = 3
val minorVersion = 0
version := s"$majorVersion.$minorVersion"



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