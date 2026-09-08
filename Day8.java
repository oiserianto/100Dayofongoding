/**
 * Day8 Deklarasi, Inisialisasi dan Update Variabel
 */
public class Day8 {
    public static void main(String[] args) {
        
        /**
         * DEKLARASI -berarti kita membuat variabel
         *  dengan menentukan tipe data dan nama variabel
         * ,tetapi belum memberikan nilai
         */

        //saya akan membuat variabel bernama umur dengan tipe data int
        int umur;

        /**
         * INISIALISASI  -berarti memberikan nilai awal kepada variabel.
         */

        //memberikan nilai awal kepada variabel umur
        umur = 18;

        //menampilkan nilai awal umur
        System.out.println("UMUR AWAL : "+umur);

        /**
         *  UPDATE - berarti mengubah nilai yang suda ada pada variabel
         */

        //megubah nilai umur dari 19 menjadi 18
        umur = 19;

        //menampilakan nilai umur setelah di perbaharui
        System.out.println("UMUR BARU : "+umur);

        /**
         * String Deklarasi dan inisialisai sekaligus/bersamaan
         */

        //nama awal
        String nama = "gacor";
        System.out.println("NAMA AWAL : "+nama);

        //mengupdate nilai String.
        nama = "OIS ERIANTO";
        System.out.println("NAMA BARU : "+nama);

        System.out.println("===== SAMPAI JUMPA DI DAY9 =====");

    }
}
