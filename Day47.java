
import java.util.Scanner;
/**
 * Day47 Program untuk Menentukan Hari
 */
public class Day47 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
       System.out.print("Masukkan nama hari: ");
       String hari = z.next().toLowerCase();

       switch (hari) {
        case "senin":
            System.out.println("Hari: Senin");
            break;
        case "selasa":
            System.out.println("Hari: Selasa");
            break;
        case "rabu":
            System.out.println("Hari: Rabu");
            break;
        case "kamis":
            System.out.println("Hari: kamis");
            break;
        case "Jumat":
            System.out.println("Hari: Jumat");
            break;
        case "sabtu":
            System.out.println("Hari: Sabtu");
            break;
        case "minggu":
            System.out.println("Hari: Minggu");
            break;
        default:
            System.out.println("Hari tidak valid");
            
       }
       
    }
}
