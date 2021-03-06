/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victo
 */
import java.util.Vector;
    import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
public class Practica7Extra extends javax.swing.JFrame {

    /**
     * Creates new form Practica10
     */
    public Practica7Extra() {
        initComponents();
    }
    
    // CONSTRUCTORES MODELOS
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modeloCambio = new DefaultTableModel();
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dCambio = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        tCambio = new javax.swing.JScrollPane();
        tCambioTabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tTabla = new javax.swing.JTable();
        bAdd = new javax.swing.JButton();
        bEliminarFila = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        bAddColumna = new javax.swing.JButton();
        tColumna = new javax.swing.JTextField();
        bCambiarNombre = new javax.swing.JButton();
        bBorrarColumna = new javax.swing.JButton();

        dCambio.setMinimumSize(new java.awt.Dimension(700, 320));
        dCambio.setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Cambiar nombre de la columna y pulsar \"Siguiente\"");

        tCambioTabla.setModel(modeloCambio
        );
        tCambio.setViewportView(tCambioTabla);

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambioNombreColumna(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        jLabel2.setText("Pulsa Enter para confirmar los cambios");

        javax.swing.GroupLayout dCambioLayout = new javax.swing.GroupLayout(dCambio.getContentPane());
        dCambio.getContentPane().setLayout(dCambioLayout);
        dCambioLayout.setHorizontalGroup(
            dCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dCambioLayout.createSequentialGroup()
                .addGroup(dCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dCambioLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1))
                    .addGroup(dCambioLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(dCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dCambioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(311, 311, 311))
        );
        dCambioLayout.setVerticalGroup(
            dCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dCambioLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Filas y Columnas");
        setMinimumSize(new java.awt.Dimension(700, 480));
        setResizable(false);

        tTabla.setModel(modelo);
        jScrollPane1.setViewportView(tTabla);

        bAdd.setText("Añadir Fila");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFila(evt);
            }
        });

        bEliminarFila.setText("Eliminar Fila");
        bEliminarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarFila(evt);
            }
        });

        bLimpiar.setText("Limpiar");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarTabla(evt);
            }
        });

        bAddColumna.setText("Nueva Columna");
        bAddColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaColumna(evt);
            }
        });

        tColumna.setText("Columna");

        bCambiarNombre.setText("Cambiar nombre de columnas");
        bCambiarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirDialogCambioNombres(evt);
            }
        });

        bBorrarColumna.setText("Borrar Columna");
        bBorrarColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarColumna(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bCambiarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bBorrarColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bAddColumna)
                                    .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bEliminarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(bLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tColumna))))
                        .addGap(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEliminarFila)
                    .addComponent(bLimpiar)
                    .addComponent(bAdd))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAddColumna)
                    .addComponent(tColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCambiarNombre)
                    .addComponent(bBorrarColumna))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void AddFila(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFila
        try {
            modelo.addRow(new Object[]{"","","",""});
        } catch (Exception e) {
        }
    }//GEN-LAST:event_AddFila

    private void NuevaColumna(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaColumna
        try {
            modelo.addColumn(tColumna.getText());
            tColumna.setText(null);
            tColumna.requestFocus();
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }//GEN-LAST:event_NuevaColumna

    private void EliminarFila(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarFila
        try {
            modelo.removeRow(tTabla.getSelectedRow());
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }//GEN-LAST:event_EliminarFila

    private void LimpiarTabla(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarTabla
        try {
            int count = modelo.getRowCount();
            for (int i = 0; i <= count ; i++) {
                modelo.removeRow(0);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }//GEN-LAST:event_LimpiarTabla

    private void BorrarColumna(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarColumna
        try {
            tTabla.removeColumn(tTabla.getColumnModel().getColumn(modelo.getColumnCount()-1));
            modelo.setColumnCount(modelo.getColumnCount()-1);
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }//GEN-LAST:event_BorrarColumna

    private void AbrirDialogCambioNombres(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirDialogCambioNombres
        modeloCambio.setColumnCount(0);
        modeloCambio.setRowCount(0);
        dCambio.setVisible(true);
        
        for (int i = 1; i <= modelo.getColumnCount(); i++) {
            modeloCambio.addColumn("Columna "+i);
        }
        
        modeloCambio.addRow(new Object[]{""});
        modeloCambio.setNumRows(1);
        
    }//GEN-LAST:event_AbrirDialogCambioNombres

    private void CambioNombreColumna(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambioNombreColumna
        dCambio.setVisible(false);
        Vector identif = new Vector();
        for (int i = 0; i < modeloCambio.getColumnCount(); i++) {
            identif.add(tCambioTabla.getValueAt(0, i));
        }
        modelo.setColumnIdentifiers(identif);
    }//GEN-LAST:event_CambioNombreColumna

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
            java.util.logging.Logger.getLogger(Practica7Extra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica7Extra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica7Extra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica7Extra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica7Extra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bAddColumna;
    private javax.swing.JButton bBorrarColumna;
    private javax.swing.JButton bCambiarNombre;
    private javax.swing.JButton bEliminarFila;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JDialog dCambio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane tCambio;
    private javax.swing.JTable tCambioTabla;
    private javax.swing.JTextField tColumna;
    private javax.swing.JTable tTabla;
    // End of variables declaration//GEN-END:variables
}
