// Day 31 Operator Logika AND (&&), OR(II), DAN NOT(!)
// operator ini digunakan ketika kita ingin menggabungkan atau membalik kondisi
public class Day31 {
    public static void main(String[] args) {
        int umur = 19;
        boolean punyakartu = true;

        // AND (&&) 
        // hasilnya true hanya jika  kedua kondisi bernilai true.
        System.out.println(umur>=18 && punyakartu);

        // OR (||)
        //hasilnya true jika minimal sala satu kondisi bernilai true
        System.out.println(umur>=20 || punyakartu);

        // NOT (!)
        // berarti tidak / membalik nilai boolean
        System.out.println(!punyakartu);
    }
}
