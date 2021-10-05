import java.util.Scanner;

public class dsiete {
    public static void main(String[] arg){
        Scanner hora = new Scanner(System.in);
        Scanner minuto = new Scanner(System.in);
        Scanner segundo = new Scanner(System.in);
        int h, m, s, n, mt;
        int hf, mf, sf;

        System.out.print("Hora: ");
        h = hora.nextInt();

        System.out.print("Minutos: ");
        m = minuto.nextInt();

        System.out.print("Segundos: ");
        s = segundo.nextInt();

        // pasamos todo a segundos + 1
            h = h * 3600;
            m = m * 60;
            n = h + m + s + 1;

        // minutos totales
            mt = n / 60;

        // encontramos segundos, minutos y hora finales
            sf = n % 60;
            mf = mt % 60;
            hf = mt / 60;

        if(sf < 10){
            System.out.println(hf + ":" + mf + ":0" + sf);
        }
        else{
            System.out.println(hf + ":" + mf + ":" + sf);
        }

        // if(mf < 10){
        //     System.out.println(hf + ":0" + mf + ":" + sf);
        // }
        // else{
        //     System.out.println(hf + ":" + mf + ":" + sf);
        // }

        hora.close();
        minuto.close();
        segundo.close();
    }
}
