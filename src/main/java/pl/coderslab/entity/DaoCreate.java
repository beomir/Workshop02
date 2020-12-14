package pl.coderslab.entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class DaoCreate {
    public static void main(String[] args) {
        daoCreate();
    }

    public static void daoCreate() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("User name: ");
        String userName = scanner.next();
        System.out.println("Email: ");
        String email = scanner.next();
        System.out.println("Password: ");
        String password = scanner.next();

        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName(userName);
        user.setEmail(email);
        user.setPassword(password);
        userDao.create(user);

        System.out.println("User: " + userName + " added to DB");
        Menu.menu();
    }


}

