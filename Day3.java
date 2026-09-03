/**
 * Program untuk mempelajari Escape Seguence \ java.applet
 * Escape Seguence digunakan untuk memberikan fungsi khusus didalam String.
 */
public class Day3 {
    public static void main(String[] args) {
       /**
        * \n = new line = baris baru
        * \n digunakan untuk membuat baris baru
        * jadi setelah langsung menambahkan tanda katarter \n
        *  atoamatis samping kiri yang teks akan langsung pindah baris kebawah
        */
        System.out.println("Nama\n: OIS ERIANTO\nUmur\n: 19");
        
        // \t digunakan untuk memberikan jarak atau sama dengan (Tab)
        System.out.println("NAMA \t: OIS ERIANTO");
        System.out.println("NIM \t: D0226518");
        System.out.println("KLS \t: C");
        System.out.println("PRODI \t: INFORMATIKA");

         //  \"digunakan untuk menampilkan (tanda kutip)
         System.out.println("Saya sedang belajar\"java Day3\"");

         //  \\digunakan untuk menampilkan (satu backslash)
         System.out.println("Folder : C:\\java\\");

         //  \'digunakan untuk menampilkan (tanda petik)
         System.out.println("Hari ini adalah \'hari Jumat\'");

         /**
          * \b kode karater yang artinya tombol hapus/mundur
          *  satu langka atau yang paling ujung  yang dihapus
          *  namun hanya satu huruf di hapus mundur kalau
          *  mau lebih tinggal masukan karakter \b lagi
          */
         System.out.println("ABC\bD"); // ini akan menampilkan kata ABD dan C dihapus

         //  \r mengembalikan posisi kursor ke awal baris.
         System.out.println("java\rTERIMA KASI");
    }
}
