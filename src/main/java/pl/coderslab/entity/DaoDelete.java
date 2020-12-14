package pl.coderslab.entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class DaoDelete {
    public static void main(String[] args) {
        daoDelete();
    }

    public static void daoDelete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which index should be deleted: ");
        String row = scanner.next();
        int rowToDelete = Integer.parseInt(row);

        UserDao userDao = new UserDao();
        userDao.delete(rowToDelete);
        System.out.println("Index " + rowToDelete + " deleted from data base");
        Menu.menu();
    }
}

