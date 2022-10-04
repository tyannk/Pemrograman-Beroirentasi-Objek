/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author LABPUSAT
 */
public class Hari {
    public static void main(String[] args){
    int kodeHari;
    String namaHari = "";
    Scanner scan = new Scanner(System.in);
    System.out.print("Kode Hari (0..6)=");
    kodeHari = scan.nextInt();
    
    if (kodeHari == 0){
        namaHari = "Minggu";
    }
    else if (kodeHari == 1){
        namaHari = "Senin";
    }
    else if (kodeHari == 2){
        namaHari = "Selasa";
    }
    else if (kodeHari == 3){
        namaHari = "Rabu";
    }
    else if (kodeHari == 4){
        namaHari = "Kamis";
    }
    else if (kodeHari == 5){
        namaHari = "Jumat";
    }
    else if (kodeHari == 6){
        namaHari = "Sabtu";
    }
    else {
        System.out.println("Kode yang anda input salah");
        
    }
    System.out.println("Hari: " + namaHari);
    }
    
}
