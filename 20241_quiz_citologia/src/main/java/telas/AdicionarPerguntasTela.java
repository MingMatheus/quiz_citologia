/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import db.AlternativaDAO;
import db.PerguntaDAO;
import db.UsuarioDAO;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;
import modelo.Alternativa;
import modelo.Pergunta;
import modelo.Usuario;

/**
 *
 * @author Matheus
 */
public class AdicionarPerguntasTela extends javax.swing.JFrame {
  private int idUsuarioLogado;

  /**
   * Creates new form AdicionarPerguntasTela
   */
  public AdicionarPerguntasTela() {
    initComponents();
    setLocationRelativeTo(null);
  }
  
  public AdicionarPerguntasTela(int idUsuarioLogado) {
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

    fundoTelaAdicionarPerguntasPanel = new javax.swing.JPanel();
    retanguloBaseAdicionarPerguntasPanel = new javax.swing.JPanel();
    adicionarPerguntasLabel = new javax.swing.JLabel();
    perguntaTextField = new javax.swing.JTextField();
    respostaCertaTextField = new javax.swing.JTextField();
    respostaErrada1TextField = new javax.swing.JTextField();
    respostaErrada2TextField = new javax.swing.JTextField();
    respostaErrada3TextField = new javax.swing.JTextField();
    cadastrarPerguntaButton = new javax.swing.JButton();
    voltarButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMaximumSize(new java.awt.Dimension(1280, 720));
    setMinimumSize(new java.awt.Dimension(1280, 720));
    setResizable(false);

    fundoTelaAdicionarPerguntasPanel.setBackground(new java.awt.Color(56, 56, 56));
    fundoTelaAdicionarPerguntasPanel.setMaximumSize(new java.awt.Dimension(1280, 720));
    fundoTelaAdicionarPerguntasPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
    fundoTelaAdicionarPerguntasPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

    retanguloBaseAdicionarPerguntasPanel.setBackground(new java.awt.Color(126, 126, 126));
    retanguloBaseAdicionarPerguntasPanel.setMaximumSize(new java.awt.Dimension(790, 480));
    retanguloBaseAdicionarPerguntasPanel.setMinimumSize(new java.awt.Dimension(790, 480));
    retanguloBaseAdicionarPerguntasPanel.setPreferredSize(new java.awt.Dimension(790, 480));

    adicionarPerguntasLabel.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
    adicionarPerguntasLabel.setForeground(new java.awt.Color(255, 255, 255));
    adicionarPerguntasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    adicionarPerguntasLabel.setText("ADICIONAR PERGUNTA");

    perguntaTextField.setBackground(new java.awt.Color(55, 55, 55));
    perguntaTextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    perguntaTextField.setForeground(new java.awt.Color(255, 255, 255));
    perguntaTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Pergunta:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
    perguntaTextField.setMaximumSize(new java.awt.Dimension(630, 64));
    perguntaTextField.setMinimumSize(new java.awt.Dimension(630, 64));
    perguntaTextField.setPreferredSize(new java.awt.Dimension(630, 64));

    respostaCertaTextField.setBackground(new java.awt.Color(55, 55, 55));
    respostaCertaTextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    respostaCertaTextField.setForeground(new java.awt.Color(255, 255, 255));
    respostaCertaTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Resposta certa:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
    respostaCertaTextField.setMaximumSize(new java.awt.Dimension(290, 64));
    respostaCertaTextField.setMinimumSize(new java.awt.Dimension(290, 64));
    respostaCertaTextField.setPreferredSize(new java.awt.Dimension(290, 64));

    respostaErrada1TextField.setBackground(new java.awt.Color(55, 55, 55));
    respostaErrada1TextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    respostaErrada1TextField.setForeground(new java.awt.Color(255, 255, 255));
    respostaErrada1TextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Resposta Errada:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
    respostaErrada1TextField.setMaximumSize(new java.awt.Dimension(290, 64));
    respostaErrada1TextField.setMinimumSize(new java.awt.Dimension(290, 64));
    respostaErrada1TextField.setPreferredSize(new java.awt.Dimension(290, 64));

    respostaErrada2TextField.setBackground(new java.awt.Color(55, 55, 55));
    respostaErrada2TextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    respostaErrada2TextField.setForeground(new java.awt.Color(255, 255, 255));
    respostaErrada2TextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Resposta Errada:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
    respostaErrada2TextField.setMaximumSize(new java.awt.Dimension(290, 64));
    respostaErrada2TextField.setMinimumSize(new java.awt.Dimension(290, 64));
    respostaErrada2TextField.setPreferredSize(new java.awt.Dimension(290, 64));

    respostaErrada3TextField.setBackground(new java.awt.Color(55, 55, 55));
    respostaErrada3TextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    respostaErrada3TextField.setForeground(new java.awt.Color(255, 255, 255));
    respostaErrada3TextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Resposta Errada:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
    respostaErrada3TextField.setMaximumSize(new java.awt.Dimension(290, 64));
    respostaErrada3TextField.setMinimumSize(new java.awt.Dimension(290, 64));
    respostaErrada3TextField.setPreferredSize(new java.awt.Dimension(290, 64));

    cadastrarPerguntaButton.setBackground(new java.awt.Color(51, 51, 51));
    cadastrarPerguntaButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    cadastrarPerguntaButton.setForeground(new java.awt.Color(255, 255, 255));
    cadastrarPerguntaButton.setText("Cadastrar pergunta");
    cadastrarPerguntaButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cadastrarPerguntaButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout retanguloBaseAdicionarPerguntasPanelLayout = new javax.swing.GroupLayout(retanguloBaseAdicionarPerguntasPanel);
    retanguloBaseAdicionarPerguntasPanel.setLayout(retanguloBaseAdicionarPerguntasPanelLayout);
    retanguloBaseAdicionarPerguntasPanelLayout.setHorizontalGroup(
      retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(adicionarPerguntasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, retanguloBaseAdicionarPerguntasPanelLayout.createSequentialGroup()
        .addContainerGap(80, Short.MAX_VALUE)
        .addGroup(retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, retanguloBaseAdicionarPerguntasPanelLayout.createSequentialGroup()
            .addGroup(retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(perguntaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, retanguloBaseAdicionarPerguntasPanelLayout.createSequentialGroup()
                .addGroup(retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(respostaCertaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(respostaErrada2TextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(respostaErrada1TextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(respostaErrada3TextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGap(80, 80, 80))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, retanguloBaseAdicionarPerguntasPanelLayout.createSequentialGroup()
            .addComponent(cadastrarPerguntaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(295, 295, 295))))
    );
    retanguloBaseAdicionarPerguntasPanelLayout.setVerticalGroup(
      retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(retanguloBaseAdicionarPerguntasPanelLayout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addComponent(adicionarPerguntasLabel)
        .addGap(40, 40, 40)
        .addComponent(perguntaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(30, 30, 30)
        .addGroup(retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(respostaCertaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(respostaErrada1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(30, 30, 30)
        .addGroup(retanguloBaseAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(respostaErrada2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(respostaErrada3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
        .addComponent(cadastrarPerguntaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    javax.swing.GroupLayout fundoTelaAdicionarPerguntasPanelLayout = new javax.swing.GroupLayout(fundoTelaAdicionarPerguntasPanel);
    fundoTelaAdicionarPerguntasPanel.setLayout(fundoTelaAdicionarPerguntasPanelLayout);
    fundoTelaAdicionarPerguntasPanelLayout.setHorizontalGroup(
      fundoTelaAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fundoTelaAdicionarPerguntasPanelLayout.createSequentialGroup()
        .addGroup(fundoTelaAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(fundoTelaAdicionarPerguntasPanelLayout.createSequentialGroup()
            .addGap(245, 245, 245)
            .addComponent(retanguloBaseAdicionarPerguntasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(fundoTelaAdicionarPerguntasPanelLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(245, Short.MAX_VALUE))
    );
    fundoTelaAdicionarPerguntasPanelLayout.setVerticalGroup(
      fundoTelaAdicionarPerguntasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fundoTelaAdicionarPerguntasPanelLayout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(60, 60, 60)
        .addComponent(retanguloBaseAdicionarPerguntasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(120, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoTelaAdicionarPerguntasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoTelaAdicionarPerguntasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void pegarAlternativas(Alternativa [] alternativas)
  {
    alternativas[0] = new Alternativa(0, respostaCertaTextField.getText());
    alternativas[1] = new Alternativa(0, respostaErrada1TextField.getText());
    alternativas[2] = new Alternativa(0, respostaErrada2TextField.getText());
    alternativas[3] = new Alternativa(0, respostaErrada3TextField.getText());
  }
  
  private boolean preencheuTodosOsCampos()
  {
    var alts = new Alternativa [4];
    pegarAlternativas(alts);
    
    String certa = alts[0].getTexto();
    String errada1 = alts[1].getTexto();
    String errada2 = alts[2].getTexto();
    String errada3 = alts[3].getTexto();
    String pergunta = perguntaTextField.getText();
    
    return !(certa.isEmpty() || errada1.isEmpty() || errada2.isEmpty() || errada3.isEmpty() || pergunta.isEmpty());
  }
  
  private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
    // TODO add your handling code here:
    var u = new Usuario(this.idUsuarioLogado, null, null, null, false);
    var dao = new UsuarioDAO();
    
    try
    {
      if(dao.isAdministrador(u, true))
      {
        var toa = new OpcoesAdministradorTela(this.idUsuarioLogado);
        toa.setVisible(true);
        this.dispose();
      }
      else
      {
        var top = new OpcoesProfessorTela(this.idUsuarioLogado);
        top.setVisible(true);
        this.dispose();
      }
    }
    catch(Exception e)
    {
      JOptionPane.showMessageDialog(null, "Erro ao voltar, redirecionando para a tela inicial");
    }
  }//GEN-LAST:event_voltarButtonActionPerformed

  private void cadastrarPerguntaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarPerguntaButtonActionPerformed
    try
    {
      // Checa se preencheu todos os campos
      if(preencheuTodosOsCampos())
      {
        // Coleta os dados da pergunta
        String enunciado = perguntaTextField.getText();
        var alts = new Alternativa [4];
        pegarAlternativas(alts);
        
        var dao = new AlternativaDAO();

        // Cadastra as alternativas no banco de dados
        for (Alternativa alt : alts)
        {
          try
          {
            dao.cadastrar(alt);
          }
          catch(SQLIntegrityConstraintViolationException e)
          {
            // Faz nada
          }
        }
        
        // Pega os IDs das alternativas (ids[0] é a alternativa certa)
        var ids = new int [4];
        for (int i = 0; i < 4; i++)
        {
          ids[i] = dao.idByText(alts[i].getTexto());
        }
        
        // Cadastra a pergunta
        var p = new Pergunta(0, enunciado, ids[0], ids[1], ids[2], ids[3], this.idUsuarioLogado);
        var dao2 = new PerguntaDAO();
        
        try
        {
          dao2.cadastrar(p);
          JOptionPane.showMessageDialog(null, "Pergunta adicionada com sucesso", "Operação bem sucedida", 1);
        }
        catch(SQLIntegrityConstraintViolationException e)
        {
          JOptionPane.showMessageDialog(null, "Essa pergunta já foi cadastrada", "Operação falhou", 1);
        }
        
      }
      else
      {
        JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", 0);
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
    }
  }//GEN-LAST:event_cadastrarPerguntaButtonActionPerformed

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
      java.util.logging.Logger.getLogger(AdicionarPerguntasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(AdicionarPerguntasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(AdicionarPerguntasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(AdicionarPerguntasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new AdicionarPerguntasTela().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel adicionarPerguntasLabel;
  private javax.swing.JButton cadastrarPerguntaButton;
  private javax.swing.JPanel fundoTelaAdicionarPerguntasPanel;
  private javax.swing.JTextField perguntaTextField;
  private javax.swing.JTextField respostaCertaTextField;
  private javax.swing.JTextField respostaErrada1TextField;
  private javax.swing.JTextField respostaErrada2TextField;
  private javax.swing.JTextField respostaErrada3TextField;
  private javax.swing.JPanel retanguloBaseAdicionarPerguntasPanel;
  private javax.swing.JButton voltarButton;
  // End of variables declaration//GEN-END:variables
}
