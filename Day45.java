
import java.util.Scanner;
/**
 * Day45 Percsbsngan (Switch-case)
 */
public class Day45 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Ayam Goreng");
        System.out.println("3. Mie Goreng");
        System.out.println("4. Bakso");
        System.out.println("5. Nasi Kuning");
        System.out.print("Pilih Menu ( 1-5 ): ");

        int menu = z.nextInt();
        switch (menu) {
            case 1:
                System.out.println("1. Nasi Goreng");
                break;
            case 2:
              System.out.println("2. Ayam Goreng");
                break;
            case 3:
              System.out.println("3. Mie Goreng");
                break;
            case 4:
             System.out.println("4. Bakso");
                break;
            case 5:
              System.out.println("5. Nasi Kuning");
                break;
            default:
                System.out.println("Menu tidak tersedia");
                throw new AssertionError();
        }
    }
}
