import java.util.Scanner;

public class dsiete {
    public static void main(String[] arg){
        Scanner hora = new Scanner(System.in);
        Scanner minuto = new Scanner(System.in);
        Scanner segundo = new Scanner(System.in);
        int h, m, s, n, mt;
        String hf, mf, sf;

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
            sf = String.valueOf(n % 60);
            mf = String.valueOf(mt % 60);
            hf = String.valueOf(mt / 60);

           
        if(sf.length() < 2) sf = "0" + sf;
        if(mf.length() < 2) mf = "0" + mf;
        if(hf.length() < 2) hf = "0" + hf;
        
        System.out.println(hf + ":" + mf + ":" + sf);

        hora.close();
        minuto.close();
        segundo.close();
    }
}
