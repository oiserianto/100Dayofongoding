import java.util.Scanner;
/**
 * Day80 Latihan akses Elemen Array Dengan indeks
 */
public class Day80 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Elemen: ");
        int n = z.nextInt();
        int[] angka = new int[n];
        for(int i=0; i<angka.length; i++){
            System.out.print("Masukkan angka: ");
            angka[i] = z.nextInt();
        }
        // Meminta index yang ingin di akses
        System.out.print("Masukkan index: ");
        int index = z.nextInt();
        // Menampilkan elemen berdasarkan index
        System.out.println("Nilai pada index "+index+" adalah "+angka[index]);
    }
}
