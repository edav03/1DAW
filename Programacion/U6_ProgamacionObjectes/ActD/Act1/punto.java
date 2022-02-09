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
        System.out.println("Coordenadas despues del set\n X: " + x + "\n Y: " + y);
    }

    public void desplaza(int dx, int dy){
        this.x = x + dx;
        this.y = y + dy;

        System.out.println("Se desplaza = (" + x + ", " + y + ")");
    }

    public double distancia(punto p){
        double result = Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));
        return result;
    }

}
