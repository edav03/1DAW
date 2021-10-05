import java.util.Scanner;

public class quince {
    public static void main(String[] arg){
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        int x, y, z;

        System.out.print("Introduce el valor de X: ");
        x = num1.nextInt();

        System.out.print("Introduce el valor de Y: ");
        y = num2.nextInt();

        System.out.print("Introduce el valor de Z: ");
        z = num3.nextInt();

        if(y > x){
            if(y > z){
                System.out.println(y + " es mayor");
            } 
            else{
                System.out.println(z + " es mayor");
            }
        } 
        else{
            if(x > z){
                System.out.println(x + " es mayor");
            } 
            else{
                System.out.println(z + " es mayor");
            }
        }

        num1.close();
        num2.close();
        num3.close();
    }
}
