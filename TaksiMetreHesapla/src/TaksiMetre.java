import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mesafe;
        double herKm=2.20,toplamTutar;
        boolean limit;


        System.out.print("Kac KM yol gideceksiniz : ");
        mesafe = input.nextInt();

        toplamTutar = mesafe+ (mesafe*herKm);

        toplamTutar=(toplamTutar<20)?20:toplamTutar;

        System.out.print(mesafe + " KM yol gittiniz.");
        System.out.print("Toplam tutariniz : "+toplamTutar+"TL");
    }
}
