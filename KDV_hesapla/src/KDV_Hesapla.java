import java.util.Scanner;

public class KDV_Hesapla {
    public static void main(String[] args) {
        //%18 kdv hesapla
        Scanner input = new Scanner(System.in);
        double kdvsizF;
        double kdv=0.18;
        double kdvliF;
        double kdvTutari;
        System.out.print("Urunun KDV siz fiyatini girin : ");
        kdvsizF = input.nextDouble();

        kdvliF = kdvsizF+kdvsizF*kdv;

        kdvTutari = kdvsizF*kdv;

        System.out.println("KDV siz fiyat = "+kdvsizF);
        System.out.println("KDV orani : "+kdv);
        System.out.println("KDV li fiyat : "+kdvliF);
        System.out.println("KDV tutari : " + kdvTutari);

    }
}
