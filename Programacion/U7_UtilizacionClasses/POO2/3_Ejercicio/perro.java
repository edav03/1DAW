public class perro implements mascotas{

    String nombre, edad, estado, fechaNacimiento, tipo;

    public perro(String nombre, String edad, String estado, String fechaNacimiento, String tipo){
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
        "Nombre: " + nombre +
        "\nEdad: " + edad +
        "\nEstado: " + estado +
        "\nFecha de nacimiento: " + fechaNacimiento;

        System.out.println(datos);
    }
    
}
