import java.util.Scanner;

public class Ej_U5{

    public static void main(String[] args){
        Scanner num = new Scanner(System.in);

        System.out.print("Introduce la cantidad sin descuento: ");
        double n1 = num.nextDouble();

        System.out.print("Introduce la cantidad con descuento: ");
        double n2 = num.nextDouble();

        double result = desc(n1, n2);

        
    }

    public static double desc(double n1, double n2){
    }
}