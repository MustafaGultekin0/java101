import java.util.Scanner;
public class VucutKitleIndex {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double boy,kilo,vkIndex;

        System.out.print("Boyunuzu metre cinsinden girin : ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu Kilogram cisinden girin : ");
        kilo=input.nextDouble();

        vkIndex = kilo/(boy*boy);

        System.out.println("Boyunuz : "+boy);
        System.out.println("Kilonuz : "+kilo);
        System.out.println("Vucut Kitle Indexiniz : "+vkIndex);
    }
}
