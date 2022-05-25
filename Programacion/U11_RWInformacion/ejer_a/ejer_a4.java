package ejer_a;
import java.io.File;

public class ejer_a4 {
    public static void main(String[] args){
        File cosas = new File("ejer_a/documentos/MisCosas");
        File alfabeto = new File("ejer_a/documentos/Alfabeto");

        cosas.mkdir();
        alfabeto.mkdir();

        File orFoto = new File("ejer_a/documentos/Fotografias");
        File orLibro = new File("ejer_a/documentos/Libros");

        File destFoto = new File("ejer_a/documentos/MisCosas/Fotografias");
        File destLibro = new File("ejer_a/documentos/MisCosas/Libros");

        boolean movFoto = orFoto.renameTo(destFoto);
        boolean movLibro = orLibro.renameTo(destLibro);

        System.out.println("Ha sido posible mover FOTOGRAFIAS? " + movFoto);
        System.out.println("Ha sido posible mover LIBRO? " + movLibro);

        for(int i = 65; i < 91; i++){
            File c = new File("ejer_a/documentos/Alfabeto/" + (char)i);

            c.mkdir();
        }
    }
}
