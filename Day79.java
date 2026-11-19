import java.util.Scanner;

/**
 * Day79 Array 1D
 */
public class Day79 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int []angka = new int[5];
        for(int i=0; i<angka.length; i++){
            System.out.print("Masukkan angka ke-"+(i+1)+": ");
            angka[i]=z.nextInt();
        }
        System.out.println("\nIsi Array: ");
        for (int i=0; i <angka.length; i++) {
            System.out.println("Index "+i+": "+angka[i]);
            
        }
    }
}
