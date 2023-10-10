package resto_80.Vistas;


import javax.swing.JOptionPane;
import resto_80.Datos.EmpleadoD;
import resto_80.Entidades.Empleado;

public class gestionEmpleados extends javax.swing.JInternalFrame {

    public gestionEmpleados() {
        initComponents();
        
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
        jTidEmpleado = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTDNI = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jRActivo = new javax.swing.JRadioButton();
        jRInactivo = new javax.swing.JRadioButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel1.setText("GESTION DE EMPLEADOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID EMPLEADO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE Y APELLIDO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DNI");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("ESTADO");

        jTidEmpleado.setEnabled(false);
        jTidEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidEmpleadoActionPerformed(evt);
            }
        });

        jTNombre.setEnabled(false);
        jTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNombreKeyTyped(evt);
            }
        });

        jBBuscar.setText("BUSCAR");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBGuardar.setText("GUARDAR");
        jBGuardar.setEnabled(false);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBNuevo.setText("NUEVO");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jRActivo.setText("ACTIVO");
        jRActivo.setEnabled(false);
        jRActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRActivoActionPerformed(evt);
            }
        });

        jRInactivo.setText("INACTIVO");
        jRInactivo.setEnabled(false);
        jRInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRInactivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTidEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jBBuscar)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRActivo)
                        .addGap(18, 18, 18)
                        .addComponent(jRInactivo)
                        .addGap(150, 150, 150))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jBNuevo)
                .addGap(39, 39, 39)
                .addComponent(jBGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar)
                    .addComponent(jLabel4)
                    .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTidEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRActivo)
                    .addComponent(jRInactivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTidEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidEmpleadoActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        try {
            EmpleadoD empD = new EmpleadoD();

            if (Integer.parseInt(jTDNI.getText()) < 7 && Integer.parseInt(jTDNI.getText()) > 8) {

                JOptionPane.showMessageDialog(null, "Verificar el DNI ingresado");
            } else {

                Empleado empleado = empD.buscarEmpleado(Integer.parseInt(jTDNI.getText()));

                jTidEmpleado.setText(empleado.getIdEmpleado() + "");

                jTNombre.setText(empleado.getNombre_apellido());

                if (empleado.isEstado() == true) {
                    jRActivo.setSelected(true);
                    jRInactivo.setSelected(false);
                } else {
                    jRInactivo.setSelected(true);
                    jRActivo.setSelected(false);
                }

                jTNombre.setEnabled(true);
                jRInactivo.setEnabled(true);
                jRActivo.setEnabled(true);
                jBGuardar.setEnabled(true);
            }
        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros sin puntos.");
        }

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        EmpleadoD empD = new EmpleadoD();
        Empleado emp = new Empleado();

        if (jTidEmpleado.getText().equalsIgnoreCase("")) {

            emp.setDni(Integer.parseInt(jTDNI.getText()));
            emp.setNombre_apellido(jTNombre.getText());
            if (jRActivo.isSelected()) {
                emp.setEstado(true);

            } else {
                emp.setEstado(false);
            }

            empD.agregarEmpleado(emp);

            jTidEmpleado.setText(emp.getIdEmpleado() + "");

        } else {

            emp.setDni(Integer.parseInt(jTDNI.getText()));
            emp.setIdEmpleado(Integer.parseInt(jTidEmpleado.getText()));
            emp.setNombre_apellido(jTNombre.getText());
            if (jRActivo.isSelected()) {
                emp.setEstado(true);

            } else {
                emp.setEstado(false);
            }

            empD.modificarEmpleado(emp);

        }


    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed

        jTNombre.setEnabled(true);
        jBGuardar.setEnabled(true);
        jRActivo.setEnabled(true);
        jRInactivo.setEnabled(true);

        jTDNI.setText("");
        jTidEmpleado.setText("");
        jTNombre.setText("");
        jRActivo.setSelected(false);
        jRInactivo.setSelected(false);


    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jRActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRActivoActionPerformed
        jRInactivo.setSelected(false);
    }//GEN-LAST:event_jRActivoActionPerformed

    private void jRInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRInactivoActionPerformed
        jRActivo.setSelected(false);
    }//GEN-LAST:event_jRInactivoActionPerformed

    private void jTNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreKeyTyped
        
    }//GEN-LAST:event_jTNombreKeyTyped


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
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTidEmpleado;
    // End of variables declaration//GEN-END:variables
}
