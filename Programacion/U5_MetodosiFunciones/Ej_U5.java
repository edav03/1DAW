import java.util.Scanner;

public class Ej_U5{

    public static void main(String[] args){
       Scanner num = new Scanner(System.in);

       System.out.print("Introduce X: ");
       int x = num.nextInt();

       System.out.print("Introduce Y: ");
       int y = num.nextInt();

       System.out.print("Introduce Z: ");
       int z = num.nextInt();

       boolean res = formula(x, y, z);

       if(res == true){
            System.out.println("Son iguales");
       }
       else{
           System.out.println("No son iguales");
       }
    }

    public static boolean formula(int x, int y, int z){
        boolean res =  true;

        if((Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2))){
            res = true;
        }
        else{
            res = false;
        }

        return res;
    }
}