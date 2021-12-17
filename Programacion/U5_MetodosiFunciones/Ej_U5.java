import java.util.Scanner;

public class Ej_U5{

    public static void main(String[] args){
       Scanner num = new Scanner(System.in);

       System.out.print("Introduce tu numero de DNI: ");
       int n = num.nextInt();
       n = n%23;

       char res = dni(n);

       System.out.println("Tu letra correspondiente al DNI = " + res);

    }

    public static char dni(int a){
        char dev = 'x';

        switch(a){
            case 0: dev = 'O';
            break;
            case 1: dev = 'R';
            break;
            case 2: dev = 'W';
            break;
            case 3: dev = 'A';
            break;
            case 4: dev = 'G';
            break;
            case 5: dev = 'M';
            break;
            case 6: dev = 'Y';
            break;
            case 7: dev = 'F';
            break;
            case 8: dev = 'P';
            break;
            case 9: dev = 'D';
            break;
            case 10: dev = 'X';
            break;
            case 11: dev = 'B';
            break;
            case 12: dev = 'N';
            break;
            case 13: dev = 'J';
            break;
            case 14: dev = 'Z';
            break;
            case 15: dev = 'S';
            break;
            case 16: dev = 'Q';
            break;
            case 17: dev = 'V';
            break;
            case 18: dev = 'H';
            break;
            case 19: dev = 'L';
            break;
            case 20: dev = 'C';
            break;
            case 21: dev = 'K';
            break;
            case 22: dev = 'E';
            break;
        }
        
        return dev;
    }
}