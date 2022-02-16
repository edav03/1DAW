import java.util.Scanner;

public class ejercicio_e4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        tienda c1 = new tienda();

        String nombre;
        double precio;
        int cuantosQuedan, descuento, vendido, alm;

        System.out.print("Nombre: ");
         nombre = sc.nextLine();

        System.out.print("Precio: ");
         precio = sc.nextDouble();

        System.out.print("Cuantos quedan: ");
         cuantosQuedan = sc.nextInt();

        System.out.print("De cuanto quieres el descuento?: ");
         descuento = sc.nextInt();

        System.out.print("Cantidad que quieres vender: ");
         vendido = sc.nextInt();
    }
}
