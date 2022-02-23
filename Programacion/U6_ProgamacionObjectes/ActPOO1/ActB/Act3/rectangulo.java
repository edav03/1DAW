public class rectangulo {    

    int x1, x2, y1, y2;       

    public rectangulo (int x1, int y1, int x2, int y2){
        if(x1 > x2 || y1 > y2){
            System.err.println("El rectangulo 1 no se ha podido instanciar");
        } else{
            this.x1=x1;
            this.y1=y1;
            this.x2=x2;
            this.y2=y2;
        }
    }

    public int base(){
        return (x2 - x1);
    }

    public int altura(){
        return (y2 - y1);
    }

    public int perimetro(){
        int perimetro = base() * 2 + altura() * 2;
        return perimetro;
    }

    public int area(){
        int area = base() * altura();
        return area;
    }

}
