import java.util.Scanner;
/**
 * Day68 Latihan Membuat pola segitiga siku-siku
 */
public class Day70 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi: ");
        int a = z.nextInt();

       for (int i=1; i<=a; i++){
        for(int j=1; j<=i; j++){
            if (j==1 || j==i || i==a){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
        }
        
    }
}
