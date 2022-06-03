import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class ejer_b4 {
    public static void main(String[] args) throws IOException{
        Random rand = new Random();
        File file_nombres = new File("ejer_b/documentos/usa_nombres.txt");
        File file_apellidos = new File("ejer_b/documentos/usa_apellidos.txt");
        Scanner sc = new Scanner(System.in);
        List<String> nombres = new ArrayList<String>();
        List<String> apellidos = new ArrayList<String>();
        List<String> combinacion = new ArrayList<String>();
        List<String> destino = new ArrayList<String>();

        System.out.print("Nombres a generar: ");
        int n = sc.nextInt();
        sc.close();
    
        System.out.print("Archivo donde añadirlo: ");
        String arch = sc.next();
        File file_destino = new File("ejer_b/documentos/" + arch);
        System.out.println(file_destino.getAbsolutePath());

        try {
            
            Scanner sc_destino = new Scanner(file_destino);
            Scanner sc_nombres = new Scanner(file_nombres);
            Scanner sc_apellidos = new Scanner(file_apellidos);

            while (sc_nombres.hasNext()) {
                nombres.add(sc_nombres.nextLine());
            }

            while (sc_apellidos.hasNext()) {
                apellidos.add(sc_apellidos.nextLine());
            }

            while (sc_destino.hasNext()) {
                destino.add(sc_destino.nextLine());
            }

            sc_destino.close();
            sc_nombres.close();
            sc_apellidos.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        FileWriter myWriter = new FileWriter(file_destino);

        System.out.println("Nombres a añadir: ");
        for(int i = 0; i < n; i++){
            combinacion.add(nombres.get(rand.nextInt(nombres.size())) + " " + apellidos.get(rand.nextInt(apellidos.size())));
            destino.add(combinacion.get(i));
            System.out.println(destino.get(i));
        }
        for(int i = 0; i < destino.size(); i++){
            myWriter.write(destino.get(i) + "\n");
        }
        myWriter.close();

        System.out.println("Nombres añadidos exitosamente");

    }
}
