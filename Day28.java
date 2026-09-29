// Operator Perbandingn == dan !=

import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan angka pertama\t: ");
        int a =z.nextInt();
        System.out.print("Masukkan angka kedua\t: ");
        int b = z.nextInt();

        // Membandingkan apakah kedua angka sama
        System.out.println("\nApakah kedua angka sama? "+(a == b ));

        // Membandingkan Kedua angka berbeda
        System.out.println("Apakah kedua angka berbeda? "+(a!=b));

        z.close();
    }
}
