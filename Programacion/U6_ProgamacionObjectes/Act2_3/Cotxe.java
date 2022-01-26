public class Cotxe {

    static String modelo;
    static String color;
    static boolean met;
    static int matricula;
    static String cotxe;
    static int fabricacion;
    static String modalidad;

    static void Cotxe() {
        modelo = "209";
        color = "Red";
        met = false;
        matricula = 6693;
        cotxe = "Mercedes";
        fabricacion = 2009;
        modalidad = "tercers";
    }

    public static void mostrarInfo() {
        System.out.println("Modelo: 209 \nColor: Red" + Cotxe();
    }

}