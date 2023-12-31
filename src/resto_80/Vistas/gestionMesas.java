/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto_80.Vistas;

import java.awt.Color;
import javax.swing.JOptionPane;
import resto_80.Datos.MesaD;
import resto_80.Entidades.Mesa;

/**
 *
 * @author nicop
 */
public class gestionMesas extends javax.swing.JInternalFrame {

    /**
     * Creates new form gestionMesas
     */
    public gestionMesas() {
        initComponents();
        this.getContentPane().setBackground(Color.orange);
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
        jLabel5 = new javax.swing.JLabel();
        jTidMesa = new javax.swing.JTextField();
        jTNumMesa = new javax.swing.JTextField();
        jTCapacidad = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jRInactivo = new javax.swing.JRadioButton();
        jRActivo = new javax.swing.JRadioButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("GESTION DE MESAS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID MESA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("N° MESA");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("CAPACIDAD");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("ESTADO");

        jTidMesa.setEnabled(false);

        jTCapacidad.setEnabled(false);

        jBBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBBuscar.setText("BUSCAR");
        jBBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBGuardar.setText("GUARDAR");
        jBGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBGuardar.setEnabled(false);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBNuevo.setText("NUEVO");
        jBNuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jRInactivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRInactivo.setText("INACTIVO");
        jRInactivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jRInactivo.setEnabled(false);
        jRInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRInactivoActionPerformed(evt);
            }
        });

        jRActivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRActivo.setText("ACTIVO");
        jRActivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jRActivo.setEnabled(false);
        jRActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRActivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTidMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTNumMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(77, 77, 77)
                .addComponent(jBBuscar)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBNuevo)
                        .addGap(41, 41, 41)
                        .addComponent(jBGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRActivo)
                        .addGap(18, 18, 18)
                        .addComponent(jRInactivo))
                    .addComponent(jLabel1))
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar)
                    .addComponent(jTNumMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTidMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRActivo)
                    .addComponent(jRInactivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
      
        try {
            jTCapacidad.setEnabled(false);
            jTCapacidad.setText("");
            jTidMesa.setText("");
            jRInactivo.setEnabled(false);
            jRInactivo.setSelected(false);
            jRActivo.setEnabled(false);
            jRActivo.setSelected(false);

            MesaD mesaD = new MesaD();

            Mesa mesa = mesaD.buscarMesaXNumero(Integer.parseInt(jTNumMesa.getText()));

            jTidMesa.setText(mesa.getIdMesa() + "");

            jTCapacidad.setText(mesa.getCapacidad()+"");

            if (mesa.isEstado() == true) {
                jRActivo.setSelected(true);
                jRInactivo.setSelected(false);
            } else {
                jRInactivo.setSelected(true);
                jRActivo.setSelected(false);
            }

            jTCapacidad.setEnabled(true);
            jRInactivo.setEnabled(true);
            jRActivo.setEnabled(true);
            jBGuardar.setEnabled(true);

        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            jTNumMesa.setText("");
        } catch (NullPointerException x) {
            jTNumMesa.setText("");
        }
        
        
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
       
       MesaD mesaD = new MesaD();
        Mesa mesa = new Mesa();

        if (jTidMesa.getText().equalsIgnoreCase("")) {

            if (jTNumMesa.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo NUMERO DE MESA");

            } else if (jTCapacidad.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo CAPACIDAD");
            } else if ((jRActivo.isSelected() == false) && ((jRInactivo.isSelected() == false))) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo ESTADO");
            } else {
                mesa.setNumeroMesa(Integer.parseInt(jTNumMesa.getText()));
                mesa.setCapacidad(Integer.parseInt(jTCapacidad.getText()));
                if (jRActivo.isSelected()) {
                    mesa.setEstado(true);

                } else {
                    mesa.setEstado(false);
                }
                mesaD.agregarMesa(mesa);

                jTidMesa.setText(mesa.getIdMesa() + "");
            }

        } else {

            mesa.setNumeroMesa(Integer.parseInt(jTNumMesa.getText()));
            mesa.setIdMesa(Integer.parseInt(jTidMesa.getText()));
            mesa.setCapacidad(Integer.parseInt(jTCapacidad.getText()));
            if (jRActivo.isSelected()) {
                mesa.setEstado(true);

            } else {
                mesa.setEstado(false);
            }

            mesaD.modificarMesa(mesa);

        }

 
        
        
        
        
        
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jRInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRInactivoActionPerformed
        jRActivo.setSelected(false);
    }//GEN-LAST:event_jRInactivoActionPerformed

    private void jRActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRActivoActionPerformed
        jRInactivo.setSelected(false);
    }//GEN-LAST:event_jRActivoActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        
        jTCapacidad.setEnabled(true);
        jBGuardar.setEnabled(true);
        jRActivo.setEnabled(true);
        jRInactivo.setEnabled(true);

        jTNumMesa.setText("");
        jTidMesa.setText("");
        jTCapacidad.setText("");
        jRActivo.setSelected(false);
        jRInactivo.setSelected(false);
        
        
    }//GEN-LAST:event_jBNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRActivo;
    private javax.swing.JRadioButton jRInactivo;
    private javax.swing.JTextField jTCapacidad;
    private javax.swing.JTextField jTNumMesa;
    private javax.swing.JTextField jTidMesa;
    // End of variables declaration//GEN-END:variables
}
