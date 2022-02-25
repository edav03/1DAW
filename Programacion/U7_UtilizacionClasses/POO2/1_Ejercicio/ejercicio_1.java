import java.util.ArrayList;
import java.util.Iterator;

public class ejercicio_1{
    public static void main(String[] args){
        ArrayList lista = new ArrayList();

        Producto p1 = new Producto("Edison", 18);
        Producto p2 = new Producto("Alejandro", 48);
        Producto p3 = new Producto("Sandra", 26);
        Producto p4 = new Producto("Adriana", 4);
        Producto p5 = new Producto("Jojo", 23);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        Iterator iter = lista.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}