
import java.util.Scanner;
class MenentukanNilaiMahasiswa{
    public static void main(String[] args){
        // inisialisasi variable
        float nilaiAkhir, nilaiUAS, nilaiTugas, nilaiUTS;
        String keterangan;
        char grade = ' ';

        // input user
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan nilai tugas :");
            nilaiTugas = sc.nextFloat();
            System.out.print("Masukkan nilai UTS :");
            nilaiUTS = sc.nextFloat();
            System.out.print("Masukkan nilai UAS :");
            nilaiUAS = sc.nextFloat();
        }

        // proses pengolahan data
        nilaiAkhir = (float) ((nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4));
        if (nilaiAkhir >= 60){
            keterangan = "Lulus";
            if (nilaiAkhir >= 80){
                grade = 'A';
            } else if (nilaiAkhir >= 70 && nilaiAkhir < 80){
                grade = 'B';
            } else if (nilaiAkhir >= 60 && nilaiAkhir < 70){
                grade = 'C';
            }
            
        } else {
            grade = 'D';
            keterangan = "Gagal";
        }
        
        // output
        System.out.println("Nilai Tugas Anda adalah " + nilaiTugas);
        System.out.println("Nilai UTS Anda adalah " + nilaiUTS);
        System.out.println("Nilai UAS Anda adalah " + nilaiUAS);
        System.out.println("Nilai Akhir Anda adalah " + nilaiAkhir);
        System.out.println("Nilai Grade Anda adalah " + grade);
        System.out.println("Keterangan : " + keterangan);
            
    }
}
