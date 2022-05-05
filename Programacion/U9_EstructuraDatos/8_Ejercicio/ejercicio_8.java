import java.util.ArrayList;
import java.util.Iterator;

public class ejercicio_8 {
    public static void main(String[] args){
        ArrayList<carta8> list = new ArrayList<carta8>(10);

        // Se escoje aleatoriamente 10 cartas de la 
        // baraja española y se guardan en un ArrayList
        for(int i = 0; i < 10; i++){
            list.add(new carta8());
        }

        // Se recorre la lista y se muestran las cartas
        for(Iterator<carta8> it = list.iterator(); it.hasNext();){
            carta8 p = (carta8)it.next();
            System.out.println(p.toString());
        }
    }
}
