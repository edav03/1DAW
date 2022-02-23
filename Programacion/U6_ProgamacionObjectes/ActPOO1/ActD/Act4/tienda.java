public class tienda {
    private String nombre;
    private double precio;
    private double iva;
    private int cuantosQuedan;
    private int descuento;

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

    public int getdescuento(){
        return descuento;
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

    public void setdescuento(int desc){
        this.descuento = desc;
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

    public void imprime(){

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

    public double getPVP(){
        double ivaresult = precio * 0.21;
        return ivaresult + precio;
    }

    public double getPVPDescuento(int descuento){
        double descresult = getPVP() * (descuento / 100);
        return getPVP() - descresult;
    }

    public boolean vender(int vendido){
        if(vendido > cuantosQuedan){
            return false;
        } else {
            return true;
        }
    }

    public boolean almacenar(int almacen){
        if(almacen > 50){
            return false;
        } else {
            return true;
        }
    }

}
