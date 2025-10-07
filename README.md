# 🧪 Parabank Automation Project

Automated end-to-end Selenium test framework for the Parabank demo website
.
This project demonstrates the Page Object Model (POM) architecture with TestNG, WebDriverManager, and Apache POI for data-driven testing.

## 📂 Project Structure

ParabankAutomation/
│
├── pom.xml                  # Maven dependencies
├── testng.xml               # TestNG suite configuration
│
├── src
│   ├── main
│   │   └── java
│   │       └── utils
│   │           ├── ConfigReader.java
│   │           ├── DriverFactory.java
│   │           └── TestDataUtil.java
│   │
│   └── test
│       ├── java
│       │   ├── base
│       │   │   └── BaseTest.java
│       │   │
│       │   ├── pages
│       │   │   ├── HomePage.java
│       │   │   ├── LoginPage.java
│       │   │   ├── RegisterPage.java
│       │   │   ├── SearchResultsPage.java
│       │   │   ├── ProductPage.java
│       │   │   └── CartPage.java
│       │   │
│       │   └── tests
│       │       ├── LoginTest.java
│       │       ├── RegisterTest.java
│       │       ├── HomePageTitleTest.java
│       │       ├── SearchProductTest.java
│       │       ├── SearchAddToCartTest.java
│       │       └── RemoveFromCartTest.java
│       │
│       └── resources
│           ├── config.properties
│           └── testdata.xlsx

## ⚙️ Technologies & Dependencies

| Tool / Library       | Version | Purpose                         |
| -------------------- | ------- | ------------------------------- |
| **Java**             | 17      | Core programming language       |
| **Selenium**         | 4.21.0  | Web automation framework        |
| **TestNG**           | 7.10.2  | Testing framework               |
| **WebDriverManager** | 5.9.2   | Driver management               |
| **Apache POI**       | 5.2.5   | Excel data-driven testing       |
| **Extent Reports**   | 5.1.1   | HTML reporting                  |
| **AssertJ**          | 3.25.3  | Fluent assertions (optional)    |
| **Maven**            | —       | Build and dependency management |

## ✨ Features

✅ Page Object Model (POM) design pattern for clean maintainable code

🧾 Data-driven testing using Excel (Apache POI)

🔐 Tests for valid & invalid login scenarios

🛒 End-to-end coverage for search, add to cart, and remove from cart flows

⚙️ Configurable setup via config.properties

🌐 Cross-browser execution using WebDriverManager

📊 Extent Reports for rich HTML test reports

🧩 TestNG integration with testng.xml suite configuration

## 🧑‍💻 Author

Abhishek Sharma
Automation Developer