import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ejer_b2 {
    public static void main(String[] args){
        List<String> alumnos = new ArrayList<String>();
        List<String> listAl = new ArrayList<String>();
        int notaAlumnos;
        double contNota = 0;
        double media;

        try {

            File f = new File("documentos/alumnos_notas.txt");
            Scanner sc = new Scanner(f);
            
            while(sc.hasNext()){
                String line = sc.nextLine();
                
                alumnos = Arrays.stream(line.split(" ")).collect(Collectors.toList());

                for(int i = 2; i < alumnos.size(); i++){
                    notaAlumnos = Integer.parseInt(alumnos.get(i));
                    contNota += notaAlumnos;
                }

                media = contNota/(alumnos.size()-2);

                alumnos.set(2, media + "");

                // System.out.println(alumnos);

                sort_Notes(alumnos);
                // String al = alumnos.get(0) + " "+alumnos.get(1)+ ": " +contNota/(alumnos.size()-2);
                // listAl.addAll(new ArrayList<String>(Arrays.asList(al)));
                // // System.out.println(listAl);
                contNota = 0;
            }

            // System.out.println(listAl.get(0));
            sc.close();

        } catch (FileNotFoundException e) {
            //TODO: handle exception
            e.printStackTrace();
        }

    }

    public static void sort_Notes(List<String> alumnos){

        List<String> alumnos_sorted = new ArrayList<>();

        alumnos_sorted.addAll(alumnos);
    }
}
