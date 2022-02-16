public class ejercicio_b3 {
    public static void main(String[] args) {

        rectangulo rec1 = new rectangulo(0, 0, 5, 5);
        rectangulo rec2 = new rectangulo(7, 0, 8, 10);

        System.out.println("Perimetro del 1r rectangulo = " + rec1.perimetro() +"\nArea del 1r rectangulo = " + rec1.area());
        System.out.println("Perimetro del 2n rectangulo = " + rec2.perimetro() +"\nArea del 2n rectangulo = " + rec2.area());
    }

}
