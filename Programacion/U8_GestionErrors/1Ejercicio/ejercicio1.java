import java.util.Scanner;
import java.util.InputMismatchException;

public class ejercicio1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Introduce un numero entero:");
            int n = sc.nextInt();

            System.out.println("Valor introducido = " + n);

        }catch(InputMismatchException ex){
            System.out.println("Valor introducido incorrecto");
        }

        System.out.println("Fin del programa");
    }
}