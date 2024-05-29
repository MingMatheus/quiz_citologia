/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Matheus
 */
public class Jogador
{
  private int id;
  private String nomeDeJogo;
  private int pontuacao;
  
  public Jogador(String nomeDeJogo)
  {
    this.nomeDeJogo = nomeDeJogo;
    this.pontuacao = 0;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNomeDeJogo() {
    return nomeDeJogo;
  }

  public void setNomeDeJogo(String nomeDeJogo) {
    this.nomeDeJogo = nomeDeJogo;
  }

  public int getPontuacao() {
    return pontuacao;
  }

  public void setPontuacao(int pontuacao) {
    this.pontuacao = pontuacao;
  }

  public void ganhaUmPonto()
  {
    this.pontuacao++;
  }
}
