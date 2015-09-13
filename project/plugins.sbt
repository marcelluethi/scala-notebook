resolvers += Resolver.url(
  "sbt-plugin-releases",
  url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/")
)(Resolver.ivyStylePatterns)

addSbtPlugin("com.untyped" %% "sbt-js" % "0.6")


addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.0")
