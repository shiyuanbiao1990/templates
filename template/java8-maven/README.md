## Template: springgradle

The springmaven template uses maven as a build system.

Maven version: 3.6.0

### Structure

There are one project which make up a single maven build:

- function - (App) springboot project

### Handler

The handler is written in the `./src/main/FunctionApplication.java` folder

Tests are supported with junit via files in `./src/test`

### External dependencies

External dependencies can be specified in ./build.gradle in the normal way using mavenCentral, a local JAR or some other remote repository.

