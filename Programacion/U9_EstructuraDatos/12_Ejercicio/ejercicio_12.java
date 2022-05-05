import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;

public class ejercicio_12 {
    public static void main(String[] args){
        ArrayList<carta12> showCards = new ArrayList<carta12>();
        HashMap<String, Integer> mapCards = new HashMap<String, Integer>();
        int cont = 0;

        mapCards.put("as", 11);
        mapCards.put("tres", 10);
        mapCards.put("sota", 2);
        mapCards.put("caballo", 3);
        mapCards.put("rey", 4);

        for(int i = 0; i < 5; i++){
        showCards.add(new carta12());
        }

        for(Iterator<carta12> it = showCards.iterator(); it.hasNext();){
            carta12 c = (carta12)it.next();
            System.out.println(c.getCarta());

            if(mapCards.containsKey(c.getValor())){
                cont += mapCards.get(c.getValor());
            }
        }

        System.out.println("Tienes " + cont + " puntos");
        
    }
}
