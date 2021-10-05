import java.util.Scanner;

public class sexto{

    public static void main(String[] arg){
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
}