/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finanzas.vista;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Finanzas.dominio.TipoTransaccion;
import Finanzas.datos.TipoTransaccionDAO;
import Finanzas.datos.Conexion;

import Hoteleria.datos.ConexionHoteleria;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import seguridad.datos.BitacoraDao;
import seguridad.dominio.Bitacora;
import seguridad.vista.Login;
import seguridad.vista.Mantenimiento_Perfil;
/**
 *
 * @author Santiago Martinez Diaz
 */
public class FrmTipoTransaccion extends javax.swing.JInternalFrame {
    int codigoAplicacion = 1002;
    private Connection connection;
    
    BitacoraDao BitacoraDAO = new BitacoraDao();
    Bitacora AInsertar = new Bitacora();
    
    // metodo de llenado de tablas automaticamente aparecen los datos guardados en bd y se despliega en automatico ademas crea las tablas en el jtable
  public void llenadoDeTablas() {
      try {
          DefaultTableModel modelo = new DefaultTableModel();
          modelo.addColumn("Codigo");
          modelo.addColumn("Tipo Transaccion");
          modelo.addColumn("Efecto Transaccio");


          
          TipoTransaccionDAO TipoTDAO = new TipoTransaccionDAO();
          List<TipoTransaccion> tipot = TipoTDAO.select();
          JTableTransaccion.setModel(modelo);
          String[] dato = new String[3];
          for (int i = 0; i < tipot.size(); i++) {
              dato[0] = tipot.get(i).getCodigo_TipoTransaccion();
              dato[1] = tipot.get(i).getTransaccion_Tipo();
              dato[2] = Integer.toString(tipot.get(i).getEfecto_TipoTransaccion());
              modelo.addRow(dato);
          }
      } catch (SQLException ex) {
          Logger.getLogger(FrmTipoTransaccion.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  
 
 //metodo para buscar Tipo De transaccion guardada en la db y que  despligue la informacion en los textfield
public void buscarperfil(){
        TipoTransaccion ConsultarT = new TipoTransaccion();
    TipoTransaccionDAO consultarDao = new TipoTransaccionDAO();
    ConsultarT.setCodigo_TipoTransaccion((txtbuscado.getText()));
    //-------------------------------------------------------------------
    ConsultarT = consultarDao.query(ConsultarT);
    TxtTipo.setText(String.valueOf(ConsultarT.getCodigo_TipoTransaccion()));
    TxtTipo.setText(ConsultarT.getTransaccion_Tipo());
    TxtEfecto.setText(Integer.toString(ConsultarT.getEfecto_TipoTransaccion()));
}
       
    

    /**
     * Creates new form FrmTipoTransaccion
     */
    public FrmTipoTransaccion() {
        initComponents();
        llenadoDeTablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label7 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        BtnElim = new javax.swing.JButton();
        BtnBus = new javax.swing.JButton();
        txtbuscado = new javax.swing.JTextField();
        BtnMod = new javax.swing.JButton();
        BtnIng = new javax.swing.JButton();
        btnLimpiar2 = new javax.swing.JButton();
        BtnAyuda = new javax.swing.JButton();
        TxtTipo = new javax.swing.JTextField();
        TxtCodigo1 = new javax.swing.JTextField();
        TxtEfecto = new javax.swing.JTextField();
        BtnIng1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableTransaccion = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Mantenimiento TipoTransaccion\n");
        setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel1.setToolTipText("");

        label7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label7.setText("Codigo:");

        label9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label9.setText("Tipo De Transaccion:");

        label8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label8.setText("Efecto De Transaccion:");

        BtnElim.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnElim.setText("Eliminar");
        BtnElim.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElimActionPerformed(evt);
            }
        });

        BtnBus.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnBus.setText("Buscar:");
        BtnBus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBusActionPerformed(evt);
            }
        });

        txtbuscado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BtnMod.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnMod.setText("Modificar");
        BtnMod.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModActionPerformed(evt);
            }
        });

        BtnIng.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnIng.setText("Imprimir:");
        BtnIng.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngActionPerformed(evt);
            }
        });

        btnLimpiar2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });

        BtnAyuda.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnAyuda.setText("Ayuda:");
        BtnAyuda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAyudaActionPerformed(evt);
            }
        });

        TxtEfecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtEfectoKeyTyped(evt);
            }
        });

        BtnIng1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnIng1.setText("Registrar");
        BtnIng1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnIng1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIng1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label8)
                            .addComponent(label9)
                            .addComponent(label7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEfecto, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnIng1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnIng, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnBus, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEfecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(BtnBus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnIng1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnIng, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles"));

        JTableTransaccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTableTransaccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JTableTransaccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo De Transaccion", "Efecto De Transaccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableTransaccion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElimActionPerformed
        // TODO add your handling code here:
        TipoTransaccionDAO tipodAO = new TipoTransaccionDAO();
        TipoTransaccion tipoEliminar = new TipoTransaccion();
        //Metodo Eliminar utilizando el codigo de tipo transaccion para eliminarlo de la bd
        tipoEliminar.setCodigo_TipoTransaccion((txtbuscado.getText()));
        tipodAO.delete(tipoEliminar);
        llenadoDeTablas();

        AInsertar.setId_Usuario(Login.usuarioFianzas);
        AInsertar.setAccion("Eliminar");
        AInsertar.setCodigoAplicacion("1002");
        AInsertar.setModulo("1000");

        try {
            BitacoraDAO.insert(AInsertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Mantenimiento_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnElimActionPerformed

    private void BtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModActionPerformed
       //METODO MODIFICAR
        TipoTransaccionDAO tipodao = new TipoTransaccionDAO();
        TipoTransaccion tipomodificar = new TipoTransaccion();
  
        
        tipomodificar.setCodigo_TipoTransaccion(TxtTipo.getText());
        tipomodificar.setTransaccion_Tipo(TxtTipo.getText());
        tipomodificar.setEfecto_TipoTransaccion(Integer.parseInt(TxtEfecto.getText()));
        
   
        tipodao.update(tipomodificar);
        JOptionPane.showMessageDialog(null, " Modificado Exitosamente");
        llenadoDeTablas();
        
       
        AInsertar.setId_Usuario(Login.usuarioFianzas);
        AInsertar.setAccion("Modificar");
        AInsertar.setCodigoAplicacion("1002");
        AInsertar.setModulo("1000");

        try {
            BitacoraDAO.insert(AInsertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Mantenimiento_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_BtnModActionPerformed


    private void BtnIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngActionPerformed

        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            connection = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/Finanzas/reportes/ReporteTipoTransaccion.jrxml");
            print = JasperFillManager.fillReport(report, p, connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte de Tipo Transaccion");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }

       AInsertar.setId_Usuario(Login.usuarioFianzas);
        AInsertar.setAccion("Imprimir");
        AInsertar.setCodigoAplicacion("1002");
        AInsertar.setModulo("1000");

        try {
            BitacoraDAO.insert(AInsertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Mantenimiento_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnIngActionPerformed

    private void BtnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAyudaActionPerformed

        try {
            if ((new File("src\\main\\java\\Finanzas\\ayudas\\AyudaMantenimientoTransaccion.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\Finanzas\\ayudas\\AyudaMantenimientoTransaccion.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
        
        
        AInsertar.setId_Usuario(Login.usuarioFianzas);
        AInsertar.setAccion("Ver Ayuda");
        AInsertar.setCodigoAplicacion("1002");
        AInsertar.setModulo("1000");

        try {
            BitacoraDAO.insert(AInsertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Mantenimiento_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnAyudaActionPerformed

    private void BtnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBusActionPerformed
        // TODO add your handling code here:
                  buscarperfil();

      AInsertar.setId_Usuario(Login.usuarioFianzas);
        AInsertar.setAccion("Buscar");
        AInsertar.setCodigoAplicacion("1002");
        AInsertar.setModulo("1000");

        try {
            BitacoraDAO.insert(AInsertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Mantenimiento_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BtnBusActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
        // TODO add your handling code here:
        
         //metodo de Limpiar automaticamente los textfield seleecionados 
        TxtCodigo1.setText("");
        TxtTipo.setText("");
        TxtTipo.setText("");
        TxtEfecto.setText("");
        txtbuscado.setText("");
        BtnIng.setEnabled(true);
        BtnMod.setEnabled(true);
        BtnElim.setEnabled(true);
        
    
    }//GEN-LAST:event_btnLimpiar2ActionPerformed

    private void BtnIng1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIng1ActionPerformed
        // TODO add your handling code here:
        
          
        TipoTransaccionDAO cuentadao = new TipoTransaccionDAO();
        TipoTransaccion insertarcuenta = new TipoTransaccion();
        insertarcuenta.setCodigo_TipoTransaccion(TxtCodigo1.getText());
        insertarcuenta.setTransaccion_Tipo(TxtTipo.getText());

       
       insertarcuenta.setEfecto_TipoTransaccion(Integer.parseInt(TxtEfecto.getText()));

      
        
        AInsertar.setId_Usuario(Login.usuarioFianzas);
        AInsertar.setAccion("Insertar");
        AInsertar.setCodigoAplicacion("1002");
        AInsertar.setModulo("1000");

        try {
            BitacoraDAO.insert(AInsertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Mantenimiento_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         cuentadao.insert(insertarcuenta);

           llenadoDeTablas();

    }//GEN-LAST:event_BtnIng1ActionPerformed

    private void TxtEfectoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtEfectoKeyTyped
        // TODO add your handling code here:
          char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
          getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "INGRESAR SOLO NUMEROS");
        }
    }//GEN-LAST:event_TxtEfectoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAyuda;
    private javax.swing.JButton BtnBus;
    private javax.swing.JButton BtnElim;
    private javax.swing.JButton BtnIng;
    private javax.swing.JButton BtnIng1;
    private javax.swing.JButton BtnMod;
    private javax.swing.JTable JTableTransaccion;
    private javax.swing.JTextField TxtCodigo1;
    private javax.swing.JTextField TxtEfecto;
    private javax.swing.JTextField TxtTipo;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}
