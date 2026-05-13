# Spring Boot Security

This project is created for learning Spring Security with Spring Boot.

## Features

- Basic Authentication
- In-Memory Authentication
- Multiple Users
- Role-Based Authorization
- Public and Protected Endpoints
- SecurityFilterChain Configuration

## Technologies Used

- Java 21
- Spring Boot
- Spring Security
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
| /hello | Any Authenticated User |
| /user | USER Role |
| /admin | ADMIN Role |

## Security Concepts

- UserDetails
- UserDetailsService
- InMemoryUserDetailsManager
- HttpSecurity
- requestMatchers()
- hasRole()
- permitAll()
- httpBasic()
- SecurityFilterChain

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
InMemoryUserDetailsManager
      ↓
Authentication Success
````

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

* Spring Boot Setup
* Spring Security Setup
* Custom Username & Password
* Basic Authentication
* In-Memory Authentication
* Multiple Users
* Role-Based Authorization
* Public Endpoint Access
* SecurityFilterChain Configuration

## Future Goals

* Password Encoder
* BCrypt Password Hashing
* Database Authentication
* JWT Authentication
* Custom Login API
* Exception Handling

````
