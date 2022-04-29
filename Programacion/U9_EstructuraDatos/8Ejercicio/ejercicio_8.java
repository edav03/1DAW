import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Math;
import java.util.Random;

public class ejercicio_8 {
    public static void main(String[] args){
        ArrayList<carta12> list = new ArrayList<carta12>(10);
        Random rand = new Random();
        String[] palo = new String[4];
        palo[0] = "Oros";
        palo[1] = "Copas";
        palo[2] = "Espadas";
        palo[3] = "Bastos";

        for(int i = 0; i < 10; i++){
            int r = (int)(Math.random() * 12) + 1;
            int p = rand.nextInt(4);

            list.add(new carta(r, palo[p]));
        }

        for(Iterator<carta12> it = list.iterator(); it.hasNext();){
            carta12 p = (carta12)it.next();
            System.out.println(p.toString());
        }
    }
}
