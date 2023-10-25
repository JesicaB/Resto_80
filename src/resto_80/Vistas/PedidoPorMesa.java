/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto_80.Vistas;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import resto_80.Datos.MesaD;
import resto_80.Datos.PedidoD;
import resto_80.Entidades.Mesa;
import resto_80.Entidades.Pedido;

/**
 *
 * @author Jesica
 */
public class PedidoPorMesa extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel(){
        
        public boolean isCellEditable (int fila, int columna){
            return false;
        }
        
    };
    private DefaultTableModel modelo2 = new DefaultTableModel(){
        
        public boolean isCellEditable (int fila, int columna){
            return false;
        }
        
    };
    

    /**
     * Creates new form PedidoPorMesa
     */
    public PedidoPorMesa() {
        initComponents();
        armarCabecera();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numMesa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        buscar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hora1 = new javax.swing.JTextField();
        hora2 = new javax.swing.JTextField();
        fecha = new com.toedter.calendar.JDateChooser();

        setClosable(true);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Estado de las mesas");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Buscar Pedido");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Núm MESA");

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

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Fecha");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Entre Horas");

        jLabel6.setText("y");

        hora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hora1ActionPerformed(evt);
            }
        });

        hora2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hora2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(limpiar))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(numMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(194, 194, 194)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(numMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(hora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(hora2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(limpiar))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        try {
            MesaD md = new MesaD();
            Mesa m = md.buscarMesaXNumero(Integer.parseInt(numMesa.getText()));
            int idM = m.getIdMesa();

            PedidoD pd = new PedidoD();

            //Obtenemos el date y lo pasamos al localdate.
            java.util.Date date = fecha.getDate();
            LocalDate f = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            //obtenemos las horas entre las cuales buscaremos.
            DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm");
            
            String h1 = hora1.getText();
            LocalTime inicio = LocalTime.parse(h1);
            
            String h2 = hora2.getText();
            LocalTime fin = LocalTime.parse(h2);
            
            int c = 0;
            
           for (int i = 0; i < pd.listarPedidos().size(); i++) {
                Pedido p = pd.listarPedidos().get(i);
                String h3= p.getF_H().toLocalTime().format(tf);
                LocalTime actual = LocalTime.parse(h3);
                
                if(p.getMesa().getIdMesa() == idM && p.getF_H().toLocalDate().equals(f) && actual.isBefore(fin) && actual.isAfter(inicio)){
                    modelo2.addRow(new Object[]{p.getIdPedido(), p.getMesa().getIdMesa(), p.getMesero().getIdEmpleado(), p.getF_H(), p.getImporte()});
                    c++;
                }
            }
            
            if (c == 0) {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna mesa con los datos ingresados."
                        + "Verifique los mimos e intente nuevamente.");
            }
            
        }catch(NumberFormatException x){
            JOptionPane.showMessageDialog(null, "Ingrese solo números.");
        }catch(NullPointerException x){
            JOptionPane.showMessageDialog(null, "Verifique los datos ingresados e intente nuevamente."
                    + "Recuerde que debe cargar todos los datos.");
        }catch(DateTimeParseException x){
            JOptionPane.showMessageDialog(null, "La hora debe ser ingresada en formato HH:mm,"
                    + " es decir horas y minutos.");
        }
        
    }//GEN-LAST:event_buscarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        borrarTabla();
        numMesa.setText("");
        fecha.setDate(null);
        hora1.setText("");
        hora2.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void hora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hora1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hora1ActionPerformed

    private void hora2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hora2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hora2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JTextField hora1;
    private javax.swing.JTextField hora2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField numMesa;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables

     private void armarCabecera(){
         
        modelo.addColumn("idMesa");
        modelo.addColumn("Numero");
        modelo.addColumn("Estado");
        
        tabla.setModel(modelo);
        
        modelo2.addColumn("idPedido");
        modelo2.addColumn("idMesa");
        modelo2.addColumn("idEmpleado");
        modelo2.addColumn("Fecha y Hora");
        modelo2.addColumn("Importe");
        
        tabla2.setModel(modelo2);
        
    }
     
      private void cargarTabla(){
        MesaD md  =new MesaD();
        
        for(Mesa m: md.listarMesas()){
            
            if(m.isEstado() == true){
                
                modelo.addRow(new Object[]{m.getIdMesa(), m.getNumeroMesa(), "libre"});
                
            }else{
                
                modelo.addRow(new Object[]{m.getIdMesa(),m.getNumeroMesa(),"ocupada"});
                
            }
           

        }
        
    }
      
    private void borrarTabla() {

        //Contamos las filas de la tabla, restamos 1 porque el indice comienza en 0.
        int filas = tabla2.getRowCount() - 1;

        //Borramos de forma descendente para no alterar el indice
        for (; filas >= 0; filas--) {
            modelo2.removeRow(filas);
        }

    }
}