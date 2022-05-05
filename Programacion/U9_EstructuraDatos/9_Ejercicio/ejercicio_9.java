import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class ejercicio_9 {
    public static void main(String[] args){
        ArrayList<carta9> list = new ArrayList<carta9>(10);

        // Se escoje aleatoriamente 10 cartas de la 
        // baraja española y se guardan en un ArrayList
        for(int i = 0; i < 10; i++){
            list.add(new carta9());
        }


        Collections.sort(list, (a, b) -> Integer.compare(a.getValor(),b.getValor()));
        Collections.sort(list, (a, b) -> a.getPalo().compareTo(b.getPalo()));


        // Se recorre la lista y se muestran las cartas
        for(Iterator<carta9> it = list.iterator(); it.hasNext();){
            carta9 p = (carta9)it.next();
            System.out.println(p.toString());
        }
    }
}
