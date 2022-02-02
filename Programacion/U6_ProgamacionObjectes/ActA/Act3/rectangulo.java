public class rectangulo {

    int x1;
    int x2;
    int y1;
    int y2;


    public int perimetro(){
        int perimetro = (x2 - x1) + (y2 - y1);
        return perimetro;
    }

    public int area(){
        int area = (x2 - x1) + (y2 - y1);
        return area;
    }
}
