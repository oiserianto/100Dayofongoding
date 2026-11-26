import java.util.Scanner;
/**
 * Day87 Latihan manipulasi data dalam Array
 */
public class Day87 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int n = z.nextInt();
        int []angka= new int[n];
        for (int i=0; i<angka.length; i++){
            System.out.print("Masukkan angka ke-"+(i+1)+" : ");
            angka[i]=z.nextInt();
        }
        // Memimilih index yang ingin diubah
        System.out.print("Masukkan index yang ingin di ubah: ");
        int index = z.nextInt();
        // Memasukkan nilai baru
        System.out.print("Masukkan nilai baru: ");
        int nilaibaru = z.nextInt();
        // Mengubah elemen Array
        angka[index]=nilaibaru;
        // Menamplkan Array setelah diubah
        System.out.println("\nArray setelah di ubah: ");
        for (int i=0; i<angka.length; i++){
            System.out.print(angka[i]+" ");
        }
    }
}
