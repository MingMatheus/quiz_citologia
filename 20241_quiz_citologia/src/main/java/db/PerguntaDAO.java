/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

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
}
