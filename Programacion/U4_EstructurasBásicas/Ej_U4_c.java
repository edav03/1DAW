import java.util.Scanner;

public class Ej_U4_c {
    public static void wait(int ms)
        {
            try
            {
                Thread.sleep(ms);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }

        public static void main(String[] args){
            Scanner num = new Scanner(System.in);
            int x = -1;
            String menu = 
            "\n1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25 y luego muestre la matriz por pantalla." +
            "\n2. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla." +
            "\n3. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son menores que cero y cuántos son igual a cero." +
            "\n4. Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el programa mostrará la nota mínima, máxima y media de cada alumno." +
            "\n5. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la información de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada género.";

            System.out.println(menu);
            x = num.nextInt();

            switch(x){
                case 1: first();
                break;
                case 2: second();
                break;
                case 3: third();
                break;
                case 4: forth();
                break;
                // case 5: fifth();
                // break;
                default:
                break;
            }
        }

        public static void first(){
            int[][] array = new int[5][5];
            int cont = 1;

            for(int row = 0; row < array.length; row++){
                for(int columns = 0; columns < array[row].length; columns++){
                    array[row][columns] = cont;
                    System.out.println("Array[" + row + "][" + columns + "]= " + array[row][columns]);
                    cont++;
                }
            }

            wait(2000);
            main(null);
        }

        public static void second(){
            int array[][] = new int[10][10];
            int cont = 1;

            for(int i = 0; i < array.length; i++){

                    for(int l = 0; l < array[i].length; l++){
                        array[i][l] = 10 * cont;
                        cont++;
                        System.out.println("Array[" + i + "][" + l + "]= " + array[i][l]);
                    }
                
                cont = 1;
            }

            wait(2000);
            main(null);
        }

        public static void third(){
            Scanner num = new Scanner(System.in);
            int cont = 0;

            System.out.print("Dame las filas de la matriz: ");
            int n = num.nextInt();
            System.out.print("Dame las columnas de la matriz: ");
            int m = num.nextInt();

            int array[][] = new int[n][m];
            int[] valores = new int[n*m];
            int contm[] = new int[3];

            System.out.print("Ahora introduce " + (n*m) + " valores:\n");

            for(int i = 0; i < valores.length; i++){
                int v = num.nextInt();
                valores[i] = v;
            }

            for(int i = 0; i < array.length; i++){

                for(int l = 0; l < array[i].length; l++){
                    array[i][l] = valores [cont];
                    cont++;
                    
                    if(array[i][l] > 0){
                        contm[0]++;
                    }
                    else if(array[i][l] < 0){
                        contm[1]++;
                    }
                    else if(array[i][l] == 0){
                        contm[2]++;
                    }
                }

            }

            System.out.println("Mayores de 0: " + contm[0]);
            System.out.println("Menores de 0: " + contm[1]);
            System.out.println("Iguales a 0: " + contm[2]);

            wait(2000);
            main(null);
        }

        public static void forth(){
            Scanner num = new Scanner(System.in);
            float notas[][] = new float[4][5];
            float min[] = new float[] {100,100,100,100}; 
            float max[] = new float[4];
            // float media[] = new float[4];
            float not[] = new float[4];

            for(int i = 0; i < notas.length; i++){

                System.out.println("Alumno " + (i + 1));

                for(int l = 0; l < notas[i].length; l++){

                    System.out.print("Asignatura " + (l + 1) + ":  ");
                    notas[i][l] = num.nextFloat();
                    
                    if(notas[i][l] > max[i]){
                        max[i] = notas[i][l];
                    }
                    if(notas[i][l] < min[i]){
                        min[i] = notas[i][l];
                    }

                    not[i] += notas[i][l];

                }

            }
            

            for(int i = 0; i < notas.length; i++){
                System.out.println("Alumno " + (i + 1));

                System.out.println("Nota minima: " + min[i]);
                System.out.println("Nota maxima: " + max[i]);
                System.out.println("Nota media: " + (not[i] / 5));
            }

        }
}
