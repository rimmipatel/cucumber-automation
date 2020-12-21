
# Automation Task Solution

## Prerequisites

- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows)
- Java 8 or up and `JAVA_HOME` environment variable
- Install [Cucumber for Java plugin](https://www.jetbrains.com/help/idea/enabling-cucumber-support-in-project.html) in IntelliJ IDEA

- Install [Gherkin plugin](https://plugins.jetbrains.com/plugin/9164-gherkin) in IntelliJ IDEA

## Development

This solution is implemented using Cucumber, TestNG, and Selenium. The test scenarios are written in Gherkin language in feature files and the step definitions are written in java in `*Steps` classes. These step definition classes use the Page Object Model. For each page, there is a `*Page` class and a separate `*PageElements` class.  

Refer step by step description of test cases in `resources/features` folder.

For more information about feature files and step definitions in IntelliJ IDEA, refer [this](https://www.jetbrains.com/help/idea/creating-feature-files.html) and [this](https://www.jetbrains.com/help/idea/creating-step-definition.html).

## How to run?

### From IDE

Open a feature file and click on play button in the gutter next to the feature/scenario that you want to run. Refer to this [link](https://www.jetbrains.com/help/idea/running-cucumber-tests.html) for more information. This will run scenarios with default URL and browser type. The default configuration is defined in this file `resources/default.properties`.

### From Command line

Use `gradlew test` to run all scenarios. This will run scenarios with default URL and browser type. The default configuration is defined in this file `resources/default.properties`.

To pass the URL and browser type while running from command line, use `gradlew test -Dbrowser=chrome -Durl=https://example.com` command.

To pass cucumber options from command line, use `gradlew test -Dcucumber.filter.tags="@TCLogin01"` command. For other available options, refer to this [link](https://cucumber.io/docs/cucumber/api/#options).
