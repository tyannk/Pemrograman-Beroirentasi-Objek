/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sepeda;

/**
 *
 * @author LABPUSAT
 */
public class SepedaBeraksi {
    public static void main(String[] args){
        //Membuat object
        Sepeda sepedaku = new Sepeda();
        
        // memanggil atribut dan memberi nilai
        sepedaku.kecepatan=10;
        sepedaku.gir=2;
        //Memanggil method dan menunjuk nilai parameter
        sepedaku.tambahKecepatan(30);
        sepedaku.ubahGir(3);
    }
}
