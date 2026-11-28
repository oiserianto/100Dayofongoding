import java.util.Scanner;
/**
 * Day88 Method void
 */
public class Day88 {
    // Method untuk menampilkan salam
    static void nama(){
        System.out.println("Halo,Perkenalkan nama saya Ois");
    }
    // Method untuk menjumlahkan dua angka
    static void jumlah(int a, int b){
        int hasil = a+b;
        System.out.println("Hasil: "+hasil);
    }
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        // Memanggil method nama
        nama();
        // Memasukkan dua angka
        System.out.print("Masukkan angka pertama\t: ");
        int angka = z.nextInt();
        System.out.print("Masukkan angka kedua\t: ");
        int angka2 = z.nextInt();

        // memanggil method jumlah
        jumlah(angka, angka2);

    }
}
