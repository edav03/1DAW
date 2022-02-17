public class CuentaBancaria {

    private String iban, titular;
    private double salario;

    public CuentaBancaria(String iban, String titular, double salario){
        if(iban.chars().count() < 24){
            System.err.println("Error al instanciar el IVA");
        } else{
            this.iban = iban;
            this.titular = titular;
            this.salario = salario;
        }
    }
    
}