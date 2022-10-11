package Exception;

import java.io.*;

class DemoEksepsi2 {

    public static void main(String[] args) {
        File myFile = new File("test.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}