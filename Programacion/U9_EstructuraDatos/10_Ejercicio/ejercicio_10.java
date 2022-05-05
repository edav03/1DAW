import java.util.HashMap;
import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
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

        System.out.print("Introduce palabra en español: ");
        String word = sc.nextLine();

        System.out.println("Traduccion ingles: " + dicc.get(word));

        sc.close();
    }
}
