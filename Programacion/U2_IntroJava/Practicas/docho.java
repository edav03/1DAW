import java.util.Scanner;

public class docho {
    public static void main(String[] arg){
        Scanner hours = new Scanner(System.in);
        int h, p;
        double salary, y, n, r;
        int t_normal = 9;

        System.out.println("(La tarifa normal se paga a 9€ la hora)");
        System.out.print("Introduce las horas trabajadas: ");
        h = hours.nextInt();

        if(h < 36){
            y = h * t_normal;
        }
        else{
            p = h - 35;
            y = (35 * t_normal) + (p * (1.5 * t_normal));
        }


        // if (y < 501){
        //     y = salary;
        //     System.out.println("Salario = " + salary);
        // }
        // else{
        //     if(y < 901){
        //         n = y - 500;
        //         y = 500 + n;
        //         salary = 500 + (n + 0.25);
        //     }
        //     else{
        //         n = 100 + r;
        //         y = n - 100;
        //     }
        // }
        
    }
}
