import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("63180f39-dde4-4dc3-bcd5-5cbd2246e9ea")
public class TrabTipo2 extends Trabajador {
    @mdl.prop
    @objid ("e2e34a1a-96d0-40ae-8c2d-76bc431b54a7")
    private double importe;

    @mdl.propgetter
    public double getImporte() {
        // Automatically generated method. Please do not modify this code.
        return this.importe;
    }

    @mdl.propsetter
    public void setImporte(double value) {
        // Automatically generated method. Please do not modify this code.
        this.importe = value;
    }

    @mdl.prop
    @objid ("d3ff14b1-f7d7-4faf-946d-c3e491304d80")
    private double comision;

    @mdl.propgetter
    public double getComision() {
        // Automatically generated method. Please do not modify this code.
        return this.comision;
    }

    @mdl.propsetter
    public void setComision(double value) {
        // Automatically generated method. Please do not modify this code.
        this.comision = value;
    }

    @mdl.prop
    @objid ("9bd36096-3b2c-49c3-9fac-90840fa18eac")
    private double sueldoBase = 1150;

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

    @objid ("1eff5b2c-1cad-41fc-86b8-8bd27753217d")
    public TrabTipo2() {
    }

    @objid ("7cdd905f-9515-4311-9d20-1175c09e46ab")
    public TrabTipo2(double im, double com, int id, String nom, double irpf) {
    }

    @objid ("fa8f1a95-f2c4-4fdc-a221-4810dc437ee2")
    public double obtenerSalario() {
    }

}
