# Project Order Management System

## Overview
This project implements a simple Order Management System with CRUD operations for orders and products. The application is built using Spring Boot, Spring Data JPA, and JUnit for testing.

## Chosen Methodology: Test-Driven Development (TDD)
The project follows the TDD approach using JUnit. TDD was chosen to ensure that each functionality in the system is thoroughly tested and validated before it is considered complete. The test cases were written first, and the implementation followed to satisfy the tests.

## Project Structure
- **Entities:** `Order`, `Product` - represent the core business objects.
- **Repositories:** `OrderRepository`, `ProductRepository` - interact with the database using JPA.
- **Services:** `OrderService`, `ProductService` - contain the business logic for managing orders and products.
- **Controllers:** `OrderController` - handles incoming REST requests for orders.
- **Tests:** Test cases for services and controllers using JUnit and Mockito.

## Test Cases Written

### OrderServiceTest
- **`testCreateOrder()`**: Validates the creation of an order.
- **`testUpdateOrder()`**: Validates updating an existing order.
- **`testDeleteOrder()`**: Verifies deletion of an order by ID.
- **`testGetAllOrders()`**: Tests retrieving all orders from the database.

### ProductServiceTest
- **`testCreateProduct()`**: Validates the creation of a product.
- **`testUpdateProduct()`**: Validates updating an existing product.
- **`testDeleteProduct()`**: Verifies deletion of a product by ID.
- **`testGetAllProducts()`**: Tests retrieving all products from the database.

### OrderControllerTest
- **`testCreateOrder()`**: Validates that the controller can handle creating an order.
- **`testGetAllOrders()`**: Verifies that the controller correctly retrieves all orders.

## Test Results
All test cases passed successfully, validating the correct implementation of the CRUD operations. The tests were run using JUnit in IntelliJ IDEA, and all assertions confirmed the expected outcomes.

## How to Build and Run the Project

### Prerequisites
- Java 17 or higher installed.
- Maven installed (or use the built-in Maven in IntelliJ IDEA).
- An IDE like IntelliJ IDEA or Eclipse.

### Step-by-Step Instructions

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/chloe514/ProjectOrderManagementSystem.git
   cd ProjectOrderManagementSystem

2.  Build the Project:

Use Maven to build the project and install dependencies:
mvn clean install

3. Run the Application:

You can run the application using the Spring Boot Maven plugin

Database Configuration
The application uses the H2 in-memory database by default, which requires no additional setup. To use a different database (e.g., MySQL), update application.properties with the appropriate connection details.

Running the Tests
To run the tests, use the following Maven command
mvn test

Accessing the Application
Once running, you can access the application endpoints using a tool like Postman or your browser at http://localhost:8080.







