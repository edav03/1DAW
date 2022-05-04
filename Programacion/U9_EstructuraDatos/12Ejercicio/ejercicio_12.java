import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;

public class ejercicio_12 {
    public static void main(String[] args){
        ArrayList<carta12> showCards = new ArrayList<carta12>();
        HashMap<String, Integer> mapCards = new HashMap<String, Integer>();

        mapCards.put("as", 11);
        mapCards.put("2", 0);
        mapCards.put("tres", 10);
        mapCards.put("4", 0);
        mapCards.put("5", 0);
        mapCards.put("6", 0);
        mapCards.put("7", 0);
        mapCards.put("8", 0);
        mapCards.put("9", 0);
        mapCards.put("sota", 2);
        mapCards.put("caballo", 3);
        mapCards.put("rey", 4);

        showCards.add(new carta12());
        showCards.add(new carta12());
        showCards.add(new carta12());
        showCards.add(new carta12());
        showCards.add(new carta12());

        for(Iterator it = showCards.iterator(); it.hasNext();){
            carta12 c = (carta12)it.next();
            System.out.println(c.getCarta());
        }
    }
}
