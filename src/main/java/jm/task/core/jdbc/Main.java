package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


import java.util.List;


public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Мария", "Прокопенко", (byte) 32);
        System.out.println("User Мария добавлена");

        userService.saveUser("Юлия", "Васильева", (byte) 21);
        System.out.println("User Юлия добавлена");

        userService.saveUser("Владимир", "Сотников", (byte) 19);
        System.out.println("User Владимир добавлен");

        userService.saveUser("Александр", "Морозов", (byte) 39);
        System.out.println("User Александр добавлен");

        List<User> userList = userService.getAllUsers();
        userList.forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }


}

