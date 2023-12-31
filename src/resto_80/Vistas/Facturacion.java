/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto_80.Vistas;

import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import resto_80.Datos.MesaD;
import resto_80.Datos.PedidoD;
import resto_80.Datos.ProductoPedidoD;
import resto_80.Entidades.Mesa;
import resto_80.Entidades.Pedido;
import resto_80.Entidades.ProductoPedido;

/**
 *
 * @author nicop
 */
public class Facturacion extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {

            return false;
        }

    };
    private DefaultTableModel modelo2 = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {

            return false;
        }

    };

    /**
     * Creates new form Facturacion
     */
    public Facturacion() {
        initComponents();
        armarCabecera1();
        armarCabecera2();
        cargarMesas();
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

        jCMesa = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cobroParcial = new javax.swing.JButton();
        cobroTotal = new javax.swing.JButton();
        vovler = new javax.swing.JButton();

        jCMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMesaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MESA");

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla2);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("PEDIDOS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("DETALLE DEL PEDIDO");

        cobroParcial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cobroParcial.setText("COBRAR PEDIDO");
        cobroParcial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cobroParcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobroParcialActionPerformed(evt);
            }
        });

        cobroTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cobroTotal.setText("COBRAR TODO");
        cobroTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cobroTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobroTotalActionPerformed(evt);
            }
        });

        vovler.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vovler.setText("VOLVER");
        vovler.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vovler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vovlerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(cobroParcial)
                        .addGap(28, 28, 28)
                        .addComponent(cobroTotal)
                        .addGap(26, 26, 26)
                        .addComponent(vovler, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jLabel2)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cobroParcial)
                            .addComponent(cobroTotal)
                            .addComponent(vovler))
                        .addGap(37, 37, 37))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cobroParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobroParcialActionPerformed

        int filaselec = tabla1.getSelectedRow();

        PedidoD peD = new PedidoD();

        peD.bajaPedido(Integer.parseInt(tabla1.getValueAt(filaselec, 0) + ""));
        
        
        borrarTabla();
        borrarTabla2();
        cargarTabla();
        int pendientes=tabla1.getRowCount();
        if(pendientes==0){
              int i = Integer.parseInt(jCMesa.getSelectedItem()+"");
        MesaD md = new MesaD();
        md.altaMesa(i);
            
        }
        


    }//GEN-LAST:event_cobroParcialActionPerformed

    private void cobroTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobroTotalActionPerformed

        int filas = tabla1.getRowCount() - 1;

        for (int i = 0; i <= filas; i++) {

            PedidoD peD = new PedidoD();

            peD.bajaPedido(Integer.parseInt(tabla1.getValueAt(i, 0) + ""));

        }
        borrarTabla();
        borrarTabla2();
        cargarTabla();
        
        int i = Integer.parseInt(jCMesa.getSelectedItem()+"");
        MesaD md = new MesaD();
        md.altaMesa(i);


    }//GEN-LAST:event_cobroTotalActionPerformed

    private void vovlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vovlerActionPerformed

        MenuPrincipal.escritorio.removeAll();
        MenuPrincipal.escritorio.repaint();
        Salon s = new Salon();
        s.setVisible(true);
        MenuPrincipal.escritorio.add(s);
        MenuPrincipal.escritorio.moveToFront(s);


    }//GEN-LAST:event_vovlerActionPerformed

    private void jCMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMesaActionPerformed
        
        borrarTabla();
        cargarTabla();

    }//GEN-LAST:event_jCMesaActionPerformed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        
        borrarTabla2();
        cargarTabla2();
        
    }//GEN-LAST:event_tabla1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cobroParcial;
    private javax.swing.JButton cobroTotal;
    private javax.swing.JComboBox<String> jCMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JButton vovler;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera1() {
        
        modelo.addColumn("idPedido");
        modelo.addColumn("Fecha y hora");
        modelo.addColumn("Mesero");
        modelo.addColumn("Importe");

        tabla1.setModel(modelo);
        
    }

    private void armarCabecera2() {
        
        modelo2.addColumn("Productos");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Sub Total");

        tabla2.setModel(modelo2);
        
    }

    private void cargarMesas() {
   
        MesaD mesd = new MesaD();

        for (Mesa mesa : mesd.listarMesas()) {

            jCMesa.addItem(mesa.getNumeroMesa() + "");

        }

    }

    private void cargarTabla() {

        PedidoD peD = new PedidoD();

        List<Pedido> obtenerPedidos = peD.listarPedidos();

        for (Pedido pedido : obtenerPedidos) {

            if ((jCMesa.getSelectedItem().toString().equalsIgnoreCase(pedido.getMesa().getNumeroMesa() + "")) && ((pedido.isEstado() == false))) {

                modelo.addRow(new Object[]{pedido.getIdPedido(), pedido.getF_H(), pedido.getMesero().getNombre_apellido(), pedido.getImporte()});

            }
        }
    }

    private void cargarTabla2() {

        int filaselec = tabla1.getSelectedRow();

        PedidoD peD = new PedidoD();
        ProductoPedidoD ppD = new ProductoPedidoD();
        
        
        List<ProductoPedido> obtenerProductos = ppD.listarPPxPedido(Integer.parseInt(tabla1.getValueAt(filaselec, 0) + ""));
        
        for (ProductoPedido prodped : obtenerProductos) {

            modelo2.addRow(new Object[]{prodped.getProducto().getNombre(), prodped.getCantidad(),(prodped.getCantidad()*prodped.getProducto().getPrecio())});

        }

    }

    private void borrarTabla() {

        int filas = tabla1.getRowCount() - 1;

        for (; filas >= 0; filas--) {

            modelo.removeRow(filas);
        }

    }

    private void borrarTabla2() {

        int filas = tabla2.getRowCount() - 1;

        for (; filas >= 0; filas--) {

            modelo2.removeRow(filas);
        }

    }

}
