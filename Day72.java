import java.util.Scanner;
/**
 * Day72 Latihan: Penjumlahan angka (berhenti ketika mengimputkan angka negatif) 
 */
public class Day72 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int angka;
        int jumlah=0;
        while (true) {
            System.out.print("Masukkan angka: ");
            angka = z.nextInt();
            if(angka<0){
                break;
        }
        jumlah+=angka;
    }
    System.out.print("Total Penjumlahan: "+jumlah);
    }
}
