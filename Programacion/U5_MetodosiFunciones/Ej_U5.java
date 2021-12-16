import java.util.Scanner;

public class Ej_U5{

    public static void main(String[] args){
        Scanner num = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = num.nextInt();

        mult(n);
    }

    public static void mult(int n){
        int a = n;

        for(int i = 1; i < 11; i++){
            a = n * i;
            System.out.println(n + " * " + i + " = " + a);
        }
    }
}