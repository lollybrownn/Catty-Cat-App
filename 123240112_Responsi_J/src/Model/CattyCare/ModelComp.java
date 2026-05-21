/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.CattyCare;

/**
 *
 * @author Lab Informatika
 */
public class ModelComp {
    
    private Integer id, lama_penitipan, biaya;
    private String nama_pemilik, nama_kucing, nomor_telpon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLama_penitipan() {
        return lama_penitipan;
    }

    public void setLama_penitipan(Integer lama_penitipan) {
        this.lama_penitipan = lama_penitipan;
    }

    public Integer getBiaya() {
        if (this.lama_penitipan<=2) {
            return biaya = 40000 * this.lama_penitipan;
        } else {
            return biaya = 30000 * this.lama_penitipan;
        }
        
    }

    public String getNama_pemilik() {
        return nama_pemilik;
    }

    public void setNama_pemilik(String nama_pemilik) {
        this.nama_pemilik = nama_pemilik;
    }

    public String getNama_kucing() {
        return nama_kucing;
    }

    public void setNama_kucing(String nama_kucing) {
        this.nama_kucing = nama_kucing;
    }

    public String getNomor_telpon() {
        return nomor_telpon;
    }

    public void setNomor_telpon(String nomor_telpon) {
        this.nomor_telpon = nomor_telpon;
    }
    
    
}
