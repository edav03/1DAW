import java.lang.Math;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ejercicio_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = (int)(Math.random() * (100) + 1);

        int array[] = new int[a];

        for(int i = 0; i < array.length; i++){
            int b = (int)(Math.random() * (10) + 1);
            array[i] = b;
        }

        try {
            int n = 1;

            while(n > 0){
            System.out.print("Que posicion del array quieres ver: ");
            n = sc.nextInt();

            System.out.println("Array [" + n + "] = " + array[n]);
            }
        }
        catch (InputMismatchException ex) {
            System.out.println("Valor no valido");
        }
        catch(IndexOutOfBoundsException be){
            System.out.println("Valor no valido");
        }
    }
}