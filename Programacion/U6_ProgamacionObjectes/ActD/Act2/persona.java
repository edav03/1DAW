public class persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    
    public persona(String dni, String nombre, String apellidos, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getdni(){
        return dni;
    }

    public String getnombre(){
        return nombre;
    }

    public String getapellidos(){
        return apellidos;
    }

    public int getedad(){
        return edad;
    }

    public void setdni(String dni){
        this.dni = dni;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public void setapellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setedad(int edad){
        this.edad = edad;
    }

    public void imprime(){
        System.out.println(nombre + " " + apellidos + " con DNI: " + dni + " tiene " + edad + " años");
    }

    public boolean esMayorEdad(){
        if(edad < 18){
            return false;
        } else{
            return true;
        }
    }

    public boolean esJubilado(){
        if(edad < 65){
            return false;
        } else{
            return true;
        }
    }

    public int diferenciaEdad(persona p){
        return p.edad - edad;
    }

}
