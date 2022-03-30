import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8db569a2-5c7b-4b06-88ce-a908bd0dad25")
public class Comercial extends Empleado {
    @mdl.prop
    @objid ("ebc06c5a-3acb-4cf6-bfc6-26d8cd8f030a")
    private int numcontratos;

    @mdl.propgetter
    private int getNumcontratos() {
        // Automatically generated method. Please do not modify this code.
        return this.numcontratos;
    }

    @mdl.propsetter
    private void setNumcontratos(int value) {
        // Automatically generated method. Please do not modify this code.
        this.numcontratos = value;
    }

    @mdl.prop
    @objid ("8dee9f0f-d15f-4839-b283-0885d641bb3e")
    private String zona;

    @mdl.propgetter
    private String getZona() {
        // Automatically generated method. Please do not modify this code.
        return this.zona;
    }

    @mdl.propsetter
    private void setZona(String value) {
        // Automatically generated method. Please do not modify this code.
        this.zona = value;
    }

    @objid ("46153e1b-27c6-45da-841a-92c58abc4fef")
    public double calcularZona() {
    }

    @objid ("309233ca-c942-4ced-b2c7-e00fa6778510")
    public double calcularPrima() {
    }

    @objid ("d522b5bb-ccca-4925-bd0c-1e4c0fd81139")
    public Comercial() {
    }

}
