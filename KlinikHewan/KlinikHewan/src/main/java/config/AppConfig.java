/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import controller.*;
import service.*;
/**
 *
 * @author syahrilfarhan
 */
public final class AppConfig {

    private static final ConnectionProvider PROVIDER = new MySqlConnectionProvider();

    private AppConfig() {
    }

    public static AuthController authController() {
        return new AuthController(new AuthService(PROVIDER));
    }

    public static HewanController hewanController() {
        return new HewanController(new HewanService(PROVIDER));
    }

    public static LayananController layananController() {
        return new LayananController(new LayananService(PROVIDER));
    }

    public static ReservasiController reservasiController() {
        return new ReservasiController(new ReservasiService(PROVIDER));
    }

    public static UserController userController() {
        return new UserController(new UserService(PROVIDER));
    }
}
