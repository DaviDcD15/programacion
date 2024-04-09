import java.time.LocalDate;
import java.util.Locale;

public class Profesor extends Persona {

    private int idProfesor;
    private String materia;
    private boolean tutor;
    private double sueldo;
    private LocalDate fechaAlta;
    private boolean EquipoDirectivo;
    private String jornada;

    public Profesor() {
        super();
    }

    public Profesor(String nombre, String telefono, String direccion, String sexo, LocalDate fechaNacimiento, String nacionalidad) {
        super(nombre, telefono, direccion, sexo, fechaNacimiento, nacionalidad);
    }

    public Profesor(String nombre, String telefono, String direccion, String sexo, LocalDate fechaNacimiento, String nacionalidad, int idProfesor, String materia, boolean tutor, double sueldo, LocalDate fechaAlta, boolean equipoDirectivo, String jornada) {
        super(nombre, telefono, direccion, sexo, fechaNacimiento, nacionalidad);
        this.idProfesor = idProfesor;
        this.materia = materia;
        this.tutor = tutor;
        this.sueldo = sueldo;
        this.fechaAlta = fechaAlta;
        EquipoDirectivo = equipoDirectivo;
        this.jornada = jornada;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public boolean isTutor() {
        return tutor;
    }

    public void setTutor(boolean tutor) {
        this.tutor = tutor;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public boolean isEquipoDirectivo() {
        return EquipoDirectivo;
    }

    public void setEquipoDirectivo(boolean equipoDirectivo) {
        EquipoDirectivo = equipoDirectivo;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "idProfesor=" + idProfesor +
                ", materia='" + materia + '\'' +
                ", tutor=" + tutor +
                ", sueldo=" + sueldo +
                ", fechaAlta=" + fechaAlta +
                ", EquipoDirectivo=" + EquipoDirectivo +
                ", jornada='" + jornada + '\'' +
                '}';
    }
}