import java.util.Scanner;
/**
 * Day85 Latihan: Menentukan angka Minimal Array
 */
public class Day85 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int n = z.nextInt();
        int []angka = new int[n];
        for(int i=0; i<angka.length; i++){
            System.out.print("Angka ke-"+(i+1)+" : ");
            angka[i]=z.nextInt();
        }
        int min=angka[0];
        for (int i=0; i<angka.length; i++){
            if(angka[i]<min){
                min=angka[i];
            }
        
        }
        System.out.println("Angka Terkecil: "+min);
    }
}
