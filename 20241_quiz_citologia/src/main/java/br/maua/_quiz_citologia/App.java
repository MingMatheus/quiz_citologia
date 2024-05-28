/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.maua._quiz_citologia;

import db.AlternativaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class App
{
  public static void main(String[] args) throws Exception
  {
    var dao = new AlternativaDAO();
    String texto = JOptionPane.showInputDialog("Digite o texto da alternativa que deseja procurar");
    var resposta = String.format("ID da alternativa: %d\n", dao.idByText(texto));
    JOptionPane.showMessageDialog(null, resposta);
  }
}
