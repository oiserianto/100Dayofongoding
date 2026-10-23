/**
 * Day52 Perulangan while
 */
import java.util.Scanner;
public class Day52 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Angka Awal\t: ");
       int a = z.nextInt();
        System.out.print("Masukkan Angka Terahir\t: ");
        int b = z.nextInt();
    while (a <= b) {
        System.out.println("Angka: "+a);
        a++;
    };
        }
    }
