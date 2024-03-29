
package universidadgrupo51.views;

import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidadgrupo51.accesoAdatos.AlumnoData;
import universidadgrupo51.entidades.Alumno;


public class MenuAlumnos extends javax.swing.JInternalFrame {

    
    public MenuAlumnos() {
        initComponents();
        getContentPane().setBackground(new Color(112, 194, 174));
    }

    
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
        botonBuscarId = new javax.swing.JButton();
        estadoActivo = new javax.swing.JRadioButton();
        estadoNoActivo = new javax.swing.JRadioButton();
        botonModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        botonBuscarDni = new javax.swing.JButton();

        setClosable(true);
        setTitle("Gestión de Alumnos");

        titulo.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Alumno");
        titulo.setToolTipText("");
        titulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jtfDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfDniMouseClicked(evt);
            }
        });

        botonBuscarId.setText("Buscar");
        botonBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarIdActionPerformed(evt);
            }
        });

        grupoBotones.add(estadoActivo);
        estadoActivo.setText("Activo");

        grupoBotones.add(estadoNoActivo);
        estadoNoActivo.setText("No Activo");

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jtfId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfIdMouseClicked(evt);
            }
        });

        botonBuscarDni.setText("Buscar");
        botonBuscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarDniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonSalir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonBuscarId))
                            .addComponent(jtfDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(estadoActivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(estadoNoActivo)))
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscarDni)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscarId))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscarDni)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(estadoActivo)
                        .addComponent(estadoNoActivo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevo)
                    .addComponent(botonEliminar)
                    .addComponent(botonModificar)
                    .addComponent(botonGuardar)
                    .addComponent(botonSalir))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        
        //borrar los datos
        jtfId.setText("");
        jtfDni.setText("");
        jtfApellido.setText("");
        jtfNombre.setText("");
        grupoBotones.clearSelection();
        fechaNacimiento.setDate(null);
        
    }//GEN-LAST:event_botonNuevoActionPerformed

    
    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_botonSalirActionPerformed

    
    private void botonBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarIdActionPerformed
       
        try{
            
            Alumno alumno=new Alumno();
            AlumnoData alumnoData=new AlumnoData();
            
            alumno = alumnoData.buscarAlumno(Integer.parseInt(jtfId.getText()));
                
            //Cambiar valores
            jtfDni.setText(String.valueOf(alumno.getDni()));
            jtfApellido.setText(alumno.getApellido());
            jtfNombre.setText(alumno.getNombre());
            fechaNacimiento.setDate(Date.valueOf(alumno.getFechaNacimiento()));
            if(alumno.isEstado()==true){
                grupoBotones.setSelected(estadoActivo.getModel(), true);
            }else{
                grupoBotones.setSelected(estadoNoActivo.getModel(), true);
            }
                
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero de dni o id valido");
            
        }catch(NullPointerException ex){
            //borrar los datos
            jtfId.setText("");
            jtfDni.setText("");
            jtfApellido.setText("");
            jtfNombre.setText("");
            grupoBotones.clearSelection();
            fechaNacimiento.setDate(null);
        }
       
    }//GEN-LAST:event_botonBuscarIdActionPerformed

    
    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        
        try{
            
            int dni=Integer.parseInt(jtfDni.getText());
            String apellido=jtfApellido.getText();
            String nombre=jtfNombre.getText();
            LocalDate fechaN = fechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            boolean estado=true;
            if(grupoBotones.isSelected(estadoNoActivo.getModel())){
                estado=false;
            }

            Alumno alumno=new Alumno(dni,apellido,nombre,fechaN,estado);

            AlumnoData alumnoData= new AlumnoData();

            alumnoData.guardarAlumno(alumno);
        
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero de DNI sin puntos ni coma");
            jtfDni.setText("");
            
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Debe completar los campos nombre,apellido,estado y fecha de nacimiento");
        }
        
    }//GEN-LAST:event_botonGuardarActionPerformed

    
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        
        try{
            
            int dniLeido = Integer.parseInt(jtfDni.getText());
            AlumnoData alumnoData= new AlumnoData();
            Alumno alumnoBuscado = alumnoData.buscarAlumnoPorDNI(dniLeido);
            alumnoData.eliminarAlumno(alumnoBuscado.getIdAlumno());

        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero de DNI sin puntos ni coma");
            
        }catch(NullPointerException ex){
            //borrar los datos
            jtfId.setText("");
            jtfDni.setText("");
            jtfApellido.setText("");
            jtfNombre.setText("");
            grupoBotones.clearSelection();
            fechaNacimiento.setDate(null);
        }
        
    }//GEN-LAST:event_botonEliminarActionPerformed

    
    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        
        try{
            
            
            int dni=Integer.parseInt(jtfDni.getText());
            String apellido=jtfApellido.getText();
            String nombre=jtfNombre.getText();
            LocalDate fechaN = fechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            boolean estado=true;
            if(grupoBotones.isSelected(estadoActivo.getModel())){
                estado=true;
            }else if(grupoBotones.isSelected(estadoNoActivo.getModel())){
                JOptionPane.showMessageDialog(this, "Para dar de baja a un alumno utilice el boton ELIMINAR");
                grupoBotones.setSelected(estadoActivo.getModel(), true);
                return;
            }
                
            AlumnoData alumnoData= new AlumnoData();
            Alumno alu = alumnoData.buscarAlumnoPorDNI(dni);
            
            if (alu!= null) {
                int idAlumno = alu.getIdAlumno();
                Alumno alumno=new Alumno(idAlumno,dni,apellido,nombre,fechaN,estado);
                alumnoData.modificarAlumno(alumno);
            }
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero de DNI sin puntos ni coma");
            jtfDni.setText("");
            
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Debe completar los campos nombre,apellido,estado y fecha de nacimiento");
        }
        
        
    }//GEN-LAST:event_botonModificarActionPerformed

    
    private void botonBuscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarDniActionPerformed
        
        try{
            
            Alumno alumno=new Alumno();
            AlumnoData alumnoData=new AlumnoData();
                        
            alumno= alumnoData.buscarAlumnoPorDNI(Integer.parseInt(jtfDni.getText()));

            //Cambiar valores
            jtfId.setText(String.valueOf(alumno.getIdAlumno()));
            jtfApellido.setText(alumno.getApellido());
            jtfNombre.setText(alumno.getNombre());
            fechaNacimiento.setDate(Date.valueOf(alumno.getFechaNacimiento()));
            if(alumno.isEstado()==true){
                grupoBotones.setSelected(estadoActivo.getModel(), true);
            }else{
                grupoBotones.setSelected(estadoNoActivo.getModel(), true);
            }
                                
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero de dni o id valido");
            
        }catch(NullPointerException ex){
            //borrar los datos
            jtfId.setText("");
            jtfDni.setText("");
            jtfApellido.setText("");
            jtfNombre.setText("");
            grupoBotones.clearSelection();
            fechaNacimiento.setDate(null);
        }
        
    }//GEN-LAST:event_botonBuscarDniActionPerformed

    
    private void jtfIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfIdMouseClicked
        
        //borrar los datos
        jtfId.setText("");
        jtfDni.setText("");
        jtfApellido.setText("");
        jtfNombre.setText("");
        grupoBotones.clearSelection();
        fechaNacimiento.setDate(null);
        
    }//GEN-LAST:event_jtfIdMouseClicked

    
    private void jtfDniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfDniMouseClicked
        
        //borrar los datos
        jtfId.setText("");
        jtfDni.setText("");
        jtfApellido.setText("");
        jtfNombre.setText("");
        grupoBotones.clearSelection();
        fechaNacimiento.setDate(null);
        
    }//GEN-LAST:event_jtfDniMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarDni;
    private javax.swing.JButton botonBuscarId;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JRadioButton estadoActivo;
    private javax.swing.JRadioButton estadoNoActivo;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
