
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class VistaMulta extends javax.swing.JFrame {

    /**
     * Creates new form VistaMulta
     */
    Controlador control;
    Coche automovil;
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public VistaMulta() {
        control = new Controlador();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tAño = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cMes = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        lPenalizacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de multas");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 82, 550, 10));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 570, 190));

        jButton1.setText("Consultar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarConsulta(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 100, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirApp(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 100, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Año");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));
        getContentPane().add(tAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 140, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Mes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        cMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        getContentPane().add(cMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 150, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Total Penalizacion:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        lPenalizacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lPenalizacion.setForeground(new java.awt.Color(255, 0, 51));
        lPenalizacion.setText("0");
        getContentPane().add(lPenalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 60, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarConsulta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarConsulta
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo.addColumn("Infraccion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Matricula");
        modelo.addColumn("Conductor");
        modelo.addColumn("Penalizacion");
        
        String auxMes = String.format("%02d", cMes.getSelectedIndex() + 1);
        int contador = 0;
        
        ResultSet resultado = control.obtenerTotalInfraccion(Integer.parseInt(tAño.getText()), auxMes);
        
        try {
            while (resultado.next()) {                
                modelo.addRow(new Object[]{resultado.getString("infraccion"),resultado.getString("fecha"),resultado.getString("matricula"),
                resultado.getString("nombre"),resultado.getString("penalizacion")});
                
                contador+=Integer.parseInt(resultado.getString("penalizacion"));
            }
        } catch (SQLException e) {
            System.out.println("FALLO mostrarConsulta");
        }
        
        lPenalizacion.setText(""+contador);
    }//GEN-LAST:event_mostrarConsulta

    private void salirApp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirApp
        System.exit(0);
    }//GEN-LAST:event_salirApp

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
            java.util.logging.Logger.getLogger(VistaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lPenalizacion;
    private javax.swing.JTextField tAño;
    // End of variables declaration//GEN-END:variables
}
