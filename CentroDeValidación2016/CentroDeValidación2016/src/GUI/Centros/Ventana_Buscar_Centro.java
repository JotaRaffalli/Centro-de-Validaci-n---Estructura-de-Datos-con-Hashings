
package GUI.Centros;

import Fuentes.BaseDeDatos;
import Fuentes.Centro;
import GUI.Centros.Ventana_Centros;


public class Ventana_Buscar_Centro extends javax.swing.JFrame {

    String num;
    Centro c1;
    
    public Ventana_Buscar_Centro(Centro c1) {
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        try
        {
        
        this.c1=c1;
        BuscarNombreCentroTF.setText(c1.getNomC());
        BuscarNumeroCentroTF.setText(c1.getNumero());
        BuscarDireccionCentroTF.setText(c1.getDireccion());
        BuscarLatitudCentroTF.setText(Double.toString(c1.getLatitud()));
        BuscarLongitudCentroTF.setText(Double.toString(c1.getLongitud()));
       
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
    }

    private Ventana_Buscar_Centro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscarNombreCentro = new javax.swing.JLabel();
        BuscarNombreCentroTF = new javax.swing.JTextField();
        BuscarNumeroCentro = new javax.swing.JLabel();
        BuscarNumeroCentroTF = new javax.swing.JTextField();
        BuscarDireccionCentro = new javax.swing.JLabel();
        BuscarDireccionCentroTF = new javax.swing.JTextField();
        BuscarLatitudCentro = new javax.swing.JLabel();
        BuscarLatitudCentroTF = new javax.swing.JTextField();
        BuscarLongitudCentro = new javax.swing.JLabel();
        BuscarLongitudCentroTF = new javax.swing.JTextField();
        AtrasCentro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BuscarNombreCentro.setText("Nombre del Centro");

        BuscarNumeroCentro.setText("Número del Centro");

        BuscarNumeroCentroTF.setText(" ");

        BuscarDireccionCentro.setText("Dirección");

        BuscarLatitudCentro.setText("Latitud del Centro");

        BuscarLongitudCentro.setText("Longitud del Centro");

        AtrasCentro.setText("Atrás");
        AtrasCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrasCentroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AtrasCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BuscarNombreCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BuscarNumeroCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BuscarDireccionCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BuscarLatitudCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BuscarLongitudCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BuscarNumeroCentroTF, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(BuscarNombreCentroTF)
                    .addComponent(BuscarDireccionCentroTF)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BuscarLatitudCentroTF, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(BuscarLongitudCentroTF))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarNombreCentro)
                    .addComponent(BuscarNombreCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarNumeroCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarNumeroCentro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarDireccionCentro)
                    .addComponent(BuscarDireccionCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarLatitudCentro)
                    .addComponent(BuscarLatitudCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarLongitudCentro)
                    .addComponent(BuscarLongitudCentroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AtrasCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasCentroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasCentroMouseClicked
        
        this.setVisible(false);
        
    }//GEN-LAST:event_AtrasCentroMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana_Buscar_Centro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Buscar_Centro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Buscar_Centro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Buscar_Centro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Ventana_Buscar_Centro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasCentro;
    private javax.swing.JLabel BuscarDireccionCentro;
    private javax.swing.JTextField BuscarDireccionCentroTF;
    private javax.swing.JLabel BuscarLatitudCentro;
    private javax.swing.JTextField BuscarLatitudCentroTF;
    private javax.swing.JLabel BuscarLongitudCentro;
    private javax.swing.JTextField BuscarLongitudCentroTF;
    private javax.swing.JLabel BuscarNombreCentro;
    private javax.swing.JTextField BuscarNombreCentroTF;
    private javax.swing.JLabel BuscarNumeroCentro;
    private javax.swing.JTextField BuscarNumeroCentroTF;
    // End of variables declaration//GEN-END:variables
}
