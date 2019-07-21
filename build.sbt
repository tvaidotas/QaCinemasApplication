name := "QACinemasApplication"
 
version := "1.0" 
      
lazy val `qacinemasapplication` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
scalaVersion := "2.11.11"

libraryDependencies ++= Seq( jdbc , cache , ws , specs2 % Test )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

//MongoDB
libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.6.0"


      