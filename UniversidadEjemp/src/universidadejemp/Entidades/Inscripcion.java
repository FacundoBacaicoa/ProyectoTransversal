package universidadejemp.Entidades;

/**
 *
 * @author facun
 */
public class Inscripcion {
    private int idInscripto;  // Cambiar a idInscripto
    private Alumno alumno;
    private Materia materia;
    private double nota;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripto, Alumno alumno, Materia materia, double nota) {  // Cambiar a idInscripto
        this.idInscripto = idInscripto;  // Cambiar a idInscripto
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public int getIdInscripto() {  // Cambiar a idInscripto
        return idInscripto;  // Cambiar a idInscripto
    }

    public void setIdInscripto(int idInscripto) {  // Cambiar a idInscripto
        this.idInscripto = idInscripto;  // Cambiar a idInscripto
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        String insc = idInscripto + " " + alumno.getApellido() + " " + alumno.getNombre() + " " + materia.getNombre();
        return insc;
    }
}
