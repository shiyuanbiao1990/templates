## Template: springgradle

The springgradle template uses gradle as a build system.

Gradle version: 4.8.1

### Structure

There are one project which make up a single gradle build:

- function - (App) springboot project

### Handler

The handler is written in the `./src/main/FunctionApplication.java` folder

Tests are supported with junit via files in `./src/test`

### External dependencies

External dependencies can be specified in ./build.gradle in the normal way using mavenCentral, a local JAR or some other remote repository.

