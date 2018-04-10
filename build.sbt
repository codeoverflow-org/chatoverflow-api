name := "chatoverflow-api"

// The source generator creates a java class with the current version info
lazy val sourceGenerator = TaskKey[Unit]("sourceGenerator")
// Convention: majorVersion++ on api signature update (else: minorVersion ++)
val majorVersion = 0




// ---------------------------------------------------------------------------------------------------------------------
// ---------------------------------------------------------------------------------------------------------------------
// ---------------------------------------------------------------------------------------------------------------------

version := s"$majorVersion.$minorVersion"
val minorVersion = 1
sourceGenerator := {
  val file = new File(sourceDirectory.value, "main/java/org/codeoverflow/chatoverflow/api/APIVersion.java")
  IO.write(file,
    """package org.codeoverflow.chatoverflow.api;
      |
      |/**
      |* THIS CLASS IS GENERATED WHILE COMPILING. DO CHANGE THE VERSION NUMBERS IN THE APIS BUILD.SBT!
      |*/
      |public class APIVersion {
      |    public static final int MAJOR_VERSION = %d;
      |    public static final int MINOR_VERSION = %d;
      |}
      |""".stripMargin.format(majorVersion, minorVersion))
}

// Update the compile process to generate the api version java class
compile in Compile := {
  sourceGenerator.value
  (compile in Compile).value
}