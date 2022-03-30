package operaciones;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import datos.*;
import datos.Trabajador;

@objid ("160cf102-c1f6-4bc8-9c14-687391731d92")
public interface Operaciones {
    @objid ("6efa759d-d2fd-4017-ac5b-feadbe19bc88")
    boolean InsertarTrabajador(Trabajador t);

    @objid ("84c2d29d-0ed7-4b39-a9a3-be7b8d441ae3")
    Trabajador ConsultarTrabajador(int id);

    @objid ("4ed7342d-dbd2-401e-b4e0-905b38c29acb")
    boolean EliminarTrabajador(int id);

    @objid ("c5a8d5a9-70d3-4263-ad4b-9f63f820d38e")
    int numeroTrabajadores(int tipo);

    @objid ("79f3683a-9523-4330-9cba-fbeae55619e2")
    List<Trabajador> ListaTrabajadores(int tipo);

}
