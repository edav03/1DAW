package ejer_a;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

public class ejer_a2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String p = "Prueba";
        boolean info;

        while(p != ""){
        System.out.print("Introduce una ruta de linux: ");
        p = sc.nextLine();
        System.out.print("Mostrar información?(s/n)");
        String r = sc.next();

        if(r == "s"){
            info = true;
        }else{
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

        }else if(ruta.isDirectory() && info == true){
            File[] lista = ruta.listFiles();
            Arrays.sort(lista);

            System.out.println("Nombre del directorio: [A] " + ruta.getName() + "\nContenido del directorio:");

            // falta poner el tamaño en bytes y la fecha de ultima mod
            for(int i = 0; i < lista.length; i++){
                File f = lista[i];

                if(f.isDirectory()){

                    System.out.println("[A]" + f.getName());

                }
            }

            for(int i = 0; i < lista.length; i++){
                File f = lista[i];

                if(f.isFile()){

                    System.out.println("[*]" + f.getName());

                }
            }

        }else if(ruta.isDirectory()){
            File[] lista = ruta.listFiles();
            Arrays.sort(lista);

            System.out.println("Nombre del directorio: [A] " + ruta.getName() + "\nContenido del directorio:");

            for(int i = 0; i < lista.length; i++){
                File f = lista[i];

                if(f.isDirectory()){

                    System.out.println("[A]" + f.getName());

                }
            }

            for(int i = 0; i < lista.length; i++){
                File f = lista[i];

                if(f.isFile()){

                    System.out.println("[*]" + f.getName());

                }
            }

        }else{

            System.out.println("Direccion erronea");

        }
    } 
}