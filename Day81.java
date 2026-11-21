import java.util.Scanner;
/**
 * Day81 Latihan mengisi elemen Array dan Menampilkan semua elemen Array dengan perulangan
 */
public class Day81 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int n = z.nextInt();
        int[]angka = new int[n];
        for(int i=0; i<angka.length; i++){
            System.out.print("Masukkan angka ke-"+(i+1)+" : ");
            angka[i]=z.nextInt();
        }
        System.out.println("\nIsi Array: ");
        for(int i=0; i<angka.length; i++){
            System.out.println("Index: "+i+" : "+angka[i]);
        }

        
    }
}
