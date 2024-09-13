 
---

# Spring Boot Actuator Lab - Book CRUD Application

## Overview

This project demonstrates the use of **Spring Boot Actuator** in a CRUD application for managing books. Actuator provides essential monitoring and management features to help you gain insights into your Spring Boot application’s health and performance.

The application is built using **Spring Boot**, **Spring Data JPA**, and **PostgreSQL** and secured using **Spring Security**. Actuator exposes various endpoints to monitor the application and has a custom endpoint to count the number of books in the system.

## Features

- **CRUD Operations**: Create, Read, Update, Delete functionality for books.
- **Spring Boot Actuator**: Enabled default endpoints such as `/actuator/health`, `/actuator/metrics`, and more.
- **Custom Endpoint**: `/actuator/book-count` to display the total number of books in the system.
- **Security**: Basic authentication for sensitive Actuator endpoints.
- **Monitoring Integration**: Optionally integrated with Prometheus for real-time metrics visualization.

## Endpoints

### Default Actuator Endpoints

- `/actuator/health`: Displays the health status of the application.
- `/actuator/info`: Displays custom information about the application.
- `/actuator/metrics`: Provides various performance metrics, including memory, CPU, and database stats.

### Custom Actuator Endpoints

- `/actuator/book-count`: Displays the total number of books in the system.

## Security

The Actuator endpoints are secured using **Basic Authentication**. Default username and password are:

- Username: `admin`
- Password: `adminpassword`

You can modify these credentials in the `application.properties` file.

## Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/SpActuatorsLab.git
   ```

2. **Configure the PostgreSQL Database**:
   Update the `application.properties` file with your PostgreSQL database credentials:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/books
   spring.datasource.username=postgres
   spring.datasource.password=yourpassword
   ```

3. **Run the application**:
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Access Actuator Endpoints**:
   Use **Postman** or your browser to interact with the following URLs:
    - `http://localhost:2500/actuator/health`
    - `http://localhost:2500/actuator/book-count`

5. **Access Secured Endpoints**:
   Use **Basic Authentication** in Postman to access the secured endpoints:
    - Username: `admin`
    - Password: `adminpassword`

## Customization

- To add more information to the `/actuator/info` endpoint, update the `application.properties` file:
   ```properties
   info.app.name=SpActuatorsLab
   info.app.version=1.0.0
   info.app.description=Spring Boot CRUD application with Actuator endpoints.
   ```

## Conclusion

This project provides a foundation for integrating Spring Boot Actuator into a CRUD application, demonstrating how to enable monitoring, add custom endpoints, and secure access to sensitive data. Actuator enhances the visibility of application performance and health, which is essential in production environments.