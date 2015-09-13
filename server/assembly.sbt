//import AssemblyKeys._ // put this at the top of the file

//assemblySettings

jarName in assembly := "scala-notebook.jar"

mainClass in assembly := Some("com.bwater.notebook.Server")

test in assembly := {}

fork in run := true



mergeStrategy in assembly := { 
        case PathList("META-INF", "MANIFEST.MF") =>   MergeStrategy.discard
        case PathList(ps @ _*) if ps.last endsWith ".conf" => MergeStrategy.concat
        case x =>  MergeStrategy.first
} 


