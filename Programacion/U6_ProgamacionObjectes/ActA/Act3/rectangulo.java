public class rectangulo {

    int x1, x2, y1, y2;

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
