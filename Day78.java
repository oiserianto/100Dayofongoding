import java.util.Scanner;
/**
 * Day78 Latihan membuat akun dan login ke akun(Menggunakan loop berhenti ketika user dan paswordnya benar)
 */
public class Day78 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("=== BUAT AKUN FACEBOOK ===");
        System.out.print("Masukkan Nama\t\t: ");
        String k = z.nextLine();
        System.out.print("Masukkan Tanggal lahir\t: ");
        String x = z.nextLine();
        System.out.print("Masukkan Nomor Ponsel\t: ");
        String n = z.nextLine();
        System.out.print("Buat Password\t\t: ");
        String b = z.nextLine();
        String a;
        String c;
        System.out.println("Akun berhasil dibuat!");
        do{
    
            System.out.println();
            System.out.println("   ==== LOGIN ====");
            System.out.print("Masukkan nomor Ponsel\t: ");
            a=z.nextLine();
            System.out.print("Masukkan Kata Sandi\t: ");
            c=z.nextLine();
            if(a.equals(n) && c.equals(b)){
            System.out.println("   === Login Berhasil ===");
            break;
            }else{
                System.out.println("Username atau password sala! ");
            }
        }while(!n.equals(a) || !b.equals(c));
        System.out.println();
        System.out.println("---   AKUN FB   ---");
        System.out.println("NAMA Facebook   : "+k);
        System.out.println("Tanggal Lahir   : "+x);
        System.out.println("Nomor Ponsel    : "+n);
        System.out.println("Kata Sandi      : "+b);

        
    }
}
