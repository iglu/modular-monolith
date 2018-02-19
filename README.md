# The Modular Monolith
An example how to set up a modular monolith with Spring Boot and Gradle.

## `boot` Module
The `boot` module is responsible for bootstrapping the application in runtime.
The Spring Boot Gradle plugin is applied to this module and the final jar wil be build under this module.
The `boot` module has *runtime* dependencies to all other modules. No other module should depend on `boot`.  
