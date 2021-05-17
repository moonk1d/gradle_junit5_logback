# Gradle + jUnit5 + logback

A sample gradle base project which uses jUnit5 for running tests and logback library for logging.

# To Run

`./gradlew test` will run all the test inside `src/test` .

After the tests are ran, you can see:

* test reports under `build/reports/tests/test/index.html`
* logs from file appender under `build/logs/log.log`

## Logback configuration

You can find logback configuration here `src/test/resources`

Current configuration contains two appenders:

* ConsoleAppender will output logs to system out stream
* FileAppender will output logs to `build/logs/log.log`
    1. Current configuration will append data to existing log file

## Libraries Used

* [Junit](https://junit.org/junit5/docs/current/user-guide/) - 5.7.0
* [Gradle](https://gradle.org/guides) - 6.8.3
* [Logback](http://logback.qos.ch/manual/index.html) - 1.2.3


