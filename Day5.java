// Day5 Tipe data pecahan(double,float).
/**
 * Program untuk memmpelajari tipe data pecahan
 * mengguankan dauble dan float
 */
public class Day5 {
    public static void main(String[] args) {
        
        /**
         * (double) digunakan untuk menyimpan
         *  bilangan desimal/pecahan dengan ketelitian
         *  tinggi dari pada float yang berukuran 64 bit
         */
        double tinggiBadan = 171.9;
        double beratBadan = 62.92;

        /**
         * (float) digunakan untuk mennyimpan
         *  bilangan pecahan/desimal dengan ukuran 32 bit
         * Huruf "f"diperlukan agar angka
         *  di anggap sebagai literal bertipe float
         */
        float nilai = 95.5f;

        // saya akan mencoba menampilkan data yang suda saya buat

        // Menampilkan  tinngi badan.
        System.out.println("Tinggi Badan :"+tinggiBadan+" cm");

        // Menampilkan Berat Badan
        System.out.println("Berat Badan  :"+beratBadan+" kg");

        // Menampilkan nilai.
        System.out.println("Nilai        :"+nilai);

        System.out.println("=== SAMPAI JUMPA DI DAY6 ===");
    }
}
