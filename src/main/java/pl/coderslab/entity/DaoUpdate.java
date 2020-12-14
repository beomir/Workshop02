package pl.coderslab.entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class DaoUpdate {
    public static void main(String[] args) {
        daoUpdate();
    }

    public static void daoUpdate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which user Id should be updated: ");
        String userId = scanner.next();
        int userIdUpdate = Integer.parseInt(userId);
        System.out.println("new user name: ");
        String userName = scanner.next();
        System.out.println("new email: ");
        String email = scanner.next();
        System.out.println("new password: ");
        String password = scanner.next();


        UserDao userDao = new UserDao();
        User userToUpdate = userDao.read(userIdUpdate);
        userToUpdate.setUserName(userName);
        userToUpdate.setEmail(email);
        userToUpdate.setPassword(password);
        userDao.update(userToUpdate);

        System.out.println("Update done. New configuration: User " + userId + " ,email: " + email + " , password" + password);
        Menu.menu();
    }
}
