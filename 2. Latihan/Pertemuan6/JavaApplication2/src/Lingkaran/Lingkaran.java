/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lingkaran;

/**
 *
 * @author LABPUSAT
 */
public class Lingkaran {
    void hitungLuas(double r){
        double phi = 3.141592;
        double hasil = phi*r*r;
        System.out.println("Luas lingkaran dalam bentuk bilangan pecahan= " + phi*r*r);
        int konv_int = (int)hasil;
        System.out.println("Luas lingkaran dalam bentuk bilangan bulat= " + konv_int);
    }
}
