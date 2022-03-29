public class excepNombre extends Exception{
    private String nombre;

    excepNombre(String nombre){
        this.nombre = nombre;
    }

    public String toString(){
        return "El nombre: '" + this.nombre + "' no es valido";
    }
}
