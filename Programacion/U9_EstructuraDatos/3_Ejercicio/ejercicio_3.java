import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>(10);

        for(int i = 0; i < 11; i++){
            System.out.println("Introduce un numero: ");
            int a = sc.nextInt();
            lista.add(a);
        }
        
        Collections.sort(lista);

        System.out.println("\nSi los ordenamos: ");
        for(Iterator<Integer> it = lista.iterator(); it.hasNext();){
            System.out.print(it.next() + ", ");
        }

        sc.close();
    }
}
