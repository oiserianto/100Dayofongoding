/**
 * Saya akan membuat Biodata diri
 */
public class Day2 {
    public static void main(String[] args) {

        // Biodata menggunakan println()
        /**
         * untuk System.out.println()
         * digunakan untuk menampilkan teks lalu pindah ke baris baru
         */
        System.out.println("==========");
        System.out.println("  BIODATA");
        System.out.println("==========");
        System.out.println("NAMA : OIS ERIANTO");
        System.out.println("ASAL : MAMASA");
        System.out.println("UMUR : 19");
        System.out.println("PRODI: INFORMATIKA");

        //Menggunakan print()
        /**
         * untuk System.out.print()
         *digunakan untuk menampilkan teks tanpa pindah baris
         */
        System.out.print("Belajar coding");
        System.out.print("Pasti bisa");

        //Menggunakan printf()
        /**
         * untuk System.out.printf()
         * digunakan untuk menampikan teks dengan format tertentu
         */
        String nama = "OIS ERIANTO";
        int umur = 19;

        System.out.printf("Nama saya %s dan umur saya %d tahun.%n",nama,umur);

        /**
         * %s String/teks
         * %d Bilangan bulat(int)
         * %f Bilangan desimal(double,float)
         * %n Pindah baris
         */
    }
}
