import java.util.Scanner;

public class MainFaktorial05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faktorial05 fk = new Faktorial05();

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println("Hasil faktorial dengan Brute Force = " + fk.faktorialBF(n));
        System.out.println("Hasil faktorial dengan Divide and Conquer = " + fk.faktorialDC(n));
    }
}