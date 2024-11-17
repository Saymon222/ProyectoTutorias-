public class Estudiante extends Usuario{
    private String contrasena;


    public Estudiante(String id, String nombre, String contrasena) {
        super(id, nombre);
        this.contrasena = contrasena;

    }

    public String getContrasena() {
        return contrasena;
    }



    @Override
    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre + ", ID: " + id);
    }
}

