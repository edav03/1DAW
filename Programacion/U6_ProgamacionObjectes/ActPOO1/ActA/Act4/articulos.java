public class articulos {
    String nombre;
    double precio;
    int cuantosQuedan;
    final float iva = 21;

    public double precioPublico(){
        double pvp = precio + (precio * 0.21);
        return (pvp);
    }
}
