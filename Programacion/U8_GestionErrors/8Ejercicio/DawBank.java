import java.util.Scanner;

public class DawBank{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CuentaBancaria c1 = new CuentaBancaria("ES6621000418401234567891", "Edison David Alcocer Valencia", 0);

        int cont[] = new int[6];
        int x = -1;
        String menu = 
        "\n1 Datos de la cuenta" +
        "\n2 IBAN" +
        "\n3 Titular" +
        "\n4 Saldo" +
        "\n5 Ingreso" +
        "\n6 Retirada" +
        "\n7 Movimientos" +
        "\n8 SALIR";

        while(x != 8){
            double n = 0;

            System.out.println(menu);
            x = sc.nextInt();
            
            switch(x){
                case 1: System.out.println("IBAN: " + c1.getiban() + "\nTitular: " + c1.gettitular() + "\nSaldo: " + c1.getsaldo() + " €"); 
                        cont[0] += 1;
                break;
                case 2: System.out.println("IBAN: " + c1.getiban());
                        cont[1] += 1;
                break;
                case 3: System.out.println("Titular: " + c1.gettitular());
                        cont[2] += 1;
                break;
                case 4: System.out.println("Saldo: " + c1.getsaldo() + "€");
                        cont[3] += 1;
                break;
                case 5:
                        System.out.println("Cantidad a ingresar: ");
                        n = sc.nextDouble();
                        if(n > 0){
                            c1.setsaldo(n);
                        } else{
                            System.out.print("La cantidad debe ser superior a 0");
                        }
                        cont[4] += 1;
                        
                break;
                case 6: System.out.println("Cantidad a retirar: ");
                        n = sc.nextDouble();
                        if(n > 0){
                            c1.setsaldo(n * -1);
                        }else{
                            System.out.print("La cantidad debe ser superior a 0");
                        }
                        cont[5] += 1;
                break;
                case 7: System.out.println("Ultimos movimientos:" + 
                        "\n1 Datos de la cuenta" +
                        "\nHas buscado " + cont[0] + " veces IBAN" +
                        "\nHas buscado " + cont[1] + " veces Titular" +
                        "\nHas buscado " + cont[2] + " veces Saldo" +
                        "\nHas buscado " + cont[3] + " veces Ingreso" +
                        "\nHas buscado " + cont[4] + " veces Retirada" +
                        "\nHas buscado " + cont[5] + " veces Movimientos");
                break;
                default:
            }
        }

    }
}