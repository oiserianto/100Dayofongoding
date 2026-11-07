import java.util.Scanner;
/**
 * Day67 Latihan Membuat pola persegi
 */
public class Day67 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Maskkan ukuran persegi: ");
        int a = z.nextInt();
        for(int i=1; i<=a; i++){
            for (int j=1; j<=a; j++){
                if (i==1|| i==a || j==1 || j==a){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }
        
    }
}
