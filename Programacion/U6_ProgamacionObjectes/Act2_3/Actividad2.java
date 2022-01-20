public class Actividad2{
    public static void main(String[] args){
        Cotxe c1 = new Cotxe();

        System.out.println("Matricula: " + c1.atributos());
        
    }
}

class Cotxe {

    String modelo;
    String color;
    boolean met;
    int matricula;
    String cotxe;
    int fabricacion;
    String modalidad;

    Cotxe() {
        modelo = "209";
        color = "Red";
        met = false;
        matricula = 6693;
        cotxe = "Mercedes";
        fabricacion = 2009;
        modalidad = "tercers";
    }

    public int atributos() {
        return matricula;
    }
}