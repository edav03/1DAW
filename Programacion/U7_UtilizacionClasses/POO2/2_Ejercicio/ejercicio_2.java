import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        planeta tierra = new planeta ("5,972 × 10^24 kg", "12.742 km", "24 horas", "365 dias", "1 UA");
        planeta marte = new planeta ("6,39 × 10^23 kg", "6.779 km", "25 horas", "687 dias", "1,524 UA");
        planeta saturno = new planeta ("5,683 × 10^26 kg", "116.460 km", "10 horas 42 minutos", "29 años y 167 días", "9,58 UA");
        satelite luna = new satelite ("7,349 × 10^22 kg", "3.474,8 km", "27.32 días", "28 días", "384.400 km");
        satelite io = new satelite ("8,94×1022 kg", "3.643,2 km", "1d 18h 27,6m", "1 d 18 h 27,6 min", "421.800 km");

        System.out.println("De que tipo de astros quieres informacion?" + "\n 1.Planetas\n 2.Satelites");
        int x = sc.nextInt();

        if(x == 1){
            System.out.println("Elige el planeta: " + "\n 1.Tierra\n 2.Marte\n 3.Saturno");
            int n = sc.nextInt();

            switch(n){
                case 1: tierra.mostrarPlanetas(); 
                        System.out.println("\n=============" + "\nSatelite Luna" + "\n=============");
                        luna.mostrarSatelites();
                break;
                case 2: marte.mostrarPlanetas();
                break;
                case 3: saturno.mostrarPlanetas();
                        System.out.println("\n=============" + "\nSatelite Io" + "\n=============");
                        io.mostrarSatelites();
                break;
            }
        }else if(x == 2){
            System.out.println("Elige el satelite: " + "\n 1.Luna\n 2.Io");
            int n = sc.nextInt();

            switch(n){
                case 1: luna.mostrarSatelites();
                break;
                case 2: io.mostrarSatelites();
                break;
            }
        }

    }
    
}
