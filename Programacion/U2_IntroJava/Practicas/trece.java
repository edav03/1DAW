import java.util.Scanner;

public class trece {
    public static void main(String[] arg){
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        int x, y;

        System.out.print("Introduce el valor de x: ");
        x = num1.nextInt();

        System.out.print("Introduce el valor de y: ");
        y = num2.nextInt();

        if(x > y){

            System.out.println(y + " < "+ x);

        } else{

            System.out.println(x + " < "+ y);
            
        }

        num1.close();
        num2.close();
    }
}
