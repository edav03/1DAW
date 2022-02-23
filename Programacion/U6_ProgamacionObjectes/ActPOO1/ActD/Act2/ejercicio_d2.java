public class ejercicio_d2{
    public static void main(String[] args){

        persona p1 = new persona("20059634T", "Edison", "Alcocer", 18);
        persona p2 = new persona("43892134I", "Raul", "Millet", 65);
        
        p1.imprime();

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

        p2.imprime();
        System.out.println("Diferencia de edad: " + p1.diferenciaEdad(p2) + " años");
    }
}