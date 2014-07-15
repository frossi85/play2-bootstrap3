//From https://github.com/spray/twirl/issues/15#issuecomment-32272389
resolvers += Classpaths.sbtPluginSnapshots

//Is this the same as the add below?
//Classpaths.sbtPluginReleases
//resolvers ++= Seq(
//  "sbt-plugin-releases" at "http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"
//)

addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.0.2")


