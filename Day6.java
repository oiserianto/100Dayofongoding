/**
 * Day6 Tipe Data Karakter(char) dan Boolean (boolean).
 * 
 * program untuk mempelajari tipe data char  dan bolean.
 * char digunakan untuk menyimpan satu karakter sedankan
 *  boolean digunakan untuk menyimpan nilai true atau false
 */
public class Day6 {
    public static void main(String[] args) {
         /**
          * (char) menyimpan satu karater
          *  berupa huruf yang menggunakan petik satu'
          */

        // Menyimpan satu karakter berupa huruf
        char jenisKelamin = 'O';
        
        // Menyimpan satu karakter berupa simbol
        char simbol = '@';
        
        // menampilkan karakter
        System.out.println("Huruf awal\t\t: "+jenisKelamin);
        System.out.println("Simbol\t\t\t: "+simbol);

        /**
         * (boolean) digunakan untuk menyimpan dua kemungkinan
         *  nilai antara (true = benar) atau (false = sala/tidak)
         */
        
        // menyimpan kondisi bahwa benar seseorang ini adalah mahasiswa
        boolean benarHadir = true;

        // Menyimpan kondisi apakah mahasiswa perna bolos/tidak.
        boolean tidak = false;

        System.out.println("Mahasiswa\t\t: "+benarHadir);
        System.out.println("Perna Bolos/Tidak\t: "+tidak);

    }
}
