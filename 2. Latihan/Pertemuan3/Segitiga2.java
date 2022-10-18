import java.util.Scanner;
public class Segitiga2 {
    public static void main(String[] args) {
        int tinggi, baris, kolom;
        Scanner scan = new Scanner(System.in);
        System.out.print("Tinggi Segitiga = ");
        tinggi = scan.nextInt();

        for (kolom=1; kolom<=tinggi; kolom++){
            for (baris=0; kolom<=tinggi-baris; baris++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
