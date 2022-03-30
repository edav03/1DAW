
package operaciones;

import datos.Trabajador;

/**
 *
 * @author mjesus
 */
public interface Operaciones {    
    boolean InsertarTrabajador(Trabajador o);    
    Trabajador ConsultarTrabajador(int id);    
    boolean EliminarTrabajador(int id);     
    int numeroTrabajadores(int tipo);  
    Trabajador [] ListaTrabajadores(int tipo);
}
