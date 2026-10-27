import java.util.Scanner;
/**
 * Day56 Latihan Mencetak angka 1-N dan angka N-1
 */
public class Day56 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int n = z.nextInt();
        System.out.print("Angka 1 sampai N : ");
        for ( int i=1; i<=n; i++){
            System.out.print(i+" ");
        }
        System.out.print("\nAngka N sampai 1 : ");
        for ( int i=n; i>=1; i--){
            System.out.print(i+" ");
        }
        
    }
}
