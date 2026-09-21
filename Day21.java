// Day21 Mengubah String menjadi Tipe Data Primitif
 
public class Day21 {

    public static void main(String[] args) {
        // String ke int
        String teksInt = "25";
        int angka = Integer.parseInt(teksInt);

        // String ke double 
        String teksDouble = "10.5";
        double desimal = Double.parseDouble(teksDouble);

        // String ke float
        String teskFloat = "5.5";
        float angkaFloat = Float.parseFloat(teskFloat);

        // String ke Long
        String teksLong = "100000";
        long angkaLong = Long.parseLong(teksLong);

        // String ke boolean
        String teksBoolean = "true";
        boolean kondisi = Boolean.parseBoolean(teksBoolean);

        // String ke char
        String teksChar = "A";
        char huruf = teksChar.charAt(0);

        System.out.println();

        // Menampilkan hasil
        System.out.println("Int\t: "+angka);       
        System.out.println("Double\t: "+desimal);       
        System.out.println("Float\t: "+angkaFloat);       
        System.out.println("Long\t: "+angkaLong);       
        System.out.println("Boolean\t: "+kondisi);       
        System.out.println("Char\t: "+huruf);       
        }
        }
    
    
