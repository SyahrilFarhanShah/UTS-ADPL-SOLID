/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import modul.HewanItem;

/**
 *
 * @author syahrilfarhan
 */
public interface IHewanService {
    List<HewanItem> getAllHewan();
    List<HewanItem> searchHewan(String keyword);
    void addHewan(HewanItem item);
    void updateHewan(HewanItem item);
    void deleteHewan(int id);
}
