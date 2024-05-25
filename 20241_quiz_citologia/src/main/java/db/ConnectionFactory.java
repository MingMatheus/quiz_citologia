/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class ConnectionFactory
{
  // Informações para conexão com o banco de dados
  final private String host = "quiz-citologia-projeto-integrador-maua-colegio-piaget.g.aivencloud.com";
  final private String port = "13707";
  final private String db = "defaultdb";
  final private String user = "avnadmin";
  final private String password = "AVNS_RezEeicVTAwVu5NrmMp";
  
  public Connection obterConexao()
  {
    try
    {
      // jdbc:mysql://host:port/db
      String stringConexao = String.format("jdbc:mysql://%s:%s/%s", host, port, db);
      var conexao = DriverManager.getConnection(stringConexao, user, password);

      return conexao; 
    }
    catch(Exception e)
    {
      JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
      return null;
    }
  }
  
  public static void main(String[] args)
  {
    var conexao = new ConnectionFactory().obterConexao();
    if(conexao != null)
      System.out.println("Conectou! :)");
    else
      System.out.println("Não conectou :(");
  }
}
