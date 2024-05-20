package universidadejemp;

import java.time.LocalDate;
import org.mariadb.jdbc.Connection;
import universidadejemp.AccesoADatos.AlumnoData;
import universidadejemp.AccesoADatos.Conexion;
import universidadejemp.Entidades.Alumno;

/**
 * Clase principal para la aplicación UniversidadEjemp.
 *
 * @autor facun
 */
public class UniversidadEjemp {

    /**
     * Método principal para la ejecución de la aplicación.
     *
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
        Alumno Juan = new Alumno(53, 1123445, "Luna", "Juan Pedro", LocalDate.of(1984, 4, 23), true);
        AlumnoData alu = new AlumnoData();

        // Guardar alumno
        alu.guardarAlumno(Juan);

        // Modificar alumno
        alu.modificarAlumno(Juan);
        
        // Buscar alumno por id
        Alumno alumnoEncontrado = alu.buscarAlumnoPorid(1);
        if (alumnoEncontrado != null) {
            System.out.println("DNI: " + alumnoEncontrado.getDni());
            System.out.println("Apellido: " + alumnoEncontrado.getApellido());
            System.out.println("Nombre: " + alumnoEncontrado.getNombre());
        }
        
        System.out.println("------------------------------------------------");

        // Buscar alumno por id
        Alumno alumnoPorDni = alu.buscarAlumnoPorDni(1123445);
        if (alumnoEncontrado != null) {
            System.out.println("ID: " + alumnoPorDni.getIdAlumno());
            System.out.println("Apellido: " + alumnoPorDni.getApellido());
            System.out.println("Nombre: " + alumnoPorDni.getNombre());
        }
        
         // Eliminar alumno
        alu.eliminarAlumno(53);

        // Listar alumnos
        for (Alumno alumno : alu.listarAlumnos()) {
            System.out.println(alumno.getDni());
        }

    }
}
