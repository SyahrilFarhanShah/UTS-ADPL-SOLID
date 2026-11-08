/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import modul.ReservasiItem;

/**
 *
 * @author syahrilfarhan
 */
public interface IReservasiService {
    List<ReservasiItem> getAllTransaksi();
    List<ReservasiItem> searchTransaksi(String keyword);
    List<ReservasiItem> getByDokter(int idDokter);
    List<ReservasiItem> getByCustomer(int idCustomer);
    void addTransaksi(ReservasiItem item);
    void updateTransaksi(ReservasiItem item);
    void deleteTransaksi(int id);
    void updateStatusTransaksi(int id, String status);

    /** Aturan bisnis: harga diambil dari layanan, dokter dipilih otomatis, status pending. */
    void buatReservasi(int idCustomer, int idHewan, int idLayanan);
}
