/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktor;

/**
 *
 * @author LABPUSAT
 */
public class Buku {
    String warna;
    int tahunProduksi;
    
    public Buku(String warna, int tahunProduksi){
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    public void info(){
        System.out.println("Warna: " + this.warna);
        System.out.println("Tahun: " + this.tahunProduksi);
    }
}
