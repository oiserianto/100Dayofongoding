// Day15 Aritmatika perkalian(*) dan pembagian (/)
/**
 * program menghitung perkalian dan pembagian dua angka.
 */
public class Day15 {
    public static void main(String[] args) {
     
    // Menyimpan angka pertama
    int angka1 = 100;

    // Menyimpan angka kedua
    int angka2 = 2;

    double angka3 = 5.5;
    double angka4 = 2.0;

    // operator perkalian digunakan unntuk mengalikan dua nilai atau lebih.
    //menghitung perkalian
    int hasilkali = angka1*angka2;

    // operator digunakan untuk membagi suatu nilai dengan nilai lainnya
    // menghitung pembagian
    int hasilbagi = angka1/angka2;

    double hasilkalike2 = angka3*angka4;
    double hasilbagike2 = angka3/angka4;

    // menampilkan hasil perkalian
    System.out.println("HASIL PERKALIAN : "+hasilkali);
    System.out.println("HASIL PERKALIAN : "+hasilkalike2);
    // menampilkan hasil pembagian
    System.out.println("HASIL PEMBAGIAN : "+hasilbagi);
    System.out.println("HASIL PEMBAGIAN : "+hasilbagike2);
    System.out.println("=== SAMPAI JUMPA DI DAY 16 ===");

    }
}
