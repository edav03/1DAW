/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.text.DecimalFormat;

/**
 *
 * @author mjesus
 */
public abstract class Trabajador {

    private int identificador;
    private String nombre;    
    private double tipoirpf;

    public abstract double obtenerSalario ();// throws Exception;

    public Trabajador() {
    }

    public Trabajador(int identificador, String nombre, int tipoirpf) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tipoirpf = tipoirpf;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTipoirpf() {
        return tipoirpf;
    }

    public void setTipoirpf(double tipoirpf) {
        this.tipoirpf = tipoirpf;
    }

    @Override
    public String toString() {
        return "identificador=" + identificador + ", nombre=" + nombre + ", tipoirpf=" + tipoirpf ;
    }
    
    public  String DarFormato(double cantidad) {
        DecimalFormat formato2 = new DecimalFormat("##,###,##0.00");
        String cantidadS = formato2.format(cantidad);
        return cantidadS;
    }// DarFormato
    

}
