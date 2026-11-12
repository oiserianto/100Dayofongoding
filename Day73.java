import java.util.Scanner;
/**
 * Day73 Latihan do while: membuat menu berulang
 */
public class Day73 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int angka;
        int i = 1;
        do{
            System.out.println("===MENU===");
            System.out.println("1.Makanan");
            System.out.println("2.Minuman");
            System.out.println("3.Selesai");
            System.out.print("Pilih (1-3): ");
            angka = z.nextInt();
            
            if(angka==1){
                System.out.println("\t1.Mie ayam Rp15.000\n\t2.Nasi kuning Rp10.000\n\t3.Bakso Rp15.000\n\t4.Ayam lalapan Rp20.000");
            }else if(angka==2){
                System.out.println("\t1.Kopi Rp5.000\n\t2.Teh Rp5.000\n\t3.Susu Rp.8.000\n\t4.Es teh manis Rp10.000");
            }
            i++;
        }while(angka!=3);
        System.out.println("---Program Selesai---");
        
        
    }
}
