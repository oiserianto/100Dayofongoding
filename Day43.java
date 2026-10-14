import java.util.Scanner;

/**
 * Day43 Latihan program kelipatan 3,5,3 dan 5
 */
public class Day43 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan batas angka: ");
        int batas = z.nextInt();

        System.out.print("\nKelipatan 3: ");
        for (int i = 1; i<= batas; i++){
            if (i % 3==0) {
                System.out.print(i+"");
            }
        }
        System.out.print("\nKelipatan 5: ");
        for (int i = 1; i<= batas; i++){
            if (i % 5==0) {
                System.out.print(i+"");

              }
        }
        System.out.print("\nKelipatan 3 dan 5: ");
        for (int i = 1; i<= batas; i++){
            if (i % 3==0 && i % 5 == 0) {
                System.out.print(i+"");
            }
        }
    }
}
