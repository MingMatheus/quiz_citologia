/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import modelo.Usuario;

/**
 *
 * @author Matheus
 */
public class UsuarioDAO
{
  public void cadastrar(Usuario u) throws Exception
  {
    String sql = "INSERT INTO usuario (nomeDaPessoa, nomeDeUsuario, senha, isAdmin) VALUES (?, ?, ?, ?)";
    try(
      var conexao = new ConnectionFactory().obterConexao();
      var ps = conexao.prepareStatement(sql);
    ){
      ps.setString(1, u.getNomeDaPessoa());
      ps.setString(2, u.getNomeDeUsuario());
      ps.setString(3, u.getSenha());
      ps.setBoolean(4, u.isIsAdmin());
      
      ps.execute();
    }
  }
  
  public boolean existe(Usuario u) throws Exception
  {
    String sql = "SELECT isAdmin FROM usuario WHERE nomeDeUsuario = ? AND senha = ?";
    try(
      var conexao = new ConnectionFactory().obterConexao();
      var ps = conexao.prepareStatement(sql);
    ){
      ps.setString(1, u.getNomeDeUsuario());
      ps.setString(2, u.getSenha());
      
      try(
        var rs = ps.executeQuery()
      ){
        boolean existe = rs.next();
        return existe;
      }
    }
  }
  
  public boolean isAdministrador(Usuario u, boolean porId) throws Exception
  {
    if(porId)
    {
      String sql = "SELECT isAdmin FROM usuario WHERE idUsuario = ?";
      try(
        var conexao = new ConnectionFactory().obterConexao();
        var ps = conexao.prepareStatement(sql);
      ){
        ps.setInt(1, u.getId());
      
        try(
          var rs = ps.executeQuery()
        ){
          rs.next();
          return rs.getBoolean("isAdmin");
        }
      }
    }
    else
    {
      String sql = "SELECT isAdmin FROM usuario WHERE nomeDeUsuario = ? AND senha = ?";
      try(
        var conexao = new ConnectionFactory().obterConexao();
        var ps = conexao.prepareStatement(sql);
      ){
        ps.setString(1, u.getNomeDeUsuario());
        ps.setString(2, u.getSenha());
      
        try(
          var rs = ps.executeQuery()
        ){
          rs.next();
          return rs.getBoolean("isAdmin");
        }
      }
    }
  }
  
  public int idByUsernamePassword(Usuario u) throws Exception
  {
    String sql = "SELECT idUsuario FROM usuario WHERE nomeDeUsuario = ? AND senha = ?";
    
    try(
      var conexao = new ConnectionFactory().obterConexao();
      var ps = conexao.prepareStatement(sql);
    ){
      ps.setString(1, u.getNomeDeUsuario());
      ps.setString(2, u.getSenha());
      
      try(
        var rs = ps.executeQuery()
      ){
        rs.next();
        int id = rs.getInt("idUsuario");
        return id;
      }
    }
  }
}
