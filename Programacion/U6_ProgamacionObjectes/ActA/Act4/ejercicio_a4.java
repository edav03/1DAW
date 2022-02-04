public class ejercicio_a4{
    public static void main(String[] args){

        articulos art1 = new articulos();

        art1.nombre = "Pijama";
        art1.precio = 18;
        art1.cuantosQuedan = 20;

        System.out.println(art1.nombre + " - Precio: " + art1.precio + "€ IVA: " + art1.iva + "% - PVP: " + art1.precioPublico() + "€ - Quedan: " + art1.cuantosQuedan + " unidades");
    }
}