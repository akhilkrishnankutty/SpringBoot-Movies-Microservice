# 🎥 Movie Microservices Project

A distributed microservices movie application built using Spring Boot, Spring Cloud Netflix Eureka, PostgreSQL, and Docker. It includes backend logic, an API gateway, and service discovery via a Eureka Server.

---

## 🧱 Microservices Overview

### 1. 🧭 Move-finderService (Eureka Server)
- **Role:** Acts as the **Eureka Service Registry Server**.
- **Technologies:** Spring Boot, Spring Cloud Eureka Server
- **Responsibilities:**
  - Maintains a registry of all microservices in the system
  - Enables dynamic service discovery
- **Port:** Default `8761` (unless configured)
- **Docker Image:** `movie_service_finder.jar`
- **UI Console:** Access Eureka dashboard at `http://localhost:8761`

---

### 2. 🌐 Moveis-api-gateway
- **Role:** Gateway service that routes client requests to appropriate microservices.
- **Technologies:** Spring Cloud Gateway, Eureka Client
- **Port:** `8031`
- **Features:**
  - Dynamic route discovery via Eureka
  - Central access point for all internal services

---

### 3. 🗃️ movie_backend
- **Role:** Manages core movie data and database interaction.
- **Technologies:** Spring Boot, Spring Data JPA, PostgreSQL
- **Database Configuration:**
  - JDBC: `jdbc:postgresql://localhost:5432/Movie`
  - User: `postgres`
  - Password: `4567`
- **Hibernate:** `ddl-auto=create`
- **Port:** `8082` (assumed)
- **Docker Image:** `movie-backend.jar`

---

### 4. 🎨 Movie_front_end
- **Role:** Frontend interface for users to interact with movie data.
- **Technologies:** Spring Boot (could serve JSP or proxy frontend SPA)
- **Port:** `8021`
- **Eureka Client:** Yes (auto-registered)
- **Docker Image:** `movie_front.jar`

---

## 🐳 Docker Deployment

Example `docker-compose.yml` setup:

```yaml
version: '3.8'
services:
  eureka_server:
    build:
      context: ./Move-finderService
    ports:
      - "8761:8761"

  api_gateway:
    build:
      context: ./Moveis-api-gateway
    ports:
      - "8031:8031"
    depends_on:
      - eureka_server

  movie_backend:
    build:
      context: ./movie_backend
    ports:
      - "8082:8082"
    depends_on:
      - eureka_server

  front_end:
    build:
      context: ./Movie_front_end
    ports:
      - "8021:8021"
    depends_on:
      - eureka_server
```
## 🧪 Technologies Used  
- Java 17+  

- Spring Boot  

- Spring Cloud Eureka (Server + Clients)  

- Spring Cloud Gateway  

- Spring Data JPA  

- PostgreSQL  

- Docker  


## 👨‍💻 Author  
Developed by AKHIL M  

🚀 Cloud-Native Enthusiast | ☁️ DevOps Learner | 🧠 AI Builder

