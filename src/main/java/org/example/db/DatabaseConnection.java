package org.example.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static final String USER = System.getenv("POSTGRES_USER");
    private static final String PASSWORD = System.getenv("POSTGRES_PASSWORD");
    private static final String BD_NAME = "usuarios_java";
    private static final String URL = "jdbc:postgresql://localhost:5432/" + BD_NAME;

    public static Connection connect(){
        Connection connection =  null;
        try{
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado a la base de datos de PostgreSQL");
        }catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
