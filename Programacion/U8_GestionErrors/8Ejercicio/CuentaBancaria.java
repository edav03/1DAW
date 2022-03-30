public class CuentaBancaria {

    private String iban, titular;
    private double saldo;

    public CuentaBancaria(String iban, String titular, double saldo){
        if(iban.chars().count() < 24){
            System.err.println("Error al instanciar el IVA");
        } else{
            this.iban = iban;
            this.titular = titular;
            this.saldo = saldo;
        }
    }

    public String getiban(){
        return iban;
    }

    public String gettitular(){
        return titular;
    }

    public double getsaldo(){
        return saldo;
    }

    public void setsaldo(double saldoX){

        if(this.saldo + saldoX < -50){
            System.out.println("Accion imposible");
        }else{
            this.saldo += saldoX;

            if(saldoX > 3000){
                System.out.println("AVISO: Notificar a hacienda");
            }
            if(this.saldo < 0){
                System.out.println("AVISO: Saldo negativo");
            }
        }

    }

    static void excepCuenta() throws CuentaException{

    }

    static void excepHacienda() throws AvisarHaciendaException{

    }

}