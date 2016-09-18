
package GUI.Centros;

import Fuentes.BaseDeDatos;
import Fuentes.Centro;


public class Ventana_Agregar_Centro extends javax.swing.JFrame {

    
    BaseDeDatos Base;
    Centro c;
    
    
    public Ventana_Agregar_Centro(BaseDeDatos Base) {
        
        initComponents();
        
        AgregarNombreCentroTF.setDocument(new LimiteJTextField1(40));
        AgregarNumeroCentroTF.setDocument(new LimiteJTextField1(4));
        AgregarDireccionCentroTF.setDocument(new LimiteJTextField1(60));
        AgregarLatitudCentroTF.setDocument(new LimiteJTextField1(8));    
        AgregarLongitudCentroTF.setDocument(new LimiteJTextField1(8));
        
        setLocationRelativeTo(null);
        setResizable(false);
        this.Base=Base;
    }

    private Ventana_Agregar_Centro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgregarNombreCentro = new javax.swing.JLabel();
        AgregarNombreCentroTF = new javax.swing.JTextField();
        AgregarNumeroCentro = new javax.swing.JLabel();
        AgregarNumeroCentroTF = new javax.swing.JTextField();
        AgregarDireccionCentro = new javax.swing.JLabel();
        AgregarDireccionCentroTF = new javax.swing.JTextField();
        AgregarLatitudCentro = new javax.swing.JLabel();
        AgregarLatitudCentroTF = new javax.swing.JTextField();
        AgregarLongitudCentro = new javax.swing.JLabel();
        AgregarLongitudCentroTF = new javax.swing.JTextField();
        AgregarCentro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AgregarNombreCentro.setText("Nombre del Centro");

        AgregarNumeroCentro.setText("Número del Centro");

        AgregarDireccionCentro.setText("Dirección");

        AgregarLatitudCentro.setText("Latitud del Centro");

        AgregarLongitudCentro.setText("Longitud del Centro");

        AgregarCentro.setText("Agregar");
        AgregarCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarCentroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AgregarCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(AgregarNombreCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AgregarNumeroCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AgregarDireccionCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AgregarLatitudCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AgregarLongitudCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgregarNumeroCentroTF, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(AgregarNombreCentroTF)
                    .addComponent(AgregarDireccionCentroTF)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AgregarLatitudCentroTF, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(AgregarLongitudCentroTF))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarNombreCentro)
                    .addComponent(AgregarNombreCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarNumeroCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarNumeroCentro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarDireccionCentro)
                    .addComponent(AgregarDireccionCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarLatitudCentro)
                    .addComponent(AgregarLatitudCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarLongitudCentro)
                    .addComponent(AgregarLongitudCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AgregarCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarCentroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarCentroMouseClicked
        if (AgregarNumeroCentroTF.getText().equals(""))
        {
            
        } 
        else 
        {
            String num = AgregarNumeroCentroTF.getText();
            c = new Centro (num , AgregarNombreCentroTF.getText(), AgregarDireccionCentroTF.getText(), Double.parseDouble(AgregarLatitudCentroTF.getText()), Double.parseDouble(AgregarLongitudCentroTF.getText()));
            
            Base.setBC(AgregarNumeroCentroTF.getText(), c);
            
            for (String key : Base.getBC().keySet()){
                Centro aux = Base.getBC().get(key);
                System.out.println("Numero: "+key+" | Nombre: "+aux.getNomC());}
            
            Ventana_Centros vAux = new Ventana_Centros (Base);
            vAux.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_AgregarCentroMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana_Agregar_Centro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Agregar_Centro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Agregar_Centro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Agregar_Centro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Ventana_Agregar_Centro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCentro;
    private javax.swing.JLabel AgregarDireccionCentro;
    private javax.swing.JTextField AgregarDireccionCentroTF;
    private javax.swing.JLabel AgregarLatitudCentro;
    private javax.swing.JTextField AgregarLatitudCentroTF;
    private javax.swing.JLabel AgregarLongitudCentro;
    private javax.swing.JTextField AgregarLongitudCentroTF;
    private javax.swing.JLabel AgregarNombreCentro;
    private javax.swing.JTextField AgregarNombreCentroTF;
    private javax.swing.JLabel AgregarNumeroCentro;
    private javax.swing.JTextField AgregarNumeroCentroTF;
    // End of variables declaration//GEN-END:variables
}
