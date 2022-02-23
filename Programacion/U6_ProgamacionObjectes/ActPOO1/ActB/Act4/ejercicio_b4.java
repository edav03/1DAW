import java.util.Scanner;

public class ejercicio_b4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        tienda c1 = new tienda();

        System.out.print("Nombre: ");
         c1.nombre = sc.nextLine();

        System.out.print("Precio: ");
         c1.precio = sc.nextDouble();

        System.out.print("IVA: ");
         c1.iva = sc.nextDouble();

        System.out.print("Cuantos quedan: ");
         c1.cuantosQuedan = sc.nextInt();

        c1.cont();
    }
}