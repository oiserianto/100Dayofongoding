// Day11 Menerima input dari keyboard ( pengenalan Scanner)
/**
 * Program latihan menerima input
 *  dari keybord menggunakan Scanner
 */
import java.util.Scanner;
public class Day11 {
    public static void main(String[] args) {
        
        /**
         * Scanner adalah clas Java yang digunakan
         *  untuk membaca input dari pengguna
         */

        //membuat objek Scanner untuk membaca keyboard
        Scanner input = new Scanner(System.in);

        // Menminta nama pengguna
        System.out.print("MASUKKAN NAMA\t\t: ");
        String nama = input.nextLine();

        // Meminta nilai pengguna
        System.out.print("MASUKKAN NILAI\t\t: ");
        byte nilai = input.nextByte();

        // meminta persen hp pengguna
        System.out.print("MASUKKAN BATERAI HP/PC\t: ");
        byte persen = input.nextByte();


        // meminta JUMLAH LEVEL
        System.out.print("MASUKKAN LEVEL\t\t: ");
        short level = input.nextShort();

        // Meminta umur pengguna
        System.out.print("MASUKKAN UMUR\t\t: ");
        int umur = input.nextInt();

        // meminta masukkan jumkah uang
        System.out.print("MASUKKAN JUMLAH UANG\t: ");
        long uang = input.nextLong();

        // Meminta tinggi badan
        System.out.print("MASUKKAN TINGGI\t\t: ");
        double tinggi = input.nextDouble();

        // meminta memasukkan berat badan
        System.out.print("MASUKKAN BERAT\t\t: ");
        float berat = input.nextFloat();

        //meminta memasukkan jenis kelamin
        System.out.print("MASUKKAN JENIS KELAMIN\t: ");
        char jenisKelamin = input.next().charAt(0);

        System.out.println();

        // Menampilkan data yang telah dimasukkan
        System.out.println("===== PROGRAM JAVA DAY 11 ===== ");

        System.out.println("NAMA            : "+nama);
        System.out.println("NILAI           : "+nilai);
        System.out.println("PERSEN          : "+persen+"%");
        System.out.println("LEVEL           : "+level);
        System.out.println("UMUR            : "+umur+" TAHUN");
        System.out.println("UANG            : RP "+uang);
        System.out.println("TINGGI          : "+tinggi);
        System.out.println("BERAT           : "+berat);
        System.out.println("JENIS KELAMIN   : "+jenisKelamin);

        System.out.println(" ===== SAMPAI JUMPA DI DAY 12 ===== ");

        // Menutup Scanner
        input.close();
    }
}
