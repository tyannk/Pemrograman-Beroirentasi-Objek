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
public class Mobil2Beraksi {
    public static void main(String[] args){
        //Membuat Object
        Mobil2 mobilku = new Mobil2();
        
        //Memanggil atribut dan memberi nilai
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2006;
        mobilku.printMobil();
    }
}
