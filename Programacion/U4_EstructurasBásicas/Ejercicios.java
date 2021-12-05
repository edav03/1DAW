public class Ejercicios{

    public static void imprimeHolaMundo(){
        System.out.println("Hola Mundo");
    }

    public static int doble(int a){
        int resultado = a * 2;
        return resultado; 
    }

    public static int multiplica(int a, int b){
        int mult = a * b;
        return mult;
    }

    public static void main(String[] args){
        imprimeHolaMundo();

        int a = doble(10);
        int b = multiplica(3, 5);

        System.out.println("El resultado de a*2 = " + a);
        System.out.println("El resultado de b*a = " + b);
    }
}