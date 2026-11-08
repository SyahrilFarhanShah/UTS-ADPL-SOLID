/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author syahrilfarhan
 */
/** Satu-satunya tempat konfigurasi koneksi MySQL (SRP). */
public class MySqlConnectionProvider implements ConnectionProvider {

    private static final String URL  = "jdbc:mysql://localhost:3306/db_klinik_hewan";
    private static final String USER = "root";
    private static final String PASS = "";

    @Override
    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver MySQL tidak ditemukan", e);
        }
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
