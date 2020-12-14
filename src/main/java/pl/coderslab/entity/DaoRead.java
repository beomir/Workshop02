package pl.coderslab.entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class DaoRead {
    public static void main(String[] args) {
        daoRead();
    }

    public static void daoRead() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which index should be readed: ");
        String rowToRead = scanner.next();
        int rowToReadInt = Integer.parseInt(rowToRead);

        UserDao userDao = new UserDao();
        User read = userDao.read(rowToReadInt);
        System.out.println(read.toString());
        Menu.menu();

    }


}
