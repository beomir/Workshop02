package pl.coderslab.entity;

import java.sql.Connection;
import java.sql.SQLException;

public class DaoReadAll {
    public static void daoReadAll() {

        try (
                Connection conn = DbUtil.getConnection()) {
            UserDao.readAll(conn, "Select * From users", "id", "email", "username", "password");

        } catch (
                SQLException throwables) {
            throwables.printStackTrace();
        }
        Menu.menu();
    }
}
