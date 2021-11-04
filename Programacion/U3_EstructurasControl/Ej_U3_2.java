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
        "\n17. Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará: El total de números introducidos, excluido el 0. El total de números fallados." +
        "\n18. Realiza un programa para calcular la suma de los cuadrados de los 5 primeros números naturales." +
        "\n19. Realiza un programa que lea un número y a continuación escriba el carácter “*” tantas veces igual al valor numérico leído. En aquellos casos en que el valor leído no sea positivo se deberá escribir un único asterisco." +
        "\n20. Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor." +
        "\n21. Realiza un programa que pida dos número enteros A y B, siendo B mayor que A. Luego visualiza los números desde A hasta B e indicar cuantos hay que sean pares." +
        "\n22. Realiza un programa que pida un número y construya por pantalla su pirámide.\n";

        System.out.println(menu);


        x = num.nextInt();

        while(x != 0){
            switch(x){
                case 15: fifteen();
                break;
                case 16: sixteen();
                break;
                case 17: seventeen();
                break;
                case 18: eighteen();
                break;
                case 19: nineteen();
                break;
                case 20: twenty();
                break;
                case 21: twentyone();
                break;
                case 22: twentytwo();
                break;
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
        int x=-1, antnum=0, cont=0, fallos=0;

        while(x != 0){
            System.out.println("Dame un número: ");
            x = num.nextInt();

            if(x < antnum){

                System.out.println("Fallo, es menor");
                fallos++;
                
            }

            cont++;
            antnum = x;
        }

        System.out.println("Total de números introducidos: " + cont);
        System.out.println("Números fallados: "+ fallos);

        wait(2000);
        main(null);
    }

    public static void eighteen(){
        int num, suma=0;

        for(int i=1; i < 6; i++){
            num = i*i;
            suma = suma + num;
        }
        System.out.println(suma);

        wait(2000);
        main(null);
    }

    public static void nineteen(){
        Scanner num = new Scanner(System.in);
        int x;

        System.out.println("Dame un numero: ");
        x = num.nextInt();

        if(x < 0){
            System.out.println("*");
        }
        else{
            for(int i=1; i <= x; i++){
                System.out.print("*");
            }
        }

        wait(1500);
        main(null);
    }

    public static void twenty(){
        Scanner num = new Scanner(System.in);
        int x;

        System.out.println("Dame un número(entre 0 y 20): ");
        x = num.nextInt();

        if(x > -1 && x < 21){

            for(int i=1; i <= x; i++){

                    for(int n=0; n < i; n++){

                        System.out.print(i);

                    }

                System.out.println(); 
            }
        }

        wait(2000);
        main(null);
    }

    public static void twentyone(){
        Scanner num = new Scanner(System.in);
        int a, b, div,cont = 0;

        System.out.println("Dame un número: ");
        a = num.nextInt();

        System.out.println("Dame otro número, mayor que el anterior: ");
        b = num.nextInt();

        for(;a <= b; a++){
            div = a%2;
            if(div == 0){
                System.out.print(a + ", ");
                cont++;
            }

        }

        System.out.println("\nLa cantidad de pares son: " + cont);

        wait(1500);
        main(null);

    }

    public static void twentytwo(){
        Scanner num = new Scanner(System.in);
        int x;

        System.out.print("Dame un número: ");
        x = num.nextInt();

        System.out.println();

        for(int i=1; i <= x; i++){
            for(int esp = 1; esp <= x - i; esp++){
                System.out.print(" ");
            }

            for(int ast = 1; ast <= (i * 2)-1; ast++){
                System.out.print("*");
            }

            System.out.println();
        }

        wait(2000);
        main(null);
    }

}
