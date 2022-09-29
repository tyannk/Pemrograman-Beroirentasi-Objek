import java.util.Scanner;
class Usia{
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