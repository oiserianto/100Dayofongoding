import java.util.Scanner;
/**
 * Day41 latihan: Menentukan Temperature Ruangan menggunakan if
 */
public class Day41 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
       System.out.print("Masukkan Suhu ruangan: ");
       double suhu = z.nextDouble();

       if (suhu < 15){
        System.out.println("Suhu sangat dingin");
       }else if (suhu<25){
        System.out.println("Suhu sejuk / Normal");
       }else if (suhu< 35){
        System.out.println("suhu hangat");
       }else{
        System.out.println("Suhu panas");
       }
    }
}
