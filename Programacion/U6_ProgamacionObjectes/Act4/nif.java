public class nif {

    private int dni;
    private String lletra;

    public nif(int dni){
        this.dni = dni;
    }

    public void CalcLetra(){
        int l = this.dni % 23;

        switch(l){
            case 0: this.lletra = "T";
            break;
            case 1: this.lletra = "R";
            break;
            case 2: this.lletra = "W";
            break;
            case 3: this.lletra = "A";
            break;
            case 4: this.lletra = "G";
            break;
            case 5: this.lletra = "M";
            break;
            case 6: this.lletra = "Y";
            break;
            case 7: this.lletra = "F";
            break;
            case 8: this.lletra = "P";
            break;
            case 9: this.lletra = "D";
            break;
            case 10: this.lletra = "X";
            break;
            case 11: this.lletra = "B";
            break;
            case 12: this.lletra = "N";
            break;
            case 13: this.lletra = "J";
            break;
            case 14: this.lletra = "Z";
            break;
            case 15: this.lletra = "S";
            break;
            case 16: this.lletra = "Q";
            break;
            case 17: this.lletra = "V";
            break;
            case 18: this.lletra = "H";
            break;
            case 19: this.lletra = "L";
            break;
            case 20: this.lletra = "C";
            break;
            case 21: this.lletra = "K";
            break;
            case 22: this.lletra = "E";
            break;
        }
    }

    public String CalcNif(){
        String letdni = String.valueOf(this.dni);
        return letdni;
    }

    public String getNif(){
        String nif = CalcNif() + lletra;
        return nif;
    }
}
