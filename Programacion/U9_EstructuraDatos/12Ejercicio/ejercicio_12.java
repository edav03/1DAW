import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

public class ejercicio_12 {
    public static void main(String[] args){
        HashMap<String, Integer> briscaValor = new HashMap<String, Integer>();
        Random rand = new Random();
        String[] palo = new String[4];
        palo[0] = "Oros";
        palo[1] = "Copas";
        palo[2] = "Espadas";
        palo[3] = "Bastos";


        briscaValor.put("as", 11);
        briscaValor.put("tres", 10);
        briscaValor.put("sota", 2);
        briscaValor.put("caballo", 3);
        briscaValor.put("rey", 4);

        for(int i = 0; i < 6; i++){
            int r = (int)(Math.random() * 12) + 1;
            int p = rand.nextInt(4);
        }

    }
}
