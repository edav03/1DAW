public class ejercicio_e2{
    public static void main(String[] args){
        persona p1 = new persona("20059634T", "Edison", "Alcocer", 18);
        
        if(p1.esMayorEdad() == true){
            System.out.println("Es mayor de edad");
        } else{
            System.out.println("Es menor de edad");
        }

        if(p1.esJubilado() == true){
            System.out.println("Es jubilado");
        } else{
            System.out.println("No es jubilado");
        }
    }
}