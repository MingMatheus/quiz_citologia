/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import modelo.Alternativa;

/**
 *
 * @author 22.00096-8
 */
public class AlternativaDAO
{
  public boolean existe(Alternativa a) throws Exception
  {
    String sql = "SELECT idAlternativa FROM alternativa WHERE textoAlternativa = ?";
    
    try(
      var conexao = new ConnectionFactory().obterConexao();
      var ps = conexao.prepareStatement(sql);
    ){
      ps.setString(1, a.getTexto());
      
      try(
        var rs = ps.executeQuery()
      ){
        boolean existe = rs.next();
        return existe;
      }
    }
  }
  
  public void cadastrar(Alternativa a) throws Exception
  {
    String sql = "INSERT INTO alternativa (textoAlternativa) VALUES (?)";
    
    try(
      var conexao = new ConnectionFactory().obterConexao();
      var ps = conexao.prepareStatement(sql);
    ){
      ps.setString(1, a.getTexto());
      
      ps.execute();
    }
  }
  
  public int idByText(String texto) throws Exception
  {
    String sql = "SELECT idAlternativa FROM alternativa WHERE textoAlternativa = ?";
    
    try(
      var conexao = new ConnectionFactory().obterConexao();
      var ps = conexao.prepareStatement(sql);
    ){
      ps.setString(1, texto);
      
      try(
        var rs = ps.executeQuery()
      ){
        rs.next();
        int id = rs.getInt("idAlternativa");
        return id;
      }
    }
  }
  
  public String textById(int id) throws Exception
  {
    String sql = "SELECT textoAlternativa FROM alternativa WHERE idAlternativa = ?";
    
    try(
      var conexao = new ConnectionFactory().obterConexao();
      var ps = conexao.prepareStatement(sql);
    ){
      ps.setInt(1, id);
      
      try(
        var rs = ps.executeQuery()
      ){
        rs.next();
        String texto = rs.getString("textoAlternativa");
        return texto;
      }
    }
  }
}
