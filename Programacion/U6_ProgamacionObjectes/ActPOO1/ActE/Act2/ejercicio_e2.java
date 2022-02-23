public class ejercicio_e2{
    public static void main(String[] args){
        persona p1 = new persona("23976989T", "Edison", "Alcocer", 18);
        
        if(p1.esMayorEdad() == true){
            System.out.println("Es mayor de edad");
        } else{
            System.out.println("Es menor de edad");
        }

        System.out.println("DNI correcto: " + persona.validarDNI("74927103H"));
        System.out.println("DNI erroneo: " + persona.validarDNI("43H213978"));

    }
}