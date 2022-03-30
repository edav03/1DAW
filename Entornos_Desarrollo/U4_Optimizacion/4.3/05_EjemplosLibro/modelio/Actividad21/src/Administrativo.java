import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9b760b11-1605-484e-8ea6-2483f4a6e669")
public class Administrativo extends Empleado {
    @mdl.prop
    @objid ("521d3674-b116-4728-9a9c-1f094e821d84")
    private String categoria;

    @mdl.propgetter
    private String getCategoria() {
        // Automatically generated method. Please do not modify this code.
        return this.categoria;
    }

    @mdl.propsetter
    private void setCategoria(String value) {
        // Automatically generated method. Please do not modify this code.
        this.categoria = value;
    }

    @mdl.prop
    @objid ("d303e55a-5f8c-462d-b5d3-0822af7c4c3b")
    private int pulsaciones;

    @mdl.propgetter
    private int getPulsaciones() {
        // Automatically generated method. Please do not modify this code.
        return this.pulsaciones;
    }

    @mdl.propsetter
    private void setPulsaciones(int value) {
        // Automatically generated method. Please do not modify this code.
        this.pulsaciones = value;
    }

    @objid ("8ce6b1dd-ed85-45f6-a3eb-efb07ad5ef2e")
    public Administrativo(String categ, int puls) {
    }

}
