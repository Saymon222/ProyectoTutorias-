import java.util.ArrayList;
import java.util.HashMap;

public class Estudiante extends Usuario implements Gestionable {
    private String contrasena;
    private HashMap<String, EstadoTutoria> tutoriasAgendadas;

    public Estudiante(String id, String nombre, String contrasena) {
        super(id, nombre);
        this.contrasena = contrasena;
        this.tutoriasAgendadas = new HashMap<>();
    }

    public String getContrasena() {
        return contrasena;
    }
    @Override
    public void agendarTutoria(String idProfesor, Profesor profesor) {
        if (tutoriasAgendadas.containsKey(idProfesor) && tutoriasAgendadas.get(idProfesor) == EstadoTutoria.ELIMINADA) {
            tutoriasAgendadas.put(idProfesor, EstadoTutoria.AGENDADA);
            profesor.agregarEstudiante(this);
            System.out.println("Tutoría reprogramada con: ");
        } else if (!tutoriasAgendadas.containsKey(idProfesor)) {
            tutoriasAgendadas.put(idProfesor, EstadoTutoria.AGENDADA);
            profesor.agregarEstudiante(this);
        } else {
            System.out.println("Ya tienes una tutoría agendada con este profesor.");
        }
    }

    @Override
    public void eliminarTutoria(String idProfesor, Profesor profesor) {
        if (tutoriasAgendadas.containsKey(idProfesor)) {
            tutoriasAgendadas.put(idProfesor, EstadoTutoria.ELIMINADA);
            profesor.removerEstudiante(this);
            System.out.println("La tutoría con " + profesor.getNombre() + " ha sido eliminada.");
        } else {
            System.out.println("No tienes tutoría agendada con este profesor.");
        }
    }
    @Override
    public void tutoriaCompletada(String idProfesor) {
        if (tutoriasAgendadas.containsKey(idProfesor) && tutoriasAgendadas.get(idProfesor) == EstadoTutoria.AGENDADA) {
            tutoriasAgendadas.put(idProfesor, EstadoTutoria.COMPLETADA);
        }
    }

    public void mostrarTutoriasAgendadas(ArrayList<Profesor> listaProfesores) {
        if (tutoriasAgendadas.isEmpty()) {
            System.out.println("No tienes tutorías agendadas.");
        } else {
            for (String idProfesor : tutoriasAgendadas.keySet()) {
                for (Profesor profesor : listaProfesores) {
                    if (profesor.getId().equals(idProfesor)) {
                        profesor.mostrarInformacion();
                        String estadoTutoria = String.valueOf(tutoriasAgendadas.get(idProfesor));
                        System.out.println("Estado de la tutoría: " + estadoTutoria);
                    }
                }
            }
        }
    }

    public HashMap<String, EstadoTutoria> getTutoriasAgendadas() {
        return tutoriasAgendadas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre + ", ID: " + id);
    }
}

