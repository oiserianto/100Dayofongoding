import java.util.Scanner;

/**
 * Day84 Latihan: Menentukan Angka Maksimal  Array
 */
public class Day84 {    
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int n = z.nextInt();
        int[]angka = new int[n];
        for (int i=0; i<angka.length; i++){
            System.out.print("Angka ke-"+(i+1)+" : ");
            angka[i]=z.nextInt();

        }
        int max = angka[0];
        for (int i=0; i<angka.length; i++){
            if(angka[i]>max){
                max=angka[i];
            }
        }
        System.out.println("Angka Terbesar: "+max);
    }
}
