/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto_80.Vistas;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import resto_80.Datos.EmpleadoD;
import resto_80.Datos.MesaD;
import resto_80.Datos.ProductoD;
import resto_80.Entidades.Empleado;
import resto_80.Entidades.Mesa;
import resto_80.Entidades.Producto;

/**
 *
 * @author Jesica
 */
public class Salon1 extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<String> b = new ArrayList<>();
    private int n = 1;
    
    JButton boton = new JButton();
    /**
     * Creates new form Salon
     */
    public Salon1() {
        
        initComponents();
        panel2.setVisible(false);
        cargarMesas();
        cargarMesa();
        armarCabecera();
        cargarMeseros();
        cargarProductos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        camarero = new javax.swing.JComboBox<>();
        productos = new javax.swing.JComboBox<>();
        mesas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        cargar = new javax.swing.JButton();
        cargar1 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setMaximizable(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(51, 255, 204));
        panel1.setDoubleBuffered(false);
        panel1.setLayout(new java.awt.GridLayout(3, 0));

        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });

        mesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesasActionPerformed(evt);
            }
        });

        jLabel1.setText("Camarero");

        jLabel2.setText("Mesas");

        jLabel3.setText("Productos");

        jLabel4.setText("Cantidad");

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

        cargar.setText("Cargar Producto");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        cargar1.setText("Eliminar Producto");
        cargar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(cargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cargar1))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jTextField1)
                                .addComponent(camarero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mesas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(productos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(camarero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(mesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargar)
                    .addComponent(cargar1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_productosActionPerformed

    private void mesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesasActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        // TODO add your handling code here:
        panel2.setVisible(false);
    }//GEN-LAST:event_cargarActionPerformed

    private void cargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> camarero;
    private javax.swing.JButton cargar;
    private javax.swing.JButton cargar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> mesas;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JComboBox<String> productos;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("Productos");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Sub Total");
        
        tabla.setModel(modelo);
    }
    
    private void cargarMeseros() {
        EmpleadoD ed = new EmpleadoD();
        
        for (Empleado e: ed.listarEmpleados()) {
            
            if(e.isEstado() == true){
                camarero.addItem(e.getNombre_apellido());
            }
        }
    }
    
    private void cargarProductos(){
        ProductoD pd = new ProductoD();
        
        for(Producto p: pd.listarProductos()){
            
            if(p.isEstado() == true){
                productos.addItem(p.getNombre());
            }
        }
    } 
    
     //carga combo box con numero de mesas.
    private void cargarMesa(){
        productos.removeAllItems();
        
        for(int i = 0; i<b.size(); i++){
            mesas.addItem(b.get(i));
        }
        
    }
    
//    private void cargarTabla(ProductoPedido pp){
//        modelo.addRow(new Object[]{pp.getIdPP(),pp.getProducto().getNombre(),pp.getPedido().getMesa().getIdMesa(),pp.getPedido().getMesero().getNombre_apellido(),pp.getCantidad(),pp.getPedido().getImporte()});
//    }
    
    //devulelve el numero de mesa:
    private int nMesa(){
        int  n = 1;
        MesaD md = new MesaD();
        
        try{
            while(md.buscarMesa(n).getIdMesa() == n){
                n++;
            }
        }catch (NullPointerException x){
            return n;
        }
        return n;
    }
    
    //carga las mesas que ya estan credas en la base de datos en el panel:
    private void cargarMesas(){
        int id = nMesa();
        
        while(n<id){
        
        JButton boton = new JButton();
        
        boton.setName("Mesa"+n);
        String nombre = boton.getName();
        b.add(nombre);
            
        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mesa.jpeg")));
           
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(true);
            }
        });
        
        panel1.add(boton);
        panel1.updateUI();
        
        n++;
        
        }
    }
//    
////    carga mesas nuevas en el panel:
//    private void crearMesa(){
//        
//        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mesa.jpeg")));
//        boton.setName("Mesa"+n);
//        String nombre = boton.getName();
//        b.add(nombre);
//        
//        boton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                panel2.setVisible(true);
//            }
//        });
//        
//        panel1.add(boton);
//        panel1.updateUI();
//        
//    }

}
