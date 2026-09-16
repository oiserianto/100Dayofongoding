// DAY16 Operator Aritmatika Modulus atau sisa bagi(%)

import java.util.Scanner;

/**
 * Program contoh operator modulus atau sisa bagi
 */
public class Day16 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // (Modulus) operator % digunakan untuk mendapatkan sisa hasil pembagian
        // dua bilangan integer
        System.out.print("Masukkan angka int pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka int kedua: ");
        int angka2 = input.nextInt();
        //mengambil sisa dari 20 dibagi 3
        int sisa =  angka1%angka2;
        System.out.print("Sisa bagi int: "+sisa);

        System.out.println();
        System.out.println();

        
        System.out.print("Masukkan angka double pertama: ");
        double angka3 = input.nextDouble();
        System.out.print("Masukkan angka double kedua: ");
        double angka4 = input.nextDouble();
        // mengambil sis dari 10.5 dibagi 3.0
        double sisadouble = angka3%angka4;

        System.out.println("Sisa bagi double: "+sisadouble);
        // menampilkan hasil
        System.out.println("ANGKA 1         : "+angka1);
        System.out.println("ANGKA 2         : "+angka2);
        System.out.println("SISA BAGI       : "+sisa);
        System.out.println();
        System.out.println("ANGKA 3         : "+angka3);
        System.out.println("ANGKA 4         : "+angka4);
        System.out.println("SISA DOUBLE     : "+sisadouble);


        input.close();
    }
}
