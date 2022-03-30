import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("59852be7-0bab-4ad4-ae24-a8a307c0a54e")
public class Plantilla {
    @mdl.prop
    @objid ("95f85c9a-2f44-4d93-a734-7f8c64d94940")
    private List<Administrativo> administrativo = new ArrayList<Administrativo> ();

    @mdl.propgetter
    public List<Administrativo> getAdministrativo() {
        // Automatically generated method. Please do not modify this code.
        return this.administrativo;
    }

    @mdl.propsetter
    public void setAdministrativo(List<Administrativo> value) {
        // Automatically generated method. Please do not modify this code.
        this.administrativo = value;
    }

    @mdl.prop
    @objid ("ad1c5a4d-46e9-4ecb-8d77-fe1b5d3f2beb")
    private List<Limpiador> limpiador = new ArrayList<Limpiador> ();

    @mdl.propgetter
    public List<Limpiador> getLimpiador() {
        // Automatically generated method. Please do not modify this code.
        return this.limpiador;
    }

    @mdl.propsetter
    public void setLimpiador(List<Limpiador> value) {
        // Automatically generated method. Please do not modify this code.
        this.limpiador = value;
    }

    @mdl.prop
    @objid ("fbcc1289-7fa4-42ac-9a4c-b16cb94b6108")
    private List<Encargado> encargado = new ArrayList<Encargado> ();

    @mdl.propgetter
    public List<Encargado> getEncargado() {
        // Automatically generated method. Please do not modify this code.
        return this.encargado;
    }

    @mdl.propsetter
    public void setEncargado(List<Encargado> value) {
        // Automatically generated method. Please do not modify this code.
        this.encargado = value;
    }

    @mdl.prop
    @objid ("47708897-76fc-4b68-b991-2b2056d22f17")
    private List<Comercial> comercial = new ArrayList<Comercial> ();

    @mdl.propgetter
    public List<Comercial> getComercial() {
        // Automatically generated method. Please do not modify this code.
        return this.comercial;
    }

    @mdl.propsetter
    public void setComercial(List<Comercial> value) {
        // Automatically generated method. Please do not modify this code.
        this.comercial = value;
    }

    @objid ("e8900309-f8e7-4aa5-9586-1857242a0058")
    public void contratarEmple(Empleado e) {
    }

    @objid ("dc2f3e04-5870-42ba-acdc-51a531fa0520")
    public void despedirEmple(Empleado e) {
    }

    @objid ("451fca84-e606-4910-aa4c-e195f22bab55")
    public void buscarEmple(int dni) {
    }

}
