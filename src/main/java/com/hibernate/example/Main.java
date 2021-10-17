package com.hibernate.example;

import com.hibernate.example.models.Auto;
import com.hibernate.example.models.User;
import com.hibernate.example.services.UserService;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        User user = new User("Masha",26);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari", "red");
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);
        user.setName("Sasha");
        userService.updateUser(user);

        userService.closeConnection();

        System.out.println("helpful link: https://javarush.ru/groups/posts/hibernate-java");
    }
}
