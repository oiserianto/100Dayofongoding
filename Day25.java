// Day25 Latihan program menghitung luas lingkaran
import  java.util.Scanner;
public class Day25 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        // Memasukkan nilai jari-jari
        System.out.print("Masukkan jari-jari lingkaran\t: ");
        double r = z.nextDouble();

        // Nilai phi
        double phi = 3.14;

        // Menghitung luas lingkaran
        double luas = phi * r * r;

        // Menampilkan hasil
        System.out.println("Luas lingkaran\t\t\t: " + luas + " cm²");
        z.close();
    }
}

