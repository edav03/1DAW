public class tienda {
    private String nombre;
    private double precio;
    private int cuantosQuedan;
    private int descuento;
    private int ivageneral = 21;
    private int ivareduc = 10;
    private int ivasupereduc = 4;

    public void datos(String nombre, double precio, int Quedan){
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = Quedan;
    }

    public String getnombre(){
        return nombre;
    }

    public double getprecio(){
        return precio;
    }

    public double getivageneral(){
        return ivageneral;
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
