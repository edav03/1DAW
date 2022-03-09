import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        astros tierra = new astros("5,972 × 10^24 kg", "12.742 km", "24 horas", "365 dias", "1 UA");
        astros marte = new astros("6,39 × 10^23 kg", "6.779 km", "25 horas", "687 dias", "1,524 UA");
        astros saturno = new astros("5,683 × 10^26 kg", "116.460 km", "10 horas 42 minutos", "29 años y 167 días", "9,58 UA");
        astros luna = new astros("7,349 × 10^22 kg", "3.474,8 km", "27.32 días", "28 días", "384.400 km");
        astros io = new astros("8,94×1022 kg", "3.643,2 km", "1d 18h 27,6m", "1 d 18 h 27,6 min", "421.800 km");

        ArrayList lista = new ArrayList();

        lista.add(tierra);
        lista.add(marte);
        lista.add(saturno);
        lista.add(luna);
        lista.add(io);

        String menu =
        "Elige el Astro:" +
        "\n1. Tierra" +
        "\n2. Marte" +
        "\n3. Saturno" +
        "\n4. Luna" +
        "\n5. Io";

        System.out.println(menu);
        int n = sc.nextInt();

        switch(n){
            case 1: System.out.println(lista.get(1));
            break;
            case 2: System.out.println(lista.get(2));
            break;
            case 3: System.out.println(lista.get(3));
            break;
            case 4: System.out.println(lista.get(4));
            break;
            case 5: System.out.println(lista.get(5));
            break;
        }

    }
    
}
