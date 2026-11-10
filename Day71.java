import java.util.Scanner;
/**
 * Day71 Latihan Membuat pola segitiga siku-siku terbalik
 */
public class Day71 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Tinggi Segitiga : ");
        int a = z.nextInt();
        
        System.out.println();

        for(int i=a; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(j==1 || j==i || i==a){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
