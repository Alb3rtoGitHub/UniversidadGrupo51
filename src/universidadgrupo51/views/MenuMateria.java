/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo51.views;

import java.awt.Color;
import javax.swing.JOptionPane;
import universidadgrupo51.accesoAdatos.MateriaData;
import universidadgrupo51.entidades.Materia;

/**
 *
 * @author tobal
 */
public class MenuMateria extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuMateria
     */
    public MenuMateria() {
        initComponents();
        getContentPane().setBackground(new Color(112, 194, 174));
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codigoMateria = new javax.swing.JTextField();
        nombreMateria = new javax.swing.JTextField();
        anioMateria = new javax.swing.JTextField();
        jbtnBuscar = new javax.swing.JButton();
        nuevoBoton = new javax.swing.JButton();
        guardarBoton = new javax.swing.JButton();
        eliminarBoton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        buscadorMateria = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Gestión de Materias");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Materia");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Año:");

        codigoMateria.setEditable(false);
        codigoMateria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        codigoMateria.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        codigoMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        nombreMateria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombreMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreMateriaActionPerformed(evt);
            }
        });

        anioMateria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        anioMateria.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jbtnBuscar.setText("Buscar");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        nuevoBoton.setText("Nuevo");
        nuevoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoBotonActionPerformed(evt);
            }
        });

        guardarBoton.setText("Guardar");
        guardarBoton.setToolTipText("");
        guardarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBotonActionPerformed(evt);
            }
        });

        eliminarBoton.setText("Eliminar");
        eliminarBoton.setEnabled(false);
        eliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBotonActionPerformed(evt);
            }
        });

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        buscadorMateria.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        buscadorMateria.setForeground(java.awt.Color.gray);
        buscadorMateria.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        buscadorMateria.setText("Código");
        buscadorMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        buscadorMateria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                buscadorMateriaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                buscadorMateriaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(anioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(codigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buscadorMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(eliminarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nombreMateria)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(nuevoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(guardarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscar)
                    .addComponent(buscadorMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Boton Exit
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void nuevoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoBotonActionPerformed
        codigoMateria.setText("");
        nombreMateria.setText("");
        anioMateria.setText("");
        eliminarBoton.setEnabled(false);
    }//GEN-LAST:event_nuevoBotonActionPerformed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        // TODO add your handling code here:
        MateriaData matData = new MateriaData();
        Materia mat = new Materia();
        
        // 18/9 Try Catch agregado para evitar si ingreso vacio o letra y evitar cuando traiga una materia que no existe mat = null
        
        try {
                mat = matData.buscarMateria(Integer.valueOf(buscadorMateria.getText()));
                    codigoMateria.setText(String.valueOf(mat.getIdMateria()));
                    nombreMateria.setText(mat.getNombre());
                    anioMateria.setText(String.valueOf(mat.getAnio()));
                    buscadorMateria.setText("");
                    colocarPlaceholder(buscadorMateria,"Código");
                    eliminarBoton.setEnabled(true);
        } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un codigo de materia para buscar.");
        } catch (NullPointerException npe){
            buscadorMateria.setText("");
            colocarPlaceholder (buscadorMateria,"Código");
            codigoMateria.setText("");
            nombreMateria.setText("");
            anioMateria.setText("");
            
        }
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void eliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBotonActionPerformed
        // TODO add your handling code here:
        int materiaID;
        MateriaData matData = new MateriaData();
        
        // 18/9 Try Catch agregado para campo codigo vacio si no elimino nada y boton Eliminar esta disponible

        try {
            materiaID = Integer.valueOf(codigoMateria.getText());
            matData.eliminarMateria(materiaID);
            codigoMateria.setText("");
            nombreMateria.setText("");
            anioMateria.setText("");
        } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un codigo de materia para Eliminar.");
        }



    }//GEN-LAST:event_eliminarBotonActionPerformed

    private void guardarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBotonActionPerformed
        Materia mat = new Materia();
        MateriaData matData = new MateriaData();
        // Función Guardar Nuevo:
        if ("".equals(codigoMateria.getText())){
            if (!"".equals(nombreMateria.getText())){
                mat.setNombre(nombreMateria.getText());
                if (!"".equals(anioMateria.getText())){
                    try{
                        mat.setAnio(Integer.valueOf(anioMateria.getText()));
                        mat.setEstado(true);
                        matData.guardarMateria(mat);
                        codigoMateria.setText("");
                        nombreMateria.setText("");
                        anioMateria.setText("");
                    }
                    catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "El Año debe ser un entero.");
                    }
                    
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Debe ingresar el año de la materia.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Debe ingresar el nombre de la materia.");
            }
        }
        //Modifica Existente
        else{
            if (!"".equals(nombreMateria.getText())){
                mat.setNombre(nombreMateria.getText());
                if (!"".equals(anioMateria.getText())){
                    try{ 
                        mat.setAnio(Integer.valueOf(anioMateria.getText()));
                        mat.setEstado(true);
                        mat.setIdMateria(Integer.valueOf(codigoMateria.getText()));
                        matData.modificarMateria(mat);
                    }
                    catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "El Año debe ser un entero.");

                        mat = matData.buscarMateria(Integer.valueOf(codigoMateria.getText()));
                        codigoMateria.setText(String.valueOf(mat.getIdMateria()));
                        nombreMateria.setText(mat.getNombre());
                        anioMateria.setText(String.valueOf(mat.getAnio()));
                        buscadorMateria.setText("");

                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Debe ingresar el año de la materia.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Debe ingresar el nombre de la materia.");
            }   
        }
        
        
    }//GEN-LAST:event_guardarBotonActionPerformed

    private void nombreMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMateriaActionPerformed

    private void buscadorMateriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscadorMateriaFocusGained
        // TODO add your handling code here:
        quitarPlaceholder(buscadorMateria,"Código");
    }//GEN-LAST:event_buscadorMateriaFocusGained

    private void buscadorMateriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscadorMateriaFocusLost
        // TODO add your handling code here:
        colocarPlaceholder (buscadorMateria,"Código");
    }//GEN-LAST:event_buscadorMateriaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anioMateria;
    private javax.swing.JTextField buscadorMateria;
    private javax.swing.JTextField codigoMateria;
    private javax.swing.JButton eliminarBoton;
    private javax.swing.JButton guardarBoton;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JTextField nombreMateria;
    private javax.swing.JButton nuevoBoton;
    // End of variables declaration//GEN-END:variables
 
    private void quitarPlaceholder (javax.swing.JTextField textField,String str){
        if (textField.getText().equals(str)) {
            textField.setText("");
            textField.setForeground(Color.BLACK);
        }
    }
    private void colocarPlaceholder (javax.swing.JTextField textField,String str){
        if (textField.getText().isEmpty()) {
            textField.setText(str);
            textField.setForeground(Color.GRAY);
        }
    }
    
}
