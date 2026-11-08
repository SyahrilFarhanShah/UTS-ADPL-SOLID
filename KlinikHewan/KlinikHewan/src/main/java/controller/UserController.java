/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import modul.UserItem;
import service.UserService;
import java.util.List;
/**
 *
 * @author 
 */

public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    public List<UserItem> getAllUser() {
        return service.getAllUser();
    }

    public List<UserItem> searchUser(String keyword) {
        return service.searchUser(keyword);
    }

    public int getIdByUsername(String username) {
        return service.getIdByUsername(username);
    }

    public void addUser(UserItem user) {
        service.addUser(user);
    }

    public void updateUser(UserItem user, String newPassword) {
        service.updateUser(user, newPassword);
    }

    public void deleteUser(int id) {
        service.deleteUser(id);
    }
}