import java.util.ArrayList;
import java.util.Random;

public class lista {

    private String rand_words = setWords();

    public String setWords(){
        ArrayList<String> col = new ArrayList<String>();

        Random rand = new Random();

        col.add("tenedor");
        col.add("agua");
        col.add("raton");
        col.add("pantalla");
        col.add("botella");
        col.add("arbol");
        col.add("flor");
        col.add("ventana");
        col.add("nube");
        col.add("edificio");
        col.add("carton");
        col.add("lapiz");
        col.add("luz");
        col.add("borrador");
        col.add("colgante");
        col.add("puerta");
        col.add("sillon");
        col.add("teclado");
        col.add("enchufe");
        col.add("pegatina");

        int r = rand.nextInt(21);

        return col.get(r);
    }

    public String getWords(){
        return rand_words;
    }
}
