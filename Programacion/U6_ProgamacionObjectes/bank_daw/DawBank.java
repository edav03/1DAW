import java.util.Scanner;

public class DawBank{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CuentaBancaria c1 = new CuentaBancaria("ES6621000418401234567891", "Edison David Alcocer Valencia", 0);

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
                break;
                case 2: System.out.println("IBAN: " + c1.getiban());
                break;
                case 3: System.out.println("Titular: " + c1.gettitular());
                break;
                case 4: System.out.println("Saldo: " + c1.getsaldo());
                break;
                case 5:
                        System.out.println("Cantidad a ingresar: ");
                        n = sc.nextDouble();
                        if(n > 0){
                            c1.setsaldo(n);
                        } else{
                            System.out.print("La cantidad debe ser superior a 0");
                        }
                        
                break;
                case 6: System.out.println("Cantidad a retirar: ");
                        n = sc.nextDouble();
                        if(n > 0){
                            c1.setsaldo(n * -1);
                        }else{
                            System.out.print("La cantidad debe ser superior a 0");
                        }
                break;
                case 7:
                break;
                default:
            }
        }

    }
}