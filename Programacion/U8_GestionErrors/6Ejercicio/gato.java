public class gato {
    private String nombre;
    private int edad;

    public gato(String nombre, int edad){
        try {
            this.nombre = nombre;
            this.edad = edad;

            caracNom(nombre);
            longEdad(edad);
        }
        catch (excepNombre e) {
            System.out.println(e.toString());
        }
        catch (excepEdad d){
            System.out.println(d.toString());
        }
        
    }

    static void caracNom(String nombre) throws excepNombre{
        if(nombre.length() < 3){
            throw new excepNombre(nombre);
        }
    }

    static void longEdad(int edad) throws excepEdad{
        if(edad < 0){
            throw new excepEdad(edad);
        }
    }
}