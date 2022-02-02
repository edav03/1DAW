import java.util.Scanner;

public class Ejercicio_a2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Per1 p1 = new Per1();
        Per2 p2 = new Per2();

        System.out.print("Datos de persona 1:\nDNI: ");
         p1.dni = sc.nextInt();    

        sc.nextLine();
        
        System.out.print("Nombre: ");
         p1.nombre = sc.nextLine();

        System.out.print("Apellidos: ");
         p1.apellidos = sc.nextLine();

        System.out.print("Edad: ");
         p1.edad = sc.nextInt();

        System.out.print("\nDatos de persona 2:\nDNI: ");
         p2.dni = sc.nextInt();    

        sc.nextLine();
        
        System.out.print("Nombre: ");
         p2.nombre = sc.nextLine();

        System.out.print("Apellidos: ");
         p2.apellidos = sc.nextLine();

        System.out.print("Edad: ");
         p2.edad = sc.nextInt();
         
        if(p1.edad > 17){
            System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni + " es mayor de edad");
        }
        else{
           System.out.println(p1.nombre + " " + p1.apellidos + "con DNI " + p1.dni + " es menor de edad"); 
        }

        if(p2.edad > 17){
            System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni + " es mayor de edad");
        }
        else{
           System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni + " es menor de edad"); 
        }
    }

}