package Giris;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuzu girin : ");
        int mat=input.nextInt();

        System.out.println("Fen notunuzu girin : ");
        int fen=input.nextInt();

        System.out.println("Sosyal bilgiler notunuzu girin : ");
        int sosyal=input.nextInt();

        System.out.println("Beden notunuzu girin : ");
        int beden=input.nextInt();

        System.out.println("Muzik notunuzu girin : ");
        int muzik=input.nextInt();

        System.out.println("Kuran notunuzu girin : ");
        int kuran=input.nextInt();

        double ort=(mat+fen+sosyal+beden+muzik+kuran)/6.0;
        System.out.println("Not ortalamaniz = "+ort);

        String durum = (ort>=60)? "Gecti":"kaldi";
        System.out.println(durum);
    }
}
