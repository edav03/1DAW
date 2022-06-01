import java.io.File;
import java.util.Arrays;
import java.util.List;

public class miniTerminal{

    private String user = "compipaul";
    private File f = new File("/home/" + user);
    private String path = f.getAbsolutePath();
    private String name = f.getName();
    private List<String> command;

    public miniTerminal(){
        this.command = command;
    }

    public void loopTerminal(){

        System.out.println("Command: ");
        // full
        while(!command.equals("exit")){
            terminalCommands();
        }
    }

    public void terminalCommands(){
        switch(command.get(0)){
            case "pwd":
                System.out.println("Ruta absoluta: " + path);
            break;

            case "cd":

                if(command.get(1).equals("..")){
                    String newPath = path.replace(name, "");

                    this.f = new File(newPath);

                    System.out.println("Ahora te encuentras en : " + this.f.getAbsolutePath());
                }
                else{
                    this.f = new File(path + command.get(1));
                    System.out.println("Ahora te encuentras en : " + f.getAbsolutePath());
                }

            break;

            case "ls":
            break;
            // case "ll":
            // break;
            // case "mkdir":
            // break;
            // case "rm":
            // break;
            // case "mv":
            // break;
            // case "help":
            // break;

        }
    }

}