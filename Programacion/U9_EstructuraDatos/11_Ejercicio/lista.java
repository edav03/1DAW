import java.util.ArrayList;
import java.util.Random;

public class lista {

    private String rand_words = setWords();

    ArrayList<String> lista = new ArrayList<String>();

    public String setWords(){
        Random rand = new Random();

        lista.add("tenedor");
        lista.add("agua");
        lista.add("raton");
        lista.add("pantalla");
        lista.add("botella");
        lista.add("arbol");
        lista.add("flor");
        lista.add("ventana");
        lista.add("nube");
        lista.add("edificio");
        lista.add("carton");
        lista.add("lapiz");
        lista.add("luz");
        lista.add("borrador");
        lista.add("colgante");
        lista.add("puerta");
        lista.add("sillon");
        lista.add("teclado");
        lista.add("enchufe");
        lista.add("pegatin");

        int r = rand.nextInt(21);

        return lista.get(r);
    }

    public String getWords(){
        return rand_words;
    }
}
