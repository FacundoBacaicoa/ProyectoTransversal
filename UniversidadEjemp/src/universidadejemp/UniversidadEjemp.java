/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidadejemp;

import java.time.LocalDate;
import org.mariadb.jdbc.Connection;
import universidadejemp.AccesoADatos.AlumnoData;
import universidadejemp.AccesoADatos.Conexion;
import universidadejemp.Entidades.Alumno;

/**
 *
 * @author facun
 */
public class UniversidadEjemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
        Alumno Juan = new Alumno(53, 1123445, "Luna", " Juan Pedro", LocalDate.of(1984, 4, 23), true);
        AlumnoData alu = new AlumnoData();
        // alu.guardarAlumno(Juan);
        
        //alu.modificarAlumno(Juan);
        
        //alu.eliminarAlumno(53);
        
        //Alumno alumnoEncontrado=alu.buscarAlumnoPorid(1);
        //if(alumnoEncontrado!=null){
        // System.out.println("dni "+alumnoEncontrado.getDni());
        //System.out.println("apellido "+alumnoEncontrado.getApellido());
        //}
        
        //for(Alumno alumno:alu.listarAlumnos()){
        //System.out.println(alumno.getDni());
        //}
    }

}
