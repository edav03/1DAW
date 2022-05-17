package ejer_a;
import java.util.Scanner;
import java.io.File;


public class ejer_a1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String p = "Prueba";

        while(p != ""){
        System.out.print("Introduce una ruta de linux: ");
        p = sc.nextLine();

        File ruta = new File(p);

        muestraInfoRuta(ruta);
        }
    }

    public static void muestraInfoRuta(File ruta){

        System.out.println("Ruta absoluta: " + ruta.getAbsolutePath());
        System.out.println("Ruta parent: " + ruta.getParent());

        if(ruta.isFile()){

            System.out.println("Nombre del archivo: [*] " + ruta.getName());

        }else if(ruta.isDirectory()){
            File[] lista = ruta.listFiles();

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