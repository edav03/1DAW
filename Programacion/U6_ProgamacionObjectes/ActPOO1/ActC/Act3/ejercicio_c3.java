/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Act3;
public class ejercicio_c3 {

    public static void main(String[] args) {


        rectangulo rec1 = new rectangulo(0, 5, 0, 10);
        rectangulo rec2 = new rectangulo(9, 7, 2, 3);

        //Hacemos un set para darle un valor a los distintos puntos del rectángulo
            rec1.setX1(0);
            rec1.setX2(5);
            rec1.setY1(0);
            rec1.setY2(10);

        //Si los valores son correctos cogemos y los guardamos con el get
                int base = rec1.getX2() - rec1.getX1();
                int altura = rec1.getY2() - rec1.getY1();
                int per = base * 2 + altura * 2;
                System.out.println("El perímetro del rectángulo 1 es: "+per);
                int area = base * altura;
                System.out.println("El área del rectángulo 1 es: "+area);


        //Hacemos lo mismo que arriba pero poniendo valores que no valen

            rec2.setX1(9);
            rec2.setX2(7);
            rec2.setY1(2);
            rec2.setY2(3);

                int base2 = rec2.getX2() - rec2.getX1();
                int altura2 = rec2.getY2() - rec2.getY1();
                int per2 = base2 * 2 + altura2 * 2;
                System.out.println("El perímetro del rectángulo 2 es: "+per2);
                int area2 = base2 * altura2;
                System.out.println("El área del rectángulo 2 es: "+area2);

                }   


/*

A3_rectangulo rec1_lado = new A3_rectangulo();        
A3_rectangulo rec1_altura = new A3_rectangulo();
A3_rectangulo rec2_lado = new A3_rectangulo();
A3_rectangulo rec2_altura = new A3_rectangulo();

        rec1_lado.x1=0;
        rec1_lado.x2=5;
        rec1_altura.y1=0;
        rec1_altura.y2=5;
        
        rec2_lado.x1=7;
        rec2_lado.x2=2;
        rec2_altura.y1=9;
        rec2_altura.y2=3;
        
        int dif_b = rec1_lado.x2 - rec1_lado.x1;
        int dif_alt = rec1_altura.y2- rec1_altura.y1;
        int perimetro = (dif_alt*2)+(dif_b*2);
        System.out.println("El perimetro del rectángulo 1 es: "+perimetro);
        int area = dif_b * dif_alt;
        System.out.print("El área del rectángulo 1 es: "+area);
        System.out.println("");
        
        int dif_b2 = rec2_lado.x1 - rec2_lado.x2;
        int dif_alt2 = rec2_altura.y1- rec2_altura.y2;
        int perimetro2 = (dif_alt2*2)+(dif_b2*2);
        System.out.println("El perimetro del rectángulo 2 es: "+perimetro2);
        int area2 = dif_b2 * dif_alt2;
        System.out.print("El área del rectángulo 2 es: "+area2);
        System.out.println("");
*/
        
    }


