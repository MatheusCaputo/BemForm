/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerPesquisa;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Usuário
 */
public class PesquisaView extends javax.swing.JFrame {

    private final ControllerPesquisa controller;

    /**
     * Creates new form PesquisaView
     */
    public PesquisaView() throws SQLException {
        initComponents();
        controller = new ControllerPesquisa(this);
        controller.preenchePergunta();
        controller.preencherRespostas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        labelPergunta1 = new javax.swing.JLabel();
        labelPergunta2 = new javax.swing.JLabel();
        labelPergunta3 = new javax.swing.JLabel();
        labelPergunta4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbRespostas1 = new javax.swing.JComboBox<>();
        cbRespostas2 = new javax.swing.JComboBox<>();
        cbRespostas3 = new javax.swing.JComboBox<>();
        cbRespostas4 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PESQUISA");

        labelPergunta1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelPergunta1.setText("pergunta1");

        labelPergunta2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelPergunta2.setText("pergunta2");

        labelPergunta3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelPergunta3.setText("pergunta3");

        labelPergunta4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelPergunta4.setText("pergunta4");

        jButton1.setText("Enviar respostas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Por favor escolha suas respostas e após conferir todas, clique em Enviar respostas.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelPergunta1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbRespostas3, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                                    .addComponent(cbRespostas1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPergunta3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelPergunta4)
                                            .addComponent(cbRespostas4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelPergunta2)
                                            .addComponent(cbRespostas2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(labelPergunta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbRespostas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(labelPergunta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbRespostas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPergunta3)
                    .addComponent(labelPergunta4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRespostas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRespostas4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            controller.salvarPesquisa();
        } catch (SQLException ex) {
            Logger.getLogger(PesquisaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PesquisaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PesquisaView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PesquisaView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public JLabel getLabelPergunta1() {
        return labelPergunta1;
    }

    public void setLabelPergunta1(JLabel labelPergunta1) {
        this.labelPergunta1 = labelPergunta1;
    }

    public JLabel getLabelPergunta2() {
        return labelPergunta2;
    }

    public void setLabelPergunta2(JLabel labelPergunta2) {
        this.labelPergunta2 = labelPergunta2;
    }

    public JLabel getLabelPergunta3() {
        return labelPergunta3;
    }

    public void setLabelPergunta3(JLabel labelPergunta3) {
        this.labelPergunta3 = labelPergunta3;
    }

    public JLabel getLabelPergunta4() {
        return labelPergunta4;
    }

    public void setLabelPergunta4(JLabel labelPergunta4) {
        this.labelPergunta4 = labelPergunta4;
    }

    public JComboBox<String> getCbRespostas1() {
        return cbRespostas1;
    }

    public void setCbRespostas1(JComboBox<String> cbRespostas1) {
        this.cbRespostas1 = cbRespostas1;
    }

    public JComboBox<String> getCbRespostas2() {
        return cbRespostas2;
    }

    public void setCbRespostas2(JComboBox<String> cbRespostas2) {
        this.cbRespostas2 = cbRespostas2;
    }

    public JComboBox<String> getCbRespostas3() {
        return cbRespostas3;
    }

    public void setCbRespostas3(JComboBox<String> cbRespostas3) {
        this.cbRespostas3 = cbRespostas3;
    }

    public JComboBox<String> getCbRespostas4() {
        return cbRespostas4;
    }

    public void setCbRespostas4(JComboBox<String> cbRespostas4) {
        this.cbRespostas4 = cbRespostas4;
    }

   

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbRespostas1;
    private javax.swing.JComboBox<String> cbRespostas2;
    private javax.swing.JComboBox<String> cbRespostas3;
    private javax.swing.JComboBox<String> cbRespostas4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelPergunta1;
    private javax.swing.JLabel labelPergunta2;
    private javax.swing.JLabel labelPergunta3;
    private javax.swing.JLabel labelPergunta4;
    // End of variables declaration//GEN-END:variables
}
