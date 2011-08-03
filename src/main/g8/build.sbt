organization := "com.example"

name := "$name$"

version := "$version$"

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-filter" % "$unfiltered_version$",
   "javax.servlet" % "servlet-api" % "2.3" % "provided",
   "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725" % "jetty",
   "org.clapper" %% "avsl" % "0.3.1"
)

seq(webSettings :_*)