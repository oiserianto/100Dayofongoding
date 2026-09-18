// Day18 Konversi otomatsi(Dari Tipe Data Kecil ke Besar)

import java.util.Scanner;
/**
 *  Materi Konversi.( Konversi otomatis = implisit widening conversion) 
 * adalah ketika java secara otomatis mengubah tipe data yang kapasitasnya
 * lebih kecil ketipe data yang kapasitasnya lebih besar.
 */
public class Day18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka int: ");
        int angka = input.nextInt();

        // int isi otomatis dikoversi menjadi double
        double hasil = angka;

        System.out.println("Nilai int\t: "+angka);
        System.out.println("Nilai double\t: "+hasil);
    }
}
