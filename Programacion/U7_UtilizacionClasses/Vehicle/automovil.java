import java.util.Scanner;

public class automovil {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        vehicle v1 = new vehicle(35000.45);
        bicicleta b1 = new bicicleta(120.32);

        String menu = 
        "\nVEHICLES" + 
        "\n=========" +
        "\n1. Camina amb la bicicleta" +
        "\n2. Fes el cavallet amb la bicileta" +
        "\n3. Camina amb el cotxe" +
        "\n4. Crema roda amb el cotxe" +
        "\n5. Veure quilometratge de la bicicleta" +
        "\n6. Veure quilometratge del cotxe" +
        "\n7. Veure quilometratge total" +
        "\n8. Eixir" +
        "\nTria una opcio (1-8):";

        System.out.println(menu);
        int x = sc.nextInt();
    }
}
