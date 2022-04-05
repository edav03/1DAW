public class carta {

    private int valor;
    private String palo;

    public carta(int valor, String palo){
        this.valor = valor;
        this.palo = palo;
    }

    public String toString(){
        return valor + " de " + palo;
    }
}
