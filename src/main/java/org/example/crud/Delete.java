package org.example.crud;

import java.sql.Connection;
import java.sql.Statement;

public class Delete {
    public static void deleteUser(Connection connection){
        try(Statement statement = connection.createStatement()){
            String sql = "DELETE FROM usuarios WHERE name = 'Bob Johnson'";
            statement.executeUpdate(sql);
            System.out.println("Usuario eliminado exitosamente");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
