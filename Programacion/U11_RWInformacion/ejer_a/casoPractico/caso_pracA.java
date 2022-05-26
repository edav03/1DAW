package ejer_a;
import java.util.Scanner;
import java.io.File;
import java.lang.ArrayIndexOutOfBoundsException;

public class caso_pracA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        File f = new File("/home/edi");
        String fullLinea;
        String[] command = new String[3];
        

        System.out.print("Commando: ");
        fullLinea = sc.nextLine();

        command = fullLinea.split("\\s+");
        miniTerminal t1 = new miniTerminal(f, command[0]);

        miniTerminal(f, command[0]);

        if(command.length == 2){

        }

        sc.close();
    }

}
