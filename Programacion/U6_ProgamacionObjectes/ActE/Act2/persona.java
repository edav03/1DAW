public class persona {

    private final String dni;
    private String nombre;
    private String apellidos;
    private static int edad = 18;
    
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

    public static final boolean esMayorEdad(){
        if(edad < 18){
            return false;
        } else{
            return true;
        }
    }

    public static boolean validarDNI(String dni){
        boolean sent = true;

        for(int i = 0; i < dni.length(); i++){

            if(i < dni.length() - 1){
                if(dni.charAt(i) >= '0' && dni.charAt(i) <= '9'){
                    sent = true;
                } else {
                    sent = false;
                }
            }

            if(sent == true){
                Boolean dec = Character.isDigit(dni.charAt(i));
                if(dec){
                    return true;
                } else{
                    return false;
                }
            }
        }
        return true;
    }
}