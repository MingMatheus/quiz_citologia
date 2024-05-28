/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import db.UsuarioDAO;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Matheus
 */
public class CadastroDeUsuariosTela extends javax.swing.JFrame {
  private int idUsuarioLogado;

  /**
   * Creates new form CadastroDeUsuariosTela
   */
  public CadastroDeUsuariosTela() {
    initComponents();
    setLocationRelativeTo(null);
  }
  
  public CadastroDeUsuariosTela(int idUsuarioLogado) {
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

    escolhaDeCargoButtonGroup = new javax.swing.ButtonGroup();
    fundoTelaCadastroDeUsuarioPanel = new javax.swing.JPanel();
    retanguloBaseTelaCadastroDeUsuarioPanel = new javax.swing.JPanel();
    tituloTelaCadastrarUsuariosLabel = new javax.swing.JLabel();
    nomeTextField = new javax.swing.JTextField();
    senhaPasswordField = new javax.swing.JPasswordField();
    usuarioTextField = new javax.swing.JTextField();
    professorRadioButton = new javax.swing.JRadioButton();
    administradorRadioButton = new javax.swing.JRadioButton();
    cadastrarUsuarioButton = new javax.swing.JButton();
    voltarButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMaximumSize(new java.awt.Dimension(1280, 720));
    setMinimumSize(new java.awt.Dimension(1280, 720));
    setResizable(false);

    fundoTelaCadastroDeUsuarioPanel.setBackground(new java.awt.Color(56, 56, 56));
    fundoTelaCadastroDeUsuarioPanel.setMaximumSize(new java.awt.Dimension(1280, 720));
    fundoTelaCadastroDeUsuarioPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
    fundoTelaCadastroDeUsuarioPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

    retanguloBaseTelaCadastroDeUsuarioPanel.setBackground(new java.awt.Color(126, 126, 126));
    retanguloBaseTelaCadastroDeUsuarioPanel.setMaximumSize(new java.awt.Dimension(570, 550));
    retanguloBaseTelaCadastroDeUsuarioPanel.setMinimumSize(new java.awt.Dimension(570, 550));
    retanguloBaseTelaCadastroDeUsuarioPanel.setPreferredSize(new java.awt.Dimension(570, 550));

    tituloTelaCadastrarUsuariosLabel.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
    tituloTelaCadastrarUsuariosLabel.setForeground(new java.awt.Color(255, 255, 255));
    tituloTelaCadastrarUsuariosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    tituloTelaCadastrarUsuariosLabel.setText("Cadastro de usuário");

    nomeTextField.setBackground(new java.awt.Color(55, 55, 55));
    nomeTextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    nomeTextField.setForeground(new java.awt.Color(255, 255, 255));
    nomeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Nome:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
    nomeTextField.setMaximumSize(new java.awt.Dimension(320, 64));
    nomeTextField.setMinimumSize(new java.awt.Dimension(320, 64));
    nomeTextField.setPreferredSize(new java.awt.Dimension(320, 64));

    senhaPasswordField.setBackground(new java.awt.Color(55, 55, 55));
    senhaPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    senhaPasswordField.setForeground(new java.awt.Color(255, 255, 255));
    senhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Senha:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
    senhaPasswordField.setMaximumSize(new java.awt.Dimension(320, 64));
    senhaPasswordField.setMinimumSize(new java.awt.Dimension(320, 64));
    senhaPasswordField.setPreferredSize(new java.awt.Dimension(320, 64));

    usuarioTextField.setBackground(new java.awt.Color(55, 55, 55));
    usuarioTextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    usuarioTextField.setForeground(new java.awt.Color(255, 255, 255));
    usuarioTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Usuario:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
    usuarioTextField.setMaximumSize(new java.awt.Dimension(320, 64));
    usuarioTextField.setMinimumSize(new java.awt.Dimension(320, 64));
    usuarioTextField.setPreferredSize(new java.awt.Dimension(320, 64));

    escolhaDeCargoButtonGroup.add(professorRadioButton);
    professorRadioButton.setForeground(new java.awt.Color(255, 255, 255));
    professorRadioButton.setText("Professor");
    professorRadioButton.setMaximumSize(new java.awt.Dimension(81, 21));
    professorRadioButton.setMinimumSize(new java.awt.Dimension(81, 21));
    professorRadioButton.setPreferredSize(new java.awt.Dimension(81, 21));

    escolhaDeCargoButtonGroup.add(administradorRadioButton);
    administradorRadioButton.setForeground(new java.awt.Color(255, 255, 255));
    administradorRadioButton.setText("Administrador");

    cadastrarUsuarioButton.setBackground(new java.awt.Color(51, 51, 51));
    cadastrarUsuarioButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    cadastrarUsuarioButton.setForeground(new java.awt.Color(255, 255, 255));
    cadastrarUsuarioButton.setText("Cadastrar");
    cadastrarUsuarioButton.setMaximumSize(new java.awt.Dimension(150, 50));
    cadastrarUsuarioButton.setMinimumSize(new java.awt.Dimension(150, 50));
    cadastrarUsuarioButton.setPreferredSize(new java.awt.Dimension(150, 50));
    cadastrarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cadastrarUsuarioButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout retanguloBaseTelaCadastroDeUsuarioPanelLayout = new javax.swing.GroupLayout(retanguloBaseTelaCadastroDeUsuarioPanel);
    retanguloBaseTelaCadastroDeUsuarioPanel.setLayout(retanguloBaseTelaCadastroDeUsuarioPanelLayout);
    retanguloBaseTelaCadastroDeUsuarioPanelLayout.setHorizontalGroup(
      retanguloBaseTelaCadastroDeUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(tituloTelaCadastrarUsuariosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(retanguloBaseTelaCadastroDeUsuarioPanelLayout.createSequentialGroup()
        .addGap(178, 178, 178)
        .addComponent(professorRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(32, 32, 32)
        .addComponent(administradorRadioButton)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, retanguloBaseTelaCadastroDeUsuarioPanelLayout.createSequentialGroup()
        .addContainerGap(130, Short.MAX_VALUE)
        .addGroup(retanguloBaseTelaCadastroDeUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, retanguloBaseTelaCadastroDeUsuarioPanelLayout.createSequentialGroup()
            .addGroup(retanguloBaseTelaCadastroDeUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(nomeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(senhaPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(usuarioTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(120, 120, 120))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, retanguloBaseTelaCadastroDeUsuarioPanelLayout.createSequentialGroup()
            .addComponent(cadastrarUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(210, 210, 210))))
    );
    retanguloBaseTelaCadastroDeUsuarioPanelLayout.setVerticalGroup(
      retanguloBaseTelaCadastroDeUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(retanguloBaseTelaCadastroDeUsuarioPanelLayout.createSequentialGroup()
        .addGap(40, 40, 40)
        .addComponent(tituloTelaCadastrarUsuariosLabel)
        .addGap(60, 60, 60)
        .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(usuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(retanguloBaseTelaCadastroDeUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(professorRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(administradorRadioButton))
        .addGap(31, 31, 31)
        .addComponent(cadastrarUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(68, Short.MAX_VALUE))
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

    javax.swing.GroupLayout fundoTelaCadastroDeUsuarioPanelLayout = new javax.swing.GroupLayout(fundoTelaCadastroDeUsuarioPanel);
    fundoTelaCadastroDeUsuarioPanel.setLayout(fundoTelaCadastroDeUsuarioPanelLayout);
    fundoTelaCadastroDeUsuarioPanelLayout.setHorizontalGroup(
      fundoTelaCadastroDeUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fundoTelaCadastroDeUsuarioPanelLayout.createSequentialGroup()
        .addGroup(fundoTelaCadastroDeUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(fundoTelaCadastroDeUsuarioPanelLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(fundoTelaCadastroDeUsuarioPanelLayout.createSequentialGroup()
            .addGap(355, 355, 355)
            .addComponent(retanguloBaseTelaCadastroDeUsuarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(355, Short.MAX_VALUE))
    );
    fundoTelaCadastroDeUsuarioPanelLayout.setVerticalGroup(
      fundoTelaCadastroDeUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fundoTelaCadastroDeUsuarioPanelLayout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(25, 25, 25)
        .addComponent(retanguloBaseTelaCadastroDeUsuarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(85, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoTelaCadastroDeUsuarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoTelaCadastroDeUsuarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private boolean preencheuTodosOsCampos()
  {
    String nome = nomeTextField.getText();
    String usuario = usuarioTextField.getText();
    String senha = new String(senhaPasswordField.getPassword());
    boolean admSelecionado = administradorRadioButton.isSelected();
    boolean profSelecionado = professorRadioButton.isSelected();
    
    // Caso todos os campos estejam preenchidos, retorna true, se não retorna false
    return !(nome.isEmpty() || usuario.isEmpty() || senha.isEmpty() || !(admSelecionado || profSelecionado));
  }
  
  private Usuario criarUsuarioParaCadastro()
  {
    String nome = nomeTextField.getText();
    String usuario = usuarioTextField.getText();
    String senha = new String(senhaPasswordField.getPassword());
    boolean isAdmin = administradorRadioButton.isSelected();
    var u = new Usuario(0, nome, usuario, senha, isAdmin);
    
    return u;
  }
  
  private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
    // TODO add your handling code here:
    var toa = new OpcoesAdministradorTela(this.idUsuarioLogado);
    toa.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_voltarButtonActionPerformed

  private void cadastrarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuarioButtonActionPerformed
    try
    {
      if(preencheuTodosOsCampos())
      {
        var dao = new UsuarioDAO();
        var u = criarUsuarioParaCadastro();
        dao.cadastrar(u);
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso", "Cadastro bem sucedido", 1);
      }
      else
      {
        JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", 0);
      }
    }
    
    catch(SQLIntegrityConstraintViolationException e)
    {
      JOptionPane.showMessageDialog(null, "Esse nome de usuário está indisponível", "Nome de usuário indisponível", 0);
    }
    
    catch(Exception e)
    {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
    }
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
      java.util.logging.Logger.getLogger(CadastroDeUsuariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(CadastroDeUsuariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(CadastroDeUsuariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(CadastroDeUsuariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new CadastroDeUsuariosTela().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JRadioButton administradorRadioButton;
  private javax.swing.JButton cadastrarUsuarioButton;
  private javax.swing.ButtonGroup escolhaDeCargoButtonGroup;
  private javax.swing.JPanel fundoTelaCadastroDeUsuarioPanel;
  private javax.swing.JTextField nomeTextField;
  private javax.swing.JRadioButton professorRadioButton;
  private javax.swing.JPanel retanguloBaseTelaCadastroDeUsuarioPanel;
  private javax.swing.JPasswordField senhaPasswordField;
  private javax.swing.JLabel tituloTelaCadastrarUsuariosLabel;
  private javax.swing.JTextField usuarioTextField;
  private javax.swing.JButton voltarButton;
  // End of variables declaration//GEN-END:variables
}
