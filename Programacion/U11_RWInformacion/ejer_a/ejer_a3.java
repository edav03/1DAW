package ejer_a;
import java.io.File;

public class ejer_a3 {
    public static void main(String[] args){

        // Renombramiento de directorios
        File origenDocs = new File("ejer_a/documentos");
        File destinoDocs = new File("ejer_a/DOCS");

        File origenFoto = new File("ejer_a/DOCS/Fotografias");
        File destinoFoto = new File("ejer_a/DOCS/FOTOS");

        File origenLibros = new File("ejer_a/DOCS/Libros");
        File destinoLibros = new File("ejer_a/DOCS/LECTURAS");

        // Uso de booleans para confirmar cambios
        boolean resDocs = origenDocs.renameTo(destinoDocs);
        boolean resFoto = origenFoto.renameTo(destinoFoto);
        boolean resLibro = origenLibros.renameTo(destinoLibros);

        System.out.println("Se ha podido renombrar DOCS? " + resDocs);
        System.out.println("Se ha podido renombrar FOTOS? " + resFoto);
        System.out.println("Se ha podido renombrar LIBROS? " + resLibro);

        // Renombramiento de archivos
        renomArch(destinoFoto, "FOTOS");
        renomArch(destinoLibros, "LECTURAS");
        

    }

    public static void renomArch(File rutaFotos, String r){
        File[] lista = rutaFotos.listFiles();

        for(int i = 0; i < lista.length; i++){
            File f = lista[i];

            String nameF = f.getName();
            String nameS = nameF.substring(0, nameF.length() - 4);

            File s = new File("ejer_a/DOCS/" + r + "/" + nameS);

            f.renameTo(s);
        }
    }
}
