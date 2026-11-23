import java.util.Scanner;
/**
 * Day83 Latihan Menjumlahkan elemen array
 */
public class Day83 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan jumlah Data: ");
        int n = z.nextInt();
        int[]angka = new int[n];
        for(int i=0; i<angka.length; i++){
             System.out.print("Masukkan angka ke-"+(i+1)+": ");
            angka[i]=z.nextInt();
        }
        int total = 0;
        for(int i=0; i<angka.length; i++){
            total+=angka[i];

        }
        System.out.println("Jumlah: "+total);
    }
    
}
