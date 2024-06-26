/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Matheus
 */
public class OpcoesProfessorTela extends javax.swing.JFrame {
  private int idUsuarioLogado;

  /**
   * Creates new form OpcoesProfessorTela
   */
  public OpcoesProfessorTela() {
    initComponents();
    setLocationRelativeTo(null);
  }
  
  public OpcoesProfessorTela(int idUsuarioLogado) {
    initComponents();
    setLocationRelativeTo(null);
    this.idUsuarioLogado = idUsuarioLogado;
  }

  public int getIdUsuarioLogado() {
    return idUsuarioLogado;
  }

  public void setIdUsuarioLogado(int idUsuarioLogado) {
    this.idUsuarioLogado = idUsuarioLogado;
  }
  
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    fundoOpcoesProfessorTelaPanel = new javax.swing.JPanel();
    adicionarPerguntasButton = new javax.swing.JButton();
    voltarButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMaximumSize(new java.awt.Dimension(1280, 720));
    setMinimumSize(new java.awt.Dimension(1280, 720));
    setResizable(false);

    fundoOpcoesProfessorTelaPanel.setBackground(new java.awt.Color(56, 56, 56));
    fundoOpcoesProfessorTelaPanel.setMaximumSize(new java.awt.Dimension(1280, 720));
    fundoOpcoesProfessorTelaPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
    fundoOpcoesProfessorTelaPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

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

    javax.swing.GroupLayout fundoOpcoesProfessorTelaPanelLayout = new javax.swing.GroupLayout(fundoOpcoesProfessorTelaPanel);
    fundoOpcoesProfessorTelaPanel.setLayout(fundoOpcoesProfessorTelaPanelLayout);
    fundoOpcoesProfessorTelaPanelLayout.setHorizontalGroup(
      fundoOpcoesProfessorTelaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fundoOpcoesProfessorTelaPanelLayout.createSequentialGroup()
        .addGap(480, 480, 480)
        .addComponent(adicionarPerguntasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(480, 480, 480))
      .addGroup(fundoOpcoesProfessorTelaPanelLayout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    fundoOpcoesProfessorTelaPanelLayout.setVerticalGroup(
      fundoOpcoesProfessorTelaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fundoOpcoesProfessorTelaPanelLayout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(250, 250, 250)
        .addComponent(adicionarPerguntasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(310, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoOpcoesProfessorTelaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoOpcoesProfessorTelaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    var tap = new AdicionarPerguntasTela(this.idUsuarioLogado);
    tap.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_adicionarPerguntasButtonActionPerformed

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
      java.util.logging.Logger.getLogger(OpcoesProfessorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(OpcoesProfessorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(OpcoesProfessorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(OpcoesProfessorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new OpcoesProfessorTela().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton adicionarPerguntasButton;
  private javax.swing.JPanel fundoOpcoesProfessorTelaPanel;
  private javax.swing.JButton voltarButton;
  // End of variables declaration//GEN-END:variables
}
