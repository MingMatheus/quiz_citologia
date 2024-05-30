/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elementos_visuais_personalizados;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

/**
 *
 * @author Matheus
 */
public class MeuTableCellRenderer extends DefaultTableCellRenderer
{
  // Cor da borda entre cada linha
  private static final Color COR_BORDA_ENTRE_LINHAS = new Color(80, 80, 80);

  @Override
  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
  {
    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

    // Cria uma bordinha entre cada linha da tabela
    if (c instanceof JComponent jc)
    {
      jc.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, COR_BORDA_ENTRE_LINHAS));
    }
    
    // Centraliza o conteúdo de cada linha
    setHorizontalAlignment(SwingConstants.CENTER);

    return c;
  }
}
