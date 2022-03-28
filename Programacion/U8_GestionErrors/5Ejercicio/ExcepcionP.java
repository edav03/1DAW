public class ExcepcionP extends Exception{
    private int num;

    ExcepcionP(int p){
        this.num = p;
    }

    public String toString(){
        return "Exepcion Propia [" + this.num + "]";
    }
}
