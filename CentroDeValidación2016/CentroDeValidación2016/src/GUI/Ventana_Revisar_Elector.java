/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Fuentes.BaseDeDatos;
import Fuentes.Centro;
import Fuentes.Elector;
import GUI.Electores.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author rocco
 */
public class Ventana_Revisar_Elector extends javax.swing.JFrame {
    
// Atributos
   BaseDeDatos Base;
   Elector e1;
   double n;
   float lat1;
   float long1;
   float lat2;
   float long2;
   double distancia;
   DefaultListModel modelo = new DefaultListModel ();
   
   
    public Ventana_Revisar_Elector(Elector e1,BaseDeDatos Base) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.Base=Base;
        this.e1=e1;
        ListaCentros.setModel(modelo);
        
        try
        {
        
        BuscarNombreTF.setText(e1.getNomE());
        BuscarCedulaTF.setText(e1.getCed());
        BuscarNacimientoTF.setText(e1.getFechaN());
        BuscarLatitudTF.setText(Double.toString(e1.getLatitud())); 
        BuscarLongitudTF.setText(Double.toString(e1.getLongitud()));
        
        }
        catch   (Exception e)
                {
                    System.out.println("error en ver usuario");
                }
    }
    
    public void Convert ()
    {
        lat1 = Float.parseFloat(BuscarLatitudTF.getText());       
        long1 = Float.parseFloat(BuscarLongitudTF.getText());
  
    }
    
    public double distancia (double lat1, double long1, double lat2, double long2)
    {
        double radioT = 6371;
        double dLat = Math.toRadians(lat2 - lat1);
        double dLong = Math.toRadians(long2 - long1);
        double sindLat = Math.sin(dLat / 2);
        double sindLong = Math.sin(dLong / 2);
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLong, 2)*Math.cos(Math.toRadians(lat1))*Math.cos(Math.toRadians(lat2));
        double va2 = 2*Math.atan2(Math.sqrt(va1), Math.sqrt(1-va1));
        distancia = radioT*va2;
        
        return distancia;
    
    }

    private Ventana_Revisar_Elector() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscarNombre = new javax.swing.JLabel();
        BuscarNombreTF = new javax.swing.JTextField();
        BuscarCedula = new javax.swing.JLabel();
        BuscarCedulaTF = new javax.swing.JTextField();
        BuscarNacimiento = new javax.swing.JLabel();
        BuscarNacimientoTF = new javax.swing.JTextField();
        BuscarLatitud = new javax.swing.JLabel();
        BuscarLatitudTF = new javax.swing.JTextField();
        BuscarLongitud = new javax.swing.JLabel();
        BuscarLongitudTF = new javax.swing.JTextField();
        BuscarCentros = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DistanciaNTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaCentros = new javax.swing.JList();
        InfoCentro = new javax.swing.JButton();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BuscarNombre.setText("Nombre Completo");

        BuscarCedula.setText("Cédula");

        BuscarCedulaTF.setText(" ");

        BuscarNacimiento.setText("Fecha de Nacimiento");

        BuscarLatitud.setText("Latitud de Domicilio");

        BuscarLongitud.setText("Longitud de Domicilio");

        BuscarCentros.setText("Buscar Centros");
        BuscarCentros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarCentrosMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText(" Por favor ingrese una distancia en Km con respecto a su domicilio");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText(" para conocer cuales centros de Validación están cerca de usted.");

        jScrollPane1.setViewportView(ListaCentros);

        InfoCentro.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        InfoCentro.setText("Ver Centro de Validación");
        InfoCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InfoCentroMouseClicked(evt);
            }
        });

        atras.setText("Atrás");
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DistanciaNTF, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(BuscarCentros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfoCentro)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BuscarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BuscarCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BuscarNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BuscarLatitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BuscarLongitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BuscarCedulaTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(BuscarNacimientoTF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BuscarNombreTF)
                                    .addComponent(BuscarLongitudTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(BuscarLatitudTF, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarNombre)
                    .addComponent(BuscarNombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarCedulaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarCedula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarNacimiento)
                    .addComponent(BuscarNacimientoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarLatitud)
                    .addComponent(BuscarLatitudTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarLongitud)
                    .addComponent(BuscarLongitudTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DistanciaNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BuscarCentros, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(InfoCentro)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InfoCentroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoCentroMouseClicked
        if (ListaCentros.getSelectedValue()== null)
        {
            
        }
        else
        {
            String NC = ListaCentros.getSelectedValue().toString();
            Centro CentroAux1 = Base.getBC().get(NC);
            Ventana_Información_Centro infocentro = new Ventana_Información_Centro (CentroAux1);
            infocentro.setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_InfoCentroMouseClicked

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        
        Ventana_Usuario ventanausuario = new Ventana_Usuario (Base);
        ventanausuario.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_atrasMouseClicked

    private void BuscarCentrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarCentrosMouseClicked
       
        modelo.clear();
        n = Double.parseDouble(DistanciaNTF.getText());
        Convert ();
        System.out.printf("Latitud Usuario : %.4f \n", lat1); // Esto es solo para comprobar
        System.out.printf("Longitud Usuario : %.4f \n", long1); // Esto es solo para comprobar
        
         for (String key : Base.getBC().keySet()) // Key es la clave o indice (Numero de centro)
         {
            Centro CentroAux = Base.getBC().get(key);
            
            
            float lat2 =((float)CentroAux.getLatitud());
            float long2 =(float)CentroAux.getLongitud();
            

            
            System.out.println("Latitud de domicilio: "+ lat2); // Esto es solo para comprobar
            System.out.println("Longitud de domicilio: "+ long2); // Esto es solo para comprobar
             
            distancia (lat1, long1, lat2, long2);
            CentroAux.setDistancia(distancia);

            
            
            System.out.println(distancia);
            
            if ( distancia <= n )
            {
                modelo.addElement(CentroAux.getNumero());
            }
         }
        
        
        
    }//GEN-LAST:event_BuscarCentrosMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana_Revisar_Elector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Revisar_Elector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Revisar_Elector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Revisar_Elector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Ventana_Revisar_Elector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BuscarCedula;
    private javax.swing.JTextField BuscarCedulaTF;
    private javax.swing.JButton BuscarCentros;
    private javax.swing.JLabel BuscarLatitud;
    private javax.swing.JTextField BuscarLatitudTF;
    private javax.swing.JLabel BuscarLongitud;
    private javax.swing.JTextField BuscarLongitudTF;
    private javax.swing.JLabel BuscarNacimiento;
    private javax.swing.JTextField BuscarNacimientoTF;
    private javax.swing.JLabel BuscarNombre;
    private javax.swing.JTextField BuscarNombreTF;
    private javax.swing.JTextField DistanciaNTF;
    private javax.swing.JButton InfoCentro;
    private javax.swing.JList ListaCentros;
    private javax.swing.JButton atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
