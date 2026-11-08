/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author syahrilfarhan
 */
public interface ConnectionProvider {
    Connection getConnection() throws SQLException;
}
