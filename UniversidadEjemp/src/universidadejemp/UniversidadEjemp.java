
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
        
        // Modificar alumno
        alu.modificarAlumno(Juan);
        
        // Eliminar alumno
        alu.eliminarAlumno(53);
        
        // Descomentar para pruebas adicionales:
        /*
        // Guardar alumno
        // alu.guardarAlumno(Juan);
        
        // Buscar alumno por id
        // Alumno alumnoEncontrado = alu.buscarAlumnoPorid(1);
        // if (alumnoEncontrado != null) {
        //     System.out.println("DNI: " + alumnoEncontrado.getDni());
        //     System.out.println("Apellido: " + alumnoEncontrado.getApellido());
        // }
        
        // Listar alumnos
        // for (Alumno alumno : alu.listarAlumnos()) {
        //     System.out.println(alumno.getDni());
        // }
        */
    }
}
