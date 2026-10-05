// Day34 Percabangan (if-else if-else)
// digunakan ketika kita punya lebih dari 2 kondisi

import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
       
        Scanner z = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai
        System.out.print("Masukkan nilai: ");
        int nilai = z.nextInt();

        // Mengecek apakah nilai 90 atau lebih
        if (nilai >= 90) {
            System.out.println("NILAI : A");

        // Jika salah, cek kondisi berikutnya
        } else if (nilai >= 80) {
            System.out.print("NILAI : B");

        // Jika salah, cek kondisi berikutnya
        } else if (nilai >= 70) {
            System.out.print("NILAI : C");

        // Jika semua kondisi salah
        } else {
            System.out.print("NILAI : D");
        }
        // Menutup Scanner
        z.close();
    }
}
    
