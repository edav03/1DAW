import java.util.Scanner;

public class ejercicio_d4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        tienda c1 = new tienda();

        String nombre;
        double precio, iva;
        int cuantosQuedan, descuento, vendido, alm;

        System.out.print("Nombre: ");
         nombre = sc.nextLine();

        System.out.print("Precio: ");
         precio = sc.nextDouble();

        System.out.print("IVA: ");
         iva = sc.nextDouble();

        System.out.print("Cuantos quedan: ");
         cuantosQuedan = sc.nextInt();

        System.out.print("De cuanto quieres el descuento?: ");
         descuento = sc.nextInt();

        System.out.print("Cantidad que quieres vender: ");
         vendido = sc.nextInt();

        System.out.print("Cantidad que quieres almacenar: ");
         alm = sc.nextInt();

        c1.setdescuento(descuento);
        c1.datos(nombre, precio, iva, cuantosQuedan);


        if(c1.vender(vendido) == true){
            System.out.println("Si es posible vender esa cantidad.");
        } else {
            System.out.println("No es posible vender tal cantidad");
        }

        if(c1.almacenar(alm) == true){
            System.out.println("Si es posible almacenarlo");
        } else {
            System.out.println("No es posible almacenar tal cantidad");
        }

        c1.imprime();

    }
}