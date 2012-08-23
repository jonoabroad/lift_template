name := "Lift SBT Template"
 
scalaVersion := "2.9.2"
 
seq(com.github.siasia.WebPlugin.webSettings :_*)

resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

resolvers += "snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= {
  val liftVersion = "2.5-SNAPSHOT" 
  Seq(
    "net.liftweb"     %% "lift-webkit"  % liftVersion % "compile->default" ,
    "net.liftweb"     %% "lift-mapper" % liftVersion % "compile->default",
  "org.eclipse.jetty" % "jetty-webapp" % "7.3.0.v20110203" % "container,test->default",
  "org.specs2" %% "specs2" % "1.9" % "test",
  "junit" % "junit" % "4.7" % "test",
  "javax.servlet" % "servlet-api" % "2.5" % "provided->default",
  "com.h2database" % "h2" % "1.2.138", // In-process database, useful for development systems
  "ch.qos.logback" % "logback-classic" % "1.0.6" % "compile->default",
  "org.slf4j" % "jcl-over-slf4j" % "1.6.4" // only used for debugging.
)
}

EclipseKeys.withSource := true

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

