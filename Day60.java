import java.util.Scanner;
/**
 * Day60 Latihan Menjumlahkan angka 1-N
 */
public class Day60 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Nilai N  : ");
        int n = z.nextInt();
        int jumlah=0;
        System.out.print("Angka 1-"+n+"\t  : ");
        for(int i=1; i<=n; i++){
            jumlah+=i;
            System.out.print(i+" ");
        }
        System.out.println("\nHasil penjumlahan : "+jumlah);
    }
}
