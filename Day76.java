import java.util.Scanner;
/**
 * Day76 Method String untuk Manipulasi (substring(),replace(),trim())
 */
public class Day76 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Kalimat: ");
        String teks = z.nextLine();

        // Mengaambil bagian teks mulai dari indeks 0 sampai 5 (indeks 5 tidak ikut)
        System.out.println("Substring\t: "+teks.substring(0, 5));
        // Menganti kata apel menjadi mangga
        System.out.println("Replace\t\t: "+teks.replaceAll("(?i)Apel", "Mangga"));
        // Menghapus Spasi diawal dan akhir teks
        System.out.println("Trim\t\t: "+teks.trim());
    }
}
