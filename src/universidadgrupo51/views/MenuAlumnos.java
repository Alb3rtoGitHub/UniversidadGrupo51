/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo51.views;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidadgrupo51.accesoAdatos.AlumnoData;
import universidadgrupo51.entidades.Alumno;

/**
 *
 * @author Nico
 */
public class MenuAlumnos extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuAlumnos
     */
    public MenuAlumnos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botonNuevo = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jtfDni = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        botonBuscar = new javax.swing.JButton();
        estadoActivo = new javax.swing.JRadioButton();
        estadoNoActivo = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Gestión de Alumnos");

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo.setText("Alumno");
        titulo.setToolTipText("");

        jLabel2.setText("Documento: ");

        jLabel3.setText("Apellido: ");

        jLabel4.setText("Nombre: ");

        jLabel5.setText("Estado: ");

        jLabel6.setText("Fecha de Nacimiento: ");

        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        grupoBotones.add(estadoActivo);
        estadoActivo.setText("Activo");

        grupoBotones.add(estadoNoActivo);
        estadoNoActivo.setText("No Activo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(estadoActivo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(estadoNoActivo))
                                    .addComponent(jtfNombre)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jtfApellido))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(botonGuardar)
                        .addGap(17, 17, 17)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonSalir)
                    .addComponent(botonBuscar))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(estadoActivo)
                    .addComponent(estadoNoActivo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevo)
                    .addComponent(botonEliminar)
                    .addComponent(botonSalir)
                    .addComponent(botonGuardar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        
        jtfApellido.setEditable(true);
        jtfNombre.setEditable(true);
        fechaNacimiento.setEnabled(true);
        botonGuardar.setEnabled(true);
        
        
        jtfDni.setText("");
        jtfApellido.setText("");
        jtfNombre.setText("");
        grupoBotones.clearSelection();
        fechaNacimiento.setDate(null);
        
        
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        
        
        if(jtfDni.getText()!=null){
            
            Alumno alumno=new Alumno();
            AlumnoData alumnoData=new AlumnoData();

            alumno= alumnoData.buscarAlumnoPorDNI(Integer.parseInt(jtfDni.getText()));

            //Cambiar valores
            jtfApellido.setText(alumno.getApellido());
            jtfNombre.setText(alumno.getNombre());
            fechaNacimiento.setDate(Date.valueOf(alumno.getFechaNacimiento()));
            if(alumno.isEstado()==true){
                grupoBotones.setSelected(estadoActivo.getModel(), true);
            }else{
                grupoBotones.setSelected(estadoNoActivo.getModel(), true);
            }
            
            //No poder editar
            jtfApellido.setEditable(false);
            jtfNombre.setEditable(false);
            fechaNacimiento.setEnabled(false);
            botonGuardar.setEnabled(false);
            
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar un dni");
        }
        
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        
        try{
        int dni=Integer.parseInt(jtfDni.getText());
        String apellido=jtfApellido.getText();
        String nombre=jtfNombre.getText();
        LocalDate fechaN = fechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        boolean estado=false;
        if(grupoBotones.isSelected(estadoActivo.getModel())){
            estado=true;
        }
        
        Alumno alumno=new Alumno(dni,apellido,nombre,fechaN,estado);
        
        AlumnoData alumnoData= new AlumnoData();
        
        alumnoData.guardarAlumno(alumno);
        
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero de DNI sin puntos ni coma");
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Debe completar los campos nombre,apellido y fecha valido");
        }
        
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        
        int dniLeido = Integer.parseInt(jtfDni.getText());
        AlumnoData alumnoData= new AlumnoData();
        Alumno alumnoBuscado = alumnoData.buscarAlumnoPorDNI(dniLeido);
        alumnoData.eliminarAlumno(alumnoBuscado.getIdAlumno());
        
    }//GEN-LAST:event_botonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JRadioButton estadoActivo;
    private javax.swing.JRadioButton estadoNoActivo;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
