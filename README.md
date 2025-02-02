# CampusTest_Cucumber_Team1

![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF7300?style=for-the-badge&logo=testng&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

## Table of Contents
1. [About the Project](#about-the-project)
2. [Key Benefits](#key-benefits)
3. [Features](#features)
4. [Installation](#installation)
5. [Configuration](#configuration)
6. [Usage](#usage)
7. [Folder Structure](#folder-structure)
8. [Dependencies](#dependencies)
9. [Contributors](#contributors)
10. [License](#license)

---

## About the Project
**CampusTest_Cucumber_Team1** is an automated test suite designed to test the **Campus** application on `test.mersys.io`.

This framework utilizes:
- **Selenium WebDriver** for browser automation
- **Cucumber (BDD)** for behavior-driven testing
- **TestNG** for test execution and reporting
- **Maven** for dependency management

The main goal of the project is to ensure the stability and accuracy of the `Campus` application by automating functional and regression tests.

---

## Key Benefits
- **Behavior-Driven Development (BDD)** using Cucumber
- **Comprehensive UI Testing** with Selenium
- **Automated Regression Testing**
- **Detailed Reporting with Extent Reports**
- **Easy Configuration & Scalability**

---

## Features
- **Login Automation**
- **User Management (Add/Edit/Delete)**
- **Human Resources Module Testing**
- **Bank Account Setup**
- **Grade Levels Setup**
- **Discount Functionality Tests**

---

## Installation
### Prerequisites:
- Install **Java 21**
- Install **Maven**
- Install **IntelliJ IDEA** (or another preferred IDE)

### Steps:
#### Option 1: Command Line Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/CampusTest_Cucumber_Team1.git
   cd CampusTest_Cucumber_Team1
   ```
2. Install dependencies:
   ```sh
   mvn clean install
   ```
3. Run tests:
   ```sh
   mvn test
   ```

#### Option 2: IntelliJ IDEA Installation
1. Open IntelliJ IDEA.
2. Select **File > New > Project from Version Control**.
3. Enter the repository URL and clone the project.
4. Open the `pom.xml` file, and IntelliJ should automatically detect and import dependencies.
5. To run tests, navigate to `src/test/java/runners/TestRunnerAll.java` and run it directly.

---

## Configuration
- **`cucumber.properties`**:
  ```properties
  cucumber.publish.quiet=true
  ```
- **`extent.properties`**:
  ```properties
  extent.reporter.spark.start=true
  extent.reporter.spark.out=test-output/SparkReport/Spark.html
  ```

---

## Usage
To execute all tests, run:
```sh
mvn test
```
Or execute a specific runner in `src/test/java/runners/` from your IDE.

---

## Folder Structure
```
CampusTest_Cucumber_Team1/
│
└── src
    ├── test
    │   ├── java
    │   │   ├── featureFiles  # Cucumber Feature Files
    │   │   ├── pages         # Page Object Model (POM) Classes
    │   │   ├── runners       # Test Runners
    │   │   ├── stepDefinitions  # Step Definitions
    │   │   └── utilities     # Utility Classes
    │   ├── resources
    │   │   ├── cucumber.properties
    │   │   ├── extent.properties
    │   │   └── CampusTestCases.xlsx
    │   └── pom.xml
```

---

## Dependencies
The dependencies for this project are managed in `pom.xml`:
- **Selenium**
- **Cucumber-Java**
- **TestNG**
- **Apache POI**
- **ExtentReports**

---

## Contributors
- [cihat-kose](https://github.com/cihat-kose) – **Team Lead / Software Tester**
- [AyseGun18](https://github.com/AyseGun18) – **Software Tester**
- [CihanDilber](https://github.com/CihanDilber) – **Software Tester**
- [HavvaGonul](https://github.com/HavvaGonul) – **Software Tester**
- [seretto](https://github.com/seretto) – **Software Tester**
- [seymanuripek](https://github.com/seymanuripek) – **Software Tester**
- [TlpAyn](https://github.com/TlpAyn) – **Software Tester**
- [yilmazas](https://github.com/yilmazas) – **Software Tester**
- [Zafer-Yilmaz](https://github.com/Zafer-Yilmaz) – **Software Tester**

---

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

