import java.io.File;

public class ejer_a5 {
    public static void main(String[] args){
        File f1 = new File("ejer_a/documentos/Fotografias");
        File f2 = new File("ejer_a/documentos/Libros");
        File f3 = new File("ejer_a/documentos");

        boolean ruta1 = borraTodo(f1);
        boolean ruta2 = borraTodo(f2);
        boolean ruta3 = borraTodo(f3);

        System.out.println("Ha sido posible borrar FOTOGRAFIAS? " + ruta1);
        System.out.println("Ha sido posible borrar LIBROS ?" + ruta2);
        System.out.println("Ha sido posible borrar DOCUMENTOS? " + ruta3);
    }

    public static boolean borraTodo(File f){
        if(f.isDirectory()){
            File[] lista = f.listFiles();

            for(int i = 0; i < lista.length; i++){
                File a = lista[i];

                a.delete();
            }

            f.delete();

            return true;
        }
        else if(f.isFile()){
            f.delete();

            return true;
        }
        else{
            return false;
        }
    }
}
