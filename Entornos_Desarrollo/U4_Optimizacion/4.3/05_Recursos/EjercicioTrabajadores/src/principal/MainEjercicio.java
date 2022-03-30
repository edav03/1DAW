
package principal;

import java.text.DecimalFormat;

import java.util.InputMismatchException;

import java.util.Scanner;

import datos.Trabajador;
import datos.TrabajadorTipo1;
import datos.TrabajadorTipo2;
import datos.TrabajadorTipo3;
import operaciones.tratamientoTrabajadores;


/**
 *
 * @author mjesus
 */
public class MainEjercicio {

    static Scanner sc;
 
    static tratamientoTrabajadores trat = new tratamientoTrabajadores();

    static int n=0;
    
    public static void main(String[] args) {
      
    	sc = new Scanner(System.in);
        n = LecturaTeclado("Nº de trabajadores a gestionar (1 y 10): ", 1, 10);
        trat.setN(n);
        Trabajador [] trabajadores = new Trabajador [n];
        trat.setTrabajadores(trabajadores);
    	
    	inicializar();

        int opcion, id;
       
        do {
            opcion = menu();
            switch (opcion) {
                case 1: //Crear un Trabajador de Tipo 1. 
                    CrearTrabajador(1);
                    break;
                case 2://Crear un Trabajador de Tipo 2. 
                    CrearTrabajador(2);
                    break;
                case 3://Crear un Trabajador de Tipo 3. 
                    CrearTrabajador(3);
                    break;
                case 4: //Buscar Trabajador, se pide id
                    System.out.println("=====================================================================");
                    id = LecturaTeclado("Introduce identificador a consultar: ", 1, 999);
                    if (trat.ConsultarTrabajador(id) == null) {
                        System.out.println("NO EXISTE EL TRABAJADOR CON ESE IDENTIFICADOR");
                    } else {
                        System.out.println(trat.ConsultarTrabajador(id));
                    }
                    break;

                case 5: //eliminar trabajador, se pide id
                    System.out.println("=====================================================================");
                    id = LecturaTeclado("Introduce identificador a eliminar: ", 1, 999);
                    if (trat.EliminarTrabajador(id)) {
                        System.out.println("EL TRABAJADOR [" + id + "] HA SIDO ELIMINADO");
                    } else {
                        System.out.println("EL TRABAJADOR [" + id + "] NO EXISTE");
                    }
                    break;

                case 6: //numero trabajadores 1
                    System.out.println("=====================================================================");
                    int total =trat.numeroTrabajadores(1) +trat.numeroTrabajadores(2)+trat.numeroTrabajadores(3);
                    System.out.println("Número de Trabajadores Tipo1: " + trat.numeroTrabajadores(1));                  
                    System.out.println("Número de Trabajadores Tipo2: " + trat.numeroTrabajadores(2));
                    System.out.println("Número de Trabajadores Tipo3: " + trat.numeroTrabajadores(3));
                   
                    System.out.println("Total de Trabajadores: " + total);

                    break;
               
                    
                case 7: //listado tipo 3
                   System.out.println("=====================================================================");
                   Object []  l1 = trat.ListaTrabajadores(1);
                   ListadoTrabajadores(1, l1);

                  
                   Object []  l2 = trat.ListaTrabajadores(2);
                   ListadoTrabajadores(2, l2);
                   
                
                   Object []  l3 = trat.ListaTrabajadores(3);
                   ListadoTrabajadores(3, l3);
                   
                   break;

                case 8:
                    break;
            }

        } while (opcion != 8);

    }//main

    private static int LecturaTeclado(String string, int min, int max) {
        boolean sal = false;
        int entero = 0;
        do {
            try {
                System.out.print(string);
                entero = sc.nextInt();
                sc.nextLine();
                if (entero >= min && entero <= max) {
                    sal = true;
                }
            } catch (InputMismatchException i) {
                sc.nextLine();
            }
        } while (!sal);

        return entero;
    }// LecturaEntero

    private static int menu() {
        int opcion;
        System.out.println("=====================================================================");
        System.out.println(" 1. Crear un Trabajador de Tipo 1.");
        System.out.println(" 2. Crear un Trabajador de Tipo 2.");
        System.out.println(" 3. Crear un Trabajador de Tipo 3.");
        System.out.println(" 4. Consultar un Trabajador.");
        System.out.println(" 5. Eliminar Trabajador.");
        System.out.println(" 6. Mostrar Número de Trabajadores.");
       
        System.out.println(" 7. Mostrar Todos los Trabajadores. ");
        System.out.println(" 8. Salir de la aplicación.");
        System.out.println("=====================================================================");
        opcion = LecturaTeclado("Introduce opción(1 a 8): ", 1, 8);
        return opcion;

    }//

    private static void inicializar() {
    	//(int antrabajados, double complemento, int identificador, String nombre, int tipoirpf) {
        TrabajadorTipo1 t1 = new TrabajadorTipo1(5, 100, 4, "Juan", 19);
        TrabajadorTipo1 t2 = new TrabajadorTipo1(4, 100, 7, "Maria", 19);
        TrabajadorTipo1 t3 = new TrabajadorTipo1(3, 100, 1, "Pedro", 21);
        TrabajadorTipo1 t4 = new TrabajadorTipo1(6, 110, 10, "Luis", 21);

        //double importeventas, double comision, int identificador, String nombre, int tipoirpf)
        TrabajadorTipo2 t21 = new TrabajadorTipo2(500, 10, 2, "Ana", 14);
        TrabajadorTipo2 t22 = new TrabajadorTipo2(460, 100, 20, "Pepa", 14);
        TrabajadorTipo2 t23 = new TrabajadorTipo2(320, 100, 9, "Rodrigo", 20);

        //TIPO3 (float numerohoras, int precioHora, int identificador, String nombre, int tipoirpf) {
        TrabajadorTipo3 t31 = new TrabajadorTipo3(50, 100, 11, "Josefa", 14);
        TrabajadorTipo3 t32 = new TrabajadorTipo3(46, 100, 3, "Luisa", 14);
        TrabajadorTipo3 t33 = new TrabajadorTipo3(32, 100, 13, "Manuel", 20);

        trat.InsertarTrabajador(t1);
        trat.InsertarTrabajador(t2);
        trat.InsertarTrabajador(t3);
        trat.InsertarTrabajador(t4);

        trat.InsertarTrabajador(t21);
        trat.InsertarTrabajador(t22);
        trat.InsertarTrabajador(t23);

        trat.InsertarTrabajador(t31);
        trat.InsertarTrabajador(t32);
        trat.InsertarTrabajador(t33);

    }

    private static void ListadoTrabajadores(int i, Object[] listado2) {

        System.out.println("\nLISTADO DE LOS TRABAJADORES DE TIPO: " + i);
        System.out.println("=====================================================================");

        if (trat.numeroTrabajadores(i) == 0) {
            System.out.println("\t<<NO EXISTEN TRABAJADORES DE ESTE TIPO>>");
            return;
        }

        String cab, raya, patron;
        
        switch (i) {
            case 1:

                cab = "ID   NOMBRE        IRPF  AÑOS TRAB SUELDO BASE COMPLEMENTO   SALARIO";
                raya = "==== ============= ===== ========= =========== =========== ==========";
                patron = "%4d %-13s %5s  %6s   %10s  %10s %10s\n";
                System.out.println(cab);
                System.out.println(raya);
               
                for(int ii=0; ii< trat.numeroTrabajadores(i); ii++) {                   
                    TrabajadorTipo1 t = (TrabajadorTipo1) listado2[ii];
                    // System.out.println(o);
                    String ad = String.format(patron, t.getIdentificador(),
                            t.getNombre(),
                            DarFormato(t.getTipoirpf()),
                            DarFormato(t.getAntrabajados()),
                            DarFormato(t.getSueldoBase()),
                            DarFormato(t.getComplemento()),
                            DarFormato(t.obtenerSalario()));
                    System.out.print(ad);
                }

                break;

            case 2:
                cab = "ID   NOMBRE         IRPF SUELDO BASE IMP VENTAS COMISION   SALARIO";
                raya = "==== ============= ===== =========== ========== ======== =========";
                patron = "%4d %-13s %5s  %10s %10s  %6s %10s\n";

                System.out.println(cab);
                System.out.println(raya);
          
                for(int ii=0; ii< trat.numeroTrabajadores(i); ii++) {                   
                    TrabajadorTipo2 t = (TrabajadorTipo2) listado2[ii];
          
                    // System.out.println(o);
                    String ad = String.format(patron, t.getIdentificador(),
                            t.getNombre(),
                            DarFormato(t.getTipoirpf()),
                            DarFormato(t.getSueldoBase()),
                            DarFormato(t.getImporteventas()),
                            DarFormato(t.getComision()),
                            DarFormato(t.obtenerSalario()));
                    System.out.print(ad);
                }

                break;

            case 3:
                cab = "ID   NOMBRE         IRPF  Nº HORAS   PVP HORA   SALARIO";
                raya = "==== ============= =====  ======== ========== =========";
                patron = "%4d %-13s %5s  %6s  %10s %10s\n";

                System.out.println(cab);
                System.out.println(raya);
                for(int ii=0; ii< trat.numeroTrabajadores(i); ii++) {                   
                    TrabajadorTipo3 t = (TrabajadorTipo3) listado2[ii];          
             
                    // System.out.println(o);
                    String ad = String.format(patron, t.getIdentificador(),
                            t.getNombre(),
                            DarFormato(t.getTipoirpf()),
                            DarFormato(t.getNumerohoras()),
                            DarFormato(t.getPrecioHora()),
                            DarFormato(t.obtenerSalario()));
                    System.out.print(ad);
                }

                break;
        }

    }//ListadoTrabajadores

    public static String DarFormato(double cantidad) {
        DecimalFormat formato2 = new DecimalFormat("##,###,##0.00");
        String cantidadS = formato2.format(cantidad);
        return cantidadS;
    }// DarFormato

    private static void CrearTrabajador(int tipo) {
        //pedir datos comunes  
        System.out.println("=====================================================================");
        System.out.println("ENTRADA DE DATOS DEL TRABAJADOR TIPO: " + tipo);
        int identificador = LecturaTeclado("Introduce identificador: ", 1, 999);
        String nombre = LecturaTeclado("Nombre del Trabajador    : ", 12);
        int tipoirpf = LecturaTeclado("Tipo de IRPF (> que 0)   : ", 1, 99);

        if (tipo == 1) {
            int antrabajados = LecturaTeclado("Años Trabajados       : ", 1, 999);
            double complemento = LecturaTeclado("Complemento  (> que 0): ");

            TrabajadorTipo1 t1 = new TrabajadorTipo1(antrabajados, complemento,
                    identificador, nombre, tipoirpf);
            if (trat.InsertarTrabajador(t1)) {
                System.out.println("\tTRABAJADOR INSERTADO");
            } 

        }//tipo1

        if (tipo == 2) {
            double importeventas = LecturaTeclado("Importe de las ventas (> que 0): ");
            double comision = LecturaTeclado("Comision(> que 0)              : ");
            TrabajadorTipo2 t2 = new TrabajadorTipo2(importeventas, comision, identificador, nombre, tipoirpf);
            if (trat.InsertarTrabajador(t2)) {
                System.out.println("\tTRABAJADOR INSERTADO");
            } 
        }//tipo2

        if (tipo == 3) {

            double numerohoras = LecturaTeclado("Número de Horas (> que 0): ");
            double precioHora = LecturaTeclado("Precio por Hora(> que 0) : ");

            TrabajadorTipo3 t3 = new TrabajadorTipo3(numerohoras, precioHora, identificador, nombre, tipoirpf);
            if (trat.InsertarTrabajador(t3)) {
                System.out.println("\tTRABAJADOR INSERTADO");
            } 
        }//tipo3

    }

    //LLER CADENA DE LONGITUD FIJA
    private static String LecturaTeclado(String string, int longitud) {
        boolean sal = false;

        String cad;
        do {
            System.out.print(string);
            cad = sc.nextLine();
            if (cad.length() <= longitud) {
                sal = true;
            }
        } while (!sal);

        return cad;
    }// Lectura String

    //LLER CADENA ENTRE UN MAXIMO Y MINIMO
    private static String LecturaTeclado(int maximo, String string, int minimo) {
        boolean sal = false;

        String cad;
        do {
            System.out.print(string);
            cad = sc.nextLine();
            if (cad.length() >= minimo && cad.length() <= maximo) {
                sal = true;
            }
        } while (!sal);

        return cad;
    }// Lectura String

    //LEER DOUBLE, MAYOR 0
    private static Double LecturaTeclado(String string) {
        boolean sal = false;
        Double entero = 0.0;
        do {
            try {
                System.out.print(string);
                entero = sc.nextDouble();
                sc.nextLine();
                if (entero > 0.0) {
                    sal = true;
                }
            } catch (InputMismatchException i) {
                sc.nextLine();
            }
        } while (!sal);

        return entero;
    }// LecturaEntero

}
