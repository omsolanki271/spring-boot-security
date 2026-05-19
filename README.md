# Spring Boot Security

This project is created for learning Spring Security with Spring Boot.

## Features

- Basic Authentication
- In-Memory Authentication
- JDBC Authentication
- Multiple Users
- Role-Based Authorization
- Public and Protected Endpoints
- SecurityFilterChain Configuration
- MySQL Database Integration

## Technologies Used

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- Maven

## Users

| Username | Password | Role |
|----------|----------|------|
| user1 | 123 | USER |
| user2 | 123 | USER |
| admin | 123 | ADMIN |

## API Endpoints

| Endpoint | Access |
|----------|--------|
| / | Public |
| /user | USER Role |
| /admin | ADMIN Role |

## Security Concepts

- UserDetails
- UserDetailsService
- InMemoryUserDetailsManager
- JdbcUserDetailsManager
- HttpSecurity
- requestMatchers()
- hasRole()
- permitAll()
- httpBasic()
- SecurityFilterChain
- DataSource

## Authentication Flow

```text
Client Request
      ↓
SecurityFilterChain
      ↓
HttpSecurity Rules
      ↓
UserDetailsService
      ↓
JdbcUserDetailsManager
      ↓
MySQL Database
      ↓
Authentication Success
```

## Database Configuration

```properties
spring.datasource.url=jdbc:mysql://localhost:3307/spring_security
spring.datasource.username=root
spring.datasource.password=abc123

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Project Structure

```text
src
 └── main
      ├── java
      │     └── com.project.securityapplication
      │              ├── SecurityApplication.java
      │              ├── SecurityConfig.java
      │              └── HelloController.java
      │
      └── resources
             └── application.properties
```

## Learning Progress

Completed Topics:

- Spring Boot Setup
- Spring Security Setup
- Custom Username & Password
- Basic Authentication
- In-Memory Authentication
- JDBC Authentication
- Multiple Users
- Role-Based Authorization
- Public Endpoint Access
- SecurityFilterChain Configuration
- MySQL Configuration
- JdbcUserDetailsManager
- DataSource Configuration

## Future Goals

- Password Encoder
- BCrypt Password Hashing
- Custom UserDetailsService
- JWT Authentication
- Custom Login API
- Exception Handling
- Refresh Token