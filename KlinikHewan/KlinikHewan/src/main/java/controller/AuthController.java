/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import modul.SessionUser;
import modul.UserItem;
import service.IAuthService;

/**
 *
 * @author 
 */

public class AuthController {

    private final IAuthService service;

    public AuthController(IAuthService service) {
        this.service = service;
    }

    public UserItem login(String username, String password) {
        UserItem user = service.login(username, password);
        SessionUser.id = user.getId();
        SessionUser.nama = user.getNama();
        SessionUser.username = user.getUsername();
        SessionUser.role = user.getRole();
        return user;
    }
}