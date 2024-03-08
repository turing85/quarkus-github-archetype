def mvnwScript = new File( request.getOutputDirectory(), request.getArtifactId() + "/mvnw" );
println mvnwScript.getAbsolutePath()
mvnwScript.setExecutable(true, false);