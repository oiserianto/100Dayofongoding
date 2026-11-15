import java.util.Scanner;
/**
 * Day75 Method String untuk pengecekan (equels(),equallgnoreCase(),contains(),isEmpty()).
 */
public class Day75 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        // Memintah pengguna memasukkan nama buah
        System.out.print("Masukkan nama buah: ");
        String buah = z.nextLine();
        // Memeriksa apakah teks sama persis dengan Apel
        System.out.println("Apakah buah Apel? " +buah.equals("Apel"));
        // Membandingkan teks tanpa membedakan huruf besar dan keci
        System.out.println("Apakah buah apel? "+buah.equalsIgnoreCase("apel"));
        // Memeriksa apakah teks mengandung kata apel
        System.out.println("Mengandung kata pel? "+buah.contains("pel"));
        // Memeriksa apakah teks kosong
        System.out.println("Apakah input kosong? "+buah.isEmpty());
    }
}
