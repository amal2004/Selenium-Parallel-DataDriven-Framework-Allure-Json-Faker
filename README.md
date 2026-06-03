# 🚀 Selenium Data Driven Automation Framework with Json & Faker

<div align="center">

### Built with Java • Selenium • TestNG • Allure • Faker • JSON

---

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge\&logo=openjdk)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-43B02A?style=for-the-badge\&logo=selenium)
![TestNG](https://img.shields.io/badge/TestNG-Testing-red?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge\&logo=apachemaven)
![Allure](https://img.shields.io/badge/Allure-Reporting-blue?style=for-the-badge)
![Logback](https://img.shields.io/badge/Logging-SLF4J%20%7C%20Logback-lightgrey?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

</div>

---

# 📖 About The Framework

A scalable and production-ready Selenium automation framework designed using modern automation engineering standards.

This framework provides:

* ✅ Thread-safe parallel execution
* ✅ Multi-browser support
* ✅ Advanced reporting
* ✅ Dynamic test data generation
* ✅ Clean Page Object Model architecture
* ✅ Reusable utilities
* ✅ Enterprise-grade logging
* ✅ Centralized configuration handling

---

# ✨ Key Features

## 🧩 Framework Highlights

| Feature                          | Description                    |
| -------------------------------- | ------------------------------ |
| 🌐 Multi Browser Support         | Chrome, Firefox, Edge          |
| ⚡ Parallel Execution             | Thread-safe TestNG execution   |
| 🧵 ThreadLocal Driver Management | Isolated WebDriver sessions    |
| 📊 Allure Reporting              | Rich execution reports         |
| 📸 Screenshot Capture            | Automatic failure screenshots  |
| 🎲 Faker Test Data               | Dynamic realistic test data    |
| 📂 JSON Data Providers           | Externalized test datasets     |
| 📝 Centralized Logging           | SLF4J + Logback                |
| 🛡 Custom Exception Handling     | Framework-level error handling |
| ⚙️ Configurable Execution        | Runtime configuration support  |

---

# 🏗️ Framework Architecture

```text
                           ┌───────────────────┐
                           │    Test Classes   │
                           └─────────┬─────────┘
                                     │
                                     ▼
                           ┌───────────────────┐
                           │     BaseTest      │
                           └─────────┬─────────┘
                                     │
                                     ▼
                           ┌───────────────────┐
                           │   DriverFactory   │
                           └─────────┬─────────┘
                                     │
                                     ▼
                           ┌───────────────────┐
                           │  BrowserManager   │
                           └─────────┬─────────┘
                                     │
                                     ▼
                           ┌───────────────────┐
                           │    WebDriver      │
                           └───────────────────┘
```

---

# 📁 Project Structure

```bash
src
├── main
│   └── java/com/amalw
│       ├── base
│       ├── config
│       ├── dataproviders
│       ├── driver
│       ├── enums
│       ├── exceptions
│       ├── factory
│       ├── listeners
│       ├── logging
│       ├── model
│       ├── pages
│       ├── testdata
│       ├── utils
│       └── waits
│
├── test
│   └── java/com/amalw/tests
│
└── resources
    ├── config.properties
    ├── logback.xml
    └── testdata
```

---

# 🧪 Technology Stack

| Layer                | Technology         |
| -------------------- | ------------------ |
| ☕ Language           | Java 17            |
| 🌐 Automation        | Selenium WebDriver |
| 🧪 Test Runner       | TestNG             |
| 📊 Reporting         | Allure Reports     |
| 📦 Build Tool        | Maven              |
| 📝 Logging           | SLF4J + Logback    |
| 📄 JSON Parsing      | Jackson            |
| 🚗 Driver Management | WebDriverManager   |
| 🎲 Test Data         | Java Faker         |

---

# 🚀 Quick Start

# 📥 Clone Repository

```bash
git clone https://github.com/your-username/selenium-framework.git
```

```bash
cd selenium-framework
```

---

# 🔧 Prerequisites

Ensure the following are installed:

* ✅ Java 17+
* ✅ Maven
* ✅ Git
* ✅ Chrome / Firefox / Edge Browser

Verify installation:

```bash
java -version
```

```bash
mvn -version
```

---

# 📦 Install Dependencies

```bash
mvn clean install
```

---

# ▶️ Execute Tests

## Run Full Test Suite

```bash
mvn test
```

---

## Run On Chrome

```bash
mvn test -Dbrowser=chrome
```

---

## Run On Firefox

```bash
mvn test -Dbrowser=firefox
```

---

## Run On Edge

```bash
mvn test -Dbrowser=edge
```

---

# ⚙️ Framework Configuration

## Example `config.properties`

```properties
base.url=https://demo.nopcommerce.com

browser=chrome
headless=false
environment=qa

pageLoadTimeout=60
retries=1

logLevel=INFO

useFakerData=true

screenshot.dir=screenshots
```

---

# 🎲 Dynamic Test Data Generation

Framework supports realistic dynamic data generation using **Java Faker**.

## ✨ Example Generated Data

* 👤 Random Names
* 📧 Unique Emails
* 🏢 Company Names
* 🔐 Secure Passwords

Example:

```java
Faker faker = FakerFactory.getFaker();

faker.name().firstName();
faker.internet().emailAddress();
faker.company().name();
```

---

# 📂 JSON Driven Test Data

Supports externalized JSON datasets.

## Example JSON

```json
[
  {
    "firstName": "John",
    "lastName": "Doe",
    "gender": "MALE",
    "company": "OpenAI",
    "password": "Password123"
  }
]
```

---

# 🧵 Parallel Execution

Framework supports fully thread-safe parallel execution.

## ✅ Benefits

* Faster execution
* Independent browser sessions
* Better scalability
* CI/CD friendly

Implementation:

```java
@DataProvider(name = "registrationData", parallel = true)
```

---

# 📊 Allure Reporting

Generate beautiful execution reports with screenshots and logs.

## Generate Report

```bash
allure serve target/allure-results
```

---

# 📸 Included In Reports

* ✅ Test Steps
* ✅ Execution Timeline
* ✅ Screenshots
* ✅ Failure Reasons
* ✅ Logs
* ✅ Environment Details

---

# 📸 Screenshot Management

Automatic screenshot capture on test failures.

## 📁 Storage Location

```bash
/screenshots/<TestClassName>/
```

## 🕒 Naming Convention

```text
<TestName>_yyyyMMdd_HHmmss_SSS.png
```

---

# 📝 Logging System

Framework uses:

* SLF4J
* Logback
* MDC Logging

## 🔥 Dynamic Log Level Configuration

```properties
logLevel=DEBUG
```

Supported Levels:

```text
TRACE
DEBUG
INFO
WARN
ERROR
```

---

# 🛡 Exception Handling

Custom exception implementation:

```java
FrameworkException
```

Advantages:

* Cleaner stack traces
* Better debugging
* Centralized framework error handling

---

# 🧱 Design Patterns Used

| Pattern                   | Purpose                      |
| ------------------------- | ---------------------------- |
| 🧩 Page Object Model      | Maintainable UI interactions |
| 🏭 Factory Pattern        | Driver & object creation     |
| 🧵 ThreadLocal Pattern    | Parallel-safe execution      |
| ⚙️ Singleton-style Config | Centralized configuration    |
| 🔒 Utility Encapsulation  | Reusable helper methods      |

---

# 🌐 Supported Browsers

| Browser    | Status      |
| ---------- | ----------- |
| 🌍 Chrome  | ✅ Supported |
| 🦊 Firefox | ✅ Supported |
| 🔷 Edge    | ✅ Supported |

---

# 🔥 Sample Test Flow

```java
RegisterPage registerPage = new RegisterPage();

registerPage
        .open()
        .selectGender(gender)
        .fillForm(user)
        .submit();

Assert.assertTrue(registerPage.isRegistrationSuccessful());
```

---

# 📈 Future Enhancements

* 🔲 Selenium Grid Integration
* 🐳 Docker Support
* ☁️ GitHub Actions CI/CD
* 📱 Mobile Automation
* 🔄 Retry Analyzer
* 📊 Extent Reports
* 🌍 Cross-platform Execution
* ⚡ REST API Automation

---

# 🤝 Contribution Guide

Contributions are always welcome 🚀

## Steps

### 1️⃣ Fork Repository

### 2️⃣ Create Feature Branch

```bash
git checkout -b feature/new-feature
```

### 3️⃣ Commit Changes

```bash
git commit -m "Added new feature"
```

### 4️⃣ Push Changes

```bash
git push origin feature/new-feature
```

### 5️⃣ Create Pull Request 🚀

---

# 👨‍💻 Author

## Amal W

---

# ⭐ Support The Project

If this project helped you:

⭐ Star the repository
🍴 Fork the project
🛠 Contribute improvements

---

# 📜 License

Licensed under the MIT License.

---

<div align="center">

## 🚀 Clean Code • Reliable Tests • Scalable Automation 🚀

</div>
