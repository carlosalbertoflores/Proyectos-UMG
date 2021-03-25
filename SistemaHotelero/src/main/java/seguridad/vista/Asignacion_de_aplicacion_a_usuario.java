/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.vista;

import java.io.File;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import seguridad.dominio.Aplicacion;
import seguridad.dominio.Perfil;
import seguridad.dominio.Asignacion_Aplicacion_Usuario;
import seguridad.datos.AplicacionDAO;
import seguridad.datos.Asignacion_Aplicacion_PerfilDAO;
import seguridad.datos.UsuarioDAO;
import seguridad.datos.Asignacion_Aplicacion_UsuarioDAO;
import seguridad.datos.PerfilDAO;
import seguridad.dominio.Asignacion_Aplicacion_Perfil;
import seguridad.dominio.Usuario;
import static seguridad.vista.Aplicacion_Perfil.tabla1;
import static seguridad.vista.Asignacion_de_aplicacion_a_usuario.tabla1;
/**
 *
 * @author gegmo
 */
public class Asignacion_de_aplicacion_a_usuario extends javax.swing.JInternalFrame {

    DefaultTableModel modelo1;
    DefaultTableModel modelo2; 
        int estadovalidacion;
    /**
     * Creates new form Asignacion_de_aplicacion_a_usuario2
     */
    public Asignacion_de_aplicacion_a_usuario() {
        initComponents();
        Asignacion_Aplicacion_UsuarioDAO personaDAO = new Asignacion_Aplicacion_UsuarioDAO();
        List<Usuario> perfiles = personaDAO.select2();
       for (Usuario persona : perfiles) {
            consulta_usuario.addItem(String.valueOf(persona.getId_usuario()));
        }
        /////////////////////
        modelo1=new DefaultTableModel();   //ASIGNAMOS UN NUEVO DEFAULTABLEMODEL AL OBJETO MODELO1
        modelo1.addColumn("CODIGO");      //LE AÑADIMOS COLUMNAS AL OBJETO MODELO
        modelo1.addColumn("NOMBRE");
        tabla1.setModel(modelo1);
        String datos[]= new String[2];
        AplicacionDAO dao = new  AplicacionDAO();
        List<Aplicacion> personas = dao.select2();
        for (Aplicacion persona : personas) {       
               
               datos[0]=String.valueOf(persona.getId_Aplicacion());
               datos[1]=persona.getNombre_Aplicacion();
               
                modelo1.addRow(datos);
        tabla1.setModel(modelo1);
                        
        } 
        
    }
    public void LimpiarTabla2(){
        modelo2=new DefaultTableModel();   //ASIGNAMOS UN NUEVO DEFAULTABLEMODEL AL OBJETO MODELO1
        modelo2.addColumn("ID Usuario");
        modelo2.addColumn("ID APLICACION");
        modelo2.addColumn("INGRESAR");
        modelo2.addColumn("CONSULTAR");
        modelo2.addColumn("MODIFICAR");
        modelo2.addColumn("ELIMINAR");
        modelo2.addColumn("IMPRIMIR");
        tabla2.setModel(modelo2);         //LE SETEAMOS EL OBJETO MODELO1 (TABLEMODEL) A LA TABLA (JTABLE) 
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
        tabla1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        txt_Nombre_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        consulta_usuario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento aplicacion a Usuarios (Gerson Gómez)");
        setVisible(true);

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla1);

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla2);

        txt_Nombre_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nombre_usuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("usuario disponible:");

        consulta_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_usuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("asignar");

        jButton2.setText(">>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("quitar");

        jLabel4.setText("Guardar");

        jButton5.setText("G");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btn_Buscar.setText("?");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        jButton6.setText(">");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("<<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("ayuda");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel4))
                                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(consulta_usuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addComponent(btn_Buscar)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consulta_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(11, 11, 11)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Nombre_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nombre_usuarioActionPerformed

    }//GEN-LAST:event_txt_Nombre_usuarioActionPerformed

    private void consulta_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_usuarioActionPerformed

    }//GEN-LAST:event_consulta_usuarioActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        LimpiarTabla2();
        String valor=consulta_usuario.getSelectedItem().toString();
        Asignacion_Aplicacion_UsuarioDAO usuarioDAO = new Asignacion_Aplicacion_UsuarioDAO();
        Usuario usuarioconsulta = new Usuario();
        usuarioconsulta.setId_usuario(Integer.parseInt(valor));
        usuarioconsulta=usuarioDAO.query(usuarioconsulta);
        txt_Nombre_usuario.setText(usuarioconsulta.getNombre_usuario());
        
        String combobox=consulta_usuario.getSelectedItem().toString();
        int validar=Integer.parseInt(combobox);
        String datos[]= new String[7];
        Asignacion_Aplicacion_UsuarioDAO dao = new  Asignacion_Aplicacion_UsuarioDAO();
        List<Asignacion_Aplicacion_Usuario> personas = dao.select();
        for (Asignacion_Aplicacion_Usuario persona : personas) {       
            if (validar==Integer.parseInt(persona.getCodigo_Usuario())) {
               
               datos[0]=persona.getCodigo_Usuario();
               datos[1]=persona.getCodigo_Aplicacion();
               datos[2]=persona.getImprimir();
               datos[3]=persona.getModificar();
               datos[4]=persona.getEliminar();
               datos[5]=persona.getIngresar();
               datos[6]=persona.getConsultar();
               
                modelo2.addRow(datos);
        tabla2.setModel(modelo2);
            }            
        }
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
for (int i = 0; i < tabla1.getRowCount(); i++) {
            String Vector[]=new String[2];
            
            Vector[0]=consulta_usuario.getSelectedItem().toString();
            Vector[1]=tabla1.getValueAt(i, 0).toString();
            
            modelo2.addRow(Vector);    //LLAMAMOS AL MODELO DE LA PANTALLA2 Y LE AGREGAMOS EL VECTOR COMO UNA NUEVA FILA
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        Asignacion_Aplicacion_UsuarioDAO modulosDAO = new Asignacion_Aplicacion_UsuarioDAO();
        String Vector[]=new String[7];
            Asignacion_Aplicacion_Usuario moduloInsertar = new Asignacion_Aplicacion_Usuario();
            for (int i = 0; i < tabla2.getRowCount(); i++) {
             
           
           Vector[0]=(String) tabla2.getValueAt(i, 0);
           Vector[1]=(String) tabla2.getValueAt(i, 1);
           Vector[2]=(String) tabla2.getValueAt(i, 2);
           Vector[3]=(String) tabla2.getValueAt(i, 3);
           Vector[4]=(String) tabla2.getValueAt(i, 4);
           Vector[5]=(String) tabla2.getValueAt(i, 5);
           Vector[6]=(String) tabla2.getValueAt(i, 6);
            
            moduloInsertar.setCodigo_Usuario(Vector[0]);           
            moduloInsertar.setCodigo_Aplicacion(Vector[1]);
            moduloInsertar.setIngresar(Vector[2]);
            moduloInsertar.setConsultar(Vector[3]);
            moduloInsertar.setModificar(Vector[4]);
            moduloInsertar.setEliminar(Vector[5]);
            moduloInsertar.setImprimir(Vector[6]);
            
            modulosDAO.insert(moduloInsertar);   
        }
            
            JOptionPane.showMessageDialog(null, "Modulo registrado correctamente");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
int filaSeleccionada=tabla1.getSelectedRow();  //LE ASIGNAMOS UNA VARIABLE INTEGER A LA FILA SELECCIONADA EN LA TABLA
        if (1==1) {
        if(filaSeleccionada>=0){   //SI EXISTE UNA FILA SELECCIONADA REALIZARA EL TRASPASO
            
               String Vector[]=new String[2];   
                
               Vector[0]=consulta_usuario.getSelectedItem().toString();
               Vector[1]=tabla1.getValueAt(filaSeleccionada, 0).toString();
               modelo2.addRow(Vector); 
               
        }    
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int filaSeleccionada=tabla2.getSelectedRow();  //LE ASIGNAMOS UNA VARIABLE INTEGER A LA FILA SELECCIONADA EN LA TABLA
        
        if(filaSeleccionada>=0){   //SI EXISTE UNA FILA SELECCIONADA REALIZARA EL TRASPASO
            
               String Vector[]=new String[2];   //CREAR UN VECTOR
                //LE ASIGNAMOS AL VECTOR Y CAPTURAMOS LOS DATOS DE LA TABLA1 EN LA FILA SELECCIONADA EN LA POSICION 0 Y 1,
                //ES DECIR COLUMNA NOMBRES Y APELLIDOS
               Vector[0]=tabla2.getValueAt(filaSeleccionada, 0).toString();    
               Vector[1]=tabla2.getValueAt(filaSeleccionada, 1).toString();
               
               modelo2.removeRow(filaSeleccionada);  //ELIMINAMOS LA FILA TRASPASADA DE LA PANTALLA1
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    LimpiarTabla2();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            if ((new File("src\\main\\java\\seguridad\\ayuda\\ayuda_Asignacion_a_Usuarios.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\seguridad\\ayuda\\ayuda_Asignacion_a_Usuarios.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JComboBox<String> consulta_usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField txt_Nombre_usuario;
    // End of variables declaration//GEN-END:variables
}
