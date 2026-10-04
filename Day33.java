// Day 33 Percabangan (if-else)
// if-else digunkan untuk membuat program melakukan sesuatu berdasarkan kondisi

import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Apakah sekarang hujan? ketik: ya / tidak :");
        boolean hujan = z.nextLine().equals("ya");

        System.out.println();


        // mengecek apakah sedang hujan
        if (hujan){
            System.out.println("Bawa payung");
        }else {
            System.out.println("Bawa Topi");
        }
    }
}
