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
public class Hari2 {
    public static void main(String[] args){
    int kodeHari;
    String namaHari = "";
    Scanner scan = new Scanner(System.in);
    System.out.print("Kode Hari (0..6)=");
    kodeHari = scan.nextInt();
    
    switch (kodeHari){
        case 0: namaHari = "Minggu";
                break;
        case 1: namaHari = "Senin";
                break;
        case 2: namaHari = "Selasa";
                break;
        case 3: namaHari = "Rabu";
                break;
        case 4: namaHari = "Kamis";
                break;
        case 5: namaHari = "Jumat";
                break;
        case 6: namaHari = "Sabtu";
                break;
        default: System.out.println("Kode yang anda input salah");
    }
    System.out.println("Hari: " + namaHari);
    }
    
}
