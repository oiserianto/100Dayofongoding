import java.util.Scanner;
/**
 * Day55 Keyword contine, break dan return
 * - break      : menghentikan perulangan (atau switch) seketika
 * - continue   : melewati interasi saat ini, lanjut ke interasi berikutnya
 * - return     : keluar dari method ( bisa sambil mengembalikan nilai)
 */
public class Day55 {
    
    static int hitung(int angka) {
        return angka*2;
    }
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        while (true) {
            System.out.print(" Masukkan angka ( 0 untuk berhenti ): ");
            int angka = z.nextInt();
            if (angka == 0) {
                break;
            }

            if (angka < 0){
                System.out.println(" Angka negatif dilewati");
                continue;
            }
            System.out.println(" Hasil: "+hitung(angka));
        }
        System.out.println(" Program selesai");
    }
}
