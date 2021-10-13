import java.util.Scanner;

public class menu {

    public static void Print(String ss){
        System.out.println(ss);
    }

    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        Scanner dec = new Scanner(System.in);
        int x = -1;
        String Menu = 
        "\nElige el programa que deseas ejecutar" + 
        "\n1. Escribe un programa que dé los buenos días." +
        "\n2. Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5." +
        "\n3. Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado" +
        "\n4. Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta, producto y división." +
        "\n5. Escribe un programa que toma como dato de entrada un número que corresponde a la longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el volumen de la esfera que corresponden con dicho radio." +
        "\n6. Escribe un programa que dado el precio de un artículo y el precio de venta real nos muestre el porcentaje de descuento realizado." +
        "\n7. Escribe un programa que lea un valor correspondiente a una distancia en millas marinas y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros." +
        "\n8. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres mayor de edad” solo si lo somos." +
        "\n9. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres mayor de edad” o el mensaje de “eres menor de edad”." +
        "\n10. Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta, producto y división. (Ten en cuenta la división por cero)." +
        "\n11. Escribe un programa que lee 2 números y muestra el mayor." +
        "\n12. Escribe un programa que lee un número y me dice si es positivo o negativo, consideraremos el cero como positivo." +
        "\n13. Escribe un programa que lee dos números y los visualiza en orden ascendente." +
        "\n14. Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales." +
        "\n15. Escribe un programa que lea tres números distintos y nos diga cuál es el mayor. " +
        "\n16. Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en calificación alfabética, escribiendo el resultado.\n\t• de 0 a <3 Muy Deficiente.\n\t• de 3 a <5 Insuficiente.\n\t• de 5 a <6 Bien.\n\t• de 6 a <9 Notable\n\t• de 9 a 10 Sobresaliente" +
        "\n17. Escribe un programa que recibe como datos de entrada una hora expresada en horas, minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán, transcurrido un segundo." +
        "\n18. Escribe un programa que calcula el salario neto semanal de un trabajador en función del número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:\n\t• Las primeras 35 horas se pagan a tarifa normal.\n\t• Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.\n\t• Las tasas de impuestos son:\n\t• Los primeros 500 euros son libres de impuestos.\n\t• Los siguientes 400 tienen un 25% de impuestos.\n\t• Los restantes un 45% de impuestos.\nEscribir nombre, salario bruto, tasas y salario neto.";

        Print(Menu);
	
	while(x != 0){
		
		System.out.println("Elige un ejercicio o pulsa 0 para salir: ");
        	x = num.nextInt();

        switch(x){
            case 1: first();
            break;
            case 2: second();
            break;
            case 3: third();
            break;
            case 4: fourth();
            break;
            case 5: fifth();
            break;
            case 6: sixth();
            break;
            case 7: seventh();
            break;
            case 8: eighth();
            break;
            case 9: ninth();
            break;
            case 10: tenth();
            break;
            case 11: eleventh();
            break;
            case 12: twelveth();
            break;
            case 13: thirteenth();
            break;
            case 14: fourteenth();
            break;
            case 15: fifteenth();
            break;
            case 16: sixteenth();
            break;
            case 17: seventeenth();
            break;
            case 18: eighteenth();
            break;
	    default: break;
	}
    }
	num.close();	
    }

    public static void first(){
        System.out.println("Buenos días");
    }

    public static void second(){
        int lado = 5;
        
        System.out.println ("Área = " + lado * lado);
    }

    public static void third(){
        Scanner entrada = new Scanner(System.in);
        int lado;

        System.out.print ("Dame el lado del cuadrado: ");
        lado = entrada.nextInt();

        System.out.println ("Área = " + lado * lado);

        //entrada.close();
    }

    public static void fourth(){
        Scanner primer = new Scanner(System.in);
        Scanner segon = new Scanner(System.in);
        double x, y;

        System.out.print("Dame el valor de X: ");
            x = primer.nextInt();

        System.out.print("Dame el valor de Y: ");
            y = segon.nextInt();

        System.out.println(x + " + " + y + " = " + (x+y));
        System.out.println(x + " - " + y + " = " + (x-y));
        System.out.println(x + " * " + y + " = " + (x*y));
        System.out.println(x + " / " + y + " = " + (x/y));

        primer.close();
        segon.close();
    }

    public static void fifth(){
        Scanner radio = new Scanner(System.in);
        double r;

        System.out.print("Escribe el radio: ");
        r = radio.nextInt();

        System.out.println("Longitud de la circumferencia = " + (2 * Math.PI * r));
        System.out.println("Área del circulo = " + (Math.PI * Math.pow(r, 2)));
        System.out.println("Volumen de la esfera = " + ((4/3) * Math.PI * Math.pow(r, 3)));

        radio.close();
    }

    public static void sixth(){
        Scanner article = new Scanner(System.in);
        Scanner venda = new Scanner(System.in);

        float a, v, desc, pordesc;
        
        System.out.print("Introduce el precio del articulo: ");
        a = article.nextInt();
        System.out.print("Introduce el precio de venta real: ");
        v = venda.nextInt();
        
        // Calculamos el descuento:
            desc = ((a/v) * 100);
        // Ahora calculamos el porcentaje descontado:
            pordesc = (100 - desc);

        System.out.println("Porcentaje descontado = " + pordesc + "%");

        article.close();
        venda.close();
    }

    public static void seventh(){
        Scanner dato = new Scanner(System.in);
        int x;

        System.out.print("Introduce las millas: ");
        x = dato.nextInt();

        System.out.println("Metros = " + (x * 1852));

        dato.close();
    }

    public static void eighth(){
        Scanner años = new Scanner(System.in);
        int edad;

        System.out.print("Introduce tu edad: ");
        edad = años.nextInt();

        if(edad > 18){
            System.out.println("Eres mayor de edad");
        }
        else{}

        años.close();
    }

    public static void ninth(){
        Scanner años = new Scanner(System.in);
        int edad;

        System.out.print("Introduce tu edad: ");
        edad = años.nextInt();

        if(edad > 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }

        años.close();
    }

    public static void tenth(){
        Scanner primer = new Scanner(System.in);
        Scanner segon = new Scanner(System.in);
        int x, y;

        System.out.print("Dame el valor de X: ");
            x = primer.nextInt();

        System.out.print("Dame el valor de Y: ");
            y = segon.nextInt();

        System.out.println(x + " + " + y + " = " + (x+y));
        System.out.println(x + " - " + y + " = " + (x-y));
        System.out.println(x + " * " + y + " = " + (x*y));

        if(y != 0){
        System.out.println(x + " / " + y + " = " + (x/y));
        }
        else{}
        primer.close();
        segon.close();
    }

    public static void eleventh(){
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

    public static void twelveth(){
        Scanner num = new Scanner(System.in);
        int x;

        System.out.print("Introduce el valor de x: ");
        x = num.nextInt();

        if(x < 0){
            System.out.println(x + " es negatiu.");
        }
        else{
            System.out.println(x + " es positiu.");
        }

        num.close();
    }

    public static void thirteenth(){
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        int x, y;

        System.out.print("Introduce el valor de x: ");
        x = num1.nextInt();

        System.out.print("Introduce el valor de y: ");
        y = num2.nextInt();

        if(x > y){

            System.out.println(y + " < "+ x);

        } else{

            System.out.println(x + " < "+ y);
            
        }

        num1.close();
        num2.close();
    }
    
    public static void fourteenth(){
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        int x, y;

        System.out.print("Introduce el valor de X: ");
        x = num1.nextInt();

        System.out.print("Introduce el valor de Y: ");
        y = num2.nextInt();

        if(x > y){

            System.out.println(x + " es mayor.");

        } else if(x == y){

            System.out.println(x + " = " + y);

        } else{

            System.out.println(y + " es mayor.");

        }

        num1.close();
        num2.close();
    }

    public static void fifteenth(){
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        int x, y, z;

        System.out.print("Introduce el valor de X: ");
        x = num1.nextInt();

        System.out.print("Introduce el valor de Y: ");
        y = num2.nextInt();

        System.out.print("Introduce el valor de Z: ");
        z = num3.nextInt(); 

        if(x > y && x > z) {System.out.println (x + " es mayor");}
        if(y > x && y > z) {System.out.println (y + " es mayor");}
        if(z > x && z > y) {System.out.println (z + " es mayor");}

        num1.close();
        num2.close();
        num3.close();
    }

    public static void sixteenth(){
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

    public static void seventeenth(){
        Scanner hora = new Scanner(System.in);
        Scanner minuto = new Scanner(System.in);
        Scanner segundo = new Scanner(System.in);
        int h, m, s, n, mt;
        String hf, mf, sf;

        System.out.print("Hora: ");
        h = hora.nextInt();

        System.out.print("Minutos: ");
        m = minuto.nextInt();

        System.out.print("Segundos: ");
        s = segundo.nextInt();

        // pasamos todo a segundos + 1
            h = h * 3600;
            m = m * 60;
            n = h + m + s + 1;

        // minutos totales
            mt = n / 60;

        // encontramos segundos, minutos y hora finales
            sf = String.valueOf(n % 60);
            mf = String.valueOf(mt % 60);
            hf = String.valueOf(mt / 60);

           
        if(sf.length() < 2) sf = "0" + sf;
        if(mf.length() < 2) mf = "0" + mf;
        if(hf.length() < 2) hf = "0" + hf;
        
        System.out.println(hf + ":" + mf + ":" + sf);

        hora.close();
        minuto.close();
        segundo.close();
    }

    public static void eighteenth(){
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
