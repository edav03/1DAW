import java.io.File;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class miniTerminal {

    private String user = "edi";
    private File f = new File("/home/" + user);
    private List<String> command = new ArrayList<String>();

    public void initTerminal() {
        Scanner sc = new Scanner(System.in);

        while (command.contains("exit") == false) {
            System.out.print("Command: ");
            String fullLinea = sc.nextLine();

            command = Arrays.stream(fullLinea.split(" ")).toList();

            terminalCommands();
        }
    }

    public void terminalCommands() {
        switch (command.get(0)) {
            case "pwd":
                System.out.println("Ruta absoluta: " + f.getAbsolutePath());
                break;

            case "cd":

                if (command.get(1).equals("..")) {
                    // String newPath = f.getAbsolutePath().replace(f.getName(), "");

                    this.f = new File(f.getAbsolutePath().replace(f.getName(), ""));

                    System.out.println("Ahora te encuentras en : " + this.f.getAbsolutePath());
                } else {
                    this.f = new File(f.getAbsolutePath() + command.get(1));
                    System.out.println("Ahora te encuentras en : " + f.getAbsolutePath());
                }

                break;

            case "ls":
                File[] lista = f.listFiles();
                Arrays.sort(lista);

                System.out.println("Nombre del directorio: [A] " + f.getName() + "\nContenido del directorio:");

                for (int i = 0; i < lista.length; i++) {
                    File p = lista[i];

                    if (p.isDirectory()) {

                        System.out.println("[A]" + p.getName());

                    }
                }

                for (int i = 0; i < lista.length; i++) {
                    File p = lista[i];

                    if (p.isFile()) {

                        System.out.println("[*]" + p.getName());

                    }
                }
                break;
            case "ll":
                File[] list = f.listFiles();
                Arrays.sort(list);

                System.out.println("Nombre del directorio: [A] " + f.getName() + "\nContenido del directorio:");

                // Imprime directorios
                for (int i = 0; i < list.length; i++) {
                    File p = list[i];

                    if (f.isDirectory()) {
                        long milis = f.lastModified();
                        Date fecha = new Date(milis);

                        System.out.println("[A]" + p.getName() + " | " + p.length() + " | " + fecha);

                    }
                }

                // Imprime archivos
                for (int i = 0; i < list.length; i++) {
                    File p = list[i];

                    if (p.isFile()) {
                        long milis = p.lastModified();
                        Date fecha = new Date(milis);

                        System.out.println("[*]" + p.getName() + " | " + p.length() + " | " + fecha);

                    }
                }
                break;
            case "mkdir":
                f = new File(f.getAbsolutePath() + "/" + command.get(1));
                f.mkdir();
                System.out.println("Ahora te encuentras en : " + f.getAbsolutePath());
                break;
            case "rm":
                File p = new File(f.getAbsolutePath() + "/" + command.get(1));

                if (p.isDirectory()) {
                    File[] listt = p.listFiles();

                    for (int i = 0; i < listt.length; i++) {
                        File a = listt[i];

                        a.delete();
                    }

                    p.delete();

                } else if (p.isFile()) {
                    p.delete();
                }
                break;
            case "mv":
                File f2 = new File(f.getAbsolutePath() + command.get(2) + "/" + command.get(1));
                f = new File(f.getAbsolutePath() + "/" + command.get(1));
                // f2 = new File(f2.getAbsolutePath() + "/" + command.get(1));
                f.renameTo(f2);
                break;
            case "help":
                String help = "\n  pwd: Muestra cual es la carpeta actual." +
                        "\n  cd <DIR>: Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior." +
                        "\n  ls: Muestra la lista de directorios y archivos de la carpeta actual (primero directorios, luego"
                        +
                        "\n  archivos, ambos ordenados alfabéticamente)." +
                        "\n  ll: Como ls pero muestra también el tamaño y la fecha de última modificación." +
                        "\n  mkdir <DIR>: Crea el directorio ‘DIR’ en la carpeta actual." +
                        "\n  rm <FILE>: Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego la carpeta. Si"
                        +
                        "\n  tiene subcarpetas, las dejará intactas y mostrará un aviso al usuario." +
                        "\n  mv <FILE1> <FILE2>: Mueve o renombra ‘FILE1’ a ‘FILE2’." +
                        "\n  help: Muestra una breve ayuda con los comandos disponibles." +
                        "\n  exit: Termina el programa.";

                System.out.println(help);
                break;

        }
    }

}