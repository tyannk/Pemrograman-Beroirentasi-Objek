package Exception;

import java.io.*;

class DemoEksepsi3 {

    public static void main(String[] args) {

        try {

            File myFile = new File("test.txt");

            myFile.createNewFile();

            System.out.println("File berhasil dibuat");

        } catch (IOException e) {

            System.out.println("File gagal dibuat");

        }

    }

}