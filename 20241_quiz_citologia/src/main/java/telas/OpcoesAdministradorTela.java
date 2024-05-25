/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Matheus
 */
public class OpcoesAdministradorTela extends javax.swing.JFrame {

  /**
   * Creates new form OpcoesAdministradorTela
   */
  public OpcoesAdministradorTela() {
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

    fundoOpcoesAdministradorTelaPanel = new javax.swing.JPanel();
    adicionarPerguntasButton = new javax.swing.JButton();
    removerPerguntasButton = new javax.swing.JButton();
    cadastrarUsuarioButton = new javax.swing.JButton();
    voltarButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMaximumSize(new java.awt.Dimension(1280, 720));
    setMinimumSize(new java.awt.Dimension(1280, 720));
    setResizable(false);

    fundoOpcoesAdministradorTelaPanel.setBackground(new java.awt.Color(56, 56, 56));
    fundoOpcoesAdministradorTelaPanel.setMaximumSize(new java.awt.Dimension(1280, 720));
    fundoOpcoesAdministradorTelaPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
    fundoOpcoesAdministradorTelaPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

    adicionarPerguntasButton.setBackground(new java.awt.Color(100, 100, 100));
    adicionarPerguntasButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
    adicionarPerguntasButton.setForeground(new java.awt.Color(255, 255, 255));
    adicionarPerguntasButton.setText("Adicionar perguntas");
    adicionarPerguntasButton.setMaximumSize(new java.awt.Dimension(320, 100));
    adicionarPerguntasButton.setMinimumSize(new java.awt.Dimension(320, 100));
    adicionarPerguntasButton.setPreferredSize(new java.awt.Dimension(320, 100));
    adicionarPerguntasButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        adicionarPerguntasButtonActionPerformed(evt);
      }
    });

    removerPerguntasButton.setBackground(new java.awt.Color(100, 100, 100));
    removerPerguntasButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
    removerPerguntasButton.setForeground(new java.awt.Color(255, 255, 255));
    removerPerguntasButton.setText("Remover perguntas");
    removerPerguntasButton.setMaximumSize(new java.awt.Dimension(320, 100));
    removerPerguntasButton.setMinimumSize(new java.awt.Dimension(320, 100));
    removerPerguntasButton.setPreferredSize(new java.awt.Dimension(320, 100));

    cadastrarUsuarioButton.setBackground(new java.awt.Color(100, 100, 100));
    cadastrarUsuarioButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
    cadastrarUsuarioButton.setForeground(new java.awt.Color(255, 255, 255));
    cadastrarUsuarioButton.setText("Cadastrar usuário");
    cadastrarUsuarioButton.setMaximumSize(new java.awt.Dimension(320, 100));
    cadastrarUsuarioButton.setMinimumSize(new java.awt.Dimension(320, 100));
    cadastrarUsuarioButton.setPreferredSize(new java.awt.Dimension(320, 100));
    cadastrarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cadastrarUsuarioButtonActionPerformed(evt);
      }
    });

    voltarButton.setBackground(new java.awt.Color(100, 100, 100));
    voltarButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    voltarButton.setForeground(new java.awt.Color(255, 255, 255));
    voltarButton.setText("Voltar");
    voltarButton.setMaximumSize(new java.awt.Dimension(90, 40));
    voltarButton.setMinimumSize(new java.awt.Dimension(90, 40));
    voltarButton.setPreferredSize(new java.awt.Dimension(90, 40));
    voltarButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        voltarButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout fundoOpcoesAdministradorTelaPanelLayout = new javax.swing.GroupLayout(fundoOpcoesAdministradorTelaPanel);
    fundoOpcoesAdministradorTelaPanel.setLayout(fundoOpcoesAdministradorTelaPanelLayout);
    fundoOpcoesAdministradorTelaPanelLayout.setHorizontalGroup(
      fundoOpcoesAdministradorTelaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoOpcoesAdministradorTelaPanelLayout.createSequentialGroup()
        .addContainerGap(480, Short.MAX_VALUE)
        .addGroup(fundoOpcoesAdministradorTelaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(removerPerguntasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(cadastrarUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(adicionarPerguntasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(480, 480, 480))
      .addGroup(fundoOpcoesAdministradorTelaPanelLayout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    fundoOpcoesAdministradorTelaPanelLayout.setVerticalGroup(
      fundoOpcoesAdministradorTelaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fundoOpcoesAdministradorTelaPanelLayout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(98, 98, 98)
        .addComponent(adicionarPerguntasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(52, 52, 52)
        .addComponent(removerPerguntasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(52, 52, 52)
        .addComponent(cadastrarUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(158, 158, 158))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoOpcoesAdministradorTelaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoOpcoesAdministradorTelaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
    // TODO add your handling code here:
    var ti = new InicialTela();
    ti.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_voltarButtonActionPerformed

  private void adicionarPerguntasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarPerguntasButtonActionPerformed
    // TODO add your handling code here:
    var tap = new AdicionarPerguntasTela();
    tap.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_adicionarPerguntasButtonActionPerformed

  private void cadastrarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuarioButtonActionPerformed
    // TODO add your handling code here:
    var tcu = new CadastroDeUsuariosTela();
    tcu.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_cadastrarUsuarioButtonActionPerformed

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
      java.util.logging.Logger.getLogger(OpcoesAdministradorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(OpcoesAdministradorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(OpcoesAdministradorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(OpcoesAdministradorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new OpcoesAdministradorTela().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton adicionarPerguntasButton;
  private javax.swing.JButton cadastrarUsuarioButton;
  private javax.swing.JPanel fundoOpcoesAdministradorTelaPanel;
  private javax.swing.JButton removerPerguntasButton;
  private javax.swing.JButton voltarButton;
  // End of variables declaration//GEN-END:variables
}