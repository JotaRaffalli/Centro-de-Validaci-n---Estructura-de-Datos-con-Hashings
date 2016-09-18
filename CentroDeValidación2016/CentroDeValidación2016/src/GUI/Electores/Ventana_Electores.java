
package GUI.Electores;

import Fuentes.BaseDeDatos;
import Fuentes.Elector;
import GUI.Ventana_Administrador;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;


public class Ventana_Electores extends javax.swing.JFrame {


    DefaultListModel modelo;
    BaseDeDatos Base ;
    
     
    
    public Ventana_Electores(BaseDeDatos Base) 
    {
        this.Base=Base;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        
        
        modelo = new DefaultListModel ();
        ListaNombre.setModel(modelo);
        llenarListaNombre ();
        
    }

    private Ventana_Electores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public String ObtenerUsuario ()
    {
        String usuario = Integer.toString(ListaNombre.getSelectedIndex());
        return usuario;
    
    }
    
    public void llenarListaNombre ()
    {
        for (String key : Base.getBE().keySet())     
        modelo.addElement(key);
    }
   public void crearArchivo() throws FileNotFoundException, IOException
    {
        FileOutputStream fOutput;
        fOutput = new FileOutputStream ("Base_De_Datos.DAT");
        ObjectOutputStream Ooutput = new ObjectOutputStream (fOutput);
        Ooutput.writeObject(Base);
        Ooutput.close();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BuscarTF = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaNombre = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        AtrasE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("ELECTORES");

        Agregar.setText("Agregar");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });

        jLabel3.setText("Para buscar ingrese cedula ...");

        jScrollPane2.setViewportView(ListaNombre);

        jLabel2.setText("Usuarios Agregados");

        AtrasE.setText("Atrás");
        AtrasE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrasEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Agregar)
                            .addComponent(Buscar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Modificar)
                                .addGap(18, 18, 18)
                                .addComponent(Eliminar)
                                .addGap(18, 18, 18)
                                .addComponent(AtrasE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(BuscarTF, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 33, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar)
                    .addComponent(BuscarTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(AtrasE))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
     if (!BuscarTF.getText().equals(""))
        {
            String cedula1 = BuscarTF.getText();
            Elector e2 = Base.getBE().get(cedula1); 
            if (e2!=null)
            {
                Ventana_Buscar_Elector ventbuscare = new Ventana_Buscar_Elector (e2);
                ventbuscare.setVisible(true);
            }
            else
            {
                BuscarTF.setText("¡Elector no registrado!");
            }
           
        }
        
        
    }//GEN-LAST:event_BuscarMouseClicked

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked

        Ventana_Agregar_Elector ventagregare = new Ventana_Agregar_Elector (Base);
        ventagregare.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_AgregarMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        BuscarTF.setText("");
        if (ListaNombre.getSelectedValue()==null)
        {
            BuscarTF.setText("¡Selecciona un Elector!");
        }
        else
        {
        String cedula2 = ListaNombre.getSelectedValue().toString();
        Elector e3 = Base.getBE().get(cedula2);        
        Ventana_Modificar_Elector ventmodificare = new Ventana_Modificar_Elector (e3,cedula2,Base);      
        ventmodificare.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_ModificarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        BuscarTF.setText("");
        if (ListaNombre.getSelectedValue()==null)
        {
            BuscarTF.setText("¡Selecciona un Elector!");
        }
        else
        {
        String cedula3 = ListaNombre.getSelectedValue().toString();
        Base.getBE().remove(cedula3);
        modelo.removeElement(cedula3);
        }
       
    }//GEN-LAST:event_EliminarMouseClicked

    private void AtrasEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasEMouseClicked
        try {
            this.crearArchivo();
        } catch (IOException ex) {
            System.out.println("Error al guardar cambios en Electores");
        }
        Ventana_Administrador vAux = new Ventana_Administrador (Base);
        vAux.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_AtrasEMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana_Electores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Electores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Electores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Electores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Electores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton AtrasE;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField BuscarTF;
    private javax.swing.JButton Eliminar;
    private javax.swing.JList ListaNombre;
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
