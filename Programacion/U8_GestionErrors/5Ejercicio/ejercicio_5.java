import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 2;

        try {
            for(int i = 0; i < 11; i++){
                System.out.println("Introduce un numero: ");
                x = sc.nextInt();

                imprimePositivo(x);
                imprimeNegativo(x);
            }
        }
        catch (ExcepcionP e) {
            System.out.println(x + " menor de 0");
        }
        catch (ExcepcionN n) {
            System.out.println(x + " mayor o igual a 0");
        }
    }

    static void imprimePositivo(int p) throws ExcepcionP{
        if(p < 0){
            throw new ExcepcionP(p);
        }
    }

    static void imprimeNegativo(int n) throws ExcepcionN{
        if(n >= 0){
            throw new ExcepcionN(n);
        }
    }
}
