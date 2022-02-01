import java.util.Scanner;

public class Ejercicio_a2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Per1 p1 = new Per1();

        System.out.print("Datos de persona 1:\nDNI: ");
         p1.dni =  sc.nextInt();    
        
        System.out.println("Nombre: ");
         p1.nombre = sc.nextLine();

        System.out.println("Apellidos: ");
         p1.apellidos = sc.nextLine();
        
        System.out.println("Edad: ");
         p1.edad = sc.nextInt();
         
        mensaje();
    }

}