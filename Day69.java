import java.util.Scanner;
/**
 * Day69 Latihan membuat pola persegi panjang
 */
public class Day69 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int n = z.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int m = z.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
