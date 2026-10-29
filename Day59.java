import java.util.Scanner;

/**
 * Day59 Latihan mencetak bilangan kelipatan M dari 1-N
 */
public class Day59 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan nilai M\t: ");
        int m = z.nextInt();
        System.out.print("Masukkan nilai N\t: ");
        int n = z.nextInt();
        System.out.print("Kelipatan "+m +" dari 1-"+n+"\t: ");
        for(int i = m; i<=n; i+=m){
         System.out.print(i+" ");
            
        }
        
        System.out.println("\nSelesai");
    }
}
