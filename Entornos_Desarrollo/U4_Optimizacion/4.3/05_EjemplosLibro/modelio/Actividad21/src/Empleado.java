import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7d35b4d8-e11f-449b-af7d-66aff0cc63fe")
public class Empleado {
    @mdl.prop
    @objid ("48baac4e-43ff-49ef-b354-f5efad2e72d9")
    private int dni;

    @mdl.propgetter
    private int getDni() {
        // Automatically generated method. Please do not modify this code.
        return this.dni;
    }

    @mdl.propsetter
    private void setDni(int value) {
        // Automatically generated method. Please do not modify this code.
        this.dni = value;
    }

    @mdl.prop
    @objid ("0526bd4e-6121-451f-a7af-acb1d5022244")
    private String nombre;

    @mdl.propgetter
    private String getNombre() {
        // Automatically generated method. Please do not modify this code.
        return this.nombre;
    }

    @mdl.propsetter
    private void setNombre(String value) {
        // Automatically generated method. Please do not modify this code.
        this.nombre = value;
    }

    @mdl.prop
    @objid ("912ae9e4-1628-4811-9976-867df38bcd3f")
    private String direccion;

    @mdl.propgetter
    private String getDireccion() {
        // Automatically generated method. Please do not modify this code.
        return this.direccion;
    }

    @mdl.propsetter
    private void setDireccion(String value) {
        // Automatically generated method. Please do not modify this code.
        this.direccion = value;
    }

    @objid ("811c01a1-41b9-4129-9f33-66fc48535407")
    public double calcularSueldo() {
    }

    @objid ("e6160f83-6db5-4fb8-b83b-0b618ada7e68")
    public Empleado(int dni, String nom, String dir) {
    }

}
