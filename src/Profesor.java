import java.util.ArrayList;

public class Profesor extends Usuario{
    private String area;
    private Horario horario;
    private ArrayList<Estudiante> estudiantesAgendados;

    public Profesor(String id, String nombre, String area, Horario horario) {
        super(id, nombre);
        this.area = area;
        this.horario = horario;
        this.estudiantesAgendados = new ArrayList<>();
    }

    public String getArea() {
        return area;
    }

    public Horario getHorario() {
        return horario;
    }

    public void mostrarHorario() {
        System.out.println("Horario de " + nombre + ": " + horario.getDescripcion());
    }

    public void mostrarEstudiantesAgendados() {
        if (estudiantesAgendados.isEmpty()) {
            System.out.println("No hay estudiantes agendados.");
        } else {
            System.out.println("Estudiantes agendados:");
            for (Estudiante estudiante : estudiantesAgendados) {
                estudiante.mostrarInformacion();
            }
        }
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantesAgendados.add(estudiante);
    }

    public void removerEstudiante(Estudiante estudiante) {
        estudiantesAgendados.remove(estudiante);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tutoria agendada con: " + nombre + ", ID: " + id + ", Área: " + area + ", Horario: " + horario.getDescripcion());
    }
}


