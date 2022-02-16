public class coordenadas {

    int x1;
    int y1;
    int x2;
    int y2;
    
    public coordenadas(int x1, int y1, int x2, int y2){
        if(x1 < x2 && y1 > y2){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else{
            System.err.println("Error al instanciar el rectangulo");
        }
    }

    public int ladoX(){
        return(x2 - x1);
    }

    public int ladoY(){
        return (y2 - y1);
    }

    public int perimetro(){
        int perimetro = ladoX() + ladoY();
        return perimetro;
    }

    public int area(){
        int area = ladoX() * ladoY();
        return area;
    }
}