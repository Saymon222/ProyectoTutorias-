public enum Horario {
    LUNES_4_00_5_30("Lunes 4:00 pm - 5:30 pm"),
    LUNES_11_30_1_00("Lunes 11:30 am - 1:00 pm"),
    MARTES_7_00_8_30("Martes 7:00 am - 8:30 am"),
    MIERCOLES_10_00_11_30("Miércoles 10:00 am - 11:30 am"),
    JUEVES_8_30_10_00("Jueves 8:30 am - 10:00 am"),
    VIERNES_4_00_5_30("Viernes 4:00 pm - 5:30 pm");

    private String descripcion;

    Horario(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
