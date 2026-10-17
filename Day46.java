import java.util.Scanner;

/**
 * Day46 Latihan membuat menu menggunakan Switc-case
 */
public class Day46 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("=== MENU MINUMAN ===");
        System.out.println("1.KOPI");
        System.out.println("2.TEH");
        System.out.println("3.SUSU");
        System.out.print("PILIH MENU ( 1-3 ): ");
        int menu = z.nextInt();

        switch (menu) {
            case 1:
                System.out.println("1.KOPI");
                break;
            case 2:
                System.out.println("2.TEH");
                break;
            case 3:
               System.out.println("3.SUSU"); 
               break;
            default:
                System.out.println("pilihan tidak tersedia");
                
        }
    }
}
