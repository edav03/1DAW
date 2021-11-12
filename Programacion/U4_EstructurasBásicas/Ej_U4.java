import java.util.Scanner;
import java.lang.Math;
public class Ej_U4 {

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
        "\n1. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores." +
        "\n2. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre la suma de todos los valores." +
        "\n3. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla." +
        "\n4. Crea un programa que pida veinte números enteros por teclado, los almacene en un array y luego muestre por separado la suma de todos los valores positivos y negativos." +
        "\n5. Crea un programa que pida veinte números reales por teclado, los almacene en un array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores." +
        "\n6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla." +
        "\n7. Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga todos los valores desde P hasta Q, y lo muestre por pantalla." +
        "\n8. Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará cuántos valores del array son igual o superiores a R." +
        "\n9. Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará en qué posiciones del array aparece N." +
        "\n10. Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y por debajo de la media." +
        "\n11. Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del primer array al segundo array en orden inverso, y mostrar ambos por pantalla." +
        "\n12. Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones: \na. Mostrar valores. \nb. Introducir valor. \nc. Salir. La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que terminará el programa." +
        "\n13. Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al usuario V, I además de N (nº de valores a crear)." +
        "\n14. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por pantalla." +
        "\n15. Crea un programa que pida la usuario dos valores N y M y luego cree un array de tamaño N que contenga M en todas sus posiciones. Luego muestra el array por pantalla." +
        "\n16. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por pantalla. En esta ocasión has de utilizar Arrays.fill()." +
        "\n17. Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un array y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario si son iguales o no." +
        "\n18. Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0 y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por pantalla." +
        "\n19. Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las puntuaciones en orden descendente (de la más alta a la más baja)." +
        "\n20. Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se mostrará por pantalla si N existe en el array, además de cuantas veces.";

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
                case 13: thirteen();
                break;
                case 14: fourteenth();
                break;
               // case 15:
               // break;
               // case 16:
               // break;
               // case 17:
               // break;
               // case 18:
               // break;
               // case 19:
               // break;
               // case 20:
               // break;
               // default:
               // break;
            }
        }
    }

    public static void first(){
        Scanner num = new Scanner(System.in);
        int numeros[] = new int[10];

        System.out.println("Dame 10 números naturales");
        
        for(int i = 0; i < numeros.length; i++){
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=num.nextInt();
        }

        for(int n = 0; n < numeros.length; n++){
            System.out.print(numeros[n] + ", ");
        }

        wait(2000);
        main(null);
    }

    public static void second(){
        Scanner num = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;

        System.out.println("Dame 10 números naturales");
        
        for(int i = 0; i < numeros.length; i++){
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=num.nextInt();
        }

        for(int n = 0; n < numeros.length; n++){
            System.out.print(numeros[n] + ", ");
        }

        for(int p = 0; p < numeros.length; p++){
            suma += numeros[p];
        }

        System.out.println("\nSuma = " + suma);

        wait(2000);
        main(null);
    }

    public static void third(){
        Scanner num = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Dame 10 números naturales");
        
        for(int i = 0; i < numeros.length; i++){
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=num.nextInt();
        }

        for(int n = 0; n < numeros.length; n++){
            System.out.print(numeros[n] + ", ");
        }

        int mayor, menor;
        mayor = menor = numeros [0];
       
        for (int i = 0; i < numeros.length; i++) {
            if(numeros [i] > mayor) {
                mayor = numeros[i];
            }
            if(numeros[i]<menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Mayor: "+ mayor);
        System.out.println("Menor: "+ menor);

        wait(2000);
        main(null);
    }
    
    public static void forth(){
        Scanner num = new Scanner(System.in);
        int i;
        int[] numeros = new int[20];
        double possuma = 0, negsuma = 0;                   
        
        
        System.out.println("Introduce 20 numeros: ");

        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=num.nextInt();
        }
 
        for (i = 0; i < numeros.length; i++) {

            if (numeros[i] > 0){ 
                possuma += numeros[i];
            } 
            else if (numeros[i] < 0){
                negsuma += numeros[i];
            }

        }

        System.out.println("Suma positivos = " + possuma);
        System.out.println("Suma negativos = " + negsuma);

        wait(2000);
        main(null);
    }

    public static void fifth(){
        Scanner num = new Scanner(System.in);
        int i;
        int pos = 0, neg = 0; 
        int[] numeros = new int[20]; 
        double possuma = 0, negsuma = 0;                   
        
        System.out.println("Introduce 20 numeros: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=num.nextInt();
        }
 
        for (i = 0; i < numeros.length; i++) {

            if (numeros[i] > 0){ 
                possuma += numeros[i];
                pos++;
            } 
            else if (numeros[i] < 0){ 
                negsuma += numeros[i];
                neg++;
            }

        }

        if (pos != 0) {
            System.out.println("Media positivos: " + possuma / pos);                
        } 
        else {
            System.out.println("No has introducido positivos");
        }

        if (neg != 0) {
            System.out.println("Media negativos: " + negsuma / neg);
        } 
        else {
            System.out.println("No has introducido negativos");
        }

        wait(2000);
        main(null);
    }

    public static void sixth(){
        Scanner num = new Scanner(System.in);

        System.out.print("Dame el tamaño del array: ");
        int n = num.nextInt();

        int primero[] = new int[n];

        System.out.print("Dame un valor 'M': ");
        int m = num.nextInt();

        for(int p = 0; p < primero.length; p++){
            primero[p] = m;
            System.out.println("Array[" + p + "] = " + primero[p]);
        }

        System.out.println("El tamaño del primer array = " + primero.length);

        wait(2000);
        main(null);
    }

    public static void seventh(){
        Scanner num = new Scanner(System.in);
        int l = 0;

        System.out.print("Dame un valor para 'P': ");
        int p = num.nextInt();

        System.out.print("Dame un valor para 'Q': ");
        int q = num.nextInt();

        l = q - p + 1;

        int array[] = new int[l];

        for(int i = 0; i < array.length; i++){
            array[i] = p;

            System.out.println("Array[" + i + "] = " + array[i]);

            p++;
        }

        wait(2000);
        main(null);
    }

    public static void eigth(){
        Scanner num = new Scanner(System.in);
        double r;
        double array[] = new double[100];
        int cont = 0;

        System.out.print("Valores 'random' generados:\n");
        for(int i = 0; i < array.length; i++){

            array[i] = Math.random();

            System.out.println("Array[" + i + "]= " + array[i]);

        }

        System.out.print("\nDame un valor entre 0.0 y 1.0: ");
        r = num.nextDouble();

        for(int n = 0; n < array.length; n++){
            
            if(array[n] >= r){
                cont++;
            }

        }

        System.out.println("Hay " + cont + " valores del array que son iguales o superiores a " + r);

        wait(2000);
        main(null);

    }

    public static void ninth(){
        Scanner num = new Scanner(System.in);
        int array[] = new int[100];
        int n;
        
        System.out.print("Dame un valor N (entre 1 y 10): ");
        n = num.nextInt();

        for(int i = 0; i < array.length; i ++){

            array[i] = (int)(1 + Math.random() * 10);

            if(array[i] == n){
                System.out.print("\nPosicion = " + i);
            }
        }

        wait(2000);
        main(null);
    }

    public static void tenth(){
        Scanner num = new Scanner(System.in);
        double suma = 0, media = 0, mayor = 0, menor = 30;
        int contMay = 0, contMen = 0;

        System.out.print("Dame el tamaño del array: ");
        int n = num.nextInt();

        double array[] = new double[n];

        for(int i = 0; i < array.length; i++){

            System.out.print("\nAltura " + (i + 1) + ": ");
            double alt = num.nextDouble();

            array[i] = alt;

        }

        // Suma de todos los arrays
        for(int i = 0; i < array.length; i++){
            suma += array[i];
        }

        // Calcular la media
        media = suma/n;

        // Encontrar el mayor, el menor y las personas por encime y por debajo de la media
        for(int i = 0; i < array.length; i++){
            if(array[i] > mayor){
                mayor = array[i];
            }
            if(array[i] < menor){
                menor = array[i];
            }

            if(array[i] < media){
                contMen++;
            }
            if (array[i] > media){
                contMay++;
            }
        }

        System.out.println("\nMedia: " + media);
        System.out.println("\nAltura maxima: " + mayor + "\nAltura minima: " + menor);
        System.out.println("\nPersonas por encima de la media = " + contMay + "\nPersonas por debajo de la media = " + contMen);

        wait(2000);
        main(null);
    }

    public static void eleventh(){
        int primray[] = new int[100];
        int segray[] = new int[100];

        for(int i = 0; i < primray.length; i ++){
            primray[i] = (i + 1);
        }
        for(int i = 0; i < segray.length; i++){
            for(int n = 100; n < 0; n--){
                segray[i] = primray[n];
            }
        }

        for(int i = 0; i < primray.length; i++){
            System.out.print("Primer array:" + primray[i] + ", ");
        }
    }

    public static void twelveth(){
        Scanner let = new Scanner(System.in);
        char choose = 'd';
        int array[] = new int[10];

        while(choose != 'c'){

            for(int i = 0; i < array.length; i++){
                array[i] = (int)(1 + Math.random() * 10);
            }

            System.out.println("a.Mostrar valores" + "\nb.Introducir valor" + "\nc.Salir");
            choose = let.next().charAt(0);

            if(choose == 'a'){
                for(int i = 0; i < array.length; i++){
                    System.out.println("Array[" + i + "]= " + array[i]);
                }
            }
            else if(choose == 'b'){
                System.out.println("Introduce un valor: ");
                int v = let.nextInt();

                System.out.println("Ahora introduce la posicion en el array: ");
                int p = let.nextInt();

                for(int i = 0; i < array.length; i++){
                    if(i == p){
                        array[i] = v;
                        System.out.print("Complete succesfully");
                    }
                }
            }

            wait(2000);
        }

        main(null);
    }

    public static void thirteen(){
        Scanner num = new Scanner(System.in);
        int v, i, n;

        System.out.println("Sequencia aritmetica:\nDame el valor inicial: ");
        v = num.nextInt();

        System.out.println("Dame el incremento: ");
        i = num.nextInt();

        System.out.println("Dame el numero de valores a crear: ");
        n = num.nextInt();

        int array[] = new int[n];

        array[0] = v;

        System.out.println("Array[0] = " + v);

        for(int q = 0; q < array.length; q++){            

            array[q] = v + i;

            v = v + i;

            System.out.println("Array[" + (q + 1) + "] = " + array[q]);

        }

        wait(2000);
        main(null);
    }

    public static void fourteenth(){
        Scanner num = new Scanner(System.in);
        int array[] = new int [55];
        int cont = 0;

        for(int i = 1; i <= 10; i++){
            for(int e = 0; e < i; e++){
                array[cont] = i;
                cont++;
            }
        }

        for(int a = 0; a < array.length; a++){
            System.out.print(array[a] + " ");
        }

        wait(2000);
        main(null);
    }

    public static void fifteenth(){
        Scanner num = new Scanner(System.in);
        

        System.out.print("Tamaño del array: ")
        int n = num.nextInt();

        int array[] = new int[n];

        System.out.print("Valor: ");
        int m = num.nextInt();

        for(int i = 0; i < array.length; i++){
            array[i] = m;

            System.out.println("Array[" + i + "]= " + array[i]);
        }
    }

}