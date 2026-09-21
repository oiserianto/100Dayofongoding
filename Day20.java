// Day20 Mengubah Tipe Data primitif Menjadi String
 
public class Day20 {
    public static void main(String[] args) {
        int umur = 19;
        double tinggi = 171.9;
        boolean mahasiswa = true;
        char jenisKelamin = 'L';

        // Mengubah tipe data  menjadi string
        String umurString = String.valueOf(umur);
        String tinggiString = String.valueOf(tinggi);
        String mahasiswaString = String.valueOf(mahasiswa);
        String jenisKelaminString = String.valueOf(jenisKelamin);

        // perbedaan ketika pakai angka
        int hasil1 = umur+1;
        String hasil = umurString+1;

System.out.println();

        // ini suda dikonvesi ke string
        // menampilkan hasil
        System.out.println("Umur\t\t: "+umurString);
        System.out.println("Tinggi\t\t: "+tinggiString);
        System.out.println("Mahasiswa\t: "+mahasiswaString);
        System.out.println("Jenis Kelamin\t: "+jenisKelamin);

        System.out.println();

        System.out.println("sebelum di konversi ke string\t: "+hasil1);
        System.out.println("sesuda di konversi ke string\t: "+hasil);
        

    }
}
