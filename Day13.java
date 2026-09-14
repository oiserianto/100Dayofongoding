import java.util.Scanner;
public class Day13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("MASUKKAN NAMA LENGKAP: ");
        String nama = input.nextLine();

        System.out.print("MASUKKAN NAMA PANGGILAN: ");
        String namapanggilan = input.nextLine();

        System.out.print("MASUKKAN UMUR: ");
        int umur = input.nextInt();

        System.out.print("MASUKKAN TINGGI BADAN: ");
        double tinggi = input.nextDouble();

        System.out.printf("NAMA SAYA %s, NAMA PANGGILAN SAYA %s, UMUR %d, TINGGI BADAN %.1f","OIS ERIANTO","OIS",19,171.1);
    }
}


