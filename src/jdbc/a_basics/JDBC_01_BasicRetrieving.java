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

/********************************************* 3. Load Necessary Driver ********************************************/
/*
        Class.forName() -> Loads Driver class dynamically.
        -> Driver class contains a static block which registers the driver with DriverManager.
        -> com.mysql.cj.jdbc.Driver --> MySQL JDBC Driver Class.
        -> * Older Driver -> [ com.mysql.jdbc.Driver ]
        -> * Current MySQL Driver -> [ com.mysql.cj.jdbc.Driver ]
        Common Error -> ClassNotFoundException --> Usually occurs when JDBC JAR is not added correctly.

        NOTE -> Modern JDBC drivers can automatically load the driver, so Class.forName() is generally not required now. However, it is useful for understanding how the JDBC driver is loaded and registered.
*/
        Class.forName("com.mysql.cj.jdbc.Driver");

/********************************************* 4. Create Connection ********************************************/

///        Establish connection between Java Application and MySQL Database.

        Connection dataBaseConnection = DriverManager.getConnection(url, userName, password);
/*
        DriverManager -> Class
        Connection    -> Interface
        getConnection -> Method --> getConnection() may throw -> SQLTimeoutException, SQLException
*/
/********************************************* 5. Create Statement ********************************************/

///        Create Statement object to execute SQL queries.
/*
         Statement -> Interface
         createStatement() -> Method of Connection --> Returns a Statement object.
*/
        Statement dataBaseStatement = dataBaseConnection.createStatement();

/********************************************* 6. Execute Query********************************************/
/*
         executeQuery() -> Used for SELECT queries. --> Returns a ResultSet object.
         ResultSet -> Stores the data returned by the SELECT query.
                   -> Data is represented in tabular form.
*/
///        Execute SELECT Query
        ResultSet studentResultSet1 = dataBaseStatement.executeQuery(query1);

/*
         executeUpdate() -> Used for: [ INSERT, UPDATE, DELETE ] --> Returns the number of affected rows.
         -> IMPORTANT --> Do not execute another query while the current ResultSet is still being used.
*/
///        Insert Data Into Database
        int studentCount = dataBaseStatement.executeUpdate(query3);

        System.out.println(studentCount + " ROW(S) AFFECTED");

/********************************************* 7. Process and Get the Result ********************************************/
/**
        [ ResultSet cursor ] -> initially points before the first row.
        [ next() ] -> Moves the cursor to the next row.
        It returns:
            * true  -> if a row exists
            * false -> if no more rows exist
*/

    }
}