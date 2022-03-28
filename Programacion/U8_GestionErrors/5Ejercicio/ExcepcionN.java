public class ExcepcionN extends Exception{
    private int num;

    ExcepcionN(int n){
        this.num = n;
    }

    public String toString(){
        return "Exepcion Propia [" + this.num + "]";
    }
}
