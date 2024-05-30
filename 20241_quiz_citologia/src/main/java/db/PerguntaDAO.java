/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.ResultSet;
import modelo.Pergunta;

/**
 *
 * @author 22.00096-8
 */
public class PerguntaDAO
{
  public void cadastrar(Pergunta p) throws Exception
  {
    String inicioSql = "INSERT INTO pergunta (enunciado, idAlternativaCerta, idAlternativaErrada1, idAlternativaErrada2, idAlternativaErrada3, idCriador)";
    String fimSql = " VALUES (?, ?, ?, ?, ?, ?)";
    String sql = String.format("%s%s", inicioSql, fimSql);
    
    try(
      var conexao = new ConnectionFactory().obterConexao();
      var ps = conexao.prepareStatement(sql);
    ){
      ps.setString(1, p.getEnunciado());
      ps.setInt(2, p.getIdAltCerta());
      ps.setInt(3, p.getIdAltErrada1());
      ps.setInt(4, p.getIdAltErrada2());
      ps.setInt(5, p.getIdAltErrada3());
      ps.setInt(6, p.getIdCriador());
      
      ps.execute();
    }
  }
  
  public Pergunta [] obterPerguntas() throws Exception
  {
    String sql = "SELECT * FROM pergunta";
    
    try(
      var conexao = new ConnectionFactory().obterConexao();
      var ps = conexao.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
      var rs = ps.executeQuery();
    ){
      int totalDePerguntas = rs.last() ? rs.getRow() : 0;
      var perguntas = new Pergunta [totalDePerguntas];
      
      rs.beforeFirst();
      
      int contador = 0;
      while(rs.next())
      {
        int id = rs.getInt("idPergunta");
        String enunciado = rs.getString("enunciado");
        int idAltCerta = rs.getInt("idAlternativaCerta");
        int idAltErrada1 = rs.getInt("idAlternativaErrada1");
        int idAltErrada2 = rs.getInt("idAlternativaErrada2");
        int idAltErrada3 = rs.getInt("idAlternativaErrada3");
        int idCriador = rs.getInt("idCriador");
        var p = new Pergunta(id, enunciado, idAltCerta, idAltErrada1, idAltErrada2, idAltErrada3, idCriador);
        
        perguntas[contador] = p;
        contador++;
      }
      
      return perguntas;
    }
  }
  
  public void remover(Pergunta p) throws Exception
  {
    String sql = "DELETE FROM pergunta WHERE idPergunta = ?";
    
    try(
      var conexao = new ConnectionFactory().obterConexao();
      var ps = conexao.prepareStatement(sql);
    ){
      ps.setInt(1, p.getId());
      
      ps.execute();
    }
  }
  
  public int numeroDePerguntas() throws Exception
  {
    String sql = "SELECT COUNT(*) FROM pergunta";
    
    try(
      var conexao = new ConnectionFactory().obterConexao();
      var ps = conexao.prepareStatement(sql);
      var rs = ps.executeQuery();
    ){
      rs.next();
      int totalDePerguntas = rs.getInt(1);
      return totalDePerguntas;
    }
  }
}
