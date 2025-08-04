
# Summer Camp Project

## Overview
The SummerCampProject is a Spring Boot application that provides a web service for managing student records. It supports HTTP CRUD operations on a "student" table, allowing users to create, read, update, and delete student information.

## Features
- CRUD operations for student records
- Student entity with the following attributes:
  - `id`: Long
  - `name`: String
  - `sex`: String
  - `age`: Integer
  - `email`: String
  - `register_date`: LocalDate

## Project Structure
```
SummerCampProject
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── summercamp
│   │   │           ├── SummerCampProjectApplication.java
│   │   │           ├── controller
│   │   │           │   └── StudentController.java
│   │   │           ├── model
│   │   │           │   └── Student.java
│   │   │           ├── repository
│   │   │           │   └── StudentRepository.java
│   │   │           └── service
│   │   │               └── StudentService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── schema.sql
├── pom.xml
└── README.md
```

## Setup Instructions
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd SummerCampProject
   ```
3. Build the project using Maven:
   ```
   mvn clean install
   ```
4. Run the application:
   ```
   mvn spring-boot:run
   ```

## Usage
- The application exposes RESTful endpoints for managing student records.
- Use tools like Postman or curl to interact with the API.

## Dependencies
- Spring Web
- Spring Data JPA
- Database driver (e.g., H2, MySQL)

## License
This project is licensed under the MIT License.


