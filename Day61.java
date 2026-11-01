import java.util.Scanner;
/**
 * Day61 Latihan: Mengalikan angka 1-N
 */
public class Day61 {

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int n = z.nextInt();
        long jumlah =1;
        System.out.print("Angka 1-"+n+"\t : ");
        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
            jumlah*=i;
        }
        System.out.println("\nHasil Perkalian  : "+jumlah);
    }
}
