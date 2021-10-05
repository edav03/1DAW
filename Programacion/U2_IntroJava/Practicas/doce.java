import java.util.Scanner;

public class doce {
    public static void main(String[] arg){
        Scanner num = new Scanner(System.in);
        int x;

        System.out.print("Introduce el valor de x: ");
        x = num.nextInt();

        if(x < 0){
            System.out.println(x + " es negatiu.");
        }
        else{
            System.out.println(x + " es positiu.");
        }

        num.close();
    }    
}