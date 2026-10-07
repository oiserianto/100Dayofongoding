// Day37 Latihan menentukan bilangan positif , Negatif dan Nol
import java.util.Scanner;
public class Day37 {
      public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Bilangan: ");
        int nilai = z.nextInt();

        if (nilai > 0){
            System.out.println("Bilangan Positif");
        }else if (nilai<0){
            System.out.println("Bilangan Negatif");
        }else {
            System.out.println("Bilangan Nol");
        }
      }                      
}
