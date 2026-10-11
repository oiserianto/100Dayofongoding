import java.util.Scanner;

/**
 * Day40
 */
public class Day40 {

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int pilihan = z.nextInt();
        int pulsa = z.nextInt();

        String paket;
        int harga;

        if (pilihan == 1){
            paket = "Harian 3GB";
            harga = 10000;
        }else if(pilihan == 2){
            paket = "Mingguan 15GB";
            harga = 35000;
        }else if(pilihan == 3){
            paket = "Bulanan 50GB";
            harga = 90000;
        }else{
            System.out.println("Pilihan tidak Valid");
            return;
        }

        System.out.println("Paket: "+paket);
        if (pulsa >= harga){
            System.out.println("Status : Berhasil");
            System.out.println("Sisa pulsa: Rp"+(pulsa-harga));
        }else{
            System.out.println("Status : pulsa tidak cukup");
            System.out.println("Kekurangan: Rp"+(harga-pulsa));
        }
    }
}
