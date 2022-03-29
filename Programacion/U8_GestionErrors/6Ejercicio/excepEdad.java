public class excepEdad extends Exception{
    private int edad;

    excepEdad(int edad){
        this.edad = edad;
    }

    public String toString(){
        return "Error: La edad no puede ser negativa tonto/a";
    }
}
