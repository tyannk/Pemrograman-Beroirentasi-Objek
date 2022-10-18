import java.util.Scanner;
class Jumlah {
	public static void main(String[] args){
		int bil1, bil2, bil3;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Masukkan bilangan ke-1");
		bil1 = scan.nextInt();
		System.out.println("Masukkan bilangan ke-2");
		bil2 = scan.nextInt();
		bil3 = bil1 + bil2;
		System.out.println("Bil 1 + Bil 2 = " + bil3);
	}
}
		