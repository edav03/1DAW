public class Per1 {

    public int dni;
    public String nombre;
    public String apellidos;
    public int edad;

    public void mensaje(){

        if(edad > 18){
            System.out.println(nombre + " " + apellidos + " con DNI " + dni + " es mayor de edad");
        }
        else{
           System.out.println(nombre + " " + apellidos + "con DNI " + dni + " es menor de edad"); 
        }
    
    }
}
