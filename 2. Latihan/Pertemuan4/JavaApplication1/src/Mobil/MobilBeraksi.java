/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobil;

/**
 *
 * @author LABPUSAT
 */
public class MobilBeraksi {
    public static void main(String[] args){
        // Membuat object
        Mobil mobilku = new Mobil();
        
        // Memanggil atribut dan memberi nilai
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2006;
        System.out.println("Warna " + mobilku.warna);
        System.out.println("Tahun " + mobilku.tahunProduksi);
       
    }
}
