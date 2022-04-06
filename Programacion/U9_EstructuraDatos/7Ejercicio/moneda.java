import java.util.Random;

public class moneda {

    private String valor, pos;

    public moneda(){
        Random rand = new Random();

        String[] val = new String[8];
        val[0] = "1 centimos";
        val[1] = "2 centimos";
        val[2] = "5 centimos";
        val[3] = "10 centimos";    
        val[4] = "25 centimos";
        val[5] = "50 centimos";
        val[6] = "1 Euro";
        val[7] = "2 Euro";

        int v = rand.nextInt(8);
        this.valor = val[v];

        int p = rand.nextInt(2);
        if(p == 1){
            this.pos = "cara";
        }else{
            this.pos = "cruz";
        }
    }

    public String getValor(){
        return valor;
    }

    public String getPos(){
        return pos;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public void setPos(String pos){
        this.pos = pos;
    }
}
