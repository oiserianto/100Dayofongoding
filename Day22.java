// Day22 Latihan program untuk mmengubah nilai dua variabel
public class Day22 {
    public static void main(String[] args) {
        // nilai awal
        int a = 10;
        int b = 20;

        // menyimpan nilai a sementara
        int temp = a;

         System.out.println("\nSebelum ditukar: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // memasukkan nilai b ke a
        a=b;
        // memasukkan nilai temp ke b
        b=temp;

        System.out.println("\nSetelah ditukar: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
