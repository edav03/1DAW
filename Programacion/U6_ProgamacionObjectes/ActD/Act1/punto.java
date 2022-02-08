public class punto {

    private int x;
    private int y;
    
    public punto(int x, int y){

        this.x = x;
        this.y = y;
    }


    public void imprime(){
        System.out.println("Coordenadas\n X: " + x + "\n Y: " + y);
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void desplaza(int dx, int dy){
        this.x = x + dx;
        this.y = y + dy;

        System.out.println("La distancia es = (" + x + ", " + y + ")");
    }

    // public int distancia(Punto p){
        
    // }

}
