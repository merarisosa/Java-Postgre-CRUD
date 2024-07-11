package org.example.crud;

import java.sql.Connection;
import java.sql.Statement;

public class Update {
    public static void updateUsers(Connection connection){
        try (Statement statement = connection.createStatement()){
            String sql = "UPDATE usuarios SET email = 'alice.smith02@example.com' WHERE name = 'Alice Smith'";
            statement.executeUpdate(sql);
            System.out.println("Usuario actualizado exitosamente");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
