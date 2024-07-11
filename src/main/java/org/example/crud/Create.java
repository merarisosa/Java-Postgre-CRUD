package org.example.crud;

import java.sql.Connection;
import java.sql.Statement;

public class Create {
    public static void createUsers(Connection connection){
        try(Statement statement = connection.createStatement()){
            String sql = "INSERT INTO usuarios (name, email) VALUES ('Juanito Lopez', 'juanito@example.com')";
            statement.executeUpdate(sql);
            System.out.println("Usuario creado exitosamente");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
