import java.util.ArrayList;
import java.util.Iterator;

public class ejercicio_7 {
    public static void main(String[] args){
        ArrayList list = new ArrayList();

        for(int i = 0; i < 6; i++){
            list.add(new moneda());
        }

        for(Iterator<moneda> it = list.iterator(); it.hasNext();){
            moneda m = (moneda)it.next();
            System.out.println(m.getValor() + " -- " + m.getPos());
        }
    }
}
