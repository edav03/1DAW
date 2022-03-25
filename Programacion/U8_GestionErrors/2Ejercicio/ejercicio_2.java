import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

public class ejercicio_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Introduce el valor de A: ");
            int a = sc.nextInt();

            System.out.print("\nIntroduce el valor de B: ");
            int b = sc.nextInt();

            System.out.println("\nA/B = " + a/b);
        }
        catch (InputMismatchException ex) {
            System.out.println("\nValor no valido");
        }
        catch(ArithmeticException ar){
            System.out.println("\nDivision imposible");
        }
    }
}
