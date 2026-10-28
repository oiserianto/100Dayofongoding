import java.util.Scanner;

/**
 * Day57 Latihan: Mencetak angka Ganjil 1-N dan angka Genap 1-N
 */
public class Day57 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Nilai N\t: ");
        int n = z.nextInt();

        System.out.print("Bilangan Ganjil 1-N\t: ");
        for (int i=1; i<=n; i +=2){
            System.out.print(i+" ");
        }
        System.out.print("\nBilangan Genap 1-N\t: ");
        for (int i=2; i<=n; i+=2){
            System.out.print(i+" ");
        }

       
        

    }
}
