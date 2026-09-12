// Day12 membuat program biodata sederhana menggunakan Scanner
/**
 * program sederhana menggunakan scanner
 */
import java.util.Scanner;
public class Day12 {
    public static void main (String[] args){

        // membuat objek Scanner untuk menerima input keyboard
        Scanner input = new Scanner (System.in);
        
        // Meminta pengguna memasukkan nama
        System.out.print("MASUKKAN NAMA\t\t\t: ");
        String nama = input.nextLine();

        // Meminta pengguna memasukkan NIM
        System.out.print("MASUKKAN NIM\t\t\t: ");
        String nim = input.nextLine();

         // Meminta pengguna memasukkan umur
         System.out.print("MASUKKAN UMUR\t\t\t: ");
         int umur = input.nextInt();

          // Meminta pengguna memasukkan TINGGI BADAN
          System.out.print("MASUKKAN TINGGI\t\t\t: ");
          double tinggi = input.nextDouble();

           // Membersihkan enter setelah nextDouble()
           input.nextLine();

            // Meminta pengguna memasukkan inisial 
            System.out.print("MASUKKAN INISIAL\t\t: ");
             char inisial = input.nextLine().charAt(0);

             System.out.println();

             // Menampilakan biodata
             System.out.println("\n======= BIODATA MAHASISWA =======");

             System.out.println("NAMA\t\t\t\t: "+nama);
             System.out.println("NIM\t\t\t\t: "+nim);
             System.out.println("UMUR\t\t\t\t: "+umur);
             System.out.println("TINGGI\t\t\t\t: "+tinggi+" CM");
             System.out.println("INISIAL\t\t\t\t: "+inisial);

             System.out.println("========= SAMPAI JUMPA DI DAY 13 ==========");
             // menutup Scanner
             input.close();

    }
}
