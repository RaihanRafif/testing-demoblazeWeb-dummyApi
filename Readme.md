# Automated Testing Documentation

## Overview
This project includes automated testing for both Web UI and API. It is designed to validate functionality and ensure reliability and performance of two separate platforms.

### Testing Frameworks and Tools:
- **Cucumber**: Utilized for behavior-driven development (BDD), allowing tests to be written in plain language.
- **Selenium**: Used for automating web browsers in testing Web UI scenarios.
- **JUnit**: Employed for unit testing API scenarios, ensuring API responses are as expected.
- **Gherkin Syntax**: Provides a readable and easy-to-understand format for describing tests.

## Test Cases
### Web UI Testing (20 Scenarios)
- Target Website: [Demo Blaze](https://www.demoblaze.com/)
- Covers functionalities including user interactions, navigation, product selections, and checkout processes.

### API Testing (19 Scenarios)
- Target API: [DummyAPI](https://dummyapi.io/)
- Tests various API endpoints for CRUD operations, response validations, and data integrity checks.

## Getting Started

### Prerequisites
- Java JDK 8 or above
- Gradle
- Web Browser (for Web UI tests)
- Internet Connection

### Installation
Clone the repository to your local machine:
```bash
git clone https://github.com/RaihanRafif/testing-demoblazeWeb-dummyApi
```

Navigate to the project directory:
```
cd testing-demoblazeWeb-dummyApi-main
```

### How To Run Tests
- **Web UI Tests**: Run the following command in the terminal: "./gradlew webTest"
- **API Tests**: Execute the API tests using this command: "./gradlew apiTest"

## Test Results
After running the tests, results will be generated and can be found in the following directories:
- **Web UI Automation Test Results**:  `report/cucumber-web-report.html`
- **API Automation Test Results**: `report/cucumber-api-report.html`

## Acknowledgments
- Thanks to the developers and contributors of Selenium, JUnit, and Cucumber.
- Special thanks to Demo Blaze and DummyAPI for providing platforms for testing.
- Thanks to my friend [Muhammad aufa alghifarri](https://github.com/maufaalghifarri) that helps me to develop this testing

## Result
[api-result](api-result.png)
[web-result](web-result.png)
