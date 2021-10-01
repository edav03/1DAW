import java.util.Scanner;

public class quart{
    public static void main(String[] arg){
        Scanner primer = new Scanner(System.in);
        Scanner segon = new Scanner(System.in);
        int x, y;

        System.out.print("Dame el valor de X: ");
            x = primer.nextInt();

        System.out.print("Dame el valor de Y: ");
            y = segon.nextInt();

        System.out.println(x + " + " + y + " = " + (x+y));
        System.out.println(x + " - " + y + " = " + (x-y));
        System.out.println(x + " * " + y + " = " + (x*y));
        System.out.println(x + " / " + y + " = " + (x/y));

        primer.close();
        segon.close();

    }
}