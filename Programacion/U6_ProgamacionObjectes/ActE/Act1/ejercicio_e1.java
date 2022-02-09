public class ejercicio_e1{
    public static void main(String[] args){

        for(int i = 0; i <11; i++){
            punto px = punto.creaPuntoAleatorio();
            System.out.println("Coordenadas del punto " + (i + 1) + " creado: \nX: " + px.getx() + "\nY:" + px.gety());
        }
    }
}