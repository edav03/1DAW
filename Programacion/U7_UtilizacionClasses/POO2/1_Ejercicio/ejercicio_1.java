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

        for(Iterator it = lista.iterator(); it.hasNext();){
            Producto p = (Producto)it.next();
            System.out.println(p.getNombre() + " : " + p.getCantidad());
        }

    }
}