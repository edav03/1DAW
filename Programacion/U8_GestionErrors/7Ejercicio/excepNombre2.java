public class excepNombre2 extends Exception{
    private String nombre;

    excepNombre2(String nombre){
        this.nombre = nombre;
    }

    public String toString(){
        return "El nombre: '" + this.nombre + "' no es valido";
    }
}