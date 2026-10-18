import java.util.Scanner;
/**
 * Day48 Latihan memmbuat kalkulator menggunakan Switch-Case
 */
public class Day48 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan angka pertama\t\t: ");
        int a = z.nextInt();
        System.out.print("Masukkan operator( +,-,*,/,% )\t: ");
        char operator = z.next().charAt(0);
        System.out.print("Masukkan angka kedua\t\t: ");
        int b = z.nextInt();

        switch (operator) {
            case '+':
                System.out.println("Hasil: "+(a+b));
                break;
            case '-':
                System.out.println("Hasil: "+(a-b));
                break;
            case '*':
                System.out.println("Hasil: "+(a*b));
                break;
            case '/':
                if(b !=0){
                System.out.println("Hasil: "+(a/b));
                }else{
                    System.out.println("Eror tidak bisa dibagi nol");
                }
                break;
            case '%':
                if (b !=0 ){
                    System.out.println("Hasil: "+(a%b));
                }else{
                    System.out.println("Eror modulus dengan nol");
                }
                break;
            default:
                System.out.println("operator tidak valid");
                
        }
    }
}
