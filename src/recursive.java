

 class Rekursif {

    public static void main(String[] args) {
        int angka = 5;
        int hasil = faktorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah " + hasil);
    }

    public static int faktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
}