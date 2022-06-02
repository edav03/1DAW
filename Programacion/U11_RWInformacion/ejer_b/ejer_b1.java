import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ejer_b1 {
    public static void main(String[] args) {
        try {
            File f = new File("documentos/numeros.txt");
            Scanner sc = new Scanner(f);
            int max = 0;
            int min = 99999999;

            while (sc.hasNext()) {

                int valor = sc.nextInt();
                if (max < valor) {
                    max = valor;
                }
                if (min > valor) {
                    min = valor;
                }

                sc.close();

            }

            System.out.println("Max = " + max + "\nMin = " + min);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}