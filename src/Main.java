import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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





                    } while (opcion != 5);

                }
    }