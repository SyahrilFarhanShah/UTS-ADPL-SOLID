/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul;

/**
 *
 * @author 
 */

public class ReservasiItem {

    private int id;

    private int idCustomer;
    private String namaCustomer;

    private int idHewan;
    private String namaHewan;

    private int idDokter;
    private String namaDokter;

    private int idLayanan;
    private String namaLayanan;

    private double totalHarga;
    private String status;  

    public ReservasiItem(int id,int idCustomer,String namaCustomer,int idHewan,String namaHewan,
            int idDokter,String namaDokter,int idLayanan,String namaLayanan,double totalHarga) {

        this.id = id;
        this.idCustomer = idCustomer;
        this.namaCustomer = namaCustomer;
        this.idHewan = idHewan;
        this.namaHewan = namaHewan;
        this.idDokter = idDokter;
        this.namaDokter = namaDokter;
        this.idLayanan = idLayanan;
        this.namaLayanan = namaLayanan;
        this.totalHarga = totalHarga;
    }

    public ReservasiItem(int id, int idCustomer, String namaCustomer, int idHewan, 
                         String namaHewan, int idDokter, String namaDokter, 
                         int idLayanan, String namaLayanan, double totalHarga, String status) {
        this.id = id;
        this.idCustomer = idCustomer;
        this.namaCustomer = namaCustomer;
        this.idHewan = idHewan;
        this.namaHewan = namaHewan;
        this.idDokter = idDokter;
        this.namaDokter = namaDokter;
        this.idLayanan = idLayanan;
        this.namaLayanan = namaLayanan;
        this.totalHarga = totalHarga;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public int getIdHewan() {
        return idHewan;
    }

    public int getIdDokter() {
        return idDokter;
    }

    public int getIdLayanan() {
        return idLayanan;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public String getStatus() {
        return status;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }
}

