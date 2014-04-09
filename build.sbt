name := "ZenTasks"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

libraryDependencies += javaJdbc

libraryDependencies += javaEbean

play.Project.playJavaSettings
