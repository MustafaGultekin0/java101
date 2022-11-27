import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kisaKenar,uzunKenar,hipo;

        System.out.print("Kisa kenari girin : ");
        kisaKenar = input.nextDouble();
        System.out.print("Uzun kenari girin : ");
        uzunKenar=input.nextDouble();
        hipo=Math.sqrt((kisaKenar*kisaKenar)+(uzunKenar*uzunKenar));
        System.out.println("Kisa kenar : "+kisaKenar);
        System.out.println("Uzun kenar : "+uzunKenar);
        System.out.println("Hipotenus : "+hipo);

    }
}
