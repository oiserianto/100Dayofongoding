// Perulangan for
import java.util.Scanner;
public class Day51 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Angka Awal\t: ");
       int a = z.nextInt();
        System.out.print("Masukkan Angka Terahir\t: ");
        int b = z.nextInt();

       for (int i = a; i<=b; i++){
        System.out.println("Angka: "+i);
       }
       System.out.println("--- Selesai ---");
        }
    }
    
