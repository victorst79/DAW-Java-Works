
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor
 */
public class Cronometro extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form Cronometro
     */
    int horas,minutos,segundos,msegundos;
    String sHoras,sMinutos, sSegundos, sMsegundos;
    Thread cronometro;
    
    public Cronometro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lCronometro = new javax.swing.JLabel();
        bIniciar = new javax.swing.JButton();
        bParar = new javax.swing.JButton();
        bResetear = new javax.swing.JButton();
        bReanudar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cronometro");
        setMinimumSize(new java.awt.Dimension(500, 200));
        setPreferredSize(new java.awt.Dimension(500, 200));
        setResizable(false);

        lCronometro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lCronometro.setText("00:00:00,00");

        bIniciar.setText("Iniciar");
        bIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iniciar(evt);
            }
        });

        bParar.setText("Parar");
        bParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Parar(evt);
            }
        });

        bResetear.setText("Resetear");
        bResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Resetear(evt);
            }
        });

        bReanudar.setText("Reanudar");
        bReanudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reanudar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(bIniciar)
                .addGap(46, 46, 46)
                .addComponent(bParar)
                .addGap(43, 43, 43)
                .addComponent(bReanudar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(bResetear)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lCronometro)
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(lCronometro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIniciar)
                    .addComponent(bParar)
                    .addComponent(bResetear)
                    .addComponent(bReanudar))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void crono() throws InterruptedException{
        while (Thread.currentThread() == cronometro) {            
            Thread.sleep(10);
            msegundos++;
            if (msegundos >= 60) {
                msegundos = 0;
                segundos++;
                if (segundos >= 60) {
                    segundos = 0;
                    minutos++;
                    if (minutos >= 60) {
                        minutos = 0;
                        horas++;
                        if (horas >= 24) {
                            horas = 0;
                            horas++;
                        }
                    }
                }
            }
            sHoras = String.format("%02d",horas);
            sMinutos = String.format("%02d",minutos);
            sSegundos = String.format("%02d",segundos);
            sMsegundos = String.format("%02d",msegundos);
            lCronometro.setText(sHoras+":"+sMinutos+":"+sSegundos+","+sMsegundos);
        }
    }
    
    private void Iniciar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iniciar
        cronometro = null;
        cronometro = new Thread(this);
        cronometro.start();
    }//GEN-LAST:event_Iniciar

    private void Parar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Parar
        try {
            cronometro.suspend();    
        } catch (NullPointerException e) {}
    }//GEN-LAST:event_Parar

    private void Resetear(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Resetear
        try {
            cronometro.suspend();
            cronometro = null;
            horas = 0;
            minutos = 0;
            segundos = 0;
            msegundos = 0;
            lCronometro.setText("00:00:00,00"); 
        } catch (NullPointerException e) {}
               
    }//GEN-LAST:event_Resetear

    private void Reanudar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reanudar
        try {
            cronometro.resume();
        } catch (NullPointerException e) {}
    }//GEN-LAST:event_Reanudar
    
    public void run(){
        try {
            crono();
        } catch (InterruptedException e) {}
    }
    
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
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cronometro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bIniciar;
    private javax.swing.JButton bParar;
    private javax.swing.JButton bReanudar;
    private javax.swing.JButton bResetear;
    private javax.swing.JLabel lCronometro;
    // End of variables declaration//GEN-END:variables
}
