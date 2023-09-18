package universidadgrupo51.views;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo51.accesoAdatos.AlumnoData;
import universidadgrupo51.accesoAdatos.InscripcionData;
import universidadgrupo51.accesoAdatos.MateriaData;
import universidadgrupo51.entidades.Alumno;
import universidadgrupo51.entidades.Inscripcion;
import universidadgrupo51.entidades.Materia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class GestionInscripcionesView extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int f, int c){ //para hacer que las celdas no sean editables
            return false;
        }
    };
    private Alumno alumnoSeleccionado;
    private InscripcionData insData = new InscripcionData();
    private MateriaData matData = new MateriaData();
    
    /**
     * Creates new form GestionInscripcionesView
     */
    public GestionInscripcionesView() {
        initComponents();
        cargarCombo();
        armarCabecera();
        
        // Seteo de ancho ce columna de la tabla jtbMaterias y resto mas chico
        jtbMaterias.getColumnModel().getColumn(0).setPreferredWidth(5);
        jtbMaterias.getColumnModel().getColumn(1).setPreferredWidth(300);
        jtbMaterias.getColumnModel().getColumn(2).setPreferredWidth(10);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotonesMatInscriptas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jrdbtnMatCursadas = new javax.swing.JRadioButton();
        jrdbtnMatNoCursadas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbMaterias = new javax.swing.JTable();
        jbtnInscribir = new javax.swing.JButton();
        jbtnBorrarInscripcion = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jcbListaAlumnos = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Gestion de Inscripciones");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inscripciones");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione un Alumno:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado de Materias");

        GrupoBotonesMatInscriptas.add(jrdbtnMatCursadas);
        jrdbtnMatCursadas.setText("Materias Inscriptas");
        jrdbtnMatCursadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdbtnMatCursadasActionPerformed(evt);
            }
        });

        GrupoBotonesMatInscriptas.add(jrdbtnMatNoCursadas);
        jrdbtnMatNoCursadas.setText("Materias no Inscriptas");
        jrdbtnMatNoCursadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdbtnMatNoCursadasActionPerformed(evt);
            }
        });

        jtbMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtbMaterias);

        jbtnInscribir.setText("Inscribir");
        jbtnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInscribirActionPerformed(evt);
            }
        });

        jbtnBorrarInscripcion.setText("Borrar Inscripcion");
        jbtnBorrarInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarInscripcionActionPerformed(evt);
            }
        });

        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jcbListaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnInscribir)
                                .addGap(96, 96, 96)
                                .addComponent(jbtnBorrarInscripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel3)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jrdbtnMatCursadas)
                .addGap(18, 18, 18)
                .addComponent(jrdbtnMatNoCursadas)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrdbtnMatNoCursadas)
                    .addComponent(jrdbtnMatCursadas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnInscribir)
                    .addComponent(jbtnBorrarInscripcion)
                    .addComponent(jbtnSalir))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaAlumnosActionPerformed
        // TODO add your handling code here:
        if (jrdbtnMatNoCursadas.isSelected() || jrdbtnMatCursadas.isSelected()) {
            borrarFilas();
        }
        GrupoBotonesMatInscriptas.clearSelection(); // limpia la selección de materias cursadas/no cursadas
        alumnoSeleccionado = (Alumno)jcbListaAlumnos.getSelectedItem();
    }//GEN-LAST:event_jcbListaAlumnosActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jrdbtnMatNoCursadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdbtnMatNoCursadasActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        if (jrdbtnMatNoCursadas.isSelected()) {
            List<Materia> materiasNoCursadas = insData.obtenerMateriasNoCursadas(alumnoSeleccionado.getIdAlumno());
            for (Materia materia : materiasNoCursadas) {
                modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
            }
        }
    }//GEN-LAST:event_jrdbtnMatNoCursadasActionPerformed

    private void jrdbtnMatCursadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdbtnMatCursadasActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        if (jrdbtnMatCursadas.isSelected()) {
            List<Materia> materiasCursadas = insData.obtenerMateriasCursadas(alumnoSeleccionado.getIdAlumno());
            for (Materia materia : materiasCursadas) {
                modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
            }
        }
    }//GEN-LAST:event_jrdbtnMatCursadasActionPerformed

    private void jbtnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInscribirActionPerformed
        // TODO add your handling code here:
        if (jtbMaterias.getSelectedRow() != -1 && jcbListaAlumnos.getSelectedItem() != null && jrdbtnMatNoCursadas.isSelected()) {
            
            alumnoSeleccionado = (Alumno)jcbListaAlumnos.getSelectedItem();
            
            int idMateriaSeleccionada = (Integer)jtbMaterias.getValueAt(jtbMaterias.getSelectedRow(), 0);
            
            Materia materiaSeleccionada = matData.buscarMateria(idMateriaSeleccionada);
            
            Inscripcion inscripcion = new Inscripcion(alumnoSeleccionado, materiaSeleccionada, 0.0);
            insData.guardarInscripcion(inscripcion);
            
            borrarFilas();
            if (jrdbtnMatNoCursadas.isSelected()) {
                List<Materia> materiasNoCursadas = insData.obtenerMateriasNoCursadas(alumnoSeleccionado.getIdAlumno());
                for (Materia materia : materiasNoCursadas) {
                    modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
                }
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Alumno y una Materia no Inscripta para Inscribir");
        }
    }//GEN-LAST:event_jbtnInscribirActionPerformed

    private void jbtnBorrarInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarInscripcionActionPerformed
        // TODO add your handling code here:
        if (jtbMaterias.getSelectedRow() != -1 && jcbListaAlumnos.getSelectedItem() != null && jrdbtnMatCursadas.isSelected()) {
        
            alumnoSeleccionado = (Alumno)jcbListaAlumnos.getSelectedItem();
            int idAlumnoSeleccionado = alumnoSeleccionado.getIdAlumno();
            int idMateriaSeleccionada = (Integer)jtbMaterias.getValueAt(jtbMaterias.getSelectedRow(), 0);
        
            insData.borrarInscripcionMateriaAlumno(idAlumnoSeleccionado, idMateriaSeleccionada);
            
            borrarFilas();
            if (jrdbtnMatCursadas.isSelected()) {
                List<Materia> materiasCursadas = insData.obtenerMateriasCursadas(alumnoSeleccionado.getIdAlumno());
                for (Materia materia : materiasCursadas) {
                    modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Alumno y una Materia Inscripta para Borrar Inscripción");
        }
    }//GEN-LAST:event_jbtnBorrarInscripcionActionPerformed
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBotonesMatInscriptas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBorrarInscripcion;
    private javax.swing.JButton jbtnInscribir;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox<Alumno> jcbListaAlumnos;
    private javax.swing.JRadioButton jrdbtnMatCursadas;
    private javax.swing.JRadioButton jrdbtnMatNoCursadas;
    private javax.swing.JTable jtbMaterias;
    // End of variables declaration//GEN-END:variables
    
    private void cargarCombo() {
        jcbListaAlumnos.removeAllItems();
        AlumnoData aluData = new AlumnoData();
        List<Alumno> alumnos = aluData.listarAlumnos();
        for (Alumno alumno : alumnos) {
            jcbListaAlumnos.addItem(alumno);
        }
    }

    private void armarCabecera(){
        modelo.addColumn("ID");
        modelo.addColumn("Materia");
        modelo.addColumn("Año");
        jtbMaterias.setModel(modelo); //no olvidar tildar la propiedad de ventana cerrable
    }
    
    private void borrarFilas(){
        int f = jtbMaterias.getRowCount()- 1; //me permite saber la cantidad de filas que tiene la tabla
        for (; f >= 0; f--) { //f comienza en la cantidad de filas de mi tabla (lo tengo en la linea anterior)
            modelo.removeRow(f);
        }
    }
}
