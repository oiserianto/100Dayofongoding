/**
 * Day4 = Tipe data Numerik Bilangan bulat (byte,short,int,long).
 * 
 * program untuk mempelajari tipe data bilngan bulat dalam java.
 * type data yang digunakan:
 * byte, short,int,dan long
 * Day4
 */
public class Day4 {
    public static void main(String[] args) {
        
        /**
         * (Byte) digunakan untuk bilangan bulat kecil
         * rentangnya adalah: -128 sampai 127. = 8 bit
         */
        byte umur = 19;

        /**
         * (SHORT) digunakan untuk bilangan bulat
         * yang leih besar dari pada byte.
         * rentangnya -32.768 sampai 32.767 = 16 bit
         */
        short jumlahSiswa = 500;

        /**
         * (int) ini type data blangan bulat
         *  yang paling sering di gunakan dalam program java = 32 bit
         */

        int tahun = 2026;

        /**
         * (Long) ini digunakan untuk bilangan yang sangat besar.
         * huruf L digunakan untuk menandakan
         * bahwa angka tersebut bersifat long = 64 bit
         */
        long jumlahPenduduk = 8000000000L;

        // sekarang saya akan coba tampilakan semua nilai kelayar
        System.out.println("=====TIPE DATA BILANGAN BULAT===");
        System.out.println("Umur            :"+umur);
        System.out.println("Jumlah siswa    :"+jumlahSiswa);
        System.out.println("Tahun           :"+tahun);
        System.out.println("Jumlah penduduk :"+jumlahPenduduk);


    }
}
