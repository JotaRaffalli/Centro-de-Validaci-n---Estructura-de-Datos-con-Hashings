
package GUI.Electores;

import Fuentes.BaseDeDatos;
import Fuentes.Elector;


public class Ventana_Modificar_Elector extends javax.swing.JFrame {
    
//Atributos
    private Elector elec1;
    private BaseDeDatos Base;
    private String ced;
    
    public Ventana_Modificar_Elector(Elector e3, String cedula2, BaseDeDatos Base) {
        
        initComponents();
        
        ModificarNombreTF.setDocument(new LimiteJTextField(40));
        ModificarCedulaTF.setDocument(new LimiteJTextField(9));
        ModificarNacimientoTF.setDocument(new LimiteJTextField(10));
        ModificarLatitudTF.setDocument(new LimiteJTextField(8));    
        ModificarLongitudTF.setDocument(new LimiteJTextField(8));
        
        setLocationRelativeTo(null);
        setResizable(false);
        
       try 
       {
        this.ced=cedula2;
        this.elec1=e3;
        this.Base=Base;
        
        ModificarNombreTF.setText(elec1.getNomE());
        ModificarCedulaTF.setText(elec1.getCed());
        ModificarNacimientoTF.setText(elec1.getFechaN());
        ModificarLatitudTF.setText(Double.toString(elec1.getLatitud()));
        ModificarLongitudTF.setText(Double.toString(elec1.getLongitud()));
        
       }
       catch (Exception e)
       {
           System.out.println("Error");
       }
        
    }

    private Ventana_Modificar_Elector() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Modificar ()
    {
        Elector elec2 = new Elector();
        elec2.setNomE(ModificarNombreTF.getText());
        elec2.setCed(ModificarCedulaTF.getText());
        elec2.setFechaN(ModificarNacimientoTF.getText());
        elec2.setLatitud(Double.parseDouble(ModificarLatitudTF.getText())); 
        elec2.setLongitud(Double.parseDouble(ModificarLongitudTF.getText()));
        
        
        try
        {
        System.out.println(ced);
        Base.getBE().remove(ced);
        Base.setBE(elec2.getCed(), elec2);
       }
       catch (Exception e)
       {
           System.out.println("error");
        }
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ModificarNombre = new javax.swing.JLabel();
        ModificarNombreTF = new javax.swing.JTextField();
        ModificarCedula = new javax.swing.JLabel();
        ModificarCedulaTF = new javax.swing.JTextField();
        ModificarNacimiento = new javax.swing.JLabel();
        ModificarNacimientoTF = new javax.swing.JTextField();
        ModificarLatitud = new javax.swing.JLabel();
        ModificarLatitudTF = new javax.swing.JTextField();
        ModificarLongitud = new javax.swing.JLabel();
        ModificarLongitudTF = new javax.swing.JTextField();
        ModificarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ModificarNombre.setText("Nombre Completo");

        ModificarCedula.setText("Cédula");

        ModificarCedulaTF.setText(" ");

        ModificarNacimiento.setText("Fecha de Nacimiento");

        ModificarLatitud.setText("Latitud de Domicilio");

        ModificarLongitud.setText("Longitud de Domicilio");

        ModificarUsuario.setText("Modificar");
        ModificarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ModificarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModificarCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModificarNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModificarLatitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModificarLongitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModificarCedulaTF, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(ModificarNombreTF)
                    .addComponent(ModificarNacimientoTF)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ModificarLatitudTF, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(ModificarLongitudTF))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarNombre)
                    .addComponent(ModificarNombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarCedulaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModificarCedula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarNacimiento)
                    .addComponent(ModificarNacimientoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarLatitud)
                    .addComponent(ModificarLatitudTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarLongitud)
                    .addComponent(ModificarLongitudTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarUsuarioMouseClicked
        
        Modificar ();
        Ventana_Electores vAux = new Ventana_Electores (Base);
        vAux.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ModificarUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana_Modificar_Elector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Modificar_Elector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Modificar_Elector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Modificar_Elector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Modificar_Elector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ModificarCedula;
    private javax.swing.JTextField ModificarCedulaTF;
    private javax.swing.JLabel ModificarLatitud;
    private javax.swing.JTextField ModificarLatitudTF;
    private javax.swing.JLabel ModificarLongitud;
    private javax.swing.JTextField ModificarLongitudTF;
    private javax.swing.JLabel ModificarNacimiento;
    private javax.swing.JTextField ModificarNacimientoTF;
    private javax.swing.JLabel ModificarNombre;
    private javax.swing.JTextField ModificarNombreTF;
    private javax.swing.JButton ModificarUsuario;
    // End of variables declaration//GEN-END:variables
}
