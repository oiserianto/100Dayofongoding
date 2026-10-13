// Day 42 Latihan Menentukan Gajig bersih
import java.util.Scanner;
public class Day42 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan gaji kotor: Rp");
        double gajiKotor = z.nextDouble();

        double potongan;

        if (gajiKotor > 3000000){
            potongan = gajiKotor*10/100;
        }else {
            potongan = gajiKotor*5/100;
        }
        double gajiBersih = gajiKotor-potongan;

        System.out.println("Gaji kotor: Rp"+gajiKotor);
        System.out.println("Potongan: Rp"+potongan);
        System.out.println("Gaji bersih: Rp"+gajiBersih);
    }
}
