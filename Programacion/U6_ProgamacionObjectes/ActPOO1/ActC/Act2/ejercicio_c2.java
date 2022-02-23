public class ejercicio_c2{
    public static void main(String[] args){

        persona p1 = new persona("20059634T", "Edison", "Alcocer", 18);

        System.out.println(p1.getnombre() + " " + p1.getapellidos() + " con DNI: " + p1.getdni() + " tiene " + p1.getedad() + " años");
        
        p1.setnombre("Raul"); p1.setapellidos("Millet"); p1.setdni("20498502T"); p1.setedad(21);

        System.out.println(p1.getnombre() + " " + p1.getapellidos() + " con DNI: " + p1.getdni() + " tiene " + p1.getedad() + " años");
    }
}