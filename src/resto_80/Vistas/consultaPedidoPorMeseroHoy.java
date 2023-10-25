/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto_80.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import resto_80.Datos.EmpleadoD;
import resto_80.Datos.PedidoD;
import resto_80.Entidades.Empleado;
import resto_80.Entidades.Pedido;

/**
 *
 * @author MANUEL
 */
public class consultaPedidoPorMeseroHoy extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo=new DefaultTableModel(){
        
        public boolean isCellEditable(int f, int c){
            return false;
        }
    };
    /**
     * Creates new form consultaPedidoPorMeseroHoy
     */
    public consultaPedidoPorMeseroHoy() {
        initComponents();
        armarCabecera();
        cargarMeseros();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLMeseroHoy = new javax.swing.JLabel();
        jCBMeserosHoy = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPedidos = new javax.swing.JTable();
        jDCFecha = new com.toedter.calendar.JDateChooser();
        jBBuscar = new javax.swing.JButton();

        setClosable(true);

        jLMeseroHoy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLMeseroHoy.setText("Mesero");

        jCBMeserosHoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMeserosHoyActionPerformed(evt);
            }
        });

        jTPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IdPedido", "Mesa", "Estado", "Fecha", "Importe"
            }
        ));
        jScrollPane1.setViewportView(jTPedidos);

        jBBuscar.setText("BUSCAR");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLMeseroHoy)
                                .addGap(18, 18, 18)
                                .addComponent(jCBMeserosHoy, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jBBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jDCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMeseroHoy)
                    .addComponent(jCBMeserosHoy, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jDCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBMeserosHoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMeserosHoyActionPerformed
//        EmpleadoD empD = new EmpleadoD();
//        borrarTabla();
//        Empleado empS = (empD.buscarEmpleadoNombre(jCBMeserosHoy.getSelectedItem()+""));
//        cargarPedidos(empS);
    }//GEN-LAST:event_jCBMeserosHoyActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        
        EmpleadoD empD = new EmpleadoD();
        borrarTabla();
        Empleado empS = (empD.buscarEmpleadoNombre(jCBMeserosHoy.getSelectedItem()+""));
        
        java.util.Date date = jDCFecha.getDate();
        LocalDate dia = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        cargarPedidos(empS, dia);
    }//GEN-LAST:event_jBBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JComboBox<String> jCBMeserosHoy;
    private com.toedter.calendar.JDateChooser jDCFecha;
    private javax.swing.JLabel jLMeseroHoy;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTPedidos;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        modelo.addColumn("ID Pedido");
        modelo.addColumn("Mesa");
        modelo.addColumn("Estado");
        modelo.addColumn("Fecha");
        modelo.addColumn("Importe");
        jTPedidos.setModel(modelo);
    }

    private void cargarMeseros() {
        EmpleadoD ed = new EmpleadoD();
        
        for (Empleado e: ed.listarEmpleados()) {
            
            if(e.isEstado() == true){
                jCBMeserosHoy.addItem(e.getNombre_apellido());
            }
        }
    }
    
    private void cargarPedidos(Empleado empleado, LocalDate dia) {
       
        PedidoD pedd = new PedidoD();
        
        
        List<Pedido> obtenerPedidos= pedd.listarPedidos();
        
                    
       
            for (Pedido pedido : obtenerPedidos) {
                
                                
                if(empleado.getIdEmpleado() == pedido.getMesero().getIdEmpleado() && pedido.getF_H().toLocalDate().equals(dia)){
                
                modelo.addRow(new Object[]{pedido.getIdPedido(), pedido.getMesa().getIdMesa(), pedido.getMesero().getIdEmpleado(), pedido.getF_H(), pedido.getImporte()});
                
                }

            }
      

    }
    
    private void borrarTabla() {

        //Contamos las filas de la tabla, restamos 1 porque el indice comienza en 0.
        int filas = jTPedidos.getRowCount() - 1;

        //Borramos de forma descendente para no alterar el indice
        for (; filas >= 0; filas--) {
            modelo.removeRow(filas);
        }

    }
    
}
