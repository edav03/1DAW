import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class ejercicio_2 {
    public static void main(String[] args){
        int Arandom = (int)(Math.random()*(11)+ 10);
        ArrayList<Integer> lista = new ArrayList<Integer>(Arandom);
        int suma = 0;

        for(int i = 0; i <= Arandom; i++){
            int lrandom = (int)(Math.random()*(101));
            lista.add(lrandom);
            suma += lrandom;
        }

        Collections.sort(lista);

        System.out.println("Sumatorio = " + suma + "\nMedia = " + (suma/2) + "\nMaximo: " + (lista.get(lista.size()-1)) + "\nMinimo = " + lista.get(0));

    }
}