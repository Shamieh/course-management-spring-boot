# 🎓 Course Management System (Backend)

## 📌 Overview
A Spring Boot backend system for managing university courses, students, instructors, and enrollments.  
The system supports:
- Student registration and course enrollment
- Semester-based scheduling
- Sections, Instructors (to be added)
- 
## ⚙️ Tech Stack
- **Backend Framework:** Spring Boot (v3+)
- **Database:** MySQL
- **ORM:** Hibernate / JPA
- **Build Tool:** Maven
- **Server:** Embedded Tomcat
- **Frontend (planned):** JSF (Jakarta Faces)


## Structure
```
├── entity/ # JPA Entities (Student, Course, Enrollment, Instructor, etc.)
├── repository/ # Spring Data JPA repositories
├── service/ # Business logic
├── controller/ # REST controllers (currently used)
├── config/ # Spring + JPA configuration
└── CourseManagementApplication.java
src/main/resources/
├── application.properties # Database configs
