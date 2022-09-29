import java.util.Scanner;
class Segitiga {
    public static void main(String[] args) {
        int tinggi, baris, kolom;
        Scanner scan = new Scanner(System.in);
        System.out.println("Tinggi Segitiga = ");
        tinggi = scan.nextInt();

        for (baris=1; baris<=tinggi; baris++){
            for (kolom=1; kolom<=baris; kolom++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}