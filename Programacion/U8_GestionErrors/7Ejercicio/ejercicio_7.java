import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.InputMismatchException;

public class ejercicio_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList lista = new ArrayList();

        try {
            
            for(int i = 0; i < 5; i++){
                sc.nextLine();

                System.out.print("\nNombre para gato: ");
                String nom = sc.nextLine();

                System.out.print("Edad del gato: ");
                int edad = sc.nextInt();
                System.out.println();

                lista.add(new gato2(nom, edad));
            }

        }
        catch (InputMismatchException ex) {
            System.out.println("Valor no valido");
        }

        for(Iterator it = lista.iterator(); it.hasNext();){
            gato2 p = (gato2)it.next();
            System.out.println("\nNombre: " + p.getNombre() + "\nEdad: " + p.getEdad());
        }

    }
}
