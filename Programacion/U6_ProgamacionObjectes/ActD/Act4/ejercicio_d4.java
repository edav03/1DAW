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

        if(c1.vender(vendido) == true){
            System.out.println("Si es posible");
        } else {
            System.out.println("No es posible vender tal cantidad");
        }

        System.out.print("Cantidad que quieres almacenar: ");
         alm = sc.nextInt();

        if(c1.almacenar(alm) == true){
            System.out.println("Si es posible almacenarlo");
        } else {
            System.out.println("No es posible almacenar tal cantidad");
        }

        c1.setdescuento(descuento);
        c1.datos(nombre, precio, iva, cuantosQuedan);
        c1.imprime();

        c1.setnombre("Ricardo");
        c1.setprecio(12.4);
        c1.setiva(35);
        c1.setcuantosQuedan(-1);

        c1.imprime();
    }
}