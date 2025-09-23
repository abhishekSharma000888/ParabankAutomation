# Parabank Automation Project

Automated end-to-end Selenium test project for **Parabank** demo website.  
This project demonstrates a **Page Object Model (POM)** structure with **TestNG**, **WebDriverManager**, and **Apache POI** for data-driven testing.

---

## Project Structure

ParabankAutomation/
│
├── pom.xml # Maven dependencies
├── testng.xml # TestNG suite configuration
│
├── src
│ ├── main
│ │ └── java
│ │ └── utils
│ │ ├── ConfigReader.java
│ │ ├── DriverFactory.java
│ │ └── TestDataUtil.java
│ │
│ └── test
│ ├── java
│ │ ├── base
│ │ │ └── BaseTest.java
│ │ │
│ │ ├── pages
│ │ │ ├── HomePage.java
│ │ │ ├── LoginPage.java
│ │ │ ├── RegisterPage.java
│ │ │ ├── SearchResultsPage.java
│ │ │ ├── ProductPage.java
│ │ │ └── CartPage.java
│ │ │
│ │ └── tests
│ │ ├── LoginTest.java
│ │ ├── RegisterTest.java
│ │ ├── HomePageTitleTest.java
│ │ ├── SearchProductTest.java
│ │ ├── SearchAddToCartTest.java
│ │ └── RemoveFromCartTest.java
│ │
│ └── resources
│ ├── config.properties
│ └── testdata.xlsx


---

## Technologies & Dependencies

- Java 17
- Selenium 4.21.0
- TestNG 7.10.2
- WebDriverManager 5.9.2
- Apache POI 5.2.5 (Excel data-driven testing)
- Extent Reports 5.1.1 (HTML reports)
- AssertJ 3.25.3 (optional, for fluent assertions)
- Maven for project build and dependency management

---

## Features

- **Page Object Model (POM)** design pattern
- **Data-driven testing** with Excel
- **Valid and invalid login tests**
- **Search, add to cart, and remove from cart functionality**
- **Configurable via `config.properties`**
- **Cross-browser setup using WebDriverManager**
- **TestNG test suite and reporting**

---

## Setup Instructions

1. **Clone the repository**
   ```bash
   git clone <repo_url>
   cd ParabankAutomation

2. Install dependencies 
-- mvn clean install

3. Update config.properties
   baseUrl=https://parabank.parasoft.com/parabank/index.htm
   browser=chrome

4. Run tests
--mvn test

5. Using TestNG suite:
--mvn test -DsuiteXmlFile=testng.xml



