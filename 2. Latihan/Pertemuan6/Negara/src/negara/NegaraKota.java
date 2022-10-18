/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negara;

/**
 *
 * @author LABPUSAT
 */
public class NegaraKota {
    public static void main(String[] args){        
        /*
        String[][] NegaraKota = {
        {"Amerika", "Washington DC"}, 
        {"Inggris", "London"}, 
        {"Jepang", "Tokyo"},
        {"Perancis", "Paris"},
        {"Indonesia", "Jakarta"},
        {"Iran", "Taheran"},
        {"Irak", "Bagdad"}};
        */
        
        String[][] NegaraKota = {
            {"Amerika", "Inggris", "Jepang", "Perancis", "Indonesia", "Iran", "Irak"},
            {"Washington DC", "London", "Tokyo", "Paris", "Jakarta", "Taheran", "Bagdad"}};

        System.out.println("Ibu Kota " + NegaraKota[0][0] + " adalah " + NegaraKota[1][0]);
        System.out.println("Ibu Kota " + NegaraKota[0][1] + " adalah " + NegaraKota[1][1]);
        System.out.println("Ibu Kota " + NegaraKota[0][2] + " adalah " + NegaraKota[1][2]);
    }
    
}
