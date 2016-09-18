
package GUI.Electores;

import Fuentes.BaseDeDatos;
import Fuentes.Elector;


public class Ventana_Agregar_Elector extends javax.swing.JFrame {

    BaseDeDatos Base ;
    Elector e;
    
    
    public Ventana_Agregar_Elector(BaseDeDatos Base) {
        initComponents();
        
        AgregarNombreTF.setDocument(new LimiteJTextField(40));
        AgregarCedulaTF.setDocument(new LimiteJTextField(9));
        AgregarNacimientoTF.setDocument(new LimiteJTextField(10));
        AgregarLatitudTF.setDocument(new LimiteJTextField(8));    
        AgregarLongitudTF.setDocument(new LimiteJTextField(8));
        
        setLocationRelativeTo(null);
        setResizable(false);
        this.Base=Base;
    }

    private Ventana_Agregar_Elector() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgregarNombre = new javax.swing.JLabel();
        AgregarNombreTF = new javax.swing.JTextField();
        AgregarCedula = new javax.swing.JLabel();
        AgregarCedulaTF = new javax.swing.JTextField();
        AgregarNacimiento = new javax.swing.JLabel();
        AgregarNacimientoTF = new javax.swing.JTextField();
        AgregarLatitud = new javax.swing.JLabel();
        AgregarLatitudTF = new javax.swing.JTextField();
        AgregarLongitud = new javax.swing.JLabel();
        AgregarLongitudTF = new javax.swing.JTextField();
        AgregarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AgregarNombre.setText("Nombre Completo");

        AgregarCedula.setText("Cédula");

        AgregarNacimiento.setText("Fecha de Nacimiento");

        AgregarLatitud.setText("Latitud de Domicilio");

        AgregarLongitud.setText("Longitud de Domicilio");

        AgregarUsuario.setText("Agregar");
        AgregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AgregarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AgregarCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AgregarNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgregarCedulaTF, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(AgregarNombreTF)
                            .addComponent(AgregarNacimientoTF))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AgregarLatitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AgregarLongitud))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AgregarLatitudTF, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(AgregarLongitudTF))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarNombre)
                    .addComponent(AgregarNombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarCedulaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarCedula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarNacimiento)
                    .addComponent(AgregarNacimientoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarLatitud)
                    .addComponent(AgregarLatitudTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarLongitud)
                    .addComponent(AgregarLongitudTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarUsuarioMouseClicked
        if (AgregarCedulaTF.getText().equals(""))
        {
            
        } 
        else 
        {
        String ced = AgregarCedulaTF.getText();
        e = new Elector (ced , AgregarNombreTF.getText(), AgregarNacimientoTF.getText(), Double.parseDouble(AgregarLatitudTF.getText()), Double.parseDouble(AgregarLongitudTF.getText()));
        
        Base.setBE(AgregarCedulaTF.getText(), e);
        
        for (String key : Base.getBE().keySet()){
              Elector aux = Base.getBE().get(key);
              System.out.println("Cedula: "+key+" | Nombre: "+aux.getNomE());}
        
        
        Ventana_Electores vAux = new Ventana_Electores (Base);
        vAux.setVisible(true);
        this.setVisible(false);
        }
        
    }//GEN-LAST:event_AgregarUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana_Agregar_Elector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Agregar_Elector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Agregar_Elector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Agregar_Elector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Agregar_Elector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgregarCedula;
    private javax.swing.JTextField AgregarCedulaTF;
    private javax.swing.JLabel AgregarLatitud;
    private javax.swing.JTextField AgregarLatitudTF;
    private javax.swing.JLabel AgregarLongitud;
    private javax.swing.JTextField AgregarLongitudTF;
    private javax.swing.JLabel AgregarNacimiento;
    private javax.swing.JTextField AgregarNacimientoTF;
    private javax.swing.JLabel AgregarNombre;
    private javax.swing.JTextField AgregarNombreTF;
    private javax.swing.JButton AgregarUsuario;
    // End of variables declaration//GEN-END:variables
}
