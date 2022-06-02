import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ejer_b3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<String> list_content = new ArrayList<String>();

        System.out.print("Introduce archivo de lectura y archivo de escritura: ");
        String[] path = sc.nextLine().split(" ");
        sc.close();

        File f1 = new File("documentos/" + path[0]);
        File f2 = new File("documentos/" + path[1]);
        f2.createNewFile();

        try {
            // Scanner file1 = new Scanner(f1);
            Scanner file2 = new Scanner(f1);

            while (file2.hasNext()) {
                String content_File = file2.nextLine();
                list_content.add(content_File);
            }

            file2.close();

            list_content = list_content.stream().sorted().collect(Collectors.toList());

            FileWriter myWriter = new FileWriter(f2.getAbsolutePath());

            for (int i = 0; i < list_content.size(); i++) {
                myWriter.write(list_content.get(i) + "\n");
            }

            System.out.println("Archivo copiado exitosamente");

            myWriter.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
