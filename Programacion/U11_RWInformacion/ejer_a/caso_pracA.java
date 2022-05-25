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
        command[0] = "";
        command[1] = "";
        command[2] = "";

        // Añadir un try i catch excepcion
        System.out.print("Commando: ");
        fullLinea = sc.nextLine();

        command = fullLinea.split("\\s+");

            miniTerminal(f, command[0], command[1], command[2]);

        sc.close();
    }

    public static void miniTerminal(File f, String command1, String command2, String command3){
        String name = f.getName();
        String path = f.getAbsolutePath();

        switch(command1){
            case "pwd":
                System.out.println("Ruta absoluta: " + f.getAbsolutePath());
            break;
            case "cd":
                
                if(command2.equals("..")){
                    String newPath = path.replace(name, "");
                    f = new File(newPath);

                    System.out.println("Ahora te encuentras en : " + f.getAbsolutePath());
                }
                else{
                    f = new File(path + command2);
                    System.out.println("Ahora te encuentras en : " + f.getAbsolutePath());
                }

            break;
            case "ls":
            break;
            case "ll":
            break;
            case "mkdir":
            break;
            case "rm":
            break;
            case "mv":
            break;
            case "help":
            break;
        }
    }
}
