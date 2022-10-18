package Thread;


public class ThreadBearksi1 {

    public static void main(String[] args) {

        Thread m1 = new Thread(new Mobil("M-1"));

        Thread m2 = new Thread(new Mobil("M-2"));

        m1.start();
        m2.start();
    }
}
