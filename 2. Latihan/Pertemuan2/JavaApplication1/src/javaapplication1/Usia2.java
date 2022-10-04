/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
class Usia2{
    public static void main(String[] args){
        int usia;
        String pesan = "boleh kok bergabung dengan kami";
        Scanner scan = new Scanner(System.in);
        System.out.println("Usia anda berapa tahun = ");
        usia = scan.nextInt();

        if (usia > 17){
            System.out.println(pesan);
        }
        else{
            pesan = "Sorry Ya, Hanya untuk yang 17++";
            System.out.println(pesan);
        }
    }
}

		
