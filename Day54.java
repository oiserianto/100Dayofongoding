import java.util.Scanner;
/**
 * Day54 Materi soal Evaluasi
 */
public class Day54 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);


        // Soal1
        int x = v.nextInt();
        int y = v.nextInt();
        int z = v.nextInt();
        if (y>x){
            x++;
        }else if(y<x){
            x-=1;
        }
        if(z>x){
            x+=2;
        }else if(z < x){
            x-=2;
        }
        System.out.println(x);
    



        // Soal2:
        double a = v.nextDouble();

        if(a>0 && a%2==0){
            System.out.println("Bulat Genap");
            System.out.println("Positif");
            System.out.println("Natural");
        }else if (a>0 && a%2!=0){
            System.out.println("Pecahan");
            System.out.println("Positif");
        } else if(a<0 && a%2 == 0){
            System.out.println("Bulat Genap");
            System.out.println("Negatif");
            System.out.println("Natural");
        }else if(a<0 && a%2 != 0){
            System.out.println("Pecahan");
            System.out.println("Negatif");
        }else{
            System.out.println("Bulat Genap");
            System.out.println("Natural");
        }




        // Soal 3
        int n = v.nextInt();
       for (int i = 1; i<=n; i++){
        if ((i % 3 == 0 || i %4==0) && i % 12 !=0){
            System.out.println(i+"");
        }
       }
    }
}

