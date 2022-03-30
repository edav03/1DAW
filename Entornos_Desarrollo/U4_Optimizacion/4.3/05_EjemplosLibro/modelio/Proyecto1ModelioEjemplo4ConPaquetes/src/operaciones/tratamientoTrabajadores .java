package operaciones;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import datos.*;
import datos.Trabajador;

@objid ("b31d9d6b-b818-435b-a86e-db344c06c842")
public class tratamientoTrabajadores  implements Operaciones {
    @mdl.prop
    @objid ("37329d0d-3eff-4d71-bb65-b61c8f242d0c")
    private List<Trabajador> trabajadores = new ArrayList<Trabajador> ();

    @mdl.propgetter
    public List<Trabajador> getTrabajadores() {
        // Automatically generated method. Please do not modify this code.
        return this.trabajadores;
    }

    @mdl.propsetter
    public void setTrabajadores(List<Trabajador> value) {
        // Automatically generated method. Please do not modify this code.
        this.trabajadores = value;
    }

    @objid ("184f52be-cd37-4fbb-b1b0-2e50567604d1")
    public boolean InsertarTrabajador(Trabajador t) {
    }

    @objid ("aa7b9c4e-63ca-4ad3-b795-a6524450d528")
    public Trabajador ConsultarTrabajador(int id) {
    }

    @objid ("fd794301-2ea3-4824-b66f-834af9a90b04")
    public boolean EliminarTrabajador(int id) {
    }

    @objid ("a5e5f3fa-339b-4272-b4e5-86d7091c104e")
    public int numeroTrabajadores(int tipo) {
    }

    @objid ("c0c23b8d-b3d6-42d1-83f5-a6437058402a")
    public List<Trabajador> ListaTrabajadores(int tipo) {
    }

}
