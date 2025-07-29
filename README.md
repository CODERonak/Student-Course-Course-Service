# 📘 Course-Service – Course Management Microservice

## ✅ Status: Completed

Handles all operations related to courses within the Student-Course System.

---

## 🎯 Objective

Provides endpoints for creating, retrieving, and deleting course data. Validates course info and enforces admin-only access for mutations.

---

## ✨ Features

- Course creation, deletion, retrieval
- Admin-role protected endpoints
- DTO validation
- Communicates with enrollment service

---

## 🛠️ Tech Stack

- Spring Boot
- Spring Security + JWT
- Spring Data JPA + MySQL
- Java 17+, Lombok, MapStruct
- Feign / WebClient

---

## 📚 API Endpoints

| Method   | Endpoint        | Description             |
|----------|-----------------|-------------------------|
| GET      | /courses        | List all courses        |
| GET      | /courses/{id}   | Get course by ID        |
| POST     | /courses        | Create a new course     |
| DELETE   | /courses/{id}   | Delete a course         |

---

## 🔗 Related Services

| Service | Description | Repository |
|--------|-------------|------------|
| 🎓 [`student-service`](https://github.com/CODERonak/Student-Course-Student-Service) | Student profiles | [GitHub](https://github.com/CODERonak/Student-Course-Student-Service) |
| 🔗 [`enrollment-service`](https://github.com/CODERonak/Student-Course-Enrollment-Service) | Enrollment logic | [GitHub](https://github.com/CODERonak/Student-Course-Enrollment-Service) |
| 🧭 [`eureka-server`](https://github.com/CODERonak/Student-Course-Eureka-Server) | Service discovery | [GitHub](https://github.com/CODERonak/Student-Course-Eureka-Server) |
