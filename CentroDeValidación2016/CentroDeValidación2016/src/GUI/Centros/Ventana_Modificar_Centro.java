
package GUI.Centros;

import Fuentes.BaseDeDatos;
import Fuentes.Centro;


public class Ventana_Modificar_Centro extends javax.swing.JFrame {

    Centro c1;
    BaseDeDatos Base;
    String num;
    
    public Ventana_Modificar_Centro(Centro c1, String num, BaseDeDatos Base) {
        
        initComponents();
        
        ModificarNombreCentroTF.setDocument(new LimiteJTextField1(40));
        ModificarNumeroCentroTF.setDocument(new LimiteJTextField1(4));
        ModificarDireccionCentroTF.setDocument(new LimiteJTextField1(60));
        ModificarLatitudCentroTF.setDocument(new LimiteJTextField1(8));    
        ModificarLongitudCentroTF.setDocument(new LimiteJTextField1(8));
        
        setLocationRelativeTo(null);
        setResizable(false);
        
        try
        {
        
        this.c1=c1;
        this.Base=Base;
        this.num=num;
        
        ModificarNombreCentroTF.setText(c1.getNomC());
        ModificarNumeroCentroTF.setText(c1.getNumero());
        ModificarDireccionCentroTF.setText(c1.getDireccion());
        ModificarLatitudCentroTF.setText(Double.toString(c1.getLatitud()));
        ModificarLongitudCentroTF.setText(Double.toString(c1.getLongitud()));
       
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
        
    }

    private Ventana_Modificar_Centro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void Modificar ()
    {
        Centro c2 = new Centro ();
        c2.setNomC(ModificarNombreCentroTF.getText());
        c2.setNumero(ModificarNumeroCentroTF.getText());
        c2.setDireccion(ModificarDireccionCentroTF.getText());
        c2.setLatitud(Double.parseDouble(ModificarLatitudCentroTF.getText())); 
        c2.setLongitud(Double.parseDouble(ModificarLongitudCentroTF.getText()));
        
        
        try
        {
        System.out.println(num);
        Base.getBC().remove(num);
        Base.setBC(c2.getNumero(), c2);
       }
       catch (Exception e)
       {
           System.out.println("error");
       }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ModificarNombreCentro = new javax.swing.JLabel();
        ModificarNombreCentroTF = new javax.swing.JTextField();
        ModificarNumeroCentro = new javax.swing.JLabel();
        ModificarNumeroCentroTF = new javax.swing.JTextField();
        ModificarDireccionCentro = new javax.swing.JLabel();
        ModificarDireccionCentroTF = new javax.swing.JTextField();
        ModificarLatitudCentro = new javax.swing.JLabel();
        ModificarLatitudCentroTF = new javax.swing.JTextField();
        ModificarLongitudCentro = new javax.swing.JLabel();
        ModificarLongitudCentroTF = new javax.swing.JTextField();
        ModificarCentro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ModificarNombreCentro.setText("Nombre del Centro");

        ModificarNumeroCentro.setText("Número del Centro");

        ModificarNumeroCentroTF.setText(" ");

        ModificarDireccionCentro.setText("Dirección");

        ModificarLatitudCentro.setText("Latitud del Centro");

        ModificarLongitudCentro.setText("Longitud del Centro");

        ModificarCentro.setText("Modificar");
        ModificarCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarCentroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ModificarCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ModificarNombreCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModificarNumeroCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModificarDireccionCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModificarLatitudCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModificarLongitudCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModificarNumeroCentroTF, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(ModificarNombreCentroTF)
                    .addComponent(ModificarDireccionCentroTF)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ModificarLatitudCentroTF, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(ModificarLongitudCentroTF))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarNombreCentro)
                    .addComponent(ModificarNombreCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarNumeroCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModificarNumeroCentro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarDireccionCentro)
                    .addComponent(ModificarDireccionCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarLatitudCentro)
                    .addComponent(ModificarLatitudCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarLongitudCentro)
                    .addComponent(ModificarLongitudCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ModificarCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarCentroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarCentroMouseClicked
        
        Modificar();
        Ventana_Centros vAux = new Ventana_Centros (Base);
        vAux.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ModificarCentroMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana_Modificar_Centro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Modificar_Centro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Modificar_Centro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Modificar_Centro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Modificar_Centro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ModificarCentro;
    private javax.swing.JLabel ModificarDireccionCentro;
    private javax.swing.JTextField ModificarDireccionCentroTF;
    private javax.swing.JLabel ModificarLatitudCentro;
    private javax.swing.JTextField ModificarLatitudCentroTF;
    private javax.swing.JLabel ModificarLongitudCentro;
    private javax.swing.JTextField ModificarLongitudCentroTF;
    private javax.swing.JLabel ModificarNombreCentro;
    private javax.swing.JTextField ModificarNombreCentroTF;
    private javax.swing.JLabel ModificarNumeroCentro;
    private javax.swing.JTextField ModificarNumeroCentroTF;
    // End of variables declaration//GEN-END:variables
}
