import java.util.Scanner;

public class once {
    public static void main(String[] arg){
        Scanner primer = new Scanner(System.in);
        Scanner segon = new Scanner(System.in);
        int x, y;

        System.out.print("Introduce el valor de x: ");
        x = primer.nextInt();

        System.out.print("Introduce el valor de y: ");
        y = segon.nextInt();

        if(x < y){
            System.out.println(y);
        }
        else{
            System.out.println(x);
        }

        primer.close();
        segon.close();

    }
}