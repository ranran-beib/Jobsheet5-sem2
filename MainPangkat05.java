import java.util.Scanner;

public class MainPangkat05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        Pangkat05[] png = new Pangkat05[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = sc.nextInt();

            System.out.println("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = sc.nextInt();

            png[i] = new Pangkat05(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (Pangkat05 p : png) {
            System.out.println(p.nilai + " ^ " + p.pangkat + " = " + p.pangkatBF(p.nilai, p.pangkat));
        }

        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat05 p : png) {
            System.out.println(p.nilai + " ^ " + p.pangkat + " = " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}