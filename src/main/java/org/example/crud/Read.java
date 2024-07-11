package org.example.crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Read {

    public static void readUsers(Connection connection){
        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios")){

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");

                System.out.println("id: " + id + ", nombre: " + name + ", email: " + email);
            }
        }catch(Exception e){
           e.printStackTrace();
        }
    }
}
