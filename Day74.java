import java.util.Scanner;
/**
 * Day74 Method String Dasar (length()),toUpperCase(),tolowerCase()).
 */
public class Day74 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan Nama\t: ");
        String nama = z.nextLine();

        // Menampilkan nama asli
        System.out.println("Nama Asli\t: "+nama);
        // Menghitung jumlah karakter nama
        System.out.println("Panjang Nama\t: "+nama.length());
        // Mengubah semua huruf menjadi huruf besar
        System.out.println("Huruf Besar\t: "+nama.toUpperCase());
        // Mengubah semua huruf menjadi huruf kecil
        System.out.println("Huruf Kecil\t: "+nama.toLowerCase());
        
    }
}
