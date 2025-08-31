# course-backend
A full-stack Course Registration System built with Spring Boot (Backend),MySQL(DataBase) and a lightweight standalone frontend (HTML, CSS, JavaScript).
### Note
- The Backend is not deployed Yet so it may rise Error but the UI is completely deployed using Netify
```bash
https://course-reg-system.netlify.app
```
### The system allows users to:
- 🔎 View available courses
- 📝 Register for a course
- 👨‍🎓 View enrolled students

### This project is split into two repositories:

 🔹 Backend (Spring Boot): course-backend
```bash
https://github.com/seshathri044/course-backend
```
 🔹 Frontend (Standalone HTML/JS): course-frontend
```bash
https://github.com/seshathri044/course-frontend
```
## 🚀 Features

- ✅ REST API for managing courses and student enrollments
- ✅ Standalone frontend (no build tools, no frameworks required)
- ✅ Clean & professional UI 
- ✅ Responsive design (works on desktop & mobile)
- ✅ Easy integration between frontend ↔ backend ↔ DataBase
- ✅ Deployed in Netify
- ✅ MySQL database integration with Hibernate ORM
- ✅ Service & Repository layer abstraction
- ✅ Centralized configuration with application.properties
- ✅ Tested with Postman + verified in MySQL Workbench


## 🛠️ Tech Stack
**Backend (course-backend)**
- Java 17+
- Spring Boot
- Spring Data JPA / Hibernate
- MySQL 
- Maven

**Frontend (course-frontend)**
- HTML
- CSS
- JavaScript (Fetch API for REST calls)

📂 Project Structure
```bash
course-backend/        <-- REST API server (Spring Boot)
course-frontend/       <-- Standalone frontend (HTML/JS)
```


📸 Screenshots
**Homepage**
<img width="1920" height="1080" alt="CR1" src="https://github.com/user-attachments/assets/70d53708-f4ae-4f73-82e0-da4dbdc50282" />
**Registeration Page**
<img width="1920" height="1080" alt="CR2" src="https://github.com/user-attachments/assets/76c30e12-fcbc-4520-bef0-e233362c4855" />

**Available Courses**

**Enrolled Students**

## ⚡ Setup Instructions
**1️⃣ Clone Both Repositories**
**Backend**
```bash
git clone https://github.com/seshathri044/course-backend.git
```
**Frontend**
```bash
git clone https://github.com/seshathri044/course-frontend.git
```
**2️⃣ Run the Backend**
cd course-backend
mvn spring-boot:run
Backend will start at:
👉 http://localhost:8080

## API Endpoints:

- GET /courses → List available courses
- POST /courses/register → Register a student
- GET /courses/enrolled → List enrolled students

3️⃣ Run the Frontend

Simply open the frontend files in your browser:
- cd course-frontend
- Open index.html in browser


### Frontend Pages:
```bash
index.html → Homepage
register.html → Register a course
availcourses.html → View available courses
enrolled.html → View enrolled students
```
🔄 Repo Navigation

- Go to Backend Repo 👉 course-backend - https://github.com/seshathri044/course-frontend


## 🤝 Contributing
Contributions are welcome! Please follow these steps:
- Fork the repo
- Create your feature branch (git checkout -b feature/awesome-feature)
- Commit your changes (git commit -m 'Add awesome feature')
- Push to the branch (git push origin feature/awesome-feature)
- Open a Pull Request

## 📜 License
This project is licensed under the MIT License – see the LICENSE
 file for details.
