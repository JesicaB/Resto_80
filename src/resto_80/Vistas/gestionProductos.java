/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto_80.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import resto_80.Datos.ProductoD;
import resto_80.Entidades.Producto;

/**
 *
 * @author nicop
 */
public class gestionProductos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {

            return false;
        }

    };

    public gestionProductos() {
        initComponents();
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

        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTidproducto = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTStock = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jTPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jRActivo = new javax.swing.JRadioButton();
        jRInactivo = new javax.swing.JRadioButton();
        jTBusqueda = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTextField3.setText("jTextField3");

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("GESTION DE PRODUCTOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID PRODUCTO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("STOCK");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("ESTADO");

        jTidproducto.setEnabled(false);

        jTNombre.setEnabled(false);

        jTStock.setEnabled(false);

        jBBuscar.setText("BUSCAR");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBNuevo.setText("NUEVO");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jTPrecio.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("PRECIO");

        jBGuardar.setText("GUARDAR");
        jBGuardar.setEnabled(false);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
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

        jTBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBusquedaKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("BUSQUEDA");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBGuardar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(103, 103, 103)
                                    .addComponent(jRActivo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRInactivo))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBNuevo)
                                .addGap(308, 308, 308))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(132, 132, 132))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBBuscar)
                                .addGap(38, 38, 38))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRActivo)
                        .addComponent(jRInactivo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jBBuscar)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        ProductoD proD = new ProductoD();
        Producto pro = new Producto();

        if (jTidproducto.getText().equalsIgnoreCase("")) {

            if (jTNombre.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo NOMBRE");
            } else if (jTStock.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo STOCK");
            } else if (jTPrecio.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo PRECIO");
            } else if ((jRActivo.isSelected() == false) && ((jRInactivo.isSelected() == false))) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo ESTADO");
            } else {

                pro.setNombre(jTNombre.getText());
                pro.setStock(Integer.parseInt(jTStock.getText()));
                pro.setPrecio(Integer.parseInt(jTPrecio.getText()));
                if (jRActivo.isSelected()) {
                    pro.setEstado(true);

                } else {
                    pro.setEstado(false);
                }
                proD.agregarProducto(pro);

                jTidproducto.setText(pro.getIdProducto() + "");
            }

        } else {

            pro.setNombre(jTNombre.getText());
            pro.setStock(Integer.parseInt(jTStock.getText()));
            pro.setPrecio(Double.parseDouble(jTPrecio.getText()));

            pro.setIdProducto(Integer.parseInt(jTidproducto.getText()));

            if (jRActivo.isSelected()) {
                pro.setEstado(true);

            } else {
                pro.setEstado(false);
            }

            proD.modificarProducto(pro);

        }
        jTBusqueda.setText("");
        borrarFila();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jRActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRActivoActionPerformed
        jRInactivo.setSelected(false);
    }//GEN-LAST:event_jRActivoActionPerformed

    private void jRInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRInactivoActionPerformed
        jRActivo.setSelected(false);
    }//GEN-LAST:event_jRInactivoActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        jTNombre.setEnabled(true);
        jTPrecio.setEnabled(true);
        jTStock.setEnabled(true);
        jBGuardar.setEnabled(true);
        jRActivo.setEnabled(true);
        jRInactivo.setEnabled(true);

        jTNombre.setText("");
        jTidproducto.setText("");
        jTStock.setText("");
        jTPrecio.setText("");
        jRActivo.setSelected(false);
        jRInactivo.setSelected(false);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        try {
            jTNombre.setEnabled(false);
            jTNombre.setText("");
            jTStock.setEnabled(false);
            jTStock.setText("");
            jTPrecio.setEnabled(false);
            jTPrecio.setText("");
            jRInactivo.setEnabled(false);
            jRInactivo.setSelected(false);
            jRActivo.setEnabled(false);
            jRActivo.setSelected(false);

            ProductoD proD = new ProductoD();

            Producto pro = proD.buscarProducto(Integer.parseInt(jTidproducto.getText()));

            jTNombre.setText(pro.getNombre());
            jTStock.setText(pro.getStock() + "");
            jTPrecio.setText(pro.getPrecio() + "");
            if (pro.isEstado() == true) {
                jRActivo.setSelected(true);
                jRInactivo.setSelected(false);
            } else {
                jRInactivo.setSelected(true);
                jRActivo.setSelected(false);
            }

            jTNombre.setEnabled(true);
            jTPrecio.setEnabled(true);
            jTStock.setEnabled(true);
            jRInactivo.setEnabled(true);
            jRActivo.setEnabled(true);
            jBGuardar.setEnabled(true);

        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros.");
            jTidproducto.setText("");
        } catch (NullPointerException x) {
            jTidproducto.setText("");
        }

    }//GEN-LAST:event_jBBuscarActionPerformed


    private void jTBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBusquedaKeyReleased
        ProductoD proD = new ProductoD();
        ArrayList<Producto> lista = proD.listarProductos();
        borrarFila();

        for (Producto prod : lista) {

            if (prod.getNombre().startsWith(jTBusqueda.getText())) {
                modelo.addRow(new Object[]{
                    prod.getIdProducto(), prod.getNombre()}
                );
            }

        }


    }//GEN-LAST:event_jTBusquedaKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        jTNombre.setEnabled(false);
        jTNombre.setText("");
        jTStock.setEnabled(false);
        jTStock.setText("");
        jTPrecio.setEnabled(false);
        jTPrecio.setText("");
        jRInactivo.setEnabled(false);
        jRInactivo.setSelected(false);
        jRActivo.setEnabled(false);
        jRActivo.setSelected(false);

        int id = 0;
        int filaSeleccionada = jTable1.getSelectedRow();

        if (filaSeleccionada != -1) {

            id = (Integer) jTable1.getValueAt(filaSeleccionada, 0);
        }

        ProductoD proD = new ProductoD();

        Producto pro = proD.buscarProducto(id);

        jTidproducto.setText(pro.getIdProducto() + "");
        jTNombre.setText(pro.getNombre());
        jTStock.setText(pro.getStock() + "");
        jTPrecio.setText(pro.getPrecio() + "");

        if (pro.isEstado() == true) {
            jRActivo.setSelected(true);
            jRInactivo.setSelected(false);
        } else {
            jRInactivo.setSelected(true);
            jRActivo.setSelected(false);
        }

        jTNombre.setEnabled(true);
        jTPrecio.setEnabled(true);
        jTStock.setEnabled(true);
        jRInactivo.setEnabled(true);
        jRActivo.setEnabled(true);
        jBGuardar.setEnabled(true);


    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRActivo;
    private javax.swing.JRadioButton jRInactivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBusqueda;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTextField jTStock;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTidproducto;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("ID Producto");
        modelo.addColumn("Nombre");

        jTable1.setModel(modelo);

    }

    private void borrarFila() {

        int f = jTable1.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }

    }

}
