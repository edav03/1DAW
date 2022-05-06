import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>(10);

        System.out.println("Intoduce 10 palabras : ");
        for(int i = 0; i < 10; i++){
            System.out.print((i + 1) + ": ");
            String a = sc.nextLine();
            lista.add(a);
        }
        
        Collections.sort(lista);

        System.out.println("\nOrdenados: ");
        for(Iterator<String> it = lista.iterator(); it.hasNext();){
            System.out.print(it.next() + ", ");
        }

        sc.close();
    }
}
