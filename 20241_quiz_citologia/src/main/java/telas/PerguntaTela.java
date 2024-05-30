/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import db.JogadorDAO;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelo.Alternativa;
import modelo.Jogador;
import modelo.PerguntaCompleta;

/**
 *
 * @author Matheus
 */
public class PerguntaTela extends javax.swing.JFrame {
  public static final int MAX_PERGUNTAS_POR_PARTIDA = 10;
  private Jogador jogador;
  private int numeroDaPergunta;
  private PerguntaCompleta [] perguntas;

  /**
   * Creates new form PerguntaTela
   */
  public PerguntaTela() {
    initComponents();
    setLocationRelativeTo(null);
  }
  
  public PerguntaTela(Jogador jogador, int numeroDaPergunta, PerguntaCompleta [] perguntas) {
    initComponents();
    setLocationRelativeTo(null);
    
    this.jogador = jogador;
    this.numeroDaPergunta = numeroDaPergunta;
    this.perguntas = perguntas;
    
    preencheCampos();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    fundoTelaPerguntaPanel = new javax.swing.JPanel();
    enunciadoLabel = new javax.swing.JLabel();
    alt2Button = new javax.swing.JButton();
    alt3Button = new javax.swing.JButton();
    alt4Button = new javax.swing.JButton();
    alt1Button = new javax.swing.JButton();
    numeroDaPerguntaTextField = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMaximumSize(new java.awt.Dimension(1280, 720));
    setMinimumSize(new java.awt.Dimension(1280, 720));
    setResizable(false);
    setSize(new java.awt.Dimension(1280, 720));

    fundoTelaPerguntaPanel.setBackground(new java.awt.Color(56, 56, 56));
    fundoTelaPerguntaPanel.setMaximumSize(new java.awt.Dimension(1280, 720));
    fundoTelaPerguntaPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
    fundoTelaPerguntaPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
    fundoTelaPerguntaPanel.setRequestFocusEnabled(false);

    enunciadoLabel.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
    enunciadoLabel.setForeground(new java.awt.Color(255, 255, 255));
    enunciadoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    enunciadoLabel.setText("ENUNCIADO");

    alt2Button.setBackground(new java.awt.Color(80, 80, 80));
    alt2Button.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    alt2Button.setForeground(new java.awt.Color(255, 255, 255));
    alt2Button.setText("Alternativa 2");
    alt2Button.setMaximumSize(new java.awt.Dimension(270, 120));
    alt2Button.setMinimumSize(new java.awt.Dimension(270, 120));
    alt2Button.setPreferredSize(new java.awt.Dimension(270, 120));
    alt2Button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        alt2ButtonActionPerformed(evt);
      }
    });

    alt3Button.setBackground(new java.awt.Color(80, 80, 80));
    alt3Button.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    alt3Button.setForeground(new java.awt.Color(255, 255, 255));
    alt3Button.setText("Alternativa 3");
    alt3Button.setMaximumSize(new java.awt.Dimension(270, 120));
    alt3Button.setMinimumSize(new java.awt.Dimension(270, 120));
    alt3Button.setPreferredSize(new java.awt.Dimension(270, 120));
    alt3Button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        alt3ButtonActionPerformed(evt);
      }
    });

    alt4Button.setBackground(new java.awt.Color(80, 80, 80));
    alt4Button.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    alt4Button.setForeground(new java.awt.Color(255, 255, 255));
    alt4Button.setText("Alternativa4");
    alt4Button.setMaximumSize(new java.awt.Dimension(270, 120));
    alt4Button.setMinimumSize(new java.awt.Dimension(270, 120));
    alt4Button.setPreferredSize(new java.awt.Dimension(270, 120));
    alt4Button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        alt4ButtonActionPerformed(evt);
      }
    });

    alt1Button.setBackground(new java.awt.Color(80, 80, 80));
    alt1Button.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    alt1Button.setForeground(new java.awt.Color(255, 255, 255));
    alt1Button.setText("Alternativa 1");
    alt1Button.setMaximumSize(new java.awt.Dimension(270, 120));
    alt1Button.setMinimumSize(new java.awt.Dimension(270, 120));
    alt1Button.setPreferredSize(new java.awt.Dimension(270, 120));
    alt1Button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        alt1ButtonActionPerformed(evt);
      }
    });

    numeroDaPerguntaTextField.setEditable(false);
    numeroDaPerguntaTextField.setBackground(new java.awt.Color(140, 140, 140));
    numeroDaPerguntaTextField.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
    numeroDaPerguntaTextField.setForeground(new java.awt.Color(255, 255, 255));
    numeroDaPerguntaTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    numeroDaPerguntaTextField.setText("13");
    numeroDaPerguntaTextField.setBorder(null);
    numeroDaPerguntaTextField.setFocusable(false);
    numeroDaPerguntaTextField.setMaximumSize(new java.awt.Dimension(70, 70));
    numeroDaPerguntaTextField.setMinimumSize(new java.awt.Dimension(70, 70));
    numeroDaPerguntaTextField.setPreferredSize(new java.awt.Dimension(70, 70));

    javax.swing.GroupLayout fundoTelaPerguntaPanelLayout = new javax.swing.GroupLayout(fundoTelaPerguntaPanel);
    fundoTelaPerguntaPanel.setLayout(fundoTelaPerguntaPanelLayout);
    fundoTelaPerguntaPanelLayout.setHorizontalGroup(
      fundoTelaPerguntaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(enunciadoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(fundoTelaPerguntaPanelLayout.createSequentialGroup()
        .addGroup(fundoTelaPerguntaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(fundoTelaPerguntaPanelLayout.createSequentialGroup()
            .addGap(290, 290, 290)
            .addGroup(fundoTelaPerguntaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(alt3Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(alt1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(160, 160, 160)
            .addGroup(fundoTelaPerguntaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(alt2Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(alt4Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addGroup(fundoTelaPerguntaPanelLayout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(numeroDaPerguntaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(290, Short.MAX_VALUE))
    );
    fundoTelaPerguntaPanelLayout.setVerticalGroup(
      fundoTelaPerguntaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fundoTelaPerguntaPanelLayout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addComponent(numeroDaPerguntaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(enunciadoLabel)
        .addGap(120, 120, 120)
        .addGroup(fundoTelaPerguntaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(alt2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(alt1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(76, 76, 76)
        .addGroup(fundoTelaPerguntaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(alt3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(alt4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(86, 86, 86))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoTelaPerguntaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoTelaPerguntaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private JButton [] getBotoesAlternativas()
  {
    var botoes = new JButton [4];
    
    botoes[0] = alt1Button;
    botoes[1] = alt2Button;
    botoes[2] = alt3Button;
    botoes[3] = alt4Button;
    
    return botoes;
  }
  
  private void preencheCampos()
  {
    // Coloca o número da pergunta
    numeroDaPerguntaTextField.setText(String.format("%d", numeroDaPergunta));
    
    // Seleciona a pergunta
    var p = perguntas[numeroDaPergunta - 1];
    
    // Coloca o enunciado
    enunciadoLabel.setText(p.getEnunciado());
    
    // Cria uma lista com os botões das alternativas
    var botoes = new ArrayList<JButton>();
    Collections.addAll(botoes, getBotoesAlternativas());
    
    // Cria uma lista com as alternativas e aleatoriza a ordem delas
    var alternativas = new ArrayList<Alternativa>();
    Collections.addAll(alternativas, p.getAlternativas());
    Collections.shuffle(alternativas);
    
    // Atribui o texto das alternativas aos botões
    for (int i = 0; i < 4; i++)
    {
      var botao = botoes.get(i);
      var alt = alternativas.get(i);
      botao.setText(alt.getTexto());
    }
  }
  
  private void passarParaProximaPergunta()
  {
    numeroDaPergunta++;
    
    try
    {
      if(numeroDaPergunta > MAX_PERGUNTAS_POR_PARTIDA)
      {
        var dao = new JogadorDAO();
        dao.cadastrar(jogador);
        var tpf = new PontuacaoFinalTela(jogador);
        tpf.setVisible(true);
        this.dispose();
      }
      else
      {
        preencheCampos();
      }
    }
    catch(Exception e)
    {
      numeroDaPergunta--;
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
    }
  }
  
  private void lidarComEscolhaDeAlternativa(String escolha)
  {
    var p = perguntas[numeroDaPergunta - 1];
    String resposta = p.getAltCerta().getTexto();
    
    if(escolha.equals(resposta))
    {
      jogador.ganhaUmPonto();
      JOptionPane.showMessageDialog(null, "Boa! Você acertou a resposta\n+1 ponto pra você", "Acertou!", 1);
    }
    else
    {
      JOptionPane.showMessageDialog(null, "Que pena! Você errou a resposta\nA resposta certa era: " + resposta, "Errou!", 0);
    }
    
    passarParaProximaPergunta();
  }
  
  private void alt1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alt1ButtonActionPerformed
    String escolha = alt1Button.getText();
    lidarComEscolhaDeAlternativa(escolha);
  }//GEN-LAST:event_alt1ButtonActionPerformed

  private void alt2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alt2ButtonActionPerformed
    String escolha = alt2Button.getText();
    lidarComEscolhaDeAlternativa(escolha);
  }//GEN-LAST:event_alt2ButtonActionPerformed

  private void alt3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alt3ButtonActionPerformed
    String escolha = alt3Button.getText();
    lidarComEscolhaDeAlternativa(escolha);
  }//GEN-LAST:event_alt3ButtonActionPerformed

  private void alt4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alt4ButtonActionPerformed
    String escolha = alt4Button.getText();
    lidarComEscolhaDeAlternativa(escolha);
  }//GEN-LAST:event_alt4ButtonActionPerformed

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
      java.util.logging.Logger.getLogger(PerguntaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(PerguntaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(PerguntaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(PerguntaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new PerguntaTela().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton alt1Button;
  private javax.swing.JButton alt2Button;
  private javax.swing.JButton alt3Button;
  private javax.swing.JButton alt4Button;
  private javax.swing.JLabel enunciadoLabel;
  private javax.swing.JPanel fundoTelaPerguntaPanel;
  private javax.swing.JTextField numeroDaPerguntaTextField;
  // End of variables declaration//GEN-END:variables
}
