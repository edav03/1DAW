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
public class TrabajadorTipo2 extends Trabajador{
    private double importeventas;
    private double comision;
    private final double sueldoBase = 1150;

    public TrabajadorTipo2() {
    }

    public TrabajadorTipo2(double importeventas, double comision) {
        this.importeventas = importeventas;
        this.comision = comision;
    }

    public TrabajadorTipo2(double importeventas, double comision, int identificador, String nombre, int tipoirpf) {
        super(identificador, nombre, tipoirpf);
        this.importeventas = importeventas;
        this.comision = comision;
    }

     @Override
    public double obtenerSalario() {      
        double salario =  sueldoBase - sueldoBase*super.getTipoirpf()/100 +importeventas*comision;
        return salario;     
    }
    
    
    public double getImporteventas() {
        return importeventas;
    }

    public void setImporteventas(double importeventas) {
        this.importeventas = importeventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
      
    
   

    @Override
    public String toString() {    
                 
        return "Trabajador TIPO2 [Id: "+super.getIdentificador()+"]:\n\t" + 
                "Nombre: "+ super.getNombre()+ ", Tipo IRPF: " + super.getTipoirpf() + 
                "\n\tImporte de Ventas: " + importeventas + ", Comision: " + comision +
                "\n\tSueldo Base: " + DarFormato(sueldoBase) + 
                "\n\tSalario = "+  DarFormato(obtenerSalario()); 
   
    
       
    
    }
                 
                 
              
    
    
}
