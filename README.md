# The Modular Monolith
An example how to set up a modular monolith with Spring Boot and Gradle.

## `boot` Module
The `boot` module is responsible for bootstrapping the application in runtime.
The Spring Boot Gradle plugin is applied to this module and the final jar wil be build under this module.
The `boot` module has *runtime* dependencies to all other modules. No other module should depend on `boot`.  

## Application Modules
All directories with `mod-` prefix and a correct `build.gradle` file will be automatically recognised as
Gradle sub-projects and added as *runtime* dependencies to the `boot` module.

### Simple Application Modules
The simplest way to introduce dependencies between modules is to add one module as a *compile* dependency to
the other module. *Simple* is by no means a derogatory term here, often the simplest solutions is also the best.
For example see how `mod-web` uses `mod-simple`.   
