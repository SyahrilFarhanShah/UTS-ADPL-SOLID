/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import modul.ReservasiItem;
import service.IReservasiService;
import java.util.List;
/**
 *
 * @author 
 */
public class ReservasiController {

    private final IReservasiService service;

    public ReservasiController(IReservasiService service) {
        this.service = service;
    }

    public List<ReservasiItem> getAllTransaksi() {
        return service.getAllTransaksi();
    }

    public List<ReservasiItem> searchTransaksi(String keyword) {
        return service.searchTransaksi(keyword);
    }

    public List<ReservasiItem> getByDokter(int idDokter) {
        return service.getByDokter(idDokter);
    }

    public List<ReservasiItem> getByCustomer(int idCustomer) {
        return service.getByCustomer(idCustomer);
    }

    public void addTransaksi(ReservasiItem item) {
        service.addTransaksi(item);
    }

    public void updateTransaksi(ReservasiItem item) {
        service.updateTransaksi(item);
    }

    public void deleteTransaksi(int id) {
        service.deleteTransaksi(id);
    }

    public void buatReservasi(int idCustomer, int idHewan, int idLayanan) {
        service.buatReservasi(idCustomer, idHewan, idLayanan);
    }
    
    public void updateStatusTransaksi(int id, String status) {
        service.updateStatusTransaksi(id, status);
    }
}
