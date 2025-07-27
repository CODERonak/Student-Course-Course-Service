---

# 📘 Course-Service – Course Management Microservice

---

## 🚧 Status: In Development

> ⚠️ **This microservice is currently under active development.**
> Some features may be incomplete, unstable, or subject to change.
> It's a simple microservice project.
> Purpose is to understand the fundamentals or basics of microservices.

---

## 🎯 Objective

This service manages **course data** (such as title, description, and instructor info) as part of a **Student-Course Management System** built using Spring Boot and a microservices architecture. It interacts with services like `student-service` and `enrollment-service`.

---

## ✨ Features

* **Course CRUD Operations:** Create, retrieve, and delete course data.
* **Admin-Controlled Access:** Only admins can create or delete courses.
* **Inter-Service Compatibility:** Works with `enrollment-service` for course validation.
* **Data Validation:** Ensures clean and consistent input through DTO validation.

---

## 🛠️ Technologies Used

* **Spring Boot** – Java microservice framework
* **Spring Security** – Role-based and JWT-secured authentication
* **Spring Data JPA** – Simplified data persistence
* **MySQL** – Relational database
* **Java 17+** – Modern Java features and performance
* **Lombok** – Reduces boilerplate code
* **MapStruct** – DTO ↔ Entity mappers
* **Feign/WebClient** – REST-based inter-service communication

---

## 📦 Project Structure

```
course-service/
├── controller/                          # API endpoints
├── dto/                                 # DTOs for request/response
├── model/                               # JPA entity
├── repository/                          # DB access layer
├── service/                             # Business logic
├── application.properties               # Configuration
└── pom.xml                              # Maven dependencies
```

---

## 📚 API Endpoints

| Method   | Endpoint        | Description             |
| -------- | --------------- | ----------------------- |
| `GET`    | `/courses`      | List all courses        |
| `GET`    | `/courses/{id}` | Get details of a course |
| `POST`   | `/courses`      | Create a new course     |
| `DELETE` | `/courses/{id}` | Delete a course         |

---

## 🌐 API Integration

This service communicates with:

* 🔗 `enrollment-service` (coming soon): Validates course IDs during enrollment operations

---

## 🔗 Related Microservices

| Service                                                                             | Description                             | Repository                                                            |
| ----------------------------------------------------------------------------------- | --------------------------------------- | --------------------------------------------------------------------- |
| 🎓 [`student-service`](https://github.com/CODERonak/Student-Course-Student-Service) | Manages student profile info            | [GitHub](https://github.com/CODERonak/Student-Course-Student-Service) |
| 📘 `course-service`                                                                 | *You are here*                          | –                                                                     |
| 🔗 `enrollment-service` (coming soon)                                               | Student-course enrollment relationships | –                                                                     |

---

## 🧩 Database

Each microservice uses its **own database**.
This service connects to **MySQL** with its own schema or instance, maintaining clean separation of concerns and modular deployment.

---