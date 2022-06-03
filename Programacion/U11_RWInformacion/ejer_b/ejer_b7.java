import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ejer_b7 {
    public static void main(String[] args){
        File coplas = new File("ejer_b/documentos/Libros/coplas_manrique.txt");
        List<String> lines_coplas =  new ArrayList<String>();
        List<String> char_coplas = new ArrayList<String>();
        List<String> words_coplas = new ArrayList<String>();
        int cont = 0;

        try {

            Scanner sc_coplas = new Scanner(coplas);

            while (sc_coplas.hasNext()) {
                lines_coplas.add(sc_coplas.nextLine());
                cont += 1;
            }

            for(int i = 0; i < lines_coplas.size(); i++){
                char_coplas.addAll(Arrays.asList(lines_coplas.get(i).split("")));
                words_coplas.addAll(Arrays.asList(lines_coplas.get(i).split(" ")));
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Datos del archivo coplas_manrique.txt");
        System.out.println("Numero de lineas: " + cont);
        System.out.println("Numero de palabras: " + words_coplas.size());
        System.out.println("Caracteres: " + char_coplas.size());
    }
}
