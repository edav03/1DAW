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
        if(saldoX > 3000){
            System.out.println("AVISO: Notificar a hacienda");
        }

        this.saldo += saldoX;
    }

}