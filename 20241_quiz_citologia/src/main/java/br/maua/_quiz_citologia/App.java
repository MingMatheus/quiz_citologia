/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.maua._quiz_citologia;

import db.UsuarioDAO;
import modelo.Usuario;

/**
 *
 * @author Matheus
 */
public class App
{
  public static void main(String[] args) throws Exception
  {
    String login = "asdasd";
    String senha = "prasdadsof";
    
    var dao = new UsuarioDAO();
    var u = new Usuario(0, null, login, senha, false);
    boolean isAdmin = dao.existe(u);
    
    System.out.printf("Esse usuario existe?\nR: %s\n", isAdmin ? "sim" : "nao");
  }
}
