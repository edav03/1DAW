import java.util.Scanner;
import java.io.File;
import java.sql.Date;
import java.util.Arrays;

public class ejer_a2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String p = "Prueba";
        boolean info = true;

        while(p != ""){

            System.out.print("Introduce una ruta de linux: ");
            p = sc.nextLine();
            System.out.print("Mostrar información?(s/n): ");
            String r = sc.nextLine();

            if(r.equalsIgnoreCase("s")){
                info = true;
            }else if(r.equalsIgnoreCase("n")){
                info = false;
            }

            File ruta = new File(p);

            muestraInfoRuta(ruta, info);

        }

        sc.close();
    }

    public static void muestraInfoRuta(File ruta, boolean info){

        System.out.println("Ruta absoluta: " + ruta.getAbsolutePath());
        System.out.println("Ruta parent: " + ruta.getParent());

        if(ruta.isFile()){

            System.out.println("Nombre del archivo: [*] " + ruta.getName());

        }
        // Bytes y ultima fecha de modificación
        else if(ruta.isDirectory() && info == true){
        
            File[] lista = ruta.listFiles();
            Arrays.sort(lista);

            System.out.println("Nombre del directorio: [A] " + ruta.getName() + "\nContenido del directorio:");

            // Imprime directorios
           for(int i = 0; i < lista.length; i++){
                File f = lista[i];

                if(f.isDirectory()){
                    long milis = f.lastModified();
                    Date fecha = new Date(milis);

                    System.out.println("[A]" + f.getName() + " | " + f.length() + " | " + fecha);

                }
            }

            // Imprime archivos
            for(int i = 0; i < lista.length; i++){
                File f = lista[i];

                if(f.isFile()){
                    long milis = f.lastModified();
                    Date fecha = new Date(milis);

                    System.out.println("[*]" + f.getName() + " | " + f.length() + " | " + fecha);

                }
            }

        }
        
        else if(ruta.isDirectory() && info == false){
        
            File[] lista = ruta.listFiles();
            Arrays.sort(lista);

            System.out.println("Nombre del directorio: [A] " + ruta.getName() + "\nContenido del directorio:");

            // Imprime directorios
            for(int i = 0; i < lista.length; i++){
                File f = lista[i];

                if(f.isDirectory()){

                    System.out.println("[A]" + f.getName());

                }
            }

            // Imprime archivos
            for(int i = 0; i < lista.length; i++){
                File f = lista[i];

                if(f.isFile()){

                    System.out.println("[*]" + f.getName());

                }
            }

        }

        else{

            System.out.println("Direccion erronea");

        }
    } 
}