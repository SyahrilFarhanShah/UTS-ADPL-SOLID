/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import modul.UserItem;
import java.sql.*;

/**
 *
 * @author Ray Wishnu
 */
public class AuthService implements IAuthService {
    private final ConnectionProvider provider;

    public AuthService(ConnectionProvider provider) {
        this.provider = provider;
    }

    private Connection getConnection() throws Exception {
        return provider.getConnection();
    }

    public UserItem login(String username, String password) {
        validateInput(username, password);

        String sql = """
            SELECT
                id_user,
                nama,
                username,
                password,
                role
            FROM user
            WHERE username = ?
            """;

        try (
            Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, username.trim());
            ResultSet rs = ps.executeQuery();

            if (!rs.next()) {
                throw new RuntimeException("Username tidak ditemukan!");
            }

            String passwordDb = rs.getString("password");
            if (!password.equals(passwordDb)) {
                throw new RuntimeException("Password salah!");
            }

            UserItem user = new UserItem(rs.getInt("id_user"),rs.getString("nama"),rs.getString("username"),rs.getString("role"));

            return user;

        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException("Gagal koneksi database : "+ e.getMessage(),e);
        }
    }

    private void validateInput(
            String username,
            String password
    ) {

        if (username == null || username.trim().isEmpty()) {
            throw new RuntimeException("Username tidak boleh kosong!");
        }

        if (password == null || password.isEmpty()) {
            throw new RuntimeException("Password tidak boleh kosong!");
        }
    }
}
