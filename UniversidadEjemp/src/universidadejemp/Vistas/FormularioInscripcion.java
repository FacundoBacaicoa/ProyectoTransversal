
package universidadejemp.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadejemp.AccesoADatos.AlumnoData;
import universidadejemp.AccesoADatos.InscripcionData;
import universidadejemp.AccesoADatos.MateriaData;
import universidadejemp.Entidades.Alumno;
import universidadejemp.Entidades.Inscripcion;
import universidadejemp.Entidades.Materia;

/**
 *
 * @author facun
 */
public class FormularioInscripcion extends javax.swing.JInternalFrame {

   private List<Materia>listaM;
   private List<Alumno>listaA;
   
   private InscripcionData inscData;
   private MateriaData mData;
   private AlumnoData aData;
   
   private DefaultTableModel modelo;
 
    public FormularioInscripcion() {
        initComponents();
        aData=new AlumnoData();
        listaA=aData.listarAlumnos();
        modelo= new DefaultTableModel();
       cargarAlumnos();
       armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboxAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        radioInscriptas = new javax.swing.JRadioButton();
        radioNoInscriptas = new javax.swing.JRadioButton();
        jBInscribir = new javax.swing.JButton();
        buttonSalir = new javax.swing.JButton();
        jBAInscribir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();

        jLabel1.setText("FORMULARIO DE INSCRIPCION");

        jLabel2.setText("Seleccione un alumno:");

        jLabel3.setText("LISTADO DE MATERIAS");

        radioInscriptas.setText("Materias Inscriptas");
        radioInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInscriptasActionPerformed(evt);
            }
        });

        radioNoInscriptas.setText("Materias no Inscriptas");
        radioNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoInscriptasActionPerformed(evt);
            }
        });

        jBInscribir.setText("Inscribir");
        jBInscribir.setEnabled(false);
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        jBAInscribir.setText("Anular Inscripcion");
        jBAInscribir.setEnabled(false);
        jBAInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAInscribirActionPerformed(evt);
            }
        });

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtMaterias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioNoInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(buttonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioNoInscriptas)
                    .addComponent(radioInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInscriptasActionPerformed
      
        borrarFilaTabla();
        radioNoInscriptas.setSelected(false);
        cargaDatosInscriptas();
        jBAInscribir.setEnabled(true);
        jBInscribir.setEnabled(false);
    }//GEN-LAST:event_radioInscriptasActionPerformed

    private void radioNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoInscriptasActionPerformed
        borrarFilaTabla();
        radioInscriptas.setSelected(false);
        cargaDatosNoInscriptas();
        jBAInscribir.setEnabled(false);
        jBInscribir.setEnabled(true);
    }//GEN-LAST:event_radioNoInscriptasActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
     int filaSeleccionada=jtMaterias.getSelectedRow();
     
        if (filaSeleccionada!=-1) {
            
            Alumno a=(Alumno) cboxAlumno.getSelectedItem();
            
            int idMateria=(int) modelo.getValueAt(filaSeleccionada, 0);
           String nombreMateria=(String)modelo.getValueAt(filaSeleccionada, 1);
           int anio=(int) modelo.getValueAt(filaSeleccionada, 2);
           Materia m=new Materia(idMateria,nombreMateria,anio,true);
           
           Inscripcion i =new Inscripcion(a,m,0);
           inscData.guardarInscripcion(i);
           borrarFilaTabla();
        }
     
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBAInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAInscribirActionPerformed
        int filaSeleccionada=jtMaterias.getSelectedRow();
        if (filaSeleccionada==-1) {
            Alumno a=(Alumno) cboxAlumno.getSelectedItem();
            int idMateria= (Integer) modelo.getValueAt(filaSeleccionada, 0);
            
            //inscData.borrarInscripcion(a.getIdAlumno(), idMateria);
            borrarFilaTabla();
        }
    }//GEN-LAST:event_jBAInscribirActionPerformed

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSalirActionPerformed

private void cargarAlumnos(){
    for(Alumno item:listaA){
        cboxAlumno.addItem(item);
    }
}
private void armarCabecera(){
    ArrayList<Object> filaCabecera=new  ArrayList<>();
    filaCabecera.add("Id");
    filaCabecera.add("Nombre");
    filaCabecera.add("Año");
    for (Object it: filaCabecera) {
        modelo.addColumn(it);
    }
    jtMaterias.setModel(modelo);
}

private void borrarFilaTabla(){
    int indice= modelo.getRowCount()-1;
    for (int i=indice;i>=0;i--) {
        modelo.removeRow(i);
    }
    
}

private void cargaDatosNoInscriptas(){
    //borrarFilasTabla();
    Alumno selec=(Alumno)cboxAlumno.getSelectedItem();
    listaM=inscData.obtenerMateriasNoCursadas(selec.getIdAlumno());
    
    for (Materia m: listaM) {
        modelo.addRow(new Object[ ] {m.getIdMateria(), m.getNombre(),m.getAnioMateria()});
    }
}
private void cargaDatosInscriptas(){
    //borrarFilasTabla();
    Alumno selec=(Alumno)cboxAlumno.getSelectedItem();
    List<Materia> lista = inscData.obtenerMateriasCursadas(selec.getIdAlumno());
    
    for (Materia m: listaM) {
        modelo.addRow(new Object[ ] {m.getIdMateria(), m.getNombre(),m.getAnioMateria()});
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSalir;
    private javax.swing.JComboBox<Alumno> cboxAlumno;
    private javax.swing.JButton jBAInscribir;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtMaterias;
    private javax.swing.JRadioButton radioInscriptas;
    private javax.swing.JRadioButton radioNoInscriptas;
    // End of variables declaration//GEN-END:variables
}
