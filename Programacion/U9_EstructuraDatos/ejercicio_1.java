import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ejercicio_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList names = new ArrayList<>();

        names.add("Isabel");
        names.add("Jaume");
        names.add("Ricardo");
        names.add("Sandra");
        names.add("Alejandro");
        names.add("David");

        for(Iterator it = names.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
}