package universidadejemp.AccesoADatos;
import universidadejemp.Entidades.Alumno;
import universidadejemp.Entidades.Inscripcion;
import universidadejemp.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class InscripcionData {
    private Connection con = null;

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion inscripcion) {
        String sql = "INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES (?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(2, inscripcion.getMateria().getIdMateria());
            ps.setDouble(3, inscripcion.getNota());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inscripcion.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripción añadida con éxito.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción: " + ex.getMessage());
        }
    }

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getDouble("nota"));

                Alumno alumno = new AlumnoData().buscarAlumnoPorid(rs.getInt("idAlumno"));
                inscripcion.setAlumno(alumno);

                Materia materia = new MateriaData().buscarMateria(rs.getInt("idMateria"));
                inscripcion.setMateria(materia);

                inscripciones.add(inscripcion);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción: " + ex.getMessage());
        }
        return inscripciones;
    } 
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getDouble("nota"));

                Alumno alumno = new AlumnoData().buscarAlumno(rs.getInt("idAlumno"));
                inscripcion.setAlumno(alumno);

                Materia materia = new MateriaData().buscarMateria(rs.getInt("idMateria"));
                inscripcion.setMateria(materia);

                inscripciones.add(inscripcion);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción: " + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT m.* FROM inscripcion i JOIN materia m ON i.idMateria = m.idMateria WHERE i.idAlumno = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                materias.add(materia);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia: " + ex.getMessage());
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNoCursadas(int idAlumno) {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                materias.add(materia);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia: " + ex.getMessage());
        }
        return materias;
    }
}
