ParabankAutomation/
│── pom.xml                  # Maven dependencies
│── testng.xml               # Test suite config
│
├── src
│   ├── main
│   │   └── java
│   │       └── utils/
│   │           ├── ConfigReader.java
│   │           ├── DriverFactory.java
│   │           └── TestDataUtil.java
│   │
│   └── test
│       └── java
│           ├── base/
│           │   └── BaseTest.java
│           │
│           ├── pages/
│           │   ├── LoginPage.java
│           │   ├── RegisterPage.java
│           │   ├── AccountsOverviewPage.java
│           │   ├── TransferFundsPage.java
│           │   ├── BillPayPage.java
│           │   └── RequestLoanPage.java
│           │
│           └── tests/
│               ├── LoginTest.java
│               ├── RegisterTest.java
│               ├── AccountsOverviewTest.java
│               ├── TransferFundsTest.java
│               ├── BillPayTest.java
│               └── RequestLoanTest.java
│
└── resources/
├── config.properties    # URL, browser, timeout
└── testdata.xlsx        # Test data for DDT
