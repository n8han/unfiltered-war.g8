organization := "com.example"

name := "$name$"

version := "$version$"

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-filter" % "$unfiltered_version$",
   "javax.servlet" % "servlet-api" % "2.3" % "provided",
   "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725" % "container",
   "org.clapper" %% "avsl" % "0.4"
)

seq(webSettings :_*)
