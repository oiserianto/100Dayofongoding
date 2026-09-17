// Day 17 Operator penugasan (=,+=,-=,dll)
/**
 * Operator penugasan digunakan untuk memberikan atau mengubah nilai sebuah variabel
 */
public class Day17 {
    public static void main(String[] args) {
        
        // memberi nilai awal
        int angka = 10;
        System.out.println("Nilai Awal      : "+angka);

        //menambahkan 5
        angka += 5;
        System.out.println("Setelah += 5    : "+angka);

        //mengurangi 3
        angka -= 3;
        System.out.println("Setelah-= 3     : "+angka);

        // mengalikan dengan 2
        angka *=2;
        System.out.println("Setelah*= 2     : "+angka);

        // membagi dengan 4
        angka/=4;
        System.out.println("Setelah/= 4     : "+angka);

        // mengambil sisa bagi 3
        angka%=3;
        System.out.println("Setelah%= 3     : "+angka);

    }
}
