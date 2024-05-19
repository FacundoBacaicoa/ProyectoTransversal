/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadejemp.AccesoADatos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import universidadejemp.Entidades.Alumno;

/**
 *
 * @author facun
 */
public class AlumnoData {
    private Connection con=null;
    
    public AlumnoData(){
        con=Conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno alumno){
        String sql="INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUES(?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4,Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno Guardado");
            }
            ps.close();
            
                    } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }
    public void modificarAlumno(Alumno alumno){
        String sql="UPDATE alumno SET dni=?, apellido=?, nombre=? , fechaNacimiento=? "
                + "WHERE idAlumno=? ";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado");
                
            }
                    
                    } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno");
        }
        
    }
     public void eliminarAlumno(int id){
    String sql="UPDATE alumno SET estado = 0 WHERE idAlumno= ?";
            
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "Alumno eliminado");
            }
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno");
        }
    
}
}
