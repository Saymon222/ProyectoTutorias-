public interface Gestionable {
    void agendarTutoria(String idProfesor, Profesor profesor);
    void eliminarTutoria(String idProfesor, Profesor profesor);
    void tutoriaCompletada(String idProfesor);
}