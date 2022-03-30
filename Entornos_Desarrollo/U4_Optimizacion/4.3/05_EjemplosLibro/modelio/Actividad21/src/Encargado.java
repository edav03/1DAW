import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("58c6c00b-502d-4d33-8f0b-64fad75cc113")
public class Encargado extends Empleado {
    @mdl.prop
    @objid ("4dc8a669-a212-414d-a215-5589461845a1")
    private int asucargo;

    @mdl.propgetter
    private int getAsucargo() {
        // Automatically generated method. Please do not modify this code.
        return this.asucargo;
    }

    @mdl.propsetter
    private void setAsucargo(int value) {
        // Automatically generated method. Please do not modify this code.
        this.asucargo = value;
    }

    @mdl.prop
    @objid ("c1345855-baaf-4d47-af60-61e6aa638a90")
    private String oficina;

    @mdl.propgetter
    private String getOficina() {
        // Automatically generated method. Please do not modify this code.
        return this.oficina;
    }

    @mdl.propsetter
    private void setOficina(String value) {
        // Automatically generated method. Please do not modify this code.
        this.oficina = value;
    }

    @objid ("5a9419ef-a89c-496b-b9a8-88af0919395b")
    public double calcularSubida(int num) {
    }

    @objid ("2dc68c25-dd90-4fcc-ab23-60a9c00e8f55")
    public Encargado() {
    }

}
