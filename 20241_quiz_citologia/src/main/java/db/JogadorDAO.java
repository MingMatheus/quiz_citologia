/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import modelo.Jogador;

/**
 *
 * @author Matheus
 */
public class JogadorDAO
{
  public void cadastrar(Jogador j) throws Exception
  {
    String sql = "INSERT INTO jogador (nomeDeJogo, pontuacao) VALUES (?, ?)";
    try(
      var conexao = new ConnectionFactory().obterConexao();
      var ps = conexao.prepareStatement(sql);
    ){
      ps.setString(1, j.getNomeDeJogo());
      ps.setInt(2, j.getPontuacao());
      
      ps.execute();
    }
  }
}
