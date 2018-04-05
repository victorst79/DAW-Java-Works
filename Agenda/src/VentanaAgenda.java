
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class VentanaAgenda extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAgenda
     */
    
    AgendaBD agenda;
    Contacto contacto;
    
    public VentanaAgenda() {
        initComponents();
        setLocationRelativeTo( null );
        agenda = new AgendaBD();
        rellenarListaDesplegable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tDireccion = new javax.swing.JTextField();
        cAgenda = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        tLocalidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tEdad = new javax.swing.JTextField();
        bNuevo = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");
        setMinimumSize(new java.awt.Dimension(650, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Seleccionar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel2.setText("Datos del Contacto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        tNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNombreActionPerformed(evt);
            }
        });
        getContentPane().add(tNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 210, -1));

        jLabel4.setText("Direccion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        tDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(tDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 210, -1));

        getContentPane().add(cAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 210, -1));

        jLabel5.setText("Localidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));
        getContentPane().add(tLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 210, -1));

        jLabel6.setText("E-Mail");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));
        getContentPane().add(tEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 210, -1));

        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));
        getContentPane().add(tTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 210, -1));

        jLabel8.setText("Edad");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));
        getContentPane().add(tEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 210, -1));

        bNuevo.setText("Nuevo");
        getContentPane().add(bNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        bModificar.setText("Modificar");
        getContentPane().add(bModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        bBorrar.setText("Borrar");
        getContentPane().add(bBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, -1));

        bSalir.setText("Salir");
        getContentPane().add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void rellenarListaDesplegable(){
        ResultSet res = agenda.obtenerRegistros("contactos");
        try {
            if (res != null) {
            cAgenda.removeAll();
            while (res.next()) {                
                cAgenda.addItem(res.getString("nombre"));
            }
        }
        } catch (SQLException e) {
            System.out.println("Error rellenar de lista");
        }
        
    }
    
    private void tNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNombreActionPerformed

    private void tDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tDireccionActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JButton bSalir;
    private javax.swing.JComboBox cAgenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tEdad;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tLocalidad;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tTelefono;
    // End of variables declaration//GEN-END:variables
}
