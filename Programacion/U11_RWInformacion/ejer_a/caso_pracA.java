import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class caso_pracA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullLinea = "";

        // System.out.print("Commando: ");
        // fullLinea = sc.nextLine();

        // List<String> command = Arrays.stream(fullLinea.split(" ")).toList();

        miniTerminal t1 = new miniTerminal();
        
        t1.initTerminal();

        sc.close();
    }

}
