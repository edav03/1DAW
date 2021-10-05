import java.util.Scanner;

public class dseis {
    public static void main(String[] arg){
        Scanner num = new Scanner(System.in);
        int x;

        System.out.print("Introduce tu nota: ");
        x = num.nextInt();

        if(x < 3){
            System.out.println("Muy deficiente");
        }
        else if(x < 5){
            System.out.println("Insuficiente");
        }
        else if(x < 6){
            System.out.println("Bien");
        }
        else if(x < 9){
            System.out.println("Notable");
        }
        else{
            System.out.println("Sobresaliente");
        }

        num.close();
    }
}
