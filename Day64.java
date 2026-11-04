import java.util.Scanner;
/**
 * Day64 Latihan: Membuat Bilangan Faktorial
 */
public class Day64 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int a = z.nextInt();
        long hasil =1;
        for(int i=a; i>=1; i--){
            System.out.print(i);
            if (i>1) {
                System.out.print(" X ");
            }
            hasil*=i;
        }
        System.out.println("\nFaktorial "+a+" : "+hasil);
    }
}
