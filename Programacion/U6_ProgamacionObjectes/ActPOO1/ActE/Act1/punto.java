import java.lang.Math;

public class punto {

    private int x;
    private int y;
    
    public punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getx(){
        return x;
    }

    public int gety(){
        return y;
    }

    public static punto creaPuntoAleatorio(){
        int rand1 = (int)(Math.random() * 201) + - 100;
        int rand2 = (int)(Math.random() * 201) + - 100;

        punto px = new punto(rand1, rand2);
        return px;
    }
}
