public class ejercicio_a3{
    public static void main(String[] args){

        rectangulo r1 = new rectangulo();
        rectangulo r2 = new rectangulo();

        r1.x1 = 0; r1.y1 = 0; r1.x2 = 5; r1.y2 = 5;
        r2.x1 = 7; r2.y1 = 9; r2.x2 = 2; r2.y2 = 3;

        System.out.println("Primero rectangulo:\n Coordenadas = (" + r1.x1 + ", " + r1.y1 + ") (" + r1.x2 + ", " + r1.y2 + ")\n Perimetro = " + r1.perimetro() + "\n Area = " + r1.area());
        System.out.println("Segundo rectangulo:\n Coordenadas = (" + r2.x1 + ", " + r2.y1 + ") (" + r2.x2 + ", " + r2.y2 + ")\n Perimetro = " + r2.perimetro() + "\n Area = " + r2.area());
    }

}