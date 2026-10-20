import java.util.Scanner;

/**
 * Day50 Latihan membuat program Ganjil Genap Menggunakan Ternary
 */
public class Day50 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = z.nextInt();
        String b = (a %2 == 0) ? "Genap" : "Ganjil";
        System.out.println(b);
    }
}
