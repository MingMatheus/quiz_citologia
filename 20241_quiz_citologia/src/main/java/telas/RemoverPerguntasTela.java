/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import db.AlternativaDAO;
import db.PerguntaDAO;
import modelo.Pergunta;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 22.00096-8
 */
public class RemoverPerguntasTela extends javax.swing.JFrame {
  private int idUsuarioLogado;

  /**
   * Creates new form RemoverPerguntasTela
   */
  public RemoverPerguntasTela() {
    initComponents();
    preencheComboBoxComPerguntas();
    setLocationRelativeTo(null);
  }
  
  public RemoverPerguntasTela(int idUsuarioLogado) {
    initComponents();
    preencheComboBoxComPerguntas();
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

    fundoTelaRemoverPerguntas = new javax.swing.JPanel();
    retanguloBaseAdicionarPerguntasPanel = new javax.swing.JPanel();
    adicionarPerguntasLabel = new javax.swing.JLabel();
    perguntaTextField = new javax.swing.JTextField();
    respostaCertaTextField = new javax.swing.JTextField();
    respostaErrada1TextField = new javax.swing.JTextField();
    respostaErrada2TextField = new javax.swing.JTextField();
    respostaErrada3TextField = new javax.swing.JTextField();
    removerPerguntaButton = new javax.swing.JButton();
    escolhaDaPerguntaComboBox = new javax.swing.JComboBox<>();
    voltarButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMaximumSize(new java.awt.Dimension(1280, 720));
    setMinimumSize(new java.awt.Dimension(1280, 720));
    setResizable(false);

    fundoTelaRemoverPerguntas.setBackground(new java.awt.Color(56, 56, 56));
    fundoTelaRemoverPerguntas.setMaximumSize(new java.awt.Dimension(1280, 720));
    fundoTelaRemoverPerguntas.setMinimumSize(new java.awt.Dimension(1280, 720));
    fundoTelaRemoverPerguntas.setPreferredSize(new java.awt.Dimension(1280, 720));

    retanguloBaseAdicionarPerguntasPanel.setBackground(new java.awt.Color(126, 126, 126));
    retanguloBaseAdicionarPerguntasPanel.setMaximumSize(new java.awt.Dimension(790, 580));
    retanguloBaseAdicionarPerguntasPanel.setMinimumSize(new java.awt.Dimension(790, 580));

    adicionarPerguntasLabel.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
    adicionarPerguntasLabel.setForeground(new java.awt.Color(255, 255, 255));
    adicionarPerguntasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    adicionarPerguntasLabel.setText("REMOVER PERGUNTA");

    perguntaTextField.setEditable(false);
    perguntaTextField.setBackground(new java.awt.Color(55, 55, 55));
    perguntaTextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    perguntaTextField.setForeground(new java.awt.Color(255, 255, 255));
    perguntaTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Pergunta:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
    perguntaTextField.setMaximumSize(new java.awt.Dimension(630, 64));
    perguntaTextField.setMinimumSize(new java.awt.Dimension(630, 64));
    perguntaTextField.setPreferredSize(new java.awt.Dimension(630, 64));

    respostaCertaTextField.setEditable(false);
    respostaCertaTextField.setBackground(new java.awt.Color(55, 55, 55));
    respostaCertaTextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    respostaCertaTextField.setForeground(new java.awt.Color(255, 255, 255));
    respostaCertaTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Resposta certa:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
    respostaCertaTextField.setMaximumSize(new java.awt.Dimension(290, 64));
    respostaCertaTextField.setMinimumSize(new java.awt.Dimension(290, 64));
    respostaCertaTextField.setPreferredSize(new java.awt.Dimension(290, 64));

    respostaErrada1TextField.setEditable(false);
    respostaErrada1TextField.setBackground(new java.awt.Color(55, 55, 55));
    respostaErrada1TextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    respostaErrada1TextField.setForeground(new java.awt.Color(255, 255, 255));
    respostaErrada1TextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Resposta Errada:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
    respostaErrada1TextField.setMaximumSize(new java.awt.Dimension(290, 64));
    respostaErrada1TextField.setMinimumSize(new java.awt.Dimension(290, 64));
    respostaErrada1TextField.setPreferredSize(new java.awt.Dimension(290, 64));

    respostaErrada2TextField.setEditable(false);
    respostaErrada2TextField.setBackground(new java.awt.Color(55, 55, 55));
    respostaErrada2TextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    respostaErrada2TextField.setForeground(new java.awt.Color(255, 255, 255));
    respostaErrada2TextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Resposta Errada:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
    respostaErrada2TextField.setMaximumSize(new java.awt.Dimension(290, 64));
    respostaErrada2TextField.setMinimumSize(new java.awt.Dimension(290, 64));
    respostaErrada2TextField.setPreferredSize(new java.awt.Dimension(290, 64));

    respostaErrada3TextField.setEditable(false);
    respostaErrada3TextField.setBackground(new java.awt.Color(55, 55, 55));
    respostaErrada3TextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    respostaErrada3TextField.setForeground(new java.awt.Color(255, 255, 255));
    respostaErrada3TextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Resposta Errada:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
    respostaErrada3TextField.setMaximumSize(new java.awt.Dimension(290, 64));
    respostaErrada3TextField.setMinimumSize(new java.awt.Dimension(290, 64));
    respostaErrada3TextField.setPreferredSize(new java.awt.Dimension(290, 64));

    removerPerguntaButton.setBackground(new java.awt.Color(51, 51, 51));
    removerPerguntaButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    removerPerguntaButton.setForeground(new java.awt.Color(255, 255, 255));
    removerPerguntaButton.setText("Remover pergunta");
    removerPerguntaButton.setMaximumSize(new java.awt.Dimension(200, 50));
    removerPerguntaButton.setMinimumSize(new java.awt.Dimension(200, 50));
    removerPerguntaButton.setPreferredSize(new java.awt.Dimension(200, 50));
    removerPerguntaButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        removerPerguntaButtonActionPerformed(evt);
      }
    });

    escolhaDaPerguntaComboBox.setLightWeightPopupEnabled(false);
    escolhaDaPerguntaComboBox.setMaximumSize(new java.awt.Dimension(400, 40));
    escolhaDaPerguntaComboBox.setMinimumSize(new java.awt.Dimension(400, 40));
    escolhaDaPerguntaComboBox.setPreferredSize(new java.awt.Dimension(400, 40));
    escolhaDaPerguntaComboBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        escolhaDaPerguntaComboBoxActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout retanguloBaseAdicionarPerguntasPanelLayout = new javax.swing.GroupLayout(retanguloBaseAdicionarPerguntasPanel);
    retanguloBaseAdicionarPerguntasPanel.setLayout(retanguloBaseAdicionarPerguntasPanelLayout);
    retanguloBaseAdicionarPerguntasPanelLayout.setHorizontalGroup(
      retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(adicionarPerguntasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, retanguloBaseAdicionarPerguntasPanelLayout.createSequentialGroup()
        .addContainerGap(81, Short.MAX_VALUE)
        .addGroup(retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, retanguloBaseAdicionarPerguntasPanelLayout.createSequentialGroup()
            .addComponent(removerPerguntaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(295, 295, 295))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, retanguloBaseAdicionarPerguntasPanelLayout.createSequentialGroup()
            .addGroup(retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(perguntaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, retanguloBaseAdicionarPerguntasPanelLayout.createSequentialGroup()
                .addGroup(retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(respostaCertaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(respostaErrada2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(respostaErrada1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(respostaErrada3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(79, 79, 79))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, retanguloBaseAdicionarPerguntasPanelLayout.createSequentialGroup()
            .addComponent(escolhaDaPerguntaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(195, 195, 195))))
    );
    retanguloBaseAdicionarPerguntasPanelLayout.setVerticalGroup(
      retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(retanguloBaseAdicionarPerguntasPanelLayout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addComponent(adicionarPerguntasLabel)
        .addGap(37, 37, 37)
        .addComponent(escolhaDaPerguntaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
        .addComponent(perguntaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(30, 30, 30)
        .addGroup(retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(respostaCertaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(respostaErrada1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(30, 30, 30)
        .addGroup(retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(respostaErrada2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(respostaErrada3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(51, 51, 51)
        .addComponent(removerPerguntaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(28, 28, 28))
    );

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

    javax.swing.GroupLayout fundoTelaRemoverPerguntasLayout = new javax.swing.GroupLayout(fundoTelaRemoverPerguntas);
    fundoTelaRemoverPerguntas.setLayout(fundoTelaRemoverPerguntasLayout);
    fundoTelaRemoverPerguntasLayout.setHorizontalGroup(
      fundoTelaRemoverPerguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fundoTelaRemoverPerguntasLayout.createSequentialGroup()
        .addGroup(fundoTelaRemoverPerguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(fundoTelaRemoverPerguntasLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(fundoTelaRemoverPerguntasLayout.createSequentialGroup()
            .addGap(280, 280, 280)
            .addComponent(retanguloBaseAdicionarPerguntasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(210, Short.MAX_VALUE))
    );
    fundoTelaRemoverPerguntasLayout.setVerticalGroup(
      fundoTelaRemoverPerguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fundoTelaRemoverPerguntasLayout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
        .addComponent(retanguloBaseAdicionarPerguntasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(70, 70, 70))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoTelaRemoverPerguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoTelaRemoverPerguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void preencheComboBoxComPerguntas()
  {
    try
    {
      var dao = new PerguntaDAO();
      var perguntas = dao.obterPerguntas();
      escolhaDaPerguntaComboBox.setModel(new DefaultComboBoxModel<>(perguntas));
    }
    catch(Exception e)
    {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Perguntas indisponíveis, tente novamente mais tarde");
    }
  }
  
  private void limpaCampos()
  {
    perguntaTextField.setText("");
    respostaCertaTextField.setText("");
    respostaErrada1TextField.setText("");
    respostaErrada2TextField.setText("");
    respostaErrada3TextField.setText("");
  }
  
  private void removerPerguntaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerPerguntaButtonActionPerformed
    var p = (Pergunta) escolhaDaPerguntaComboBox.getSelectedItem();
    if(p == null)
    {
      JOptionPane.showMessageDialog(null, "Selecione um pergunta primeiro", "Erro", 0);
    }
    else
    {  
      try
      {
        String[] opcoes = {"Sim", "Não", "Cancelar"};
        int op = JOptionPane.showOptionDialog(
                  null,
                  "Você deseja mesmo remover essa pergunta?",
                  "Confirmação",
                  JOptionPane.YES_NO_CANCEL_OPTION,
                  JOptionPane.QUESTION_MESSAGE,
                  null,
                  opcoes,
                  opcoes[0]);

        if(op == JOptionPane.YES_OPTION)
        {
          var dao = new PerguntaDAO();
          dao.remover(p);
          preencheComboBoxComPerguntas();
          limpaCampos();
          JOptionPane.showMessageDialog(null, "Pergunta removida com sucesso", "Remoção bem sucedida", 1);
        }
      }
      catch(Exception e)
      {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
      }
    }
  }//GEN-LAST:event_removerPerguntaButtonActionPerformed

  private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
    // TODO add your handling code here:
    var toa = new OpcoesAdministradorTela(this.idUsuarioLogado);
    toa.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_voltarButtonActionPerformed

  private void escolhaDaPerguntaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaDaPerguntaComboBoxActionPerformed
    try
    {
      var p = (Pergunta) escolhaDaPerguntaComboBox.getSelectedItem();
      var dao = new AlternativaDAO();
    
      String enunciado = p.getEnunciado();
      String altCerta = dao.textById(p.getIdAltCerta());
      String altErrada1 = dao.textById(p.getIdAltErrada1());
      String altErrada2 = dao.textById(p.getIdAltErrada2());
      String altErrada3 = dao.textById(p.getIdAltErrada3());
      
      perguntaTextField.setText(enunciado);
      respostaCertaTextField.setText(altCerta);
      respostaErrada1TextField.setText(altErrada1);
      respostaErrada2TextField.setText(altErrada2);
      respostaErrada3TextField.setText(altErrada3);
    }
    catch(Exception e)
    {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
    }
  }//GEN-LAST:event_escolhaDaPerguntaComboBoxActionPerformed

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
      java.util.logging.Logger.getLogger(RemoverPerguntasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(RemoverPerguntasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(RemoverPerguntasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(RemoverPerguntasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new RemoverPerguntasTela().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel adicionarPerguntasLabel;
  private javax.swing.JComboBox<Pergunta> escolhaDaPerguntaComboBox;
  private javax.swing.JPanel fundoTelaRemoverPerguntas;
  private javax.swing.JTextField perguntaTextField;
  private javax.swing.JButton removerPerguntaButton;
  private javax.swing.JTextField respostaCertaTextField;
  private javax.swing.JTextField respostaErrada1TextField;
  private javax.swing.JTextField respostaErrada2TextField;
  private javax.swing.JTextField respostaErrada3TextField;
  private javax.swing.JPanel retanguloBaseAdicionarPerguntasPanel;
  private javax.swing.JButton voltarButton;
  // End of variables declaration//GEN-END:variables
}
