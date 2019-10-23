
// To publish the api create a credentials file at ~/.sbt/1.0/gpr-codeoverflow.sbt with the following content:
//    credentials += Credentials(
//      "GitHub Package Registry",
//      "maven.pkg.github.com",
//      "<GITHUB_USERNAME>",
//      "<GITHUB_TOKEN>"
//    )
//
// The github token requires the read:packages, repo and write:packages scopes.
// Then simply run `sbt apiProject/publish`


lazy val githubOwner = "codeoverflow-org" // Can be changed to publish to a fork, e.g. to test if the publish process works
lazy val githubRepository = "chatoverflow-api"

publishTo := Some(s"GitHub $githubOwner Apache Maven Packages" at s"https://maven.pkg.github.com/$githubOwner/$githubRepository")
publishMavenStyle := true

