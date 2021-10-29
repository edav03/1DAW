import java.util.Scanner;

public class Ej_U3{

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
        "\nElije el ejercicio que desees ejecutar o pulsa 0 para salir:" + 
        "\n1. Dibuja un ordinograma de un programa que muestre por pantalla los 20 primeros números naturales (1, 2, 3,…., 20)." +
        "\n2. Dibuja un ordinograma de un programa que muestre los números pares comprendidos entre el 1 y el 200. Para ello utiliza un contador y suma de 2 en 2." +
        "\n3. Dibuja un ordinograma de un programa que muestre los números pares comprendidos entre el 1 y el 200. Esta vez utiliza un contador sumando de 1 en 1." +
        "\n4. Dibuja un ordinograma de un programa que muestre los números desde el 1 hasta un número N que se introducirá por teclado." +
        "\n5. Dibuja un ordinograma de un programa que lea un número positivo N y calcule y visualice su factorial N! Siendo el factorial:\n    0! = 1\n    1! = 1\n    2! = 2 * 1\n    3! = 3 * 2* 1\n     N! = N * (N-1) * (N-2) * … * 1" +
        "\n6. Dibuja un ordinograma de un programa que lea 100 números no nulos y luego muestre un mensaje de si ha leído algún número negativo o no." +
        "\n7. Dibuja un ordinograma de un programa que lea 100 números no nulos y luego muestre un mensaje indicando cuántos son positivos y cuantos negativos." +
        "\n8. Dibuja un ordinograma de un programa que lea una secuencia de números no nulos hasta que se introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos." +
        "\n9. Dibuja un ordinograma de un programa que calcula y escribe la suma y el producto de los 10 primeros números naturales." +
        "\n10. Dibuja un ordinograma de un programa que lee una secuencia de notas (con valores que van de 0 a 10) que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10." +
        "\n11. Dibuja un ordinograma de un programa que suma independientemente los pares y los impares de los números comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas." +
        "\n12. Dibuja un ordinograma de un programa que calcule el valor A elevado a B (A^B) sin hacer uso del operador de potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por pantalla." +
        "\n13. Dibuja un ordinograma de un programa donde el usuario 'piensa' un número del 1 al 100 y el ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado)." +
        "\n14. Dibuja un ordinograma de un programa que dada una cantidad de euros que el usuario introduce por teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo número de billetes posible).";

        Print(menu);

        x = num.nextInt();

        while(x != 0){
            switch(x){
                case 1: first();
                break;
                case 2: second();
                break;
                case 3: third();
                break;
                case 4: forth();
                break;
                case 5: fifth();
                break;
                case 6: sixth();
                break;
                case 7: seventh();
                break;
                case 8: eigth();
                break;
                case 9: ninth();
                break;
                case 10: tenth();
                break;
                case 11: eleventh();
                break;
                case 12: twelveth();
                break;
                // case 13: thirteen(),
                // break;
                case 14: fourteenth();
                break;
                default:
                break;
            }
        }
    }

    public static void first(){
        int i;
        for(i = 1; i <= 20; i++){
            
            System.out.print(i + ", ");
        }

        wait(2000);
        main(null);
    }

    public static void second(){
        int i;

        for(i = 0; i < 201; i = i + 2){
            if(i != 0){
                System.out.print(i + ", ");
            }
        }

        wait(2000);
        main(null);
    }

    public static void third(){
        int i;
        
        for (i=0; i < 201; i++){
            if(i%2 == 0 && i != 0){
                System.out.print(i + ", ");
            }
        }

        wait(2000);
        main(null);
    }

    public static void forth(){
        Scanner num = new Scanner(System.in);
        int i, n;

        System.out.print("Dame un número: ");
        n = num.nextInt();

        for(i= 1; i <= n; i++){
            System.out.print(i + ", ");
        }

        wait(2000);
        main(null);
    }

    public static void fifth(){
        Scanner num = new Scanner(System.in);
        int n, i = 1, result = 1;

        System.out.print("Dame un número: ");
        n = num.nextInt();

        for(i=1 ; i <= n; i++){
            result = result * i;
        }

        System.out.print("Factorial = " + result);

        wait(2000);
        main(null);
    }

    public static void sixth(){
        Scanner num = new Scanner(System.in);
        int i =  1;

        while (i != 0){

            System.out.print("Dame 100 numeros:");
            i = num.nextInt();

            if(i > 0){
                System.out.println(i + " es positivo");
            }
            else{
                System.out.println(i + " es negativo");
            }
    
        }

        wait(1000);
        main(null);
    }

    public static void seventh(){
        Scanner num = new Scanner(System.in);
        int i =  1;
        int contp = 0, contn = 0;

        while (i != 0){

            System.out.print("Dame 100 numeros:");
            i = num.nextInt();

            if(i > 0){
                contp ++;
            }
            else{
                contn ++;
            }

            System.out.println("Numeros positivos: " + contp);
            System.out.println("Numeros negativos: " + contn);
    
        }

        wait(1000);
        main(null);
    }

    public static void eigth(){
        Scanner num = new Scanner(System.in);
        int i =  1;
        int contp = 0, contn = 0;

        while (i != 0){

            System.out.print("Dame 100 numeros(o pulsa 0 para salir):");
            i = num.nextInt();

            if(i > 0){
                contp ++;
            }
            else{
                contn ++;
            }
    
        }

        System.out.println("Numeros positivos: " + contp);
        System.out.println("Numeros negativos: " + contn);

        wait(1000);
        main(null);
    }

    public static void ninth(){
        int n, suma = 0, mult = 1, i = 1;

        for(n=1; n < 11; n++){
            suma = suma + n;
            mult = mult * n;
        }
        
        System.out.println("El resultado de suma " + suma);
        System.out.println("El resultado del producto " + mult);

        wait(1500);
        main(null);
    }

    public static void tenth(){
        Scanner num = new Scanner(System.in);
        int x = 0, cont = 0;

        while (x != -1){
            System.out.print("Dame las notas(entre 0 i 10): ");
            x = num.nextInt();

            if(x == 10){
                cont++;
            }
            else if(x >= 0 && x <10){
            }
            else{
                System.out.println("Escribe un numero entre 0 i 10 porfavor.");
            }

            System.out.println("Hay " + cont + " dieces");
        }

        wait(1500);
        main(null);
    }

    public static void eleventh(){
        int p, i;

        for(p = 100; p <= 200; p = p + 2){
            System.out.print(p + ", ");
        }
        for(i = 101; i <= 200; i = i + 2){
            System.out.print(i + ", ");
        }

        wait(2000);
        main(null);
    }

    public static void twelveth(){
        Scanner num = new Scanner(System.in);
        int a, b, result = 1, cont;

        System.out.print("Dame el numero que deseas elevar: ");
        a = num.nextInt();
        System.out.print("Dame el numero al que deseas elevar el anterior: ");
        b = num.nextInt();

        if(b != 0){
            for(cont = 1; cont <= b; cont ++){
                result = a*a;
            }
        }
        else{
            result = 1;
        }

        System.out.print("Resultado: " + result);

        wait(1500);
        main(null);
    }

    public static void fourteenth(){
        Scanner num = new Scanner(System.in);
        int x = 1, q = 0;

        System.out.print("Indica la cantidad de dinero a retirar(debe ser multiplo de 5): ");
        x = num.nextInt();

        while(x > 0){

            if(x >= 500){
                q = x/500;
                System.out.print("\n" + q + " billetes de 500");
                x = x - 500;
            }
            else if(x >= 200){
                q = x/200;
                System.out.print("\n" + q + " billetes de 200");
                x = x - 200;
            }
            else if(x >= 100){
                q = x/100;
                System.out.print("\n" + q + " billetes de 100");
                x = x - 100;
            }
            else if(x >= 50){
                q = x/50;
                System.out.print("\n" + q + " billetes de 50");
                x = x - 50;
            }
            else if(x >= 20){
                q = x/20;
                System.out.print("\n" + q + " billetes de 20");
                x = x - 20;
            }
            else if(x >= 10){
                q = x/10;
                System.out.print("\n" + q + " billetes de 10");
                x = x - 10;
            }
            else if(x >= 5){
                q = x/5;
                System.out.print("\n" + q + " billetes de 5");
                x = x - 5;
            }

        }

        wait(2000);
        main(null);
    }
}