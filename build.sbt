name := "bastiodon"

lazy val domain = project
lazy val boot = project.dependsOn(domain)