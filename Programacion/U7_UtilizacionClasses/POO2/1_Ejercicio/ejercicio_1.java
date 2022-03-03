import java.util.ArrayList;
import java.util.Iterator;

public class ejercicio_1{
    public static void main(String[] args){
        Producto p1 = new Producto("Edison", 18);
        Producto p2 = new Producto("Raul", 23);
        Producto p3 = new Producto("Isabel", 10);
        Producto p4 = new Producto("Enrique", 75);
        Producto p5 = new Producto("Sandra", 28);

        ArrayList lista = new ArrayList();

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        for(Iterator n = lista.iterator(); n.hasNext();){
            Producto p = (Producto)n.next();
            System.out.println(p.getNombre() + " : " + p.getCantidad());
        }

        lista.remove(2);
        lista.remove(3);

        System.out.println("\nLista tras eliminar puesto 2 i 4");
        for(Iterator n = lista.iterator(); n.hasNext();){
            Producto p = (Producto)n.next();
            System.out.println(p.getNombre() + " : " + p.getCantidad());
        }

        lista.clear();

    }
}