import java.util.Scanner;

public class Ej_U5{

    public static void main(String[] args){
        int arroy[] = new int[100];

        for(int i = 0; i < arroy.length; i++){
            arroy[i] = i + 1;
        }

        int s = suma(arroy[]);
        double m = media(arroy[]);
        
    }

    public static int suma(int a[]){
        int plus = 0;

        for(int i = 0; i < a.length; i++){
            plus += a[i];
        }

        return plus;
    }

    public static double media(int b[]){
        int media = 0;
        return media;
    }
}