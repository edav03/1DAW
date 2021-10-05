import java.util.Scanner;

public class catorce {
    public static void main(String[] arg){
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        int x, y;

        System.out.print("Introduce el valor de X: ");
        x = num1.nextInt();

        System.out.print("Introduce el valor de Y: ");
        y = num2.nextInt();

        if(x > y){

            System.out.println(x + " es mayor.");

        } else if(x == y){

            System.out.println(x + " = " + y);

        } else{

            System.out.println(y + " es mayor.");

        }

        num1.close();
        num2.close();

    }
}
