public class tienda {
    private String nombre;
    private double precio;
    private double iva;
    private int cuantosQuedan;

    public void datos(String nombre, double precio, double iva, int Quedan){
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cuantosQuedan = Quedan;
    }

    public String getnombre(){
        return nombre;
    }

    public double getprecio(){
        return precio;
    }

    public double getiva(){
        return iva;
    }

    public int getcuantosQuedan(){
        return cuantosQuedan;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public void setprecio(double precio){
        this.precio = precio;
    }

    public void setiva(double iva){
        this.iva = iva;
    }

    public void setcuantosQuedan(int quedan){
        this.cuantosQuedan = quedan;
    }

    public boolean digits(){

        for(int i = 0; i < nombre.length(); i++){

            if(nombre.charAt(i) >= '0' && nombre.charAt(i) <= '9'){
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }

    public void cont(){

        if(digits() == false){
            System.err.println("\nError al instanciar nombre, contiene algun numero");
        } else{
            System.out.println("\nNombre: " + nombre);
        }

        if(precio < 0){
            System.err.println("\nError al instanciar precio");
        } else{
            System.out.println("\nPrecio: " + precio + "€");
        }

        if(iva != 21 && iva != 0.21){
            System.err.println("\nError al instanciar IVA");
        } else{
            System.out.println("\nIva: " + iva);
        }

        if(cuantosQuedan < 0){
            System.err.println("\nError al instanciar cuantosQuedan");
        } else{
            System.out.println("\nQuedan: " + cuantosQuedan);
        }

    }

}
