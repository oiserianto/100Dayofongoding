//Day 24  Latihan program menghitung luas persegi panjan

public class Day24 {
   public static void main(String[] args) {
     // Data tanah
        double panjang = 1000;
        double lebar = 500;

        // Jumlah anak
        int anakLakiLaki = 5;
        int anakPerempuan = 2;

        // Data penjualan
        double persenJual = 10;
        double hargaPerMeter = 50000;

        // 1. Luas tanah sebelum dijual
        double luasAwal = panjang * lebar;

        // 2. Luas tanah yang dijual
        double luasDijual = luasAwal * persenJual / 100;

        // Uang hasil penjualan
        double hasilPenjualan = luasDijual * hargaPerMeter;

        // 3. Luas tanah yang siap dihibahkan
        double luasHibah = luasAwal - luasDijual;

        // 4. Pembagian tanah
        // Anak laki-laki mendapat 2 bagian
        // Anak perempuan mendapat 1 bagian
        double totalBagian = (anakLakiLaki * 2) + anakPerempuan;

        double satuBagian = luasHibah / totalBagian;

        double bagianLakiLaki = satuBagian * 2;
        double bagianPerempuan = satuBagian;

        // Menampilkan hasil
        System.out.println("================== HASIL PERHITUNGAN =================");

        System.out.printf("1. Luas tanah sebelum dijual\t: %.2f m²%n", luasAwal);

        System.out.printf("2. Luas tanah yang dijual\t: %.2f m²%n", luasDijual);
        System.out.printf("   Hasil penjualan\t\t: Rp%.2f%n", hasilPenjualan);

        System.out.printf("3. Luas tanah siap dihibahkan\t: %.2f m²%n", luasHibah);

        System.out.printf("4. Bagian setiap anak laki-laki : %.2f m²%n",bagianLakiLaki);

        System.out.printf("   Bagian setiap anak perempuan : %.2f m²%n",bagianPerempuan);

   }
}
