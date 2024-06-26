/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import db.UsuarioDAO;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author 22.00096-8
 */
public class LoginTela extends javax.swing.JFrame {

  /**
   * Creates new form LoginTela
   */
  public LoginTela() {
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

    fundoTelaLoginPanel = new javax.swing.JPanel();
    retanguloBaseTelaLoginPanel = new javax.swing.JPanel();
    tituloTelaLoginLabel = new javax.swing.JLabel();
    loginTextField = new javax.swing.JTextField();
    senhaPasswordField = new javax.swing.JPasswordField();
    entrarButton = new javax.swing.JButton();
    voltarButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMaximumSize(new java.awt.Dimension(1280, 720));
    setMinimumSize(new java.awt.Dimension(1280, 720));
    setResizable(false);
    setSize(new java.awt.Dimension(1280, 720));

    fundoTelaLoginPanel.setBackground(new java.awt.Color(56, 56, 56));
    fundoTelaLoginPanel.setMaximumSize(new java.awt.Dimension(1280, 720));
    fundoTelaLoginPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
    fundoTelaLoginPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

    retanguloBaseTelaLoginPanel.setBackground(new java.awt.Color(126, 126, 126));
    retanguloBaseTelaLoginPanel.setMaximumSize(new java.awt.Dimension(580, 420));
    retanguloBaseTelaLoginPanel.setMinimumSize(new java.awt.Dimension(580, 420));

    tituloTelaLoginLabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
    tituloTelaLoginLabel.setForeground(new java.awt.Color(255, 255, 255));
    tituloTelaLoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    tituloTelaLoginLabel.setText("LOGIN");

    loginTextField.setBackground(new java.awt.Color(55, 55, 55));
    loginTextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    loginTextField.setForeground(new java.awt.Color(255, 255, 255));
    loginTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Login:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
    loginTextField.setMaximumSize(new java.awt.Dimension(280, 64));
    loginTextField.setMinimumSize(new java.awt.Dimension(280, 64));
    loginTextField.setPreferredSize(new java.awt.Dimension(280, 64));

    senhaPasswordField.setBackground(new java.awt.Color(55, 55, 55));
    senhaPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    senhaPasswordField.setForeground(new java.awt.Color(255, 255, 255));
    senhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Senha:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
    senhaPasswordField.setMaximumSize(new java.awt.Dimension(280, 64));
    senhaPasswordField.setMinimumSize(new java.awt.Dimension(280, 64));
    senhaPasswordField.setPreferredSize(new java.awt.Dimension(280, 64));

    entrarButton.setBackground(new java.awt.Color(51, 51, 51));
    entrarButton.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
    entrarButton.setForeground(new java.awt.Color(255, 255, 255));
    entrarButton.setText("Entrar");
    entrarButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        entrarButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout retanguloBaseTelaLoginPanelLayout = new javax.swing.GroupLayout(retanguloBaseTelaLoginPanel);
    retanguloBaseTelaLoginPanel.setLayout(retanguloBaseTelaLoginPanelLayout);
    retanguloBaseTelaLoginPanelLayout.setHorizontalGroup(
      retanguloBaseTelaLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(tituloTelaLoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(retanguloBaseTelaLoginPanelLayout.createSequentialGroup()
        .addGroup(retanguloBaseTelaLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(retanguloBaseTelaLoginPanelLayout.createSequentialGroup()
            .addGap(150, 150, 150)
            .addGroup(retanguloBaseTelaLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(retanguloBaseTelaLoginPanelLayout.createSequentialGroup()
            .addGap(224, 224, 224)
            .addComponent(entrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(150, Short.MAX_VALUE))
    );
    retanguloBaseTelaLoginPanelLayout.setVerticalGroup(
      retanguloBaseTelaLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(retanguloBaseTelaLoginPanelLayout.createSequentialGroup()
        .addGap(42, 42, 42)
        .addComponent(tituloTelaLoginLabel)
        .addGap(61, 61, 61)
        .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(42, 42, 42)
        .addComponent(entrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(32, Short.MAX_VALUE))
    );

    voltarButton.setBackground(new java.awt.Color(100, 100, 100));
    voltarButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    voltarButton.setForeground(new java.awt.Color(255, 255, 255));
    voltarButton.setText("Voltar");
    voltarButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        voltarButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout fundoTelaLoginPanelLayout = new javax.swing.GroupLayout(fundoTelaLoginPanel);
    fundoTelaLoginPanel.setLayout(fundoTelaLoginPanelLayout);
    fundoTelaLoginPanelLayout.setHorizontalGroup(
      fundoTelaLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fundoTelaLoginPanelLayout.createSequentialGroup()
        .addGroup(fundoTelaLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(fundoTelaLoginPanelLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(fundoTelaLoginPanelLayout.createSequentialGroup()
            .addGap(380, 380, 380)
            .addComponent(retanguloBaseTelaLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(320, Short.MAX_VALUE))
    );
    fundoTelaLoginPanelLayout.setVerticalGroup(
      fundoTelaLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fundoTelaLoginPanelLayout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(98, 98, 98)
        .addComponent(retanguloBaseTelaLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(142, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoTelaLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoTelaLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private boolean preencheuTodosOsCampos()
  {
    String login = loginTextField.getText();
    String senha = new String(senhaPasswordField.getPassword());
    
    return !(login.isEmpty() || senha.isEmpty());
  }
  
   private Usuario criarUsuarioParaLogin()
   {
     String login = loginTextField.getText();
     String senha = new String(senhaPasswordField.getPassword());
     var u = new Usuario(0, null, login, senha, false);
     
     return u;
   }
  
  private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
    // TODO add your handling code here:
    var ti = new InicialTela();
    ti.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_voltarButtonActionPerformed

  private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
    try
    {
      if(preencheuTodosOsCampos())
      {
        var dao = new UsuarioDAO();
        var u = criarUsuarioParaLogin();
        if(dao.existe(u))
        {
          if(dao.isAdministrador(u, false))
          {
            var toa = new OpcoesAdministradorTela(dao.idByUsernamePassword(u));
            toa.setVisible(true);
            this.dispose();
          }
          else
          {
            var top = new OpcoesProfessorTela(dao.idByUsernamePassword(u));
            top.setVisible(true);
            this.dispose();
          }
        }
        else
        {
          JOptionPane.showMessageDialog(null, "Informações de autenticação incorretas", "Não foi possível realizar o login", 0);
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
  }//GEN-LAST:event_entrarButtonActionPerformed

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
      java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LoginTela().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton entrarButton;
  private javax.swing.JPanel fundoTelaLoginPanel;
  private javax.swing.JTextField loginTextField;
  private javax.swing.JPanel retanguloBaseTelaLoginPanel;
  private javax.swing.JPasswordField senhaPasswordField;
  private javax.swing.JLabel tituloTelaLoginLabel;
  private javax.swing.JButton voltarButton;
  // End of variables declaration//GEN-END:variables
}
