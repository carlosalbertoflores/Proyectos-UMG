package Comercial.vista;


import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
    @author Diego Vásquez
 */
public class MDIComercial extends javax.swing.JFrame {
 private Mantenimiento_Cliente Mantenimiento_Cliente ;
  private Mantenimiento_Acreedor  Mantenimiento_Acreedor;
    public MDIComercial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane()
        ;
        JDesktopPane_Escritorio = new javax.swing.JDesktopPane()
        ;
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulo Comercial [ip] [user]");
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(255, 200, 23));

        JDesktopPane_Escritorio.setBackground(new java.awt.Color(255, 204, 0));
        JDesktopPane_Escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayer(JDesktopPane_Escritorio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopPane_Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopPane_Escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Catálogos");
        jMenu2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenu2.add(jSeparator1);

        jMenu7.setText("Catalogos Ventas");

        jMenuItem1.setText("Mantenimineto Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenuItem2.setText("Mantenimiento Acreedor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem2);

        jMenu2.add(jMenu7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Procesos");
        jMenu3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Informes");
        jMenu4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Herramientas");
        jMenu5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ayuda");
        jMenu6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem3.setText("Ayuda Menu");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 Mantenimiento_Cliente= new Mantenimiento_Cliente();
        Mantenimiento_Cliente.setVisible(true);
        JDesktopPane_Escritorio.add(Mantenimiento_Cliente);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
 Mantenimiento_Acreedor= new Mantenimiento_Acreedor();
        Mantenimiento_Acreedor.setVisible(true);
        JDesktopPane_Escritorio.add(Mantenimiento_Acreedor);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
  try {
            if ((new File("src\\main\\java\\Comercial\\reportes\\menu.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\Comercial\\reportes\\menu.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {
       
        //FLATLAF
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIComercial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDesktopPane_Escritorio;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
