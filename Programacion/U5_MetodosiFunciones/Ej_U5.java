import java.util.Scanner;

public class Ej_U5{

    public static void main(String[] args){
        int n = -1;

        while(n != 0){
            n = menu();

            double radio = pideRadio();

            switch(n){
                case 1:
                    double r = circunferencia(radio);
                    System.out.println("Circunferencia = " + r);
                break;
                case 2:
                    double ra = area(radio);
                    System.out.println("Area = " + ra);
                break;
                case 3:
                    double v = volumen(radio);
                    System.out.println("Volumen = " + v);
                break;
                case 4:
                    double c = circunferencia(radio);
                    double ar = area(radio);
                    double vol = volumen(radio);
                    System.out.println("Circunferencia = " + c + "\nArea = " + ar + "\nVolumen = " + vol);
                break;
            }

        }
    }

    public static int menu(){
        Scanner num = new Scanner(System.in);
        
        System.out.println("Menú\n0.Salir\n1.Circunferencia\n2.Area\n3.Volumen\n4.Todas");
        int x = num.nextInt();

        return x;

    }

    public static double pideRadio(){
        Scanner num = new Scanner(System.in);

        System.out.print("Introduce el radio: ");
        double radio = num.nextDouble();

        return radio;
    }

    public static double circunferencia(double r){
        double circ = 2*Math.PI*r;

        return circ;

    }

    public static double area(double r){
        double ar = Math.PI * Math.pow(r, 2);

        return ar;

    }

    public static double volumen(double r){
        double vol = (4/3) * Math.PI * Math.pow(r, 3);

        return vol;
    }
}