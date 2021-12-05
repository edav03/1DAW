import java.util.Scanner;
import java.util.Arrays;

public class Ej_U4_b {

    public static void wait(int ms)
        {
            try
            {
                Thread.sleep(ms);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        int x = -1;
        String menu = 
        "\n1. Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra de la cadena en una línea distinta." +
        "\n2. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas." +
        "\n3. Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y “Alcocer” mostrará “LIOTARALC”." +
        "\n4. Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay: \nNº de A's: 3 \nNº de E's: 1 \nNº de I's: 2 \nNº de O's: 0 \nNº de U's: 0" +
        "\n5. Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda. Por ejemplo: \nAmigo no gima \nDabale arroz a la zorra el abad \nAmo la pacífica paloma \nA man a plan a canal Panama";

        System.out.println(menu);
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
                default:
                break;
            }
        }
    }

    public static void first(){
        Scanner frase = new Scanner(System.in);
        String fr = ",";
        System.out.println("Introduce una frase: ");

        while(fr != "\n"){
            fr = frase.nextLine();
            String[] words = fr.split(" ");

            for(int i = 0; i < words.length; i++){
                System.out.println(words[i]);
            }

            fr = "\n";
        }

        wait(2000);
        main(null);

    }

    public static void second(){
        Scanner frase = new Scanner(System.in);
        Scanner frase2 = new Scanner(System.in);

        System.out.print("Introduce una oracion: ");
        String or1 = frase.next();

        System.out.print("Introduce otra oracion: ");
        String or2 = frase2.next();
        
        if(or1.equalsIgnoreCase(or2) == true){
            System.out.println("Ambas cadenas son iguales.");
        }
        else{
            System.out.println("Las cadenas son distintas.");
        }

        wait(2000);
        main(null);
    }

    public static void third(){
        Scanner frase = new Scanner(System.in);

        System.out.print("Nombre: ");
        String name = frase.next();
        name = name.toUpperCase();

        System.out.print("1r Apellido: ");
        String lname1 = frase.next();
        lname1 = lname1.toUpperCase();

        System.out.print("2o Apellido: ");
        String lname2 = frase.next();
        lname2 = lname2.toUpperCase();

        System.out.println("Resultado: " + name.substring(0, 3) + lname1.substring(0, 3) + lname2.substring(0, 3));

        wait(2000);
        main(null);
    }

    public static void forth(){
        Scanner frase = new Scanner(System.in);
        int[] cont = new int[5];
        String or = ",";

        System.out.print("Escribe un texto: ");
        while(or != "\n"){
            or = frase.nextLine();
            char[] statement = or.toCharArray();

            for(int i = 0; i < statement.length; i++){
                if(statement[i] == 'a'){
                    cont[0]++;
                }
                else if(statement[i] == 'e'){
                    cont[1]++;
                }
                else if(statement[i] == 'i'){
                    cont[2]++;
                }
                else if(statement[i] == 'o'){
                    cont[3]++;
                }
                else if(statement[i] == 'u'){
                    cont[4]++;
                }
            }

            or = "\n";
        } 

        System.out.println("Veces 'a': " + cont[0]);
        System.out.println("Veces 'e': " + cont[1]);
        System.out.println("Veces 'i': " + cont[2]);
        System.out.println("Veces 'o': " + cont[3]);
        System.out.println("Veces 'u': " + cont[4]);

        wait(2000);
        main(null);

    }

    public static void fifth(){
        Scanner frase = new Scanner(System.in);

        System.out.print("Escribe una oracion: ");
        String or = frase.nextLine();
        or = or.toLowerCase();
        or = or.replaceAll(" ", "");

        char[] statement = or.toCharArray();
        char[] statement2 = new char[statement.length];
        int rest = (statement.length - 1);

        for(int i = 0; i < statement.length; i++){
            statement2[i] = statement[rest];
            rest--;
        }

        if(Arrays.equals(statement, statement2)){
            System.out.println("Es una palindromo");
        }
        else{
            System.out.println("No es un palindromo");
        }
        
        wait(2000);
        main(null);
    }
    
}
