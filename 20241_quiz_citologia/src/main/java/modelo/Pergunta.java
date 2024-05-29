/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 22.00096-8
 */
public class Pergunta
{
  private int id;
  private String enunciado;
  private int idAltCerta;
  private int idAltErrada1;
  private int idAltErrada2;
  private int idAltErrada3;
  private int idCriador;

  public Pergunta(int id, String enunciado, int idAltCerta, int idAltErrada1, int idAltErrada2, int idAltErrada3, int idCriador) {
    this.id = id;
    this.enunciado = enunciado;
    this.idAltCerta = idAltCerta;
    this.idAltErrada1 = idAltErrada1;
    this.idAltErrada2 = idAltErrada2;
    this.idAltErrada3 = idAltErrada3;
    this.idCriador = idCriador;
  }
  
  public Pergunta(int id)
  {
    this.id = id;
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

  public int getIdAltCerta() {
    return idAltCerta;
  }

  public void setIdAltCerta(int idAltCerta) {
    this.idAltCerta = idAltCerta;
  }

  public int getIdAltErrada1() {
    return idAltErrada1;
  }

  public void setIdAltErrada1(int idAltErrada1) {
    this.idAltErrada1 = idAltErrada1;
  }

  public int getIdAltErrada2() {
    return idAltErrada2;
  }

  public void setIdAltErrada2(int idAltErrada2) {
    this.idAltErrada2 = idAltErrada2;
  }

  public int getIdAltErrada3() {
    return idAltErrada3;
  }

  public void setIdAltErrada3(int idAltErrada3) {
    this.idAltErrada3 = idAltErrada3;
  }

  public int getIdCriador() {
    return idCriador;
  }

  public void setIdCriador(int idCriador) {
    this.idCriador = idCriador;
  }
  
  @Override
  public String toString()
  {
    return this.enunciado;
  }
}
