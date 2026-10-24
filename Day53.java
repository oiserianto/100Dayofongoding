import java.util.Scanner;

/**
 * Day53 perulangan do-while
 */
public class Day53 {
    public static void main(String[] args) {
         Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Angka Awal\t: ");
        int a = z.nextInt();
        System.out.print("Masukkan Angka Terahir\t: ");
        int b = z.nextInt();

        do{
            System.out.println("Angka: "+a);
            a++;
        }while(a<= b);

    }
}
