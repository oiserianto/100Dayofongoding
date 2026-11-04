import java.util.Scanner;
/**
 * Day65 Latihan membuat Pola Garis vertikal
 */
public class Day65 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int n = z.nextInt();
        System.out.print("Masukkan jumlah garis: ");
        int m = z.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("| ");
            }
            System.out.println();
        }
        
    }
}
