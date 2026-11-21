# 🏨 Hotel Management System

A desktop-based Hotel Management System developed using **Java, MySQL, and JDBC**. This project is designed to simplify hotel operations through a centralized application connected to a MySQL database.

## 🚀 Technologies Used

- **Programming Language:** Java
- **Database:** MySQL
- **Database Connectivity:** JDBC
- **IDE:** Apache NetBeans
- **Version Control:** Git & GitHub

## ✨ Project Overview

The Hotel Management System is a Java-based application that connects to a MySQL database to manage hotel-related information and operations.

## 🛠️ Installation and Setup

### 1. Clone the Repository

```bash
git clone https://github.com/Tarunreddy-k/Hotel-Management-System.git
```

### 2. Open the Project

- Open Apache NetBeans.
- Select File → Open Project.
- Choose the cloned project folder.

### 3. Configure MySQL

- Install and start MySQL Server.
- Create the database:

```sql
CREATE DATABASE hotelmanagementsystem;
```

- Set the following Windows environment variables:

```text
DB_URL=jdbc:mysql://localhost:3306/hotelmanagementsystem
DB_USER=root
DB_PASSWORD=your_mysql_password
```

### 4. Configure Database Driver

Ensure the MySQL Connector/J JDBC driver is available in the project libraries.

### 5. Run the Application

- Open the project in NetBeans.
- Build the project.
- Run the application.

## 🔐 Security

- Database credentials are read through environment variables.
- Sensitive configuration files are excluded using `.gitignore`.
- Database passwords are not hardcoded in the application source code.

## 👨‍💻 Developer

**Tarun K**

GitHub: [Tarunreddy-k](https://github.com/Tarunreddy-k)

---

⭐ If you find this project useful, consider giving the repository a star!
