# Park-now Registration page Automation Test
## About
This task is to provide automation of registration journey for *Park-now* portal.

## Technologies
This project is java based on BDD framework, uses Selenium and Cucumber and JUnit.
Following technologies used to build this project.
* Java
* Selenium
* Cucumber
* JUnit 
* Maven

## How to build & Run
Use following command to build the project and execute the test cases.
> Note: By default it uses Chrome browser

```shell script
mvn clean test
```
### Run with Firefox browser
Use following command to run tests using firefox.
```shell script
mvn clean test -DBROWSER=firefox
```

## Checking Test Reports
After running the above step you can find the reports in following directory.
``test-output/Spark/ExtentSpark.html``