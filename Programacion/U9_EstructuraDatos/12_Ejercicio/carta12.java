import java.util.Random;
import java.util.ArrayList;

public class carta12 {

    private String valor = setValor();
    private String palo = setPalo();

    public String setPalo(){
        Random rand = new Random();
        String[] palo = new String[4];
        palo[0] = "Oros";
        palo[1] = "Copas";
        palo[2] = "Espadas";
        palo[3] = "Bastos";

        int p = rand.nextInt(4);

        return palo[p];
    }

    public String setValor(){
        ArrayList<String> cartas = new ArrayList<String>();
        Random rand = new Random();
        cartas.add("as");
        cartas.add("2");
        cartas.add("tres");
        cartas.add("4");
        cartas.add("5");
        cartas.add("6");
        cartas.add("7");
        cartas.add("8");
        cartas.add("9");
        cartas.add("sota");
        cartas.add("caballo");
        cartas.add("rey");

        int r = rand.nextInt(12);
        
        return cartas.get(r);
    }

    public String getValor(){
        return valor;
    }

    public String getPalo(){
        return palo;
    }

    public String getCarta(){
        return valor + " de " + palo;
    }
}
