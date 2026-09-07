/**
 * Day7 Pengenalan Tipe Data String untuk teks
 */
public class Day7 {
    public static void main(String[] args) {
        
        // (String) digunakan untuk menyimpan teks atau kumpulan karakter
        /**
         * Membuat variabel "String" untuk menyimpan
         *  [ nama, alamat, nim, prodi, universitas]
         */
        String nama = "oiserianto";
        String alamat = "MAMASA";
        String nim = "D0226518";
        String prodi = "TEKNIK INFORMATIKA";
        String universitas = "SULAWESI BARAT";

        System.out.println("===========================================");
        System.out.println("           BIO DATA DIRI DAY7");
        System.out.println("===========================================");
        System.out.println("NAMA        : "+nama);
        System.out.println("ALAMAT      : "+alamat);
        System.out.println("NIM         : "+nim);
        System.out.println("PRODI       : "+prodi);
        System.out.println("UNIVERSITAS : "+universitas);
        
        //menghitung jumlah karakter.
        System.out.println("JUMLAH KARATER NAMA SAYA ADA        : "+nama.length()+" KARAKTER ");

        // mengubah menjadi huruf besar
        System.out.println("NAMA SAYA MENJADI HURUF KAPITAL     : "+nama.toUpperCase());

        // mengubah menjadi huruf kecil
        System.out.println("NAMA PRODI MENJADI HURUF KECIL      : "+ prodi.toLowerCase());

        //membandingkan dua isi String true/false
        //jadi hasil false karena isi nim dan prodi beda jadi false
        System.out.println("ISI VARIABEL TIDAK SAMA             :"+nim.equals(prodi));

        System.out.println("============================================");
        System.out.println("         SAMPAI JUMPA DI DAY8");
        System.out.println("============================================");
    }
}
