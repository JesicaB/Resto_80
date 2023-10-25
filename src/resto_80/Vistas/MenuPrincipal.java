/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto_80.Vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
public class MenuPrincipal extends javax.swing.JFrame {
    
    static void main() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Icon Imagenes;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        
        escritorio.removeAll();
        escritorio.repaint();
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/fastfood.jpg"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Producto = new javax.swing.JMenuItem();
        Mesa = new javax.swing.JMenuItem();
        Empleado = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        pedidosMesas = new javax.swing.JMenuItem();
        SALON = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1095, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración ");

        Producto.setText("Producto");
        Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoActionPerformed(evt);
            }
        });
        jMenu1.add(Producto);

        Mesa.setText("Mesa");
        Mesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesaActionPerformed(evt);
            }
        });
        jMenu1.add(Mesa);

        Empleado.setText("Empleado");
        Empleado.setToolTipText("");
        Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadoActionPerformed(evt);
            }
        });
        jMenu1.add(Empleado);

        jMenuBar1.add(jMenu1);

        jMenu8.setText("Consultas");

        jMenuItem4.setText("Cierre de Caja");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem4);

        jMenuItem5.setText("Pedido por Mesero");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem5);

        pedidosMesas.setText("Pedido Por Mesa");
        pedidosMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosMesasActionPerformed(evt);
            }
        });
        jMenu8.add(pedidosMesas);

        jMenuBar1.add(jMenu8);

        SALON.setText("Salon");
        SALON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SALONMouseClicked(evt);
            }
        });
        SALON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALONActionPerformed(evt);
            }
        });
        jMenuBar1.add(SALON);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
        gestionProductos gdp = new gestionProductos ();
        gdp.setVisible(true);
        escritorio.add(gdp);
        escritorio.moveToFront(gdp);
        
    
    }//GEN-LAST:event_ProductoActionPerformed

    private void EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        gestionEmpleados gde = new gestionEmpleados ();
        gde.setVisible(true);
        escritorio.add(gde);
        escritorio.moveToFront(gde);
        
    
    }//GEN-LAST:event_EmpleadoActionPerformed

    private void MesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesaActionPerformed
         escritorio.removeAll();
        escritorio.repaint();
        gestionMesas gdm = new gestionMesas ();
        gdm.setVisible(true);
        escritorio.add(gdm);
        escritorio.moveToFront(gdm);
        
   
    }//GEN-LAST:event_MesaActionPerformed

    private void pedidosMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosMesasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        PedidoPorMesa pm = new PedidoPorMesa();
        pm.setVisible(true);
        escritorio.add(pm);
        escritorio.moveToFront(pm);
        
 
    }//GEN-LAST:event_pedidosMesasActionPerformed

    private void SALONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALONActionPerformed
       
        escritorio.removeAll();
        escritorio.repaint();
        Salon sal = new Salon ();
        sal.setVisible(true);
        escritorio.add(sal);
        escritorio.moveToFront(sal);
        
     
    }//GEN-LAST:event_SALONActionPerformed

    private void SALONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALONMouseClicked
        
        escritorio.removeAll();
        escritorio.repaint();
        Salon sal = new Salon ();
        sal.setVisible(true);
        escritorio.add(sal);
        escritorio.moveToFront(sal);
    
    }//GEN-LAST:event_SALONMouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Cajas cajas = new Cajas ();
        cajas.setVisible(true);
        escritorio.add(cajas);
        escritorio.moveToFront(cajas);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       
        escritorio.removeAll();
        escritorio.repaint();
        consultaPedidoPorMeseroHoy ppm = new consultaPedidoPorMeseroHoy ();
        ppm.setVisible(true);
        escritorio.add(ppm);
        escritorio.moveToFront(ppm);
        
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem Empleado;
    public javax.swing.JMenuItem Mesa;
    public javax.swing.JMenuItem Producto;
    public javax.swing.JMenu SALON;
    public static javax.swing.JDesktopPane escritorio;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu8;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuItem4;
    public javax.swing.JMenuItem jMenuItem5;
    public javax.swing.JMenuItem pedidosMesas;
    // End of variables declaration//GEN-END:variables

}
