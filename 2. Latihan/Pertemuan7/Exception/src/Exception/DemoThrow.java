package Exception;

class DemoThrow {

    public static void main(String[] args) {

        RuntimeException r = new RuntimeException("Eksepsi RuntimeException");

        System.out.println("Sebelum Throw");

        throw (r);

    }

}