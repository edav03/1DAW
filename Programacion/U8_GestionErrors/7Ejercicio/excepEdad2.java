public class excepEdad2 extends Exception{
    private int edad;

    excepEdad2(int edad){
        this.edad = edad;
    }

    public String toString(){
        return "Error: La edad no puede ser negativa tonto/a";
    }
}
