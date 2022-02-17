import java.util.Scanner;

public class DawBank{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CuentaBancaria c1 = new CuentaBancaria("ES6621000418401234567891", "Edison David Alcocer Valencia", 43080.54);

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
            System.out.println(menu);
            x = sc.nextInt();
        }

    }
}