import java.lang.Math;
import java.util.Random;

public class carta8 {

    private int valor = setValor();
    private String palo = setPalo();


    public int setValor(){
        return (int)(Math.random() * 12) + 1;
    }

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

    public String toString(){
        return valor + " de " + palo;
    }

}
