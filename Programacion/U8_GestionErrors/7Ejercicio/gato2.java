public class gato2 {
    private String nombre;
    private int edad;

    public gato2(String nombre, int edad){
        try {
            this.nombre = nombre;
            this.edad = edad;

            caracNom2(nombre);
            longEdad2(edad);
        }
        catch (excepNombre2 e) {
            System.err.println(e.toString());
        }
        catch (excepEdad2 d){
            System.err.println(d.toString());
        }
        
    }

    static void caracNom2(String nombre) throws excepNombre2{
        if(nombre.length() < 3){
            throw new excepNombre2(nombre);
        }
    }

    static void longEdad2(int edad) throws excepEdad2{
        if(edad < 0){
            throw new excepEdad2(edad);
        }
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }
}