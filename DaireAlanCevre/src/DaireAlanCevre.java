import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yariCap;
        double alan,cevre;

        System.out.print("Dairenin Yaricapini girin : ");
        yariCap=input.nextInt();

        alan=(yariCap*yariCap)*Math.PI;
        cevre=2*Math.PI*yariCap;
        System.out.println("Dairenin yaricapi : "+ yariCap);
        System.out.println("Dairenin alani : "+ alan);
        System.out.println("Dairenin cevresi : "+ cevre);
    }
}
