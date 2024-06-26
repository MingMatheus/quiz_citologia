/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import db.JogadorDAO;
import elementos_visuais_personalizados.MeuTableCellRenderer;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import modelo.Jogador;

/**
 *
 * @author 22.00096-8
 */
public class RankingTela extends javax.swing.JFrame {
  
  /**
   * Creates new form RankingTela
   */
  public RankingTela() {
    initComponents();
    setLocationRelativeTo(null);
    preencheTabelaRanking();
    ajustaTabela();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    fundoTelaRankingPanel = new javax.swing.JPanel();
    tituloRankingLabel = new javax.swing.JLabel();
    tabelaRankingScrollPane = new javax.swing.JScrollPane();
    tabelaRankingTable = new javax.swing.JTable();
    retornarAoMenuButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMaximumSize(new java.awt.Dimension(1280, 720));
    setMinimumSize(new java.awt.Dimension(1280, 720));
    setResizable(false);
    setSize(new java.awt.Dimension(1280, 720));

    fundoTelaRankingPanel.setBackground(new java.awt.Color(56, 56, 56));
    fundoTelaRankingPanel.setMaximumSize(new java.awt.Dimension(1280, 720));
    fundoTelaRankingPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
    fundoTelaRankingPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

    tituloRankingLabel.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
    tituloRankingLabel.setForeground(new java.awt.Color(255, 255, 255));
    tituloRankingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    tituloRankingLabel.setText("RANKING");

    tabelaRankingTable.setBackground(new java.awt.Color(45, 45, 45));
    tabelaRankingTable.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
    tabelaRankingTable.setForeground(new java.awt.Color(255, 255, 255));
    tabelaRankingTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {},
        {},
        {},
        {},
        {},
        {},
        {},
        {},
        {},
        {}
      },
      new String [] {

      }
    ));
    tabelaRankingTable.setFocusable(false);
    tabelaRankingTable.setMaximumSize(new java.awt.Dimension(225, 300));
    tabelaRankingTable.setMinimumSize(new java.awt.Dimension(225, 300));
    tabelaRankingTable.setRowHeight(30);
    tabelaRankingScrollPane.setViewportView(tabelaRankingTable);

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

    javax.swing.GroupLayout fundoTelaRankingPanelLayout = new javax.swing.GroupLayout(fundoTelaRankingPanel);
    fundoTelaRankingPanel.setLayout(fundoTelaRankingPanelLayout);
    fundoTelaRankingPanelLayout.setHorizontalGroup(
      fundoTelaRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(tituloRankingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(fundoTelaRankingPanelLayout.createSequentialGroup()
        .addGroup(fundoTelaRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(fundoTelaRankingPanelLayout.createSequentialGroup()
            .addGap(412, 412, 412)
            .addComponent(tabelaRankingScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(fundoTelaRankingPanelLayout.createSequentialGroup()
            .addGap(555, 555, 555)
            .addComponent(retornarAoMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(412, 412, 412))
    );
    fundoTelaRankingPanelLayout.setVerticalGroup(
      fundoTelaRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(fundoTelaRankingPanelLayout.createSequentialGroup()
        .addGap(80, 80, 80)
        .addComponent(tituloRankingLabel)
        .addGap(38, 38, 38)
        .addComponent(tabelaRankingScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
        .addComponent(retornarAoMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(65, 65, 65))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoTelaRankingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(fundoTelaRankingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void preencheTabelaRanking()
  {
    try
    {
      var dao = new JogadorDAO();
      var melhoresJogadores = dao.obterMelhoresJogadores();
      
      var model = new DefaultTableModel();
      
      model.addColumn("Ranque");
      model.addColumn("Nome");
      model.addColumn("Pontuação");
      
      int contador = 1;
      for (Jogador jogador : melhoresJogadores)
      {
        if(jogador != null)
        {
          int ranque = contador;
          String nome = jogador.getNomeDeJogo();
          int pontuacao = jogador.getPontuacao();

          model.addRow(new Object[] {ranque, nome, pontuacao});

          contador++;
        }
      }
      
      while(contador <= 10)
      {
        model.addRow(new Object[] {contador, "", ""});
        contador++;
      }
      
      tabelaRankingTable.setModel(model);
    }
    catch(Exception e)
    {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
    }
  }
  
  private void setMeuTableCellRenderer()
  {
    TableCellRenderer renderer = new MeuTableCellRenderer();
    for (int i = 0; i < tabelaRankingTable.getColumnCount(); i++)
    {
      tabelaRankingTable.getColumnModel().getColumn(i).setCellRenderer(renderer);
    }
  }
  
  private void ajustaLarguraColunas()
  {
    var coluna1 = tabelaRankingTable.getColumnModel().getColumn(0);
    coluna1.setPreferredWidth(20);
    var coluna2 = tabelaRankingTable.getColumnModel().getColumn(1);
    coluna2.setPreferredWidth(255);
    var coluna3 = tabelaRankingTable.getColumnModel().getColumn(2);
    coluna3.setPreferredWidth(25);
  }
  
  private void centralizaTituloDasColunas()
  {
    JTableHeader header = tabelaRankingTable.getTableHeader();
    DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
    headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
  }
  
  private void impedeEdicaoDaTabela()
  {
    tabelaRankingTable.setDefaultEditor(Object.class, null);
  }
  
  private void ajustaTabela()
  {
    setMeuTableCellRenderer();
    ajustaLarguraColunas();
    centralizaTituloDasColunas();
    impedeEdicaoDaTabela();
  }
  
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
      java.util.logging.Logger.getLogger(RankingTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(RankingTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(RankingTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(RankingTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new RankingTela().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel fundoTelaRankingPanel;
  private javax.swing.JButton retornarAoMenuButton;
  private javax.swing.JScrollPane tabelaRankingScrollPane;
  private javax.swing.JTable tabelaRankingTable;
  private javax.swing.JLabel tituloRankingLabel;
  // End of variables declaration//GEN-END:variables
}
