import java.util.Scanner;

public class tercer{
    public static void main(String[] arg){
        Scanner entrada = new Scanner(System.in);
        int lado;

        System.out.print ("Dame el lado del cuadrado: ");
        lado = entrada.nextInt();

        System.out.println ("Área = " + lado * lado);

        entrada.close();

    }
}