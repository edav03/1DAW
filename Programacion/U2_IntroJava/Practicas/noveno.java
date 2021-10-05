import java.util.Scanner;

public class noveno {
    public static void main(String[] arg){
        Scanner años = new Scanner(System.in);
        int edad;

        System.out.print("Introduce tu edad: ");
        edad = años.nextInt();

        if(edad > 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }

        años.close();
    }
}
