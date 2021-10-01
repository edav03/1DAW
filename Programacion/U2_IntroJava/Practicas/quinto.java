import java.util.Scanner;

public class quinto{

    public static void main(String[] arg){
        Scanner radio = new Scanner(System.in);
        int r;

        System.out.print("Escribe el radio: ");
        r = radio.nextInt();

        System.out.println("Longitud de la circumferencia = " + (2 * Math.PI * r));
        System.out.println("Área del circulo = " + (Math.PI * Math.pow(r, 2)));
        System.out.println("Volumen de la esfera = " + ((4/3) * Math.PI * Math.pow(r, 3)));

    }
}