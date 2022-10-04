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
public class TigaOper {
    public static void main(String[] args){
    int usia;
    String pesan;
    Scanner scan = new Scanner(System.in);
    System.out.println("Usia anda berapa tahun = ");
    usia = scan.nextInt();

    pesan = usia < 17 ?
            "Sorry Ya, Hanya untuk yang 17++" :
            "Boleh kok bergabung dengan kami";
        System.out.println(pesan);
    }
}
