
package GUI.Centros;

import Fuentes.BaseDeDatos;
import Fuentes.Centro;
import GUI.Ventana_Administrador;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.DefaultListModel;


public class Ventana_Centros extends javax.swing.JFrame {

    
    DefaultListModel modelo;
    BaseDeDatos Base;
    
    
    public Ventana_Centros(BaseDeDatos Base) {
        this.Base=Base;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        modelo = new DefaultListModel ();
        ListaCentro.setModel(modelo);
        llenarListaCentro ();
        
    }

    private Ventana_Centros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public String ObtenerNumero ()
    {
        String numero = BuscarCentroTF.getText();
        return numero;
    
    }
    
    public String ObtenerCentro ()
    {
        String centro = Integer.toString(ListaCentro.getSelectedIndex());
        return centro;
    
    }
    
    
    public void llenarListaCentro ()
    {
        for (String key : Base.getBC().keySet())     
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
        BuscarCentroTF = new javax.swing.JTextField();
        AgregarCentro = new javax.swing.JButton();
        BuscarCentro = new javax.swing.JButton();
        ModificarCentro = new javax.swing.JButton();
        EliminarCentro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaCentro = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("CENTROS");

        AgregarCentro.setText("Agregar");
        AgregarCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarCentroMouseClicked(evt);
            }
        });

        BuscarCentro.setText("Buscar");
        BuscarCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarCentroMouseClicked(evt);
            }
        });

        ModificarCentro.setText("Modificar");
        ModificarCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarCentroMouseClicked(evt);
            }
        });

        EliminarCentro.setText("Eliminar");
        EliminarCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarCentroMouseClicked(evt);
            }
        });

        jLabel3.setText("Para buscar ingrese número de centro ...");

        jScrollPane2.setViewportView(ListaCentro);

        jLabel2.setText("Centros Agregados");

        jButton1.setText("Atrás");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
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
                            .addComponent(AgregarCentro)
                            .addComponent(BuscarCentro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ModificarCentro)
                                .addGap(18, 18, 18)
                                .addComponent(EliminarCentro)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(BuscarCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 39, Short.MAX_VALUE))))
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
                    .addComponent(BuscarCentro)
                    .addComponent(BuscarCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarCentro)
                    .addComponent(ModificarCentro)
                    .addComponent(EliminarCentro)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarCentroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarCentroMouseClicked
        if (!BuscarCentroTF.getText().equals(""))
        {
        String num1 = BuscarCentroTF.getText();
        Centro c1 = Base.getBC().get(num1);
            if (c1!=null)
            {
                Ventana_Buscar_Centro ventbuscarc = new Ventana_Buscar_Centro (c1);
                ventbuscarc.setVisible(true);
            }
            else
            {
                BuscarCentroTF.setText("¡Centro no registrado!");
            }
        
        }
        
        
    }//GEN-LAST:event_BuscarCentroMouseClicked

    private void AgregarCentroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarCentroMouseClicked
       
        Ventana_Agregar_Centro ventagregarc = new Ventana_Agregar_Centro (Base);
        ventagregarc.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_AgregarCentroMouseClicked

    private void ModificarCentroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarCentroMouseClicked
         BuscarCentroTF.setText("");
        if (ListaCentro.getSelectedValue()==null)
        {
            BuscarCentroTF.setText("¡Selecciona un Centro!");
        }
        else
        {
            String num2 = ListaCentro.getSelectedValue().toString();
            Centro c2 = Base.getBC().get(num2);
            Ventana_Modificar_Centro ventmodificarc = new Ventana_Modificar_Centro (c2, num2, Base);
            ventmodificarc.setVisible(true);
            this.setVisible(false);
        }    
        
        
    }//GEN-LAST:event_ModificarCentroMouseClicked

    private void EliminarCentroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarCentroMouseClicked
       BuscarCentroTF.setText("");
        if (ListaCentro.getSelectedValue()==null)
        {
            BuscarCentroTF.setText("¡Selecciona un Centro!");
        }
        else
        {
        String num3 = ListaCentro.getSelectedValue().toString();
        Base.getBC().remove(num3);
        modelo.removeElement(num3);
        }
            
        
    }//GEN-LAST:event_EliminarCentroMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        try {
            this.crearArchivo();
        } catch (IOException ex) {
            System.out.println("Error al guardar cambios de centros");
        }
        Ventana_Administrador vAux = new Ventana_Administrador (Base);
        vAux.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Ventana_Centros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Centros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Centros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Centros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Centros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCentro;
    private javax.swing.JButton BuscarCentro;
    private javax.swing.JTextField BuscarCentroTF;
    private javax.swing.JButton EliminarCentro;
    private javax.swing.JList ListaCentro;
    private javax.swing.JButton ModificarCentro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
