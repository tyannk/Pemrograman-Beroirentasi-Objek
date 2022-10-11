package Exception;

class DemoEksepsi5 {
    public static void main(String[] args) {
        double BILANGAN = 100.0;
        System.out.println("Sebelum pembagian");
        for (int i = 5; i >= 0; i--) {
            try {
                System.out.println(BILANGAN + "/" + i + " = ");
                System.out.println(BILANGAN / i);
            } finally {

                System.out.println("Bagian finally dijalankan");
            }
        }

        System.out.println("Program selesai");
    }

}