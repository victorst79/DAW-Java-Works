/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author medina
 */
public class HiloCuenta2 extends javax.swing.JFrame{
    int desde, hasta;
    Thread hiloCuenta;
        
    public HiloCuenta2() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(480, 200);
    }
    
    class Hilo extends Thread {
        public Hilo(String nombre) {
            super(nombre);
        }
        
        public void run() {
            try{
            contar();
            } catch(InterruptedException e) {}
        }
    }
    public void contar() throws InterruptedException {
        leerDatos();
        for(int i=desde; i<=hasta; i++) {
            tfContar.setText("" + i);
            //try{
            Thread.sleep(1000);
            //} catch(InterruptedException e) {}
        }
    }
    
    public void leerDatos() {
        try{
            desde = Integer.parseInt(tfDesde.getText());
        } catch(NumberFormatException e) {
            desde=1;
            tfDesde.setText("" + desde);
        }
        try{
            hasta = Integer.parseInt(tfHasta.getText());
        } catch(NumberFormatException e) {
            hasta=100;
            tfHasta.setText("" + hasta);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfDesde = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        tfHasta = new java.awt.TextField();
        bContar = new javax.swing.JButton();
        tfContar = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejemplo bloque try");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Desde");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(44, 68, 60, 20);

        tfDesde.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDesdeActionPerformed(evt);
            }
        });
        getContentPane().add(tfDesde);
        tfDesde.setBounds(110, 70, 60, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Hasta");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 70, 50, 20);

        tfHasta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHastaActionPerformed(evt);
            }
        });
        getContentPane().add(tfHasta);
        tfHasta.setBounds(260, 70, 70, 23);

        bContar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bContar.setText("Contar");
        bContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bContarActionPerformed(evt);
            }
        });
        getContentPane().add(bContar);
        bContar.setBounds(230, 130, 80, 25);

        tfContar.setEditable(false);
        tfContar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(tfContar);
        tfContar.setBounds(380, 70, 80, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDesdeActionPerformed
       tfHasta.requestFocus();
    }//GEN-LAST:event_tfDesdeActionPerformed

    private void tfHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHastaActionPerformed
        try{
            contar();
        } catch(InterruptedException e) {}
    }//GEN-LAST:event_tfHastaActionPerformed

    private void bContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bContarActionPerformed
        hiloCuenta = new Hilo("Hilo cuenta");
        hiloCuenta.start();        
    }//GEN-LAST:event_bContarActionPerformed

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
            java.util.logging.Logger.getLogger(HiloCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HiloCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HiloCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HiloCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HiloCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bContar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.TextField tfContar;
    private java.awt.TextField tfDesde;
    private java.awt.TextField tfHasta;
    // End of variables declaration//GEN-END:variables
}
