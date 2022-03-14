import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class inventario{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        mascotas p1 = new perro("Bobi", "5 años", "Vivo", "21/02/2017", "Perro");
        mascotas g1 = new gato("Gary", "9 años", "Vivo", "12/10/2012", "Gato");
        mascotas l1 = new loro("Polo", "3 años", "Muerto", "03/05/2016", "Loro");
        mascotas c1 = new canario("Wifi", "7 años", "Vivo", "24/07/2014", "Canario");
        
        ArrayList lista = new ArrayList();

        lista.add(p1);
        lista.add(g1);
        lista.add(l1);
        lista.add(c1);

        String menu =
        "\n1. Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal)." +
        "\n2. Mostrar todos los datos de un animal concreto." +
        "\n3. Mostrar todos los datos de todos los animales." +
        "\n4. Insertar animales en el inventario." +
        "\n5. Eliminar animales del inventario." +
        "\n6. Vaciar el inventario." ;

        System.out.println(menu);
        int n = sc.nextInt();

        Iterator it = lista.iterator();

        switch(n){
            case 1:
                System.out.println("===============");
                while(it.hasNext()){
                    mascotas p = (mascotas)it.next();
                    p.mostrarPoco();
                    System.out.println("===============");
                }
            break;
            case 2:
                System.out.println("===============\n 1. Bobi\n 2. Gary\n 3. Polo\n 4. Wifi");
                int x = sc.nextInt();
                System.out.println("===============");
                if(x == 1){
                    p1.mostrarDatos();
                }else if(x == 2){
                    g1.mostrarDatos();
                }else if(x == 3){
                    l1.mostrarDatos();
                }else{
                    c1.mostrarDatos();
                }
            break;
            case 3:
                System.out.println("===============");
                while(it.hasNext()){
                    mascotas p = (mascotas)it.next();
                    p.mostrarDatos();
                    System.out.println("===============");
                }
            break;
            case 4:

                String tipo;
                
                System.out.println("===============\n Tipo de animal a insertar:\n 1.Perro\n 2.Gato\n 3.Loro\n 4.Canario");
                int d1 = sc.nextInt();

                System.out.println("Nombre: ");
                String nombre = sc.next();

                System.out.println("Edad: ");
                String edad = sc.next();

                System.out.println("Estado (vivo o muerto): ");
                String estado = sc.next();

                System.out.println("Fecha de nacimiento: ");
                String nacim = sc.next();

                if(d1 == 1){
                    tipo = "Perro";
                    mascotas m = new perro(nombre, edad + " años", estado, nacim, tipo);
                }else if(d1 == 2){
                    tipo = "Gato";
                    mascotas m = new gato(nombre, edad + " años", estado, nacim, tipo);
                }else if(d1 == 3){
                    tipo = "Loro";
                    mascotas m = new loro(nombre, edad + " años", estado, nacim, tipo);
                }else{
                    tipo = "Canario";
                    mascotas m = new canario(nombre, edad + " años", estado, nacim, tipo);
                }
            break;
            case 5:
                int cont = 1;

                System.out.println("Que animal quieres eliminar?\n===============");
                while(it.hasNext()){
                    System.out.println(cont);
                    mascotas p = (mascotas)it.next();
                    p.mostrarDatos();
                    System.out.println("===============");
                    cont += 1;
                }
                int p = sc.nextInt();

                if(p == 1){
                    lista.remove(p1);
                }else if(p == 2){
                    lista.remove(g1);
                }else if(p == 3){
                    lista.remove(l1);
                }else{
                    lista.remove(c1);
                }
            break;
            case 6:
                lista.clear();
            break;
        }

    }
}