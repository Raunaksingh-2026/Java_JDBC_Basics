<h1 align="center">🗄️ Java JDBC Learning</h1>

<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=24&pause=1000&color=36BCF7&center=true&vCenter=true&width=750&lines=Java+JDBC+Learning+Repository;Connecting+Java+with+MySQL;Learning+SQL+and+Database+Operations;Statement+PreparedStatement+DAO+and+More" alt="Typing SVG" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/JDBC-Java%20Database%20Connectivity-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white"/>
  <img src="https://img.shields.io/badge/Status-Active-success?style=for-the-badge"/>
</p>

---

## 🚀 Repository Overview

A beginner-friendly **Java JDBC learning repository** created to understand how Java applications connect and interact with databases.

This repository contains practical programs and notes covering **JDBC basics, SQL, Statement, PreparedStatement, Batch Processing, Advanced JDBC concepts, and DAO Design Pattern**.

The main goal of this repository is to learn JDBC step by step by writing practical Java programs.

---

## ✨ Topics Covered

### 🟢 JDBC Basics

- JDBC Introduction
- JDBC Architecture
- JDBC Driver
- JDBC URL
- Database Connection
- DriverManager
- Connection
- Statement
- ResultSet
- Retrieving Data from Database

### 🟡 PreparedStatement

- Parameterized SQL Queries
- Inserting Data
- Preventing SQL Injection
- Reusable SQL Queries

### 🟠 Advanced JDBC

- Batch Processing
- Transactions
- Advanced Database Operations

### 🔵 DAO Design Pattern

- Data Access Object (DAO)
- Separating Database Code from Business Logic
- Clean Code Structure
- Reusable Database Operations

### 🟣 SQL

- SQL Introduction
- Database Creation
- Table Creation
- SQL Queries

---

## 🛠️ Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| JDBC | Database Connectivity |
| MySQL | Database Management System |
| SQL | Database Queries |
| MySQL Connector/J | JDBC Driver |
| IntelliJ IDEA | Development Environment |

---

## 🏗️ JDBC Architecture

```text
Java Application
        │
        ↓
     JDBC API
        │
        ↓
   JDBC Driver
        │
        ↓
  MySQL Database
```

---

## ⚙️ JDBC Working Flow

```text
Create Database
       ↓
Create Table
       ↓
Add JDBC Driver
       ↓
Import java.sql Package
       ↓
Create Database Connection
       ↓
Create Statement / PreparedStatement
       ↓
Execute SQL Query
       ↓
Process ResultSet
       ↓
Close Resources
```

---

## 📂 Project Structure

```text
jdbcJavaBasic
│
├── src
│   │
│   ├── jdbc
│   │   │
│   │   ├── a_basics
│   │   │   ├── JDBC_01_BasicRetrieve...
│   │   │   ├── JDBC_02_BasicInsert...
│   │   │   └── JDBC_03_Retrieving...
│   │   │
│   │   ├── b_preparedstatement
│   │   │   └── JDBC_04_Inserting...
│   │   │
│   │   ├── c_advance
│   │   │   └── JDBC_07_BatchProcessing...
│   │   │
│   │   ├── d_daodesignpattern
│   │   │   ├── JDBC_09_DesignPattern...
│   │   │   └── Main.java
│   │   │
│   │   └── JDBC_0_Basics.txt
│   │
│   └── sql
│       └── SQL_0_1_Introduction...
│
├── .gitignore
│
├── README.md
│
└── jdbcJavaBasic.iml
```

---

## 📚 JDBC Important Components

| Class / Interface | Purpose |
|-------------------|---------|
| `DriverManager` | Creates database connection |
| `Connection` | Represents database connection |
| `Statement` | Executes static SQL queries |
| `PreparedStatement` | Executes parameterized SQL queries |
| `CallableStatement` | Executes stored procedures |
| `ResultSet` | Stores data returned by SELECT query |

---

## 🔗 JDBC URL Format

```text
jdbc:mysql://host:port/database_name
```

### Example

```text
jdbc:mysql://localhost:3306/database_name
```

## 🔄 Learning Progress

```text
SQL Basics                 ██░░░░░░░░ 20%

JDBC Introduction          █████░░░░░ 50%

Database Connection        █░░░░░░░░░ 10%

Statement                  █░░░░░░░░░ 10%

PreparedStatement          █░░░░░░░░░ 10%

ResultSet                  █░░░░░░░░░ 10%

Batch Processing           ░░░░░░░░░░ 0%

Advanced JDBC              ░░░░░░░░░░ 0%

Transactions               ░░░░░░░░░░ 0%

DAO Design Pattern         ░░░░░░░░░░ 0%
```

---

## 🔮 Future Learning

* Complete CRUD Operations
* Transactions
* Exception Handling in JDBC
* Try-With-Resources
* CallableStatement
* Stored Procedures
* ResultSetMetaData
* DatabaseMetaData
* Complete DAO Implementation
* Build a JDBC-Based Project

---

## 👨‍💻 Author

**Raunak Singh**

Learning Java step by step and building practical programs to strengthen understanding of **Java, SQL, JDBC, MySQL, and Backend Development**.

---
