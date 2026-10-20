import java.util.Scanner;
/**
 * Day49 Operator Ternery
 */
public class Day49 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

       

        // 1.Bilangan terbesar dari dua angka
        System.out.print("\nMasukkan angka pertama: ");
        int a = z.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = z.nextInt();
        int besar = (a>b)? a:b;
        System.out.println("Bilangan terbesar: "+besar);

        // 2. Kelulusan berdasarkan nilai
        System.out.print("\nMasukkan nilai (0-100): ");
        int nilai = z.nextInt();
        String status = (nilai>=60)?"Lulus":"Tidak Lulus";
        System.out.println("Status: "+status);
    }
}
