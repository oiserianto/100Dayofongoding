// Day32 Latihan Mengkombinasikan berbagai operator
public class Day32 {
    public static void main(String[] args) {
        // Menyimpan nilai umur
        int umur = 19;

        // menyimpan nilai ujian 
        int nilai = 95;

        // menyimpan status kehadirqn
        boolean hadir = true;

        // mengecek apakah umur minimal 18 DAN nilai minimal 75
        boolean syarat1 = umur >= 18 && nilai >= 75;

        // Mengecek apakah nilai minimal 90 ATAU hadir
        boolean syarat2 = nilai >= 90 || hadir;

        // Membalik nilai dari variabel hadir
        boolean syarat3 = !hadir;

        // Menampilkan hasil masing-masing kondisi
        System.out.println("Syarat 1: "+syarat1);
        System.out.println("Syarat 2: "+syarat2);
        System.out.println("Syarat 3: "+syarat3);

    }
}
