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
    
    JButton boton = new JButton();
    /**
     * Creates new form Salon
     */
    public Salon1() {
        
        initComponents();
        panel2.setVisible(false);
        cargarMesas();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        cargar = new javax.swing.JButton();
        cargar1 = new javax.swing.JButton();
        nmesa = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        cobrar = new javax.swing.JButton();

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

        jLabel1.setText("Camarero");

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

        nmesa.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        nmesa.setText("nmesa");

        jLabel5.setText("Total:");

        total.setEditable(false);
        total.setText("$");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(cargar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cargar1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(productos, javax.swing.GroupLayout.Alignment.LEADING, 0, 290, Short.MAX_VALUE)
                                .addComponent(camarero, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(nmesa, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(nmesa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(camarero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargar)
                    .addComponent(cargar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        cobrar.setText("Cobrar Mesa");
        cobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cobrar))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(cobrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_productosActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        // TODO add your handling code here:
        ProductoD pd = new ProductoD();
        Producto p = (pd.buscarProductoxNombre(productos.getSelectedItem()+""));
        
        String n = p.getNombre();
        int c = Integer.parseInt(cantidad.getText());
        double precio = c*p.getPrecio();

        modelo.addRow(new Object[]{n, c, precio});
        
        double suma = 0;
        
        for(int i=0; i<=tabla.getRowCount()-1;i++){
            
            suma = suma + (Double)tabla.getValueAt(i, 2);
            
        }
        
        total.setText(suma+"");
       
        int i = Integer.parseInt(nmesa.getText());
        System.out.println(i);

        MesaD md = new MesaD();
        md.bajaMesa(i);
          
    }//GEN-LAST:event_cargarActionPerformed

    private void cargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargar1ActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_totalActionPerformed

    private void cobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobrarActionPerformed
        // TODO add your handling code here:
        int i = Integer.parseInt(nmesa.getText());
        MesaD md = new MesaD();
        md.altaMesa(i);
    }//GEN-LAST:event_cobrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> camarero;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton cargar;
    private javax.swing.JButton cargar1;
    private javax.swing.JButton cobrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nmesa;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JComboBox<String> productos;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField total;
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
    
       
    private void cargarTabla(){
        Producto p  = (Producto)productos.getSelectedItem();
        int c = Integer.parseInt(cantidad.getText());
        
        modelo.addRow(new Object[]{p.getNombre(),c,c*p.getPrecio()});
    }
    
    //devulelve el numero de mesa:
//    private int nMesa(){
//        int  n = 1;
//        MesaD md = new MesaD();
//        
//        try{
//            while(md.buscarMesa(n).getIdMesa() == n){
//                n++;
//            }
//        }catch (NullPointerException x){
//            return n;
//        }
//        return n;
//    }
    
    //carga las mesas que ya estan credas en la base de datos en el panel:
    private void cargarMesas(){

        MesaD md = new MesaD();
        
        ArrayList <Mesa> mesas=(ArrayList <Mesa>) md.listarMesas();
        
        for (Mesa m:mesas){
            
        JButton boton = new JButton();
        
        boton.setName("MESA " + m.getNumeroMesa());
            
        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mesa.jpeg")));
        boton.setText(boton.getName());
           
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(true);
                nmesa.setText(boton.getName());
            }
        });
        
        panel1.add(boton);
        panel1.updateUI();
        
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
