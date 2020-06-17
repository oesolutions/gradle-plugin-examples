
# Gradle Plugin Examples
A collection of example Gradle projects, targeting plugin development topics.

## Contents
* [Incoming Ideas](#incoming-ideas)
* [Using the Examples](#using-the-examples)
  * [Using Composite Builds From the Commandline](#using-composite-builds-from-the-command-line)

## Incoming Ideas
- showcase modern Gradle plugin development techniques using complete and working examples
- update plugins with new features/techniques as Gradle is released
  - branches correspond to Gradle releases
  - backwards compatibility between branches is not one of the goals
- Wgz transform
-  Compiler project
-  Compile task
-  Compile Inc task
-  Compile worker task

## Using the Examples
Each example project is independent and no composite builds are declared in the . However, there do exist some
 dependencies
 between the
projects. There are a few ways to integrate the required dependencies:

  1. Use composite builds (`--include-build`) when invoking Gradle from the command-line.
  1. Publish the dependencies to the `ExampleLocal` repository. This repository is a local directory located in the root
     of the git repo. See `localRepo.name` in `examples.properties`.
  1. Import each project into your IDE and configure composite builds there.

### Using Composite Builds From the Command-Line





# Widget

## External Resources

* Gradle Services (https://services.gradle.org)
* Google Translation ()
# TODO
- widgets have language variants
- language compatibility rules for US and GB english
- language artifact transform using google apis
  - https://stackoverflow.com/questions/8147284/how-to-use-google-translate-api-in-my-java-application
  - https://developers.google.com/ml-kit/language/translation
