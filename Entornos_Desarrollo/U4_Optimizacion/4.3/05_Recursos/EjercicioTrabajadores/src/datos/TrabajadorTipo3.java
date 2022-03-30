/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author mjesus
 */
public class TrabajadorTipo3 extends Trabajador{
    private double numerohoras;
    private double precioHora;

    public TrabajadorTipo3() {
    }

    public TrabajadorTipo3(double numerohoras, double precioHora) {
        this.numerohoras = numerohoras;
        this.precioHora = precioHora;
    }

    public TrabajadorTipo3(double numerohoras, double precioHora, int identificador, String nombre, int tipoirpf) {
        super(identificador, nombre, tipoirpf);
        this.numerohoras = numerohoras;
        this.precioHora = precioHora;
    }

     @Override
    public double obtenerSalario() {      
        double salario =  numerohoras *precioHora - numerohoras *precioHora*super.getTipoirpf()/100;
        return salario;     
    }
    public double getNumerohoras() {
        return numerohoras;
    }

    public void setNumerohoras(double numerohoras) {
        this.numerohoras = numerohoras;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    
  

    @Override
    public String toString() {             
    
      return "Trabajador TIPO3 [Id: "+super.getIdentificador()+"]:\n\t" + 
                "Nombre: "+ super.getNombre()+ ", Tipo IRPF: " + super.getTipoirpf() + 
                "\n\tNúmero de Horas: " + numerohoras + ", Precio Hora: " + precioHora +              
                "\n\tSalario = "+  DarFormato(obtenerSalario());  
    }
    
}
