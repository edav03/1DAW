public class coordenadas {

    int x1;
    int y1;
    int x2;
    int y2;
    
    public int ladox(){
        int a = (x2 - x1);
        return a;
    }

    public int ladoy(){
        int b = (y2 - y1);
        return b;
    }
    public coordenadas(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean hipotenusa(){
        double hip = Math.sqrt((Math.pow(2, ladox())+ Math.pow(2, ladoy())));

        boolean al = true;

        return al;
    }
}
