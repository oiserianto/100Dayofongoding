// Day 44 Latihan program predikat Nilai (A,B,C,D,E)
import java.util.Scanner;
public class Day44 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan Nilai :");
        int nilai = z.nextInt();

       if (nilai >= 90){
        System.out.println("Nilai: A");
       }else if(nilai >= 80){
        System.out.println("Nilai: B");
       }else if(nilai >= 70){
        System.out.println("Nilai: C");
       }else if(nilai >= 60){
        System.out.println("Nilai: D");
       }else{
        System.out.println("Nilai: E");
       }
    }
}
