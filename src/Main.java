import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Profesor> listaProfesores = new ArrayList<>();
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        listaProfesores.add(new Profesor("90256", "Yineth Adriana Aldana Cifuentes", "Inglés", Horario.MARTES_7_00_8_30));
        listaProfesores.add(new Profesor("90306", "María Nazareth Vado Zúñiga  ", "Cátedra Minuto de Dios", Horario.VIERNES_4_00_5_30));
        listaProfesores.add(new Profesor("96045", "William Alexander Matallana Porras ", "Estructura de Datos", Horario.MIERCOLES_10_00_11_30));
        listaProfesores.add(new Profesor("93506", "Faiber Parra Medina", "Comunicación escrita", Horario.LUNES_4_00_5_30));
        listaProfesores.add(new Profesor("93202", "Leidy Katerine Estepa Avila", "Cálculo integral", Horario.JUEVES_8_30_10_00));
        listaProfesores.add(new Profesor("20250", "Fabian Rodrigo Gutierrez Arevalo", "Metodología de investigación", Horario.LUNES_11_30_1_00));

        int opcion;
        do {
            System.out.println("+------------------------------------------------------+");
            System.out.println("|                 Sistema de Tutorías                  |");
            System.out.println("+------------------------------------------------------+");
            System.out.println("|                   Menú Principal                     |");
            System.out.println("+------------------------------------------------------+");
            System.out.println("| 1. Iniciar sesión como Estudiante                    |");
            System.out.println("| 2. Iniciar sesión como Profesor                      |");
            System.out.println("| 3. Ver cuentas activas de estudiantes                |");
            System.out.println("| 4. Ver cantidad de tutorías registradas              |");
            System.out.println("| 5. Salir                                             |");
            System.out.println("+------------------------------------------------------+");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();;

            if (opcion == 1) {
                System.out.println("+------------------------------------------------------+");
                System.out.println("|         ¿Ya tienes una cuenta de Estudiante?         |");
                System.out.println("+------------------------------------------------------+");
                System.out.println("| 1. Sí                                                |");
                System.out.println("| 2. No                                                |");
                System.out.println("+------------------------------------------------------+");
                System.out.print("Seleccione una opción: ");
                int cuentaOpcion = teclado.nextInt();
                teclado.nextLine();

                Estudiante nuevoEstudiante = null;

                if (cuentaOpcion == 1) {
                    System.out.print("Ingrese su ID: ");
                    String idEstudiante = teclado.nextLine();
                    System.out.print("Ingrese su contraseña: ");
                    String contrasenaEstudiante = teclado.nextLine();

                    for (Estudiante est : listaEstudiantes) {
                        if (est.getId().equals(idEstudiante) && est.getContrasena().equals(contrasenaEstudiante)) {
                            nuevoEstudiante = est;
                            break;
                        }
                    }

                    if (nuevoEstudiante == null) {
                        System.out.println("ID o contraseña incorrectos.");
                        continue;
                    } else {
                        System.out.println("Bienvenido nuevamente, " + nuevoEstudiante.getNombre() + "!");
                    }

                } else if (cuentaOpcion == 2) {
                    System.out.print("Ingrese su nombre: ");
                    String nombreEstudiante = teclado.nextLine();
                    System.out.print("Ingrese su ID: ");
                    String idEstudiante = teclado.nextLine();
                    System.out.print("Ingrese su contraseña: ");
                    String contrasenaEstudiante = teclado.nextLine();


                    nuevoEstudiante = new Estudiante(idEstudiante, nombreEstudiante, contrasenaEstudiante);
                    listaEstudiantes.add(nuevoEstudiante);
                    System.out.println("Cuenta creada. Bienvenido, " + nuevoEstudiante.getNombre() + "!");
                } else {
                    System.out.println("Opción inválida.");
                    continue;
                }


                int opcionEstudiante;
                do {
                    System.out.println("+------------------------------------------------------+");
                    System.out.println("|                    Menú Estudiante                   |");
                    System.out.println("+------------------------------------------------------+");
                    System.out.println("| 1. Ver lista de Profesores                           |");
                    System.out.println("| 2. Agendar tutoría                                   |");
                    System.out.println("| 3. Mostrar tutorías agendadas                        |");
                    System.out.println("| 4. Eliminar tutoria                                  |");
                    System.out.println("| 5. Marcar tutoría como completada                    |");
                    System.out.println("| 6. Cerrar sesión                                     |");
                    System.out.println("| 7. Eliminar cuenta                                   |");
                    System.out.println("+------------------------------------------------------+");
                    System.out.print("Seleccione una opción: ");
                    opcionEstudiante = teclado.nextInt();
                    teclado.nextLine();

                    if (opcionEstudiante == 1) {
                        System.out.println("\n+-------------------------------------------------------------------------------------------------------------------------+");
                        System.out.println("|                                                 Lista de Tutores                                                        |");
                        System.out.println("+------------+------------------------------------------+--------------------------------+--------------------------------+");
                        System.out.println(String.format("| %-10s | %-40s | %-30s | %-30s |", "ID", "Nombre", "Área", "Horario"));
                        System.out.println("+------------+------------------------------------------+--------------------------------+--------------------------------+");
                        for (Profesor p : listaProfesores) {
                            System.out.println(String.format("| %-10s | %-40s | %-30s | %-30s |", p.getId(), p.getNombre(), p.getArea(), p.getHorario()));
                        }
                        System.out.println("+------------+------------------------------------------+--------------------------------+--------------------------------+");

                    } else if (opcionEstudiante == 2) {
                        System.out.println("\n+-------------------------------------------------------------------------------------------------------------------------+");
                        System.out.println("|                                                 Lista de Tutores                                                        |");
                        System.out.println("+------------+------------------------------------------+--------------------------------+--------------------------------+");
                        System.out.println(String.format("| %-10s | %-40s | %-30s | %-30s |", "ID", "Nombre", "Área", "Horario"));
                        System.out.println("+------------+------------------------------------------+--------------------------------+--------------------------------+");
                        for (Profesor p : listaProfesores) {
                            System.out.println(String.format("| %-10s | %-40s | %-30s | %-30s |", p.getId(), p.getNombre(), p.getArea(), p.getHorario()));
                        }
                        System.out.println("+------------+------------------------------------------+--------------------------------+--------------------------------+");

                        System.out.print("Ingrese el ID del profesor para agendar la tutoría: ");
                        String idProfesorAgendar = teclado.nextLine();
                        Profesor profesorAgendar = null;
                        for (Profesor p : listaProfesores) {
                            if (p.getId().equals(idProfesorAgendar)) {
                                profesorAgendar = p;
                                break;
                            }
                        }
                        if (profesorAgendar != null) {
                            nuevoEstudiante.agendarTutoria(idProfesorAgendar, profesorAgendar);
                            profesorAgendar.mostrarInformacion();
                        } else {
                            System.out.println("Profesor no encontrado.");
                        }
                    }else if (opcionEstudiante == 3) {
                        nuevoEstudiante.mostrarTutoriasAgendadas(listaProfesores);

                    }else if (opcionEstudiante == 4) {
                        System.out.print("Ingrese el ID del profesor para eliminar la tutoría: ");
                        String idProfesorEliminar = teclado.nextLine();
                        Profesor profesorEliminar = null;
                        for (Profesor p : listaProfesores) {
                            if (p.getId().equals(idProfesorEliminar)) {
                                profesorEliminar = p;
                                break;
                            }
                        }
                        if (profesorEliminar != null) {
                            nuevoEstudiante.eliminarTutoria(idProfesorEliminar, profesorEliminar);
                        } else {
                            System.out.println("Profesor no encontrado.");
                        }

                    } else if (opcionEstudiante == 5) {
                        System.out.print("Ingrese el ID del profesor para marcar la tutoría como completada: ");
                        String idProfesorCompletada = teclado.nextLine();
                        Profesor profesorCompletada = null;
                        for (Profesor p : listaProfesores) {
                            if (p.getId().equals(idProfesorCompletada)) {
                                profesorCompletada = p;
                                break;
                            }
                        }
                        if (profesorCompletada != null) {
                            EstadoTutoria estado = nuevoEstudiante.getTutoriasAgendadas().get(idProfesorCompletada);
                            if (estado != null && estado == EstadoTutoria.AGENDADA) {
                                nuevoEstudiante.tutoriaCompletada(idProfesorCompletada);
                                profesorCompletada.removerEstudiante(nuevoEstudiante);  // Remove the student from the professor's list
                                System.out.println("La tutoría con " + profesorCompletada.getNombre() + " ha sido completada.");
                            } else {
                                System.out.println("No tienes una tutoría agendada con este profesor o la tutoría ya está completada.");
                            }
                        } else {
                            System.out.println("Profesor no encontrado.");
                        }

                    } else if (opcionEstudiante == 6) {
                        System.out.println("Volviendo al menú inicial...");
                        break;

                    } else if (opcionEstudiante == 7) {

                        listaEstudiantes.remove(nuevoEstudiante);
                        for (String idProfesor : nuevoEstudiante.getTutoriasAgendadas().keySet()) {
                            for (Profesor profesor : listaProfesores) {
                                if (profesor.getId().equals(idProfesor)) {
                                    profesor.removerEstudiante(nuevoEstudiante);
                                }
                            }
                        }
                        System.out.println("Tu cuenta ha sido eliminada.");
                        break;

                    } else {
                        System.out.println("Opción inválida.");
                    }

                } while (opcionEstudiante != 6);

            } else if (opcion == 2) {
                System.out.println("\n+---------------------------------------------------------------------------------------------------------------+");
                System.out.println("|                                             Lista de Tutores                                                  |");
                System.out.println("+------------+--------------------------------+--------------------------------+--------------------------------+");
                System.out.println(String.format("| %-10s | %-30s | %-30s | %-30s |", "ID", "Nombre", "Área", "Horario"));
                System.out.println("+------------+--------------------------------+--------------------------------+--------------------------------+");
                for (Profesor p : listaProfesores) {
                    System.out.println(String.format("| %-10s | %-30s | %-30s | %-30s |", p.getId(), p.getNombre(), p.getArea(), p.getHorario()));
                }
                System.out.println("+------------+--------------------------------+--------------------------------+--------------------------------+");

                System.out.print("Ingrese su ID para iniciar sesión como profesor: ");
                String idProf = teclado.nextLine();
                Profesor profesor = null;
                for (Profesor p : listaProfesores) {
                    if (p.getId().equals(idProf)) {
                        profesor = p;
                        break;
                    }
                }

                if (profesor == null) {
                    System.out.println("Profesor no encontrado.");
                } else {
                    System.out.println("Bienvenido, Profesor " + profesor.getNombre() + "!");

                    int opcionProfesor = 0;
                    do {
                        System.out.println("+------------------------------------------------------+");
                        System.out.println("|                   Menú Profesor                      |");
                        System.out.println("+------------------------------------------------------+");
                        System.out.println("| 1. Ver Estudiantes Registrados para Tutorías         |");
                        System.out.println("| 2. Ver Horario de Tutorías                           |");
                        System.out.println("| 3. Cerrar sesión                                     |");
                        System.out.println("+------------------------------------------------------+");
                        System.out.print("Seleccione una opción: ");
                        opcionProfesor = teclado.nextInt();
                        teclado.nextLine();

                        if (opcionProfesor == 1) {
                            profesor.mostrarEstudiantesAgendados();
                        } else if (opcionProfesor == 2) {
                            profesor.mostrarHorario();
                        } else if (opcionProfesor == 3) {
                            System.out.println("Cerrando sesión de profesor...");
                            break;
                        } else {
                            System.out.println("Opción inválida.");
                        }
                    } while (opcionProfesor != 3);
                }
            } else if (opcion == 3) {
                if (listaEstudiantes.isEmpty()) {
                    System.out.println("No hay estudiantes activos.");
                } else {
                    System.out.println("+----------------------------------+");
                    System.out.println("| Estudiantes Activos              |");
                    System.out.println("+----------------------------------+");
                    for (Estudiante est : listaEstudiantes) {
                        System.out.println("Estudiante: "+ est.getNombre() + " (ID: " + est.getId() + ")");
                    }
                    System.out.println("+----------------------------------+");
                }
            } else if (opcion == 4) {
                if (listaEstudiantes.isEmpty()) {
                    System.out.println("No hay estudiantes registrados.");
                } else {
                    for (Estudiante est : listaEstudiantes) {
                        System.out.println("\nEstudiante: " + est.getNombre() + " (ID: " + est.getId() + ")");
                        int cantidadTutorias = est.getTutoriasAgendadas().size();
                        System.out.println("Cantidad de tutorías: " + cantidadTutorias);
                        if (cantidadTutorias > 0) {
                            System.out.println("Detalles de las tutorías:");
                            for (String idProfesor : est.getTutoriasAgendadas().keySet()) {
                                String estadoTutoría = String.valueOf(est.getTutoriasAgendadas().get(idProfesor));
                                Profesor profesor = null;
                                for (Profesor p : listaProfesores) {
                                    if (p.getId().equals(idProfesor)) {
                                        profesor = p;
                                        break;
                                    }
                                }
                                if (profesor != null) {
                                    System.out.println("Profesor: " + profesor.getNombre() + ", Materia: " + profesor.getArea() + ", Estado: " + estadoTutoría);
                                }
                            }
                        } else {
                            System.out.println("No hay tutorías agendadas.");
                        }
                    }
                }
            } else if (opcion == 5) {
                System.out.println("Saliendo del sistema...");
            } else {
                System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}