public class tienda {

    String nombre;
    double precio;
    double iva;
    int cuantosQuedan;

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
