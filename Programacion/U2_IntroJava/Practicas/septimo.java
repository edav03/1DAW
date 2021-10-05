import java.util.Scanner;

public class septimo{
    
    public static void main(String[] arg){
        Scanner dato = new Scanner(System.in);
        int x;

        System.out.print("Introduce las millas: ");
        x = dato.nextInt();

        System.out.println("Metros = " + (x * 1852));

        dato.close();
    }
}