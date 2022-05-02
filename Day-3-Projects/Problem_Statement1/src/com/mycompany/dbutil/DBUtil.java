package com.mycompany.dbutil;

import java.sql.*;

public class DBUtil {

    //static method that creates a connection to the database and return the connection object
    public static Connection getConnection()
    {
        Connection conn = null;
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
        	//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "balu@1234");
           
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }

    //close connection
    public static void closeConnection(Connection conn)
    {
        try{
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


}