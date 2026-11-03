import java.util.Scanner;
/**
 * Day63 Latihan: Mencetak hasil M pangkat N
 */
public class Day63 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan nilai M: ");
        int m =z.nextInt();
        System.out.print("Masukkan nilai N: ");
        int n = z.nextInt();

        long hasil = 1;
        for (int i=1; i<=n; i++){
            hasil *=m;
        }
        System.out.println("Hasil "+m+" Pangkat "+n+" = "+hasil);

    }
}
