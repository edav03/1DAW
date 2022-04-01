import java.util.Scanner;
import java.util.InputMismatchException;

public class ejercicio_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            double array[] = new double[5];

            for(int i = 0; i < array.length; i++){
                System.out.print("Vector[" + (i + 1) + "] = ");
                array[i] = sc.nextDouble();
            }
        } catch (InputMismatchException ex) {
            System.out.println("Valor no valido");
        }
    }
}
