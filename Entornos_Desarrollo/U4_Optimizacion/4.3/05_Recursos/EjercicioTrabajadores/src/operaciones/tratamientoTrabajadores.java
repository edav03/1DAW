/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;


import datos.*;

/**
 *
 * @author mjesus
 */
public class tratamientoTrabajadores implements Operaciones {

	private int n;
	private Trabajador [] trabajadores; 
	private static int actual=-1;
	  

    public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;		
	}



    public Trabajador[] getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(Trabajador[] trabajadores) {
		this.trabajadores = trabajadores;
	}

	@Override
    public boolean InsertarTrabajador(Trabajador p) {
       
        if (existeObjeto(p.getIdentificador())) {
            System.out.println("\tYa existe el identificador: " + p.getIdentificador());
            return false;
        }
        if (trabajadores != null) {
        	
        	actual++;
        	if(actual < n) {
             trabajadores[actual] = p; //si no existe
             return true;
        	}
        	else {
        		System.out.println("\n\t<<NO SE PUEDEN AÑADIR MAS TRABAJADORES>>\n");
        		actual--;
        	}
            
            
        }
        return false;

    }//

    private boolean existeObjeto(int id) {
    	   
        boolean existe = false;
        for(int i=0; i< actual; i++) {
            Trabajador p = (Trabajador)  trabajadores[i];
            if (p.getIdentificador() == id) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    @Override
    public Trabajador ConsultarTrabajador(int id) {      
        Trabajador o = null;
        boolean existe = false;
        for(int i=0; i<= actual; i++) {
            o = trabajadores[i];
            Trabajador p = (Trabajador) o;
            if (p.getIdentificador() == id) {
                o = p;
                existe = true;
                break;
            }
        }//while

        if (existe) {
            return o;
        } else {
            return null;
        }
    }

    @Override
    public boolean EliminarTrabajador(int id) {
       
 
        boolean existe = false;

        Trabajador [] trabajadores2 = new Trabajador[n];
        int j=-1;
        
        for(int i=0; i<= actual; i++) {            
        	Trabajador trabajador = (Trabajador) trabajadores[i];
       
            if(trabajador.getIdentificador() == id) {            	
                existe=true;               
            }else {
            	j++;
            	trabajadores2[j]=trabajadores[i];       	
            	
            }   
        

        }//
        
        if (existe==true) {
        	trabajadores = trabajadores2;
        	actual=j;
        }
        return existe;
    }

    @Override
    public int numeroTrabajadores(int tipo) {
        int contador = 0;
        for(int i=0; i<= actual; i++) {            
            Trabajador o = trabajadores[i];
            switch (tipo) {
                case 1:
                    if (o instanceof TrabajadorTipo1) {
                        contador++;
                    }
                    break;
                case 2:
                    if (o instanceof TrabajadorTipo2) {
                        contador++;
                    }
                    break;
                case 3:
                    if (o instanceof TrabajadorTipo3) {
                        contador++;
                    }
                    break;

            }//switch     

        }//while
        return contador;
    }

    @Override
    public Trabajador [] ListaTrabajadores(int tipo) {
    	Trabajador [] trabajadorestipo = new Trabajador [actual+1];
    	int posicion=0;

        for(int i=0; i<= actual; i++) {            
            Trabajador o = trabajadores[i];
         
            switch (tipo) {
                case 1:
                    if (o instanceof TrabajadorTipo1) {
                        trabajadorestipo[posicion] = o;
                        posicion++;
                    }
                    break;
                case 2:
                    if (o instanceof TrabajadorTipo2) {
                    	trabajadorestipo[posicion] = o;
                        posicion++;
                    }
                    break;
                case 3:
                    if (o instanceof TrabajadorTipo3) {
                    	trabajadorestipo[posicion] = o;
                        posicion++;
                    }
                    break;

            }//switch     

        }//while
        return trabajadorestipo;
    }//

}//FIN
