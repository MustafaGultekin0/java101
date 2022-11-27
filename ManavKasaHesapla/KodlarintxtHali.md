import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        double aKilo,eKilo,dKilo,mKilo,pKilo,total;

        System.out.print("Kac kilo armut aldiniz : ");
        aKilo=input.nextDouble();
        System.out.print("Kac kilo elma aldiniz : ");
        eKilo = input.nextDouble();
        System.out.print("Kac kilo domates aldiniz : ");
        dKilo = input.nextDouble();
        System.out.print("Kac kilo muz aldiniz : ");
        mKilo= input.nextDouble();
        System.out.print("Kac kilo patlican aldiniz : ");
        pKilo=input.nextDouble();
        System.out.println(aKilo+" Kilo armut aldiniz");
        System.out.println(eKilo+" Kilo elma aldiniz");
        System.out.println(dKilo+" Kilo domates aldiniz");
        System.out.println(mKilo+" Kilo muz aldiniz");
        System.out.println(pKilo+" Kilo patlican aldiniz");
        total = (aKilo*armut)+(eKilo*elma) +(domates*dKilo)+(muz*mKilo)+(patlican*pKilo);
        System.out.println("Toplam tutar : "+total);
    }
}
