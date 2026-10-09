import java.util.Scanner;

/**
 * Day39 Latihan Membuat kalkulator dengan if
 */
public class Day39 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = z.nextDouble();

        System.out.print("Masukkan operator(+, -, *, / ): ");
        char operator = z.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double b = z.nextDouble();

        if (operator == '+'){
            System.out.println("Hasil = " +(a+b));
    }   else if (operator == '-'){
            System.out.println("Hasil = " +(a-b));
    }   else if (operator == '*'){
            System.out.println("Hasil = " +(a*b));
    }   else if (operator == '/'){
            if (b !=0){
            System.out.println("Hasil = " +(a/b));
    }   else {
            System.out.println("Eror: Tidak bisa dibagi nol!");
    }
    }   else{
    System.out.println("Operator tidak valid");
    }
    }
    }
    
