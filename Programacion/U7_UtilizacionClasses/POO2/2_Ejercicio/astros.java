public abstract class astros {

    protected String Mcuerpo, DMedio, Protacion, Ptraslacion, Distancia;

    public astros(String Mcuerpo,String DMedio,String Protacion,String Ptraslacion,String Distancia){
        this.Mcuerpo = Mcuerpo;
        this.DMedio = DMedio;
        this.Protacion = Protacion;
        this.Ptraslacion = Ptraslacion;
        this.Distancia = Distancia;
    }

    public void mostrarAstros(){
        String result = 
        "\nMasa del cuerpo: " + Mcuerpo +
        "\nDiametro medio: " + DMedio +
        "\nPeriodo de rotacion: " + Protacion +
        "\nPeriodo de traslacion: " + Ptraslacion +
        "\nDistancia media al cuerpo que orbita: " + Distancia;

        System.out.println(result);
    }
    
}
