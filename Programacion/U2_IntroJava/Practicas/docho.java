import java.util.Scanner;

public class docho {
    public static void main(String[] arg){
        Scanner hours = new Scanner(System.in);
        int h, p;
        double salary = 0;
        double y, n;
        int t_normal = 10;

        System.out.println("(La tarifa normal se paga a 10€ la hora)");
        System.out.print("Introduce las horas trabajadas: ");
        h = hours.nextInt();

        if(h < 36){
            y = h * t_normal;
        }
        else{
            p = h - 35;
            y = (p * (1.5 * t_normal)+ 350);
        }


        if (y < 501){
            salary = y;
            System.out.println("Salario = " + salary);
        }
        else{
            if(y < 901 && y > 500){
                n = y - 500;
                salary = 500 + (n * 0.25);
                System.out.println("Salario correspondiente = " + salary);
            }
            else{
                n = y - 900;
                salary = 600 + (n * 0.45);
                System.out.println("Salario correspondiente = " + salary);
            }
        }

        hours.close();
        
    }
}