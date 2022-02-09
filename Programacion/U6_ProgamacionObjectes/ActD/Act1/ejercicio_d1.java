public class ejercicio_d1{

    public static void main(String[] args){
        punto p1 = new punto(2, 5);
        punto p2 = new punto(5, 7);
        
        p1.imprime();
        p1.setXY(5, 1);
        p1.desplaza(2, 4);
        System.out.println("Distancia entre los dos puntos: " + p1.distancia(p2));
    }
}