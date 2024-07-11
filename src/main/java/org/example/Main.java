package org.example;

import org.example.crud.Create;
import org.example.crud.Delete;
import org.example.crud.Read;
import org.example.crud.Update;
import org.example.db.DatabaseConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.connect();

        if(connection != null){
            Create.createUsers(connection);
            Read.readUsers(connection);
            Update.updateUsers(connection);
            Delete.deleteUser(connection);
        }
    }
}