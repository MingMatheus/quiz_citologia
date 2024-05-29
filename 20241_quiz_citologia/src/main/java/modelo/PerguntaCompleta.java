/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Matheus
 */

/*
  Essa classe só existe porque eu só fui me ligar que seria melhor fazer a classe Pergunta desse jeito
  muito tarde no projeto, num ponto onde ficou inviável de refazer a classe Pergunta.
  Num cenário ideal essa seria a estrutura da classe Pergunta desde o começo.
  Esse equívoco ocorreu pois eu fiquei apegado ao modelo do Banco de Dados e só fui perceber depois
*/

public class PerguntaCompleta
{
  private int id;
  private String enunciado;
  private Alternativa altCerta;
  private Alternativa altErrada1;
  private Alternativa altErrada2;
  private Alternativa altErrada3;
  private Usuario criador;

  public PerguntaCompleta(int id, String enunciado, Alternativa altCerta, Alternativa altErrada1, Alternativa altErrada2, Alternativa altErrada3, Usuario criador) {
    this.id = id;
    this.enunciado = enunciado;
    this.altCerta = altCerta;
    this.altErrada1 = altErrada1;
    this.altErrada2 = altErrada2;
    this.altErrada3 = altErrada3;
    this.criador = criador;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEnunciado() {
    return enunciado;
  }

  public void setEnunciado(String enunciado) {
    this.enunciado = enunciado;
  }

  public Alternativa getAltCerta() {
    return altCerta;
  }

  public void setAltCerta(Alternativa altCerta) {
    this.altCerta = altCerta;
  }

  public Alternativa getAltErrada1() {
    return altErrada1;
  }

  public void setAltErrada1(Alternativa altErrada1) {
    this.altErrada1 = altErrada1;
  }

  public Alternativa getAltErrada2() {
    return altErrada2;
  }

  public void setAltErrada2(Alternativa altErrada2) {
    this.altErrada2 = altErrada2;
  }

  public Alternativa getAltErrada3() {
    return altErrada3;
  }

  public void setAltErrada3(Alternativa altErrada3) {
    this.altErrada3 = altErrada3;
  }

  public Usuario getCriador() {
    return criador;
  }

  public void setCriador(Usuario criador) {
    this.criador = criador;
  }
  
  public Alternativa [] getAlternativas()
  {
    var alts = new Alternativa[4];
    
    alts[0] = altCerta;
    alts[1] = altErrada1;
    alts[2] = altErrada2;
    alts[3] = altErrada3;
    
    return alts;
  }
}
