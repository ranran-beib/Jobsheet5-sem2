import java.util.Scanner;

public class MainPraktNilai05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        PraktNilai05 nm = new PraktNilai05(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai UTS mahasiswa ke-" + (i + 1) + ": ");
            nm.uts[i] = sc.nextInt();

            System.out.print("Masukkan nilai UAS mahasiswa ke-" + (i + 1) + ": ");
            nm.uas[i] = sc.nextInt();
        }

        System.out.println("Nilai UTS tertinggi: " + nm.maxUTS(0, n - 1));
        System.out.println("Nilai UTS terendah: " + nm.minUTS(0, n - 1));
        System.out.println("Rata-rata nilai UAS: " + nm.rataUAS());
    }
}