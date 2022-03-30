package datos;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("616d07ae-817b-4fd5-8020-f0ffb3a70f5f")
public class TrabTipo1 extends Trabajador {
    @mdl.prop
    @objid ("1061596a-d5cf-4fa6-91a6-8315094e6bef")
    private int anyo;

    @mdl.propgetter
    private int getAnyo() {
        // Automatically generated method. Please do not modify this code.
        return this.anyo;
    }

    @mdl.propsetter
    private void setAnyo(int value) {
        // Automatically generated method. Please do not modify this code.
        this.anyo = value;
    }

    @mdl.prop
    @objid ("20fe7490-c5ef-434c-9804-4506c63c0a1d")
    private double complem;

    @mdl.propgetter
    public double getComplem() {
        // Automatically generated method. Please do not modify this code.
        return this.complem;
    }

    @mdl.propsetter
    public void setComplem(double value) {
        // Automatically generated method. Please do not modify this code.
        this.complem = value;
    }

    @mdl.prop
    @objid ("e95557c7-6b4a-4277-a2bf-7f3e62075bc5")
    private double sueldoBase = 1200;

    @mdl.propgetter
    public double getSueldoBase() {
        // Automatically generated method. Please do not modify this code.
        return this.sueldoBase;
    }

    @mdl.propsetter
    public void setSueldoBase(double value) {
        // Automatically generated method. Please do not modify this code.
        this.sueldoBase = value;
    }

    @objid ("5bfb695e-15b9-4686-9eb9-937edbac5186")
    public TrabTipo1() {
    }

    @objid ("1f7b549c-0b93-4b9c-997b-5206559e2c1a")
    public TrabTipo1(int an, double comp, int id, String nom, double irpf) {
    }

    @objid ("87151b5a-d07d-48b8-8fd1-0dd6415de02f")
    public double obtenerSalario() {
    }

}
