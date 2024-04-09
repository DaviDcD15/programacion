import java.security.SecureRandom;
import java.time.LocalDate;

public class Alumno extends Persona{


    int idAlunmo;
    private String curso;
     private String aula;
     private String nombreTutor;
     private String telefonoTutor;
     private String direccionTutor;
     private String emailTutor;
     private String alergiasTutor;
     private boolean comedor;
     private String becaBoolean;


    public Alumno() {
    }

    public Alumno(String nombre, String telefono, String direccion, String sexo, LocalDate fechaNacimiento, String nacionalidad, int idAlunmo, String curso, String aula, String nombreTutor, String telefonoTutor, String direccionTutor, String emailTutor, String alergiasTutor, boolean comedor, String becaBoolean) {
        super(nombre, telefono, direccion, sexo, fechaNacimiento, nacionalidad);
        this.idAlunmo = idAlunmo;
        this.curso = curso;
        this.aula = aula;
        this.nombreTutor = nombreTutor;
        this.telefonoTutor = telefonoTutor;
        this.direccionTutor = direccionTutor;
        this.emailTutor = emailTutor;
        this.alergiasTutor = alergiasTutor;
        this.comedor = comedor;
        this.becaBoolean = becaBoolean;
    }

    public int getIdAlunmo() {
        return idAlunmo;
    }

    public void setIdAlunmo(int idAlunmo) {
        this.idAlunmo = idAlunmo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public String getTelefonoTutor() {
        return telefonoTutor;
    }

    public void setTelefonoTutor(String telefonoTutor) {
        this.telefonoTutor = telefonoTutor;
    }

    public String getDireccionTutor() {
        return direccionTutor;
    }

    public void setDireccionTutor(String direccionTutor) {
        this.direccionTutor = direccionTutor;
    }

    public String getEmailTutor() {
        return emailTutor;
    }

    public void setEmailTutor(String emailTutor) {
        this.emailTutor = emailTutor;
    }

    public String getAlergiasTutor() {
        return alergiasTutor;
    }

    public void setAlergiasTutor(String alergiasTutor) {
        this.alergiasTutor = alergiasTutor;
    }

    public boolean getComedor() {
        return comedor;
    }

    public void setComedor(boolean comedor) {
        this.comedor = comedor;
    }

    public String getBecaBoolean() {
        return becaBoolean;
    }

    public void setBecaBoolean(String becaBoolean) {
        this.becaBoolean = becaBoolean;
    }

    @Override
    public String toString() {
        return super.toString() +
                "idAlunmo=" + idAlunmo +
                ", curso='" + curso + '\'' +
                ", aula='" + aula + '\'' +
                ", nombreTutor='" + nombreTutor + '\'' +
                ", telefonoTutor='" + telefonoTutor + '\'' +
                ", direccionTutor='" + direccionTutor + '\'' +
                ", emailTutor='" + emailTutor + '\'' +
                ", alergiasTutor='" + alergiasTutor + '\'' +
                ", comedor=" + comedor +
                ", becaBoolean='" + becaBoolean + '\'' +
                '}';
    }
}
