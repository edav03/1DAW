public class planeta extends astros{
    
    public planeta(String Mcuerpo,String DMedio,String Protacion,String Ptraslacion,String Distancia){
        super(Mcuerpo, DMedio, Protacion, Ptraslacion, Distancia);
    }

    public void mostrarPlanetas(){
        super.mostrarAstros();
    }
}
