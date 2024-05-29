/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import modelo.Alternativa;
import modelo.PerguntaCompleta;
import static telas.PerguntaTela.MAX_PERGUNTAS_POR_PARTIDA;

/**
 *
 * @author Matheus
 */
public class PerguntaCompletaDAO
{
  public PerguntaCompleta [] obterPerguntasParaJogar() throws Exception
  {
    String s1 = "SELECT P.idPergunta AS 'idPergunta', P.enunciado AS 'Enunciado', P.idAlternativaCerta AS 'idCerta', ";
    String s2 = "P.idAlternativaErrada1 AS 'idErrada1', P.idAlternativaErrada2 AS 'idErrada2', P.idAlternativaErrada3 AS 'idErrada3', ";
    String s3 = "A1.textoAlternativa AS 'textoCerta', A2.textoAlternativa AS 'textoErrada1', A3.textoAlternativa AS 'textoErrada2', ";
    String s4 = "A4.textoAlternativa AS 'textoErrada3' FROM pergunta AS P ";
    String s5 = "JOIN alternativa AS A1 ON `P`.`idAlternativaCerta` = `A1`.`idAlternativa` ";
    String s6 = "JOIN alternativa AS A2 ON `P`.`idAlternativaErrada1` = `A2`.`idAlternativa` ";
    String s7 = "JOIN alternativa AS A3 ON `P`.`idAlternativaErrada2` = `A3`.`idAlternativa` ";
    String s8 = "JOIN alternativa AS A4 ON `P`.`idAlternativaErrada3` = `A4`.`idAlternativa` ORDER BY RAND() LIMIT ?";
    String sql = String.format("%s%s%s%s%s%s%s%s", s1, s2, s3, s4, s5, s6, s7, s8);
    
    try(
      var conexao = new ConnectionFactory().obterConexao();
      var ps = conexao.prepareStatement(sql);
    ){
      ps.setInt(1, MAX_PERGUNTAS_POR_PARTIDA);
      
      try(
        var rs = ps.executeQuery();
      ){
        var perguntas = new PerguntaCompleta [MAX_PERGUNTAS_POR_PARTIDA];
        int contador = 0;
        while(rs.next())
        {
          int id = rs.getInt("idPergunta");
          String enunciado = rs.getString("Enunciado");
          
          int idAltCerta = rs.getInt("idCerta");
          int idAltErrada1 = rs.getInt("idErrada1");
          int idAltErrada2 = rs.getInt("idErrada2");
          int idAltErrada3 = rs.getInt("idErrada3");
          
          String textoCerta = rs.getString("textoCerta");
          String textoErrada1 = rs.getString("textoErrada1");
          String textoErrada2 = rs.getString("textoErrada2");
          String textoErrada3 = rs.getString("textoErrada3");
          
          var ac = new Alternativa(idAltCerta, textoCerta);
          var ae1 = new Alternativa(idAltErrada1, textoErrada1);
          var ae2 = new Alternativa(idAltErrada2, textoErrada2);
          var ae3 = new Alternativa(idAltErrada3, textoErrada3);
          
          var p = new PerguntaCompleta(id, enunciado, ac, ae1, ae2, ae3, null);

          perguntas[contador] = p;
          contador++;
        }

        return perguntas;
      }
    }
  }
}
