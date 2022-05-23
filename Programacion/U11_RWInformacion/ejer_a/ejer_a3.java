package ejer_a;
import java.io.File;

public class ejer_a3 {
    public static void main(String[] args){

        File origenDocs = new File("ejer_a/documentos");
        File destinoDocs = new File("ejer_a/DOCS");

        File origenFoto = new File("ejer_a/documentos/Fotografias");
        File destinoFoto = new File("ejer_a/documentos/FOTOS");

        File origenLibros = new File("ejer_a/documentos/Libros");
        File destinoLibros = new File("ejer_a/documentos/LECTURAS");

        boolean resDocs = origenDocs.renameTo(destinoDocs);
        boolean resFoto = origenFoto.renameTo(destinoFoto);
        boolean resLibro = origenLibros.renameTo(destinoLibros);

        System.out.println("Se ha podido renombrar DOCS? " + resDocs);
        System.out.println("Se ha podido renombrar FOTOS? " + resFoto);
        System.out.println("Se ha podido renombrar LIBROS? " + resLibro);

    }
}
