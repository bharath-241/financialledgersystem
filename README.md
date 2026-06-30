# Financial Ledger System

A Spring Boot REST API application developed to manage financial ledger records, users, transactions, and audit logs using MySQL and Spring Data JPA.

## Features

- User Registration API
- Ledger Creation API
- Transaction Creation API
- Audit Log API
- Spring Data JPA Integration
- MySQL Database Integration
- Swagger API Documentation
- Exception Handling
- Layered Architecture (Controller, Service, Repository)

## Technologies Used

- Java 21
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- Maven
- Swagger (OpenAPI)
- Lombok

## Project Structure

```
src
├── controller
├── dto
├── entity
├── repository
├── security
├── service
├── service/impl
└── resources
```

## REST APIs

### User API
- POST /api/users/register

### Ledger API
- POST /api/ledger/create

### Transaction API
- POST /api/transactions/create

### Audit Log API
- POST /api/audit/create

## Database Tables

- users
- ledger
- transactions
- audit_log

## Swagger UI

```
http://localhost:8080/swagger-ui/index.html
```

## GitHub Repository

```
https://github.com/bharath-241/financialledgersystem
```

## Author

**Bharath Kumar Malli**
