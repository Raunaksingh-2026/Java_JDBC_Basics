/// Telusko -> 23:12:00 - 1:00:34:00
/// -> 23:55:00

package jdbc.a_basics;

/*
=========================================================
                JDBC BASIC PROGRAM
---------------------------------------------------------
Features Covered:
1. Load JDBC Driver
2. Establish Database Connection
3. Create Statement
4. Execute SQL Query
5. Process ResultSet
6. Insert Data
7. Close JDBC Resources
=========================================================
*/
/**
1. Connect IDE with the Database
   -> Add MySQL Connector/J JAR file in External Libraries.
   Example -> mysql-connector-j-9.7.0.jar
*/

/********************************************* 2. Import SQL Package ********************************************/

import java.sql.*;

public class JDBC_01_BasicRetrieving {
    public static void main(String[] args) throws Exception {
/*
        JDBC URL Format -> jdbc:mysql://host:port/database_name
        Example -> jdbc:mysql://localhost:3306/sqldatabase1
*/
        String url = "jdbc:mysql://localhost:3306/sqldatabase1";

        String userName = "javaUser";
        String password = "Password";

//      ============================== SQL Queries ============================

//         Fetch selected columns from users table
        String query1 = "SELECT name, date_of_birth FROM users WHERE id >= 2";

//         Fetch all columns from users table
        String query2 = "SELECT * FROM users";

//         Insert a new user record into database
        String query3 = "INSERT INTO users " +
                        "(name, email, gender, date_of_birth) " +
                        "VALUES " +
                        "('Om Singh', 'om123@gmail.com', 'Male', '2007-04-29')";

    }
}