// Day38 Latihan Membuat menu menggunakan if

import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bakso");
        System.out.println("3. Ayam Goreng");

        System.out.print("Pilih menu (1-3): ");
        int pilihan = z.nextInt();
        
        System.out.println();

        if (pilihan == 1){
            System.out.println("[=== NASI GORENG ===]");
       }if (pilihan == 2){
            System.out.println("[=== BAKSO ===]");
       }if (pilihan == 3){
        System.out.println("[=== AYAM GORENG ===]");
       }

       System.out.println();
    }
}
