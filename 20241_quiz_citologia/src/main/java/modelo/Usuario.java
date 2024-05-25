/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Matheus
 */
public class Usuario
{
  private int id;
  private String nomeDaPessoa;
  private String nomeDeUsuario;
  private String senha;
  private boolean isAdmin;

  public Usuario(int id, String nomeDaPessoa, String nomeDeUsuario, String senha, boolean isAdmin) {
    this.id = id;
    this.nomeDaPessoa = nomeDaPessoa;
    this.nomeDeUsuario = nomeDeUsuario;
    this.senha = senha;
    this.isAdmin = isAdmin;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNomeDaPessoa() {
    return nomeDaPessoa;
  }

  public void setNomeDaPessoa(String nomeDaPessoa) {
    this.nomeDaPessoa = nomeDaPessoa;
  }

  public String getNomeDeUsuario() {
    return nomeDeUsuario;
  }

  public void setNomeDeUsuario(String nomeDeUsuario) {
    this.nomeDeUsuario = nomeDeUsuario;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public boolean isIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(boolean isAdmin) {
    this.isAdmin = isAdmin;
  }
}
