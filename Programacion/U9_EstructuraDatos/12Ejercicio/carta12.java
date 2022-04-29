import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;

public class carta12 {

    private String valor;
    private String palo = setPalo();

    Random rand = new Random();
    HashMap<String, Integer> briscaValor = new HashMap<String, Integer>();
    
    public String setPalo(){
        String[] palo = new String[4];
        palo[0] = "Oros";
        palo[1] = "Copas";
        palo[2] = "Espadas";
        palo[3] = "Bastos";

        int p = rand.nextInt(4);

        return palo[p];
    }

    public String setValor(){
        briscaValor.put("as", 11);
        briscaValor.put("2", 0);
        briscaValor.put("tres", 10);
        briscaValor.put("4", 0);
        briscaValor.put("5", 0);
        briscaValor.put("6", 0);
        briscaValor.put("7", 0);
        briscaValor.put("8", 0);
        briscaValor.put("9", 0);
        briscaValor.put("sota", 2);
        briscaValor.put("caballo", 3);
        briscaValor.put("rey", 4);

        int r = rand.nextInt(12);
        String value = (new ArrayList<String> (briscaValor.values())).get(r);
        
        return "" + briscaValor.keySet();
    }
}
