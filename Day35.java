// Day 35 Nested if
// Nested if adalah if yang berada di dalam if

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Umur: ");
        int umur = z.nextInt();
        System.out.print("Status mahasiswa/bukan mahasiswa: ");
        boolean mahasiswa = z.nextBoolean();

        // Mengecek umur terlebih dahulu
        if (umur >= 17) {

System.out.println();

            System.out.println("Umur sudah 17 tahun atau lebih");


            // if ini berada di dalam if pertama
            if (mahasiswa) {
                System.out.println("Status: Mahasiswa");
            } else {
                System.out.println("Status: Bukan mahasiswa");
            }

        } else {

            System.out.println("Umur masih di bawah 17 tahun");
    }
    }
}
