# Sample Geb and Gradle Project

## Description
This project was made to test 3 goals:

1. Setup an automation environment on your local machine using selenium
2. Automate any cases that you would think are good to test the functionality of validating logging into hudl.com with your credentials.
3. Push your tests to a Github repository (a public repo is fine) and share the link (please do not include any passwords in public repos).

Tools used in this suite:
* Geb
* Spock
* Groovy
* Gradle

## Running Project
1. Place proper chromedriver binary in the resources folder
2. Update username and password in `groovy/module/userInfoModule.groovy`
3. Run test folder through IDE or use `gradlew test` in terminal

after project report can be seen at `\build\reports/geb`

###Specifications
* jdk 11 - jdk 14
* groovy 2.5.9
* gradle 7..0.8