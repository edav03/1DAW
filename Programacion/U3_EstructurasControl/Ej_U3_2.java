import java.util.Scanner;

public class Ej_U3_2 {

    public static void Print(String men){

        System.out.println(men);

    }

    public static void wait(int ms){

        try{
            Thread.sleep(ms);
        }

        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }

    }
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        int x = -1;
        String menu =
        "\n15. Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que introducimos por teclado." +
        "\n16. Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no." +
        "\n17. Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará: El total de números introducidos, excluido el 0. El total de números fallados.";

        Print(menu);

        x = num.nextInt();

        while(x != 0){
            switch(x){
                case 15: fifteen();
                break;
                case 16: sixteen();
                break;
                // case 17: seventeen();
                // break;
                // case 18: eighteen();
                // break;
                // case 19: nineteen();
                // break;
                // case 20: twenty();
                // break;
                // case 21: twentyone();
                // break;
                // case 22: twentytwo();
                // break;
                default:
                break;
            }
        }
    }

    public static void fifteen(){
        Scanner num = new Scanner(System.in);
        int x, i=1;
        int cont=0;

        System.out.println("Dame un número: ");
        x = num.nextInt();

        while(i <= x){

                if(i%3==0){
                    cont++;
                }
            i++;
            
        }

        System.out.println("Multiples de 3: " + cont);
    
        wait(2000);
        main(null);

    }
    

    public static void sixteen(){
        Scanner num = new Scanner(System.in);
        float numero, cont = 0;

        System.out.println("Dame un número entero positivo: ");
        numero = num.nextInt();
        
        if (numero == 0 || numero == 1 || numero == 4) {}

        for (int x = 2; x < numero / 2; x++) {
        // Si es divisible por cualquiera de estos números, no
        // es primo
        if (numero % x == 0){}
        else{cont++;}

        }

          // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        if(cont == 0){
            System.out.println("No es primo");
        }
        else{
            System.out.println("Es primo");
        }

        wait(1200);
        main(null);   

    }

    public static void seventeen(){
        Scanner num = new Scanner(System.in);
        int x=-1;

        while(x != 0){
            System.out.println("Dame un número inicial: ");
            x = num.nextInt();


        }
    }

}
