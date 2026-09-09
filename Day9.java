/**
 * Day9 Constanta (Final Variabel)
 * program untuk mempelajari konstanta
 *  menggunakan keyword final
 */
public class Day9 {
    public static void main(String[] args) {

        // variabel biasa dapat di ubah nilainya.
        int nilai = 90;

        // mengubah nilai dari 90 ke 95.
        nilai = 95;

        // menampilkan nilai yang suda di update
        System.out.println("NILAI\t\t: "+nilai);

        /**
         * (KOSNTANTA) Adalah nilai yang
         *  setelah ditetapkan tidak bole
         *  di ubah lagi selama program berjalan.
         * 
         * (Final) membuat nilai tidak dapat
         *  di ubah setalah di beri nilai.
         */
        final int JUMLAH_HARI = 7;

        //menampilkan jumlah hari
        System.out.println("JUMLAH HARI\t: "+JUMLAH_HARI+" HARI");

        /**
         * KOSNTANTA DOUBLE 
         */

        //nilai PI di buat sebagai kosntanta.
        final double PI = 120.125;

        //menampilkan nilai PI
        System.out.println("NILAI PI\t: "+PI+" RP");

        /**
         *  KONSTANTA STRING
         */
        // Menyimpan nama negara sebagai konstanta.
        final String NEGARA = "Indonesia";

        // Menampilkan nama negara.
        System.out.println("NEGARA\t\t: "+NEGARA);

        System.out.println("===== SAMPAI JUMPA DI DAY 10 =====");
    }

}
