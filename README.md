# Bank Account

## Author
**Karina Lorenzo**
  
## Status: DONE 🚀

## Project Description

This banking system application implements a complete account management solution with three main components:

### Base Account Class
- Manages core banking operations (deposits, withdrawals)
- Tracks balance, transaction counts, and interest rates
- Handles monthly statements and interest calculations 
### Savings Account
- Specialized account with activity status
- Becomes inactive if balance falls below $10,000
- Additional fees for excessive withdrawals
- Tracks total transaction count
### Current Account
- Supports overdraft functionality
- Automatically manages overdraft payments
- Maintains separate overdraft balance
- Handles partial overdraft repayment

The system includes comprehensive unit tests with 80% code coverage and follows object-oriented principles with proper encapsulation and inheritance. All components are thoroughly documented and maintain clear separation of concerns.

## Prerequisites
To run this project, you need to have the following installed:

- Java Development Kit (JDK) 8 or higher
- JUnit 5: Testing library used to write and run the tests.
- Maven (for dependency management and running tests)

## Tech stack:

![Visual Studio Code](https://img.shields.io/badge/-Visual_Studio_Code-007ACC?logo=visual-studio-code&logoColor=white&style=flat)
![Maven](https://img.shields.io/badge/-Maven-C71A36?logo=apache-maven&logoColor=white&style=flat)
![Java](https://img.shields.io/badge/-Java-007396?logo=java&logoColor=white&style=flat)
![GitHub](https://img.shields.io/badge/-GitHub-181717?logo=github&logoColor=white&style=flat)
![Git](https://img.shields.io/badge/-Git-F05032?logo=git&logoColor=white&style=flat)  
![Google](https://img.shields.io/badge/-Google-4285F4?logo=google&logoColor=white&style=flat)
![Mermaid](https://img.shields.io/badge/-Mermaid-0084C8?style=flat&logo=mermaid&logoColor=white)
![Copilot](https://img.shields.io/badge/-Copilot-0078D4?style=flat&logo=microsoft&logoColor=white)


## Installation and Execution
### 1. Clone the Repository (Optional)
If you want to clone this project from a GitHub repository, use the following command:

```sh
git clone https://github.com/Karina-s-happy-place/BankAccount
```
#### Make sure you have Java JDK installed. You can verify it by running:
Navigate to the project directory and run:
```sh
java -version
```

### 3. Compilation
You can run the main application by executing the App class. Here are two ways to do it:

Using your IDE: Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse), navigate to App.java, and run the main method.
Using the command line:

```sh
javac src/*.java
```

### Running Tests

```sh
mvn test
```

## Contributing
If you'd like to contribute to this project, please fork the repository and submit a pull request with your changes. I welcome all contributions and improvements!

Follow the next steeps if you want contribute:

1. Make a fork
2. Create a new branch to yor changes (git checkout -b feature/name-branch)
3. Make the necesary changes and write test to cover them
4. Submit a pull request explaining your modifications


## License
This project is open-source, and you are free to use, modify, and distribute it.
