// Day 36 Latihan Menentukan Bilangan Ganjil dan Genap
import java.util.Scanner;
public class Day36 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = z.nextInt();
        if(angka % 2 == 0){
            System.out.println("Angka Genap");
        }else{
            System.out.println("Angka Ganjil");
        }
}
}
