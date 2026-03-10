import java.util.Scanner;

public class MainSum05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen: ");
        int el = sc.nextInt();

        Sum05 sm = new Sum05(el);

        for (int i = 0; i < sm.keuntungan.length; i++) {
            System.out.print("Masukkan keuntungan bulan ke-" + (i+1) + ": ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("Total keuntungan dengan Brute Force = " + sm.totalBF());
        System.out.println("Total keuntungan dengan Divide and Conquer = " + sm.totalDC(sm.keuntungan, 0, sm.keuntungan.length - 1));
    }
}