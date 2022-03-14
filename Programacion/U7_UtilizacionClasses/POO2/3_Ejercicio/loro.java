public class loro implements mascotas{

    String nombre, edad, estado, fechaNacimiento, tipo;

    public loro(String nombre, String edad, String estado, String fechaNacimiento, String tipo){
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.tipo = tipo;
    }

    public void mostrarPoco(){
        System.out.println("Tipo: " + tipo + "\nNombre: " + nombre);
    }

    public void mostrarDatos(){
        String datos = 
        "\nNombre: " + nombre +
        "\nEdad: " + edad +
        "\nEstado: " + estado +
        "\nFecha de nacimiento: " + fechaNacimiento;

        System.out.println(datos);
    }
    
}
