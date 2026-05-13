# Spring Boot Security

This project is created for learning Spring Security with Spring Boot.

## Features

- Basic Authentication
- In-Memory Authentication
- Multiple Users
- Role-Based Authorization
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

## Endpoints

| Endpoint | Access |
|----------|--------|
| /hello | Any Authenticated User |
| /user | USER Role |
| /admin | ADMIN Role |

## Concepts Learned

- UserDetails
- UserDetailsService
- InMemoryUserDetailsManager
- HttpSecurity
- requestMatchers()
- hasRole()
- httpBasic()
- SecurityFilterChain