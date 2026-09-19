//Day19 Konversi manual/Paksa (Dari tipe data besar ke kecil)

import java.util.Scanner;

/**
 *  Konversi manual atau casting adalah proses
 *  mengubah tipe data secara sengaja oleh programmer.
 * Biasanya digunakan ketika kita ingin mengubah tipe
 * data yang lebih besar menjadi tipe data yang lebih kecil
 * Day19
 */
public class Day19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Membuat input double
        System.out.print("Masukkan angka double: ");
        double angka = input.nextDouble();

        // mengubah double menjadi int secra manual
        int hasil = (int) angka;

        // Menampilkan hasil
        System.out.println("Nilai Double\t: "+angka);
        System.out.println("Nilai int\t: "+hasil);
        System.out.println("==== SAMPAI JUMPA DI DAY 20 ====");
        // menutup Scanner
        input.close();

    }
}
