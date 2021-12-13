import java.util.Scanner;

public class Ej_U5{

    public static int suma1aN(int n){
        int array[] = new int[n];
        int suma = 0;

        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
            suma += array[i];
        }

        return suma;
    }
    public static int producto1aN(int n){
        int array[] = new int[n];
        int mult = 1;

        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
            mult *= array[i];
        }

        return mult;
    }
    public static double intermedio1aN(int n){
        double result = (n -1)/2;
        return result;
    }
    
    public static void main(String[] args){
       Scanner num = new Scanner(System.in);

       System.out.print("Introduce un numero: ");
       int n = num.nextInt();

       int suma = suma1aN(n);
       int product = producto1aN(n);
       double inter = intermedio1aN(n);
       
       System.out.println("Sumatorio = " +  suma + "\nProductorio = " + product + "\nValor intermedio = " + inter);

       num.close();
    }
}