import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 2;

        try {
            for(int i = 0; i < 11; i++){
                System.out.print("Introduce un numero: ");
                x = sc.nextInt();

                imprimePositivo(x);
                imprimeNegativo(x);
            }
        }
        catch (ExcepcionP e) {
            System.out.println("\n" + x + " menor de 0");
        }
        catch (ExcepcionN n) {
            System.out.println("\n" + x + " mayor o igual a 0");
        }
    }

    static void imprimePositivo(int p) throws ExcepcionN{
        if(p < 0){
            throw new ExcepcionN(p);
        }
    }

    static void imprimeNegativo(int n) throws ExcepcionP{
        if(n >= 0){
            throw new ExcepcionP(n);
        }
    }
}
