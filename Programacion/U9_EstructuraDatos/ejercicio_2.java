import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Math;

public class ejercicio_2 {
    public static void main(String[] args){
        int Arandom = (int)(Math.random()*(11)+ 10);
        ArrayList lista = new ArrayList<>(Arandom);
        int suma = 0;

        for(Iterator it = lista.iterator(); it.hasNext();){
            int lrandom = (int)(Math.random()*(101));
            lista.add(lrandom);
        }

    }
}