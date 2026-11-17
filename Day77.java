import java.util.Scanner;
/**
 * Day77 Latihan: Menggunakan berbagai Method String
 */
public class Day77 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        // Meminta pengguna memeasukkan kalimat
        System.out.print("Masukkan kalimat: ");
        String teks = z.nextLine();
        //Menghitung jumlah karakter
        System.out.println("Panjang teks: "+teks.length());
        // Mengubah teks menjadi huruf besar
        System.out.println("Huruf besar: "+teks.toUpperCase());
        // Mengubah teks menjadi huruf kecil
        System.out.println("Huruf kecil: "+teks.toLowerCase());
        // Memeriksa apakah teks sama dengan kalimat tertentu
        System.out.println("Apakah sama? "+teks.equals("Saya suka apel"));
        // Memeriksa teks tanpa membedakan huruf besar dan kecil
        System.out.println("Apakah sama (abaikan kapital)? "+teks.equalsIgnoreCase("saya suka apel"));
        // Memeriksa apakah megandung kata apel
        System.out.println("Mengandung apel? "+teks.contains("apel"));
        // Memeriksa apakah teks kosong
        System.out.println("Apakah kosong? "+teks.isEmpty());
        // Mengambil lima karakter pertama
        // pastikan input minimal 5 karakter
        System.out.println("Substring: "+teks.substring(0,5));
        // Mengganti kata apel menjadi mangga
        System.out.println("Replace: "+teks.replace("apel", "mangga"));
        // mengghapus Spasi di awal dan akhir teks
        System.out.println("Trim: "+teks.trim());
    }
}
