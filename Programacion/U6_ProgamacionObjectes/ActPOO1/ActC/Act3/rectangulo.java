/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act3;

/**
 *
 * @author Salva&Sandra
 */
public class rectangulo {
    
    private int x1, x2, y1, y2;
    
    
    public rectangulo (int x1, int y1, int x2, int y2){
            this.x1=x1;
            this.y1=y1;
            this.x2=x2;
            this.y2=y2;
    }    
    public void setX1(int x1) {
        
        if (x1 > this.x2) {
            System.err.println("Los datos introducidos son incorrectos");
        }else{
            this.x1 = x1;
        }
    }
    public void setX2(int x2) {
        
        if (this.x1 > x2) {
            System.err.println("Los datos introducidos son incorrectos");
        }else{
            this.x2 = x2;
        }
        
        //Comprobamos que el valor que hemos introducido en el main cumpla las normas que le hemos puesto           
    }
    public void setY1(int y1) {
        if (y1 > this.y2) {
            System.err.println("Los datos introducidos son incorrectos");
        }else{
            this.y1 = y1;
        }
    }
    public void setY2(int y2) {
        if (this.y1 > y2) {
            System.err.println("Los datos introducidos son incorrectos");
        }else{
            this.y2 = y2;
        }
    }    
    public int getX1(){
        return x1;
    }    
    public int getX2(){
        return x2;
    }    
    public int getY1(){
        return y1;
    }    
    public int getY2(){
        return y2;
    }    
}
