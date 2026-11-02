import java.util.Scanner;
/**
 * Day62 Nested Loop
 */
public class Day62 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Jumlah baris: ");
        int baris = z.nextInt();
        System.out.print("Masukkan Jumlah kolom: ");
        int kolom = z.nextInt();
        for(int i = 1; i<=baris; i++){
            for (int n = 1; n<=kolom; n++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
