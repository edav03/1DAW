import java.io.File;

public class miniTerminal{

    // private String name = f.getName();
    // private String path = f.getAbsolutePath();

    private File f;
    private String command1, command2, command3;

    public miniTerminal(File f, String command1){
        this.f = f;
        this.command1 = command1;
    }

    public void setCom(String command2){
        this.command2 = command2;
    }

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