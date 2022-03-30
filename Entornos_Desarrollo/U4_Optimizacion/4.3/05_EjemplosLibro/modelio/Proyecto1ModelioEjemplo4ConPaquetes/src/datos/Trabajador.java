package datos;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a6fdc6df-56ea-496a-84a1-238dbde461fa")
public abstract class Trabajador {
    @mdl.prop
    @objid ("2a328f53-cacf-4c4e-b236-e0c1f2df2896")
    private int id;

    @mdl.propgetter
    public int getId() {
        // Automatically generated method. Please do not modify this code.
        return this.id;
    }

    @mdl.propsetter
    public void setId(int value) {
        // Automatically generated method. Please do not modify this code.
        this.id = value;
    }

    @mdl.prop
    @objid ("f2247c11-165a-4e4d-b37b-bfc218f668e5")
    private String nombre;

    @mdl.propgetter
    public String getNombre() {
        // Automatically generated method. Please do not modify this code.
        return this.nombre;
    }

    @mdl.propsetter
    public void setNombre(String value) {
        // Automatically generated method. Please do not modify this code.
        this.nombre = value;
    }

    @mdl.prop
    @objid ("a1326b68-73ae-4992-9fed-b5e501d2f2c8")
    private String irpf;

    @mdl.propgetter
    public String getIrpf() {
        // Automatically generated method. Please do not modify this code.
        return this.irpf;
    }

    @mdl.propsetter
    public void setIrpf(String value) {
        // Automatically generated method. Please do not modify this code.
        this.irpf = value;
    }

    @objid ("68bf0399-0993-45a9-8299-6b1ed89fd05d")
    private Departamento lugar;

    @objid ("2a18182a-500b-49b1-ad23-d03b5d258f54")
    public Trabajador() {
    }

    @objid ("b74b137b-57de-4935-87f5-e2fd6cf46eb5")
    public Trabajador(int id, String nom, int irpf) {
    }

    @objid ("7b314a9f-2eb0-45c9-af2c-c6b6f372ac8f")
    public abstract double obtenerSalario();

    @objid ("ca4b16f7-4fbf-4495-91be-9d093505f094")
    Departamento getLugar() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.lugar;
    }

    @objid ("d9201691-35a6-4716-a5e6-6167a46968f1")
    void setLugar(Departamento value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.lugar = value;
    }

}
