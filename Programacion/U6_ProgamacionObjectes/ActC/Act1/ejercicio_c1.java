public class ejercicio_c1{
    public static void main(String[] args){
        punto p1 = new punto(2, 3);

        System.out.println("Coordenadas \nX: " + p1.getX() + "\nY: " + p1.getY());

        p1.setX(5);
        p1.setY(0);

        System.out.println("Coordenadas despues del set\nX: " + p1.getX() + "\nY: " + p1.getY());
    }
}