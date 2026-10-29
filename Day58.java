import java.util.Scanner;

/**
 * Day57 Latihan: Mencetak angka Ganjil 1-N dan angka Genap 1-N
 */
public class Day58 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Nilai N\t: ");
        int n = z.nextInt();

        System.out.print("Bilangan Ganjil N-1\t: ");
        for (int i=n; i>=1; i--){
            if(i%2!=0)
            System.out.print(i+" ");
        }
        System.out.print("\nBilangan Genap N-1\t: ");
        for (int i=n; i>1; i--){
            if (i%2==0) {
                
            System.out.print(i+" ");
            }
        }

       
        

    }
}
