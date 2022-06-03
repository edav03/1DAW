import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejer_b5 {
    public static void main(String[] args) throws IOException{
        File f = new File("ejer_b/documentos/Diccionario");
        f.mkdir();
        File letra = new File("ejer_b/documentos/diccionario.txt");
        List<String> palabras = new ArrayList<String>();

        try {

            Scanner diccionario_letras = new Scanner(letra);

            while (diccionario_letras.hasNext()) {
                palabras.add(diccionario_letras.next());
            }

            diccionario_letras.close();
            

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for(int i = 65; i < 91; i++){
            File c = new File("ejer_b/documentos/Diccionario/" + (char)i);
            FileWriter myWriter = new FileWriter(c);
            c.createNewFile();
            String wordsToLetter = "";
            String newLine = "\n";

            for(int z = 0; z < palabras.size(); z++){
                String[] word = palabras.get(z).split("");

                if(word[0].equals(String.valueOf((char)i).toLowerCase())){
                    String pal = palabras.get(z);
                    wordsToLetter += pal + newLine;
                    // palabras.remove(0);
                }
                
            }

            myWriter.write(wordsToLetter);
            myWriter.close();

        }
    }
}
