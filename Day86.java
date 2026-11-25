import java.util.Scanner;
/**
 * Day86 Latihan mencari elemen pada Array
 */
public class Day86 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int n = z.nextInt();
        int []angka = new int[n];
        for (int i=0; i<angka.length; i++){
            System.out.print("Masukkan angka ke-"+(i+1)+" : ");
            angka[i] = z.nextInt();
        }
        System.out.print("Cari angka: ");
        int cari = z.nextInt();
        boolean temukan = false;
        System.out.print("Angka di temukan pada index: ");
        for(int i=0; i<angka.length; i++){
            if(angka[i]==cari){
                temukan = true;
                System.out.print(i);
                break;
            }
        }
        if(!temukan){
            System.out.println("Angka tidak di temukan");
        }
    }
}
