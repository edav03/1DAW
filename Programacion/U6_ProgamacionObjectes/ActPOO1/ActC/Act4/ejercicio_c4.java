import java.util.Scanner;

public class ejercicio_c4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        tienda c1 = new tienda();

        String nombre;
        double precio, iva;
        int cuantosQuedan;

        System.out.print("Nombre: ");
         nombre = sc.nextLine();

        System.out.print("Precio: ");
         precio = sc.nextDouble();

        System.out.print("IVA: ");
         iva = sc.nextDouble();

        System.out.print("Cuantos quedan: ");
         cuantosQuedan = sc.nextInt();

        c1.datos(nombre, precio, iva, cuantosQuedan);
        c1.cont();

        c1.setnombre("Ricardo");
        c1.setprecio(12.4);
        c1.setiva(35);
        c1.setcuantosQuedan(-1);

        c1.cont();
    }
}