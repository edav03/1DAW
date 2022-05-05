import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<lista> words = new ArrayList<lista>();

        HashMap<String, String> dicc = new HashMap<String, String>();
        dicc.put("tenedor", "fork");
        dicc.put("agua", "water");
        dicc.put("raton", "mouse");
        dicc.put("pantalla", "screen");
        dicc.put("botella", "bottle");
        dicc.put("arbol", "tree");
        dicc.put("flor", "flower");
        dicc.put("ventana", "window");
        dicc.put("nube", "cloud");
        dicc.put("edificio", "building");
        dicc.put("carton", "cardboard");
        dicc.put("lapiz", "pencil");
        dicc.put("luz", "light");
        dicc.put("borrador", "eraser");
        dicc.put("colgante", "pendant");
        dicc.put("puerta", "door");
        dicc.put("sillon", "armchair");
        dicc.put("teclado", "keyboard");
        dicc.put("enchufe", "plug");
        dicc.put("pegatina", "sticker");

        for(int i = 0; i < 5; i++){
            words.add(new lista());
        }

        for(Iterator<lista> it = words.iterator(); it.hasNext();){
            lista w = (lista)it.next();
        }

        System.out.print("Introduce palabra en español: ");
        String word = sc.nextLine();

        System.out.println("Traduccion ingles: " + dicc.get(word));

        sc.close();
        
    }
}
