import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("828f9e1d-2945-49f6-be9f-4a47a9693a64")
public class Departamento {
    @mdl.prop
    @objid ("e3f50c4e-509d-42dc-b4e1-db53daafbd6d")
    private int dept_no;

    @mdl.propgetter
    public int getDept_no() {
        // Automatically generated method. Please do not modify this code.
        return this.dept_no;
    }

    @mdl.propsetter
    public void setDept_no(int value) {
        // Automatically generated method. Please do not modify this code.
        this.dept_no = value;
    }

    @mdl.prop
    @objid ("5c92275b-a4e8-408f-857f-9c27f3e29415")
    private String dnombre;

    @mdl.propgetter
    public String getDnombre() {
        // Automatically generated method. Please do not modify this code.
        return this.dnombre;
    }

    @mdl.propsetter
    public void setDnombre(String value) {
        // Automatically generated method. Please do not modify this code.
        this.dnombre = value;
    }

    @mdl.prop
    @objid ("1e564e7e-a177-4de7-90fe-864617bde93a")
    private String loc;

    @mdl.propgetter
    public String getLoc() {
        // Automatically generated method. Please do not modify this code.
        return this.loc;
    }

    @mdl.propsetter
    public void setLoc(String value) {
        // Automatically generated method. Please do not modify this code.
        this.loc = value;
    }

    @mdl.prop
    @objid ("3caecfd3-8d88-490a-af9d-5bc5dd47e154")
    private List<Trabajador> trabajador = new ArrayList<Trabajador> ();

    @mdl.propgetter
    private List<Trabajador> getTrabajador() {
        // Automatically generated method. Please do not modify this code.
        return this.trabajador;
    }

    @mdl.propsetter
    private void setTrabajador(List<Trabajador> value) {
        // Automatically generated method. Please do not modify this code.
        this.trabajador = value;
    }

    @objid ("f06c88c8-8c3f-49e7-b668-a13176c05166")
    public Departamento(int dep, String nom, String loc) {
    }

    @objid ("78e4a935-0320-485e-a278-c5330bc35f80")
    public Departamento() {
    }

}
