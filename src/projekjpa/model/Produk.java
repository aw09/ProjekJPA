/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekJPA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author student
 */
@Entity
public class Produk {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private String nama;
    private int harga;
    private String tipe;
    private int pergerakanHargaMin;
    private int pergerakanHargaMax;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getPergerakanHargaMin() {
        return pergerakanHargaMin;
    }

    public void setPergerakanHargaMin(int pergerakanHargaMin) {
        this.pergerakanHargaMin = pergerakanHargaMin;
    }

    public int getPergerakanHargaMax() {
        return pergerakanHargaMax;
    }

    public void setPergerakanHargaMax(int pergerakanHargaMax) {
        this.pergerakanHargaMax = pergerakanHargaMax;
    }
    
    
}
