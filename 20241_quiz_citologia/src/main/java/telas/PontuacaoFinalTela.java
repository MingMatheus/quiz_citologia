/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Matheus
 */
public class PontuacaoFinalTela extends javax.swing.JFrame {

  /**
   * Creates new form PontuacaoFinalTela
   */
  public PontuacaoFinalTela() {
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

    fundoTelaFinal = new javax.swing.JPanel();
    tituloTelaFinalLabel = new javax.swing.JLabel();
    pontuacaoFinalTextField = new javax.swing.JTextField();
    retornarAoMenuButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMaximumSize(new java.awt.Dimension(1280, 720));
    setMinimumSize(new java.awt.Dimension(1280, 720));
    setSize(new java.awt.Dimension(1280, 720));

    fundoTelaFinal.setBackground(new java.awt.Color(56, 56, 56));
    fundoTelaFinal.setMaximumSize(new java.awt.Dimension(1280, 720));
    fundoTelaFinal.setMinimumSize(new java.awt.Dimension(1280, 720));
    fundoTelaFinal.setPreferredSize(new java.awt.Dimension(1280, 720));

    tituloTelaFinalLabel.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
    tituloTelaFinalLabel.setForeground(new java.awt.Color(255, 255, 255));
    tituloTelaFinalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    tituloTelaFinalLabel.setText("SUA PONTUAÇÃO FINAL");

    pontuacaoFinalTextField.setEditable(false);
    pontuacaoFinalTextField.setBackground(new java.awt.Color(22, 22, 22));
    pontuacaoFinalTextField.setFont(new java.awt.Font("Segoe UI", 0, 65)); // NOI18N
    pontuacaoFinalTextField.setForeground(new java.awt.Color(255, 255, 255));
    pontuacaoFinalTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    pontuacaoFinalTextField.setText("13/20");
    pontuacaoFinalTextField.setBorder(null);
    pontuacaoFinalTextField.setMaximumSize(new java.awt.Dimension(332, 150));
    pontuacaoFinalTextField.setMinimumSize(new java.awt.Dimension(332, 150));
    pontuacaoFinalTextField.setPreferredSize(new java.awt.Dimension(332, 150));

    retornarAoMenuButton.setBackground(new java.awt.Color(100, 100, 100));
    retornarAoMenuButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    retornarAoMenuButton.setForeground(new java.awt.Color(255, 255, 255));
    retornarAoMenuButton.setText("Retornar ao menu");
    retornarAoMenuButton.setMaximumSize(new java.awt.Dimension(170, 50));
    retornarAoMenuButton.setMinimumSize(new java.awt.Dimension(170, 50));
    retornarAoMenuButton.setPreferredSize(new java.awt.Dimension(170, 50));
    retornarAoMenuButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        retornarAoMenuButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout fundoTelaFinalLayout = new javax.swing.GroupLayout(fundoTelaFinal);
    fundoTelaFinal.setLayout(fundoTelaFinalLayout);
    fundoTelaFinalLayout.setHorizontalGroup(
      fundoTelaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(tituloTelaFinalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoTelaFinalLayout.createSequentialGroup()
        .addContainerGap(474, Short.MAX_VALUE)
        .addGroup(fundoTelaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoTelaFinalLayout.createSequentialGroup()
            .addComponent(pontuacaoFinalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(474, 474, 474))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoTelaFinalLayout.createSequentialGroup()
            .addComponent(retornarAoMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(555, 555, 555))))
    );
    fundoTelaFinalLayout.setVerticalGroup(
      fundoTelaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fundoTelaFinalLayout.createSequentialGroup()
        .addGap(127, 127, 127)
        .addComponent(tituloTelaFinalLabel)
        .addGap(64, 64, 64)
        .addComponent(pontuacaoFinalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
        .addComponent(retornarAoMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(61, 61, 61))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoTelaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoTelaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void retornarAoMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarAoMenuButtonActionPerformed
    // TODO add your handling code here:
    var ti = new InicialTela();
    ti.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_retornarAoMenuButtonActionPerformed

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
      java.util.logging.Logger.getLogger(PontuacaoFinalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(PontuacaoFinalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(PontuacaoFinalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(PontuacaoFinalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new PontuacaoFinalTela().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel fundoTelaFinal;
  private javax.swing.JTextField pontuacaoFinalTextField;
  private javax.swing.JButton retornarAoMenuButton;
  private javax.swing.JLabel tituloTelaFinalLabel;
  // End of variables declaration//GEN-END:variables
}