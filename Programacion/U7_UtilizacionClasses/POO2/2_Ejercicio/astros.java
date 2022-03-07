public class astros {

    private String masa;
    private String diam;
    private String Prota;
    private String Ptrans;
    private String dist;

    public astros(String masa, String diam, String Prota, String Ptrans, String dist){
        this.masa = masa;
        this.diam = diam;
        this.Prota = Prota;
        this.Ptrans = Ptrans;
        this.dist = dist;
    }

    public String getmasa(){
        return masa;
    }
    public String getdiam(){
        return diam;
    }
    public String getProta(){
        return Prota;
    }
    public String getPtrans(){
        return Ptrans;
    }
    public String getdist(){
        return dist;
    }

    public void setmasa(String masa){
        this.masa = masa;
    }
    public void setdiam(String diam){
        this.diam = diam;
    }
    public void setProta(String Prota){
        this.Prota = Prota;
    }
    public void setPtrans(String Ptrans){
        this.Ptrans = Ptrans;
    }
    public void setdist(String dist){
        this.dist = dist;
    }
    
}
