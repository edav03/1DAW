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
public class TrabajadorTipo1 extends Trabajador{
    private int antrabajados;   
    private double complemento;
    private final double sueldoBase = 1200;

    public TrabajadorTipo1() {
    }

    public TrabajadorTipo1(int antrabajados,  double complemento) {
        this.antrabajados = antrabajados;        
        this.complemento = complemento;
    }

    public TrabajadorTipo1(int antrabajados, double complemento, int identificador, String nombre, int tipoirpf) {
        super(identificador, nombre, tipoirpf);
        this.antrabajados = antrabajados;     
        this.complemento = complemento;
    }

    
     @Override
    public double obtenerSalario() {
        double salario =  sueldoBase - sueldoBase*super.getTipoirpf()/100 +antrabajados*complemento;
        return salario;
        
    }
    
    
    public int getAntrabajados() {
        return antrabajados;
    }

    public void setAntrabajados(int antrabajados) {
        this.antrabajados = antrabajados;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

   

    @Override
    public String toString() {
        return "Trabajador TIPO1 [Id: "+super.getIdentificador()+"]:\n\t" + 
                "Nombre: "+ super.getNombre()+ ", Tipo IRPF: " + super.getTipoirpf() + 
                "\n\tAños Trabajados: " + antrabajados + ", Sueldo Base: " 
                + DarFormato(sueldoBase) + ", Complemento: " + complemento  +
                "\n\tSalario = "+ DarFormato(obtenerSalario()); 
    }
    
    
    
    
}
