// Day26 Operator Increment dan Decrement (++,--)

import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
       Scanner z = new Scanner(System.in);

       // Soal 1
       System.out.print("Masukkan Nama\t\t: ");
       String a = z.nextLine();
       System.out.print("Masukkan Nim\t\t: ");
       String b = z.nextLine();
       System.out.print("Masukkan Kelas\t\t: ");
       char c = z.next().charAt(0);
       System.out.print("Masukkan Umur\t\t: ");
        int d = z.nextInt();
        z.nextLine();
        System.out.print("Masukkan Prodi\t\t: ");
         String e = z.nextLine();
        System.out.print("Masukkan IPK\t\t: ");
        double f = z.nextDouble();
        System.out.print("Status Keaktifan\t: ");
        boolean g = z.nextBoolean();

        System.out.println();
        System.out.println("===== BIODATA MAHASISWA =====");
        System.out.println("Nama\t\t: "+a);
        System.out.println("Nim\t\t: "+b);
        System.out.println("Kelas\t\t: "+c);
        System.out.println("Umur\t\t: "+d);
        System.out.println("Prodi\t\t: "+e);
        System.out.println("IPK\t\t: "+f);
        System.out.println("Status Aktif\t: "+g);
        System.out.println("=========================\n");

        // Soal 2
        int h = z.nextInt();
        int i = z.nextInt();
        double j = 3.14;
        double k =j*h*h;
        double l =j*i*i;
         
        System.out.println(k);
        System.out.println(l);


        System.out.println();


        // Soal3
        int p = z.nextInt();
        int o = z.nextInt();

        p = p+o;
        o = p-o;
        p = p-o;

        System.out.println(p);
        System.out.println(o);

    }
}
