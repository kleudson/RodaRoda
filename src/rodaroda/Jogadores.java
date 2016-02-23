/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda;

import java.util.List;

/**
 *
 * @author Kleudson
 */
public class Jogadores {

    private String nome;
    private int totalPontos;
    private int tentativas;

    /**
     *
     * @param nome
     * @param totalPontos
     * @param tentativas
     */
    public void jogadores(String nome, int totalPontos, int tentativas) {
        this.nome = nome;
        this.totalPontos = totalPontos;
        this.tentativas = tentativas;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalPontos() {
        return totalPontos;
    }
    
    public void setTotalPontos(int totalPontos) {
        this.totalPontos = totalPontos;
    } 
    
    public int getTentativas() {
        return tentativas;
    }
    
    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

  public void imprimirDadosJogadores(List<Jogadores> jogadores) {
      for (int i = 0; i < jogadores.size(); i++){
                System.out.println("");
                System.out.println("########## JOGADOR 0"+(i+1)+" ##########");
                System.out.println("Nome: " + jogadores.get(i).getNome());
                System.out.println("Tentativas: " + jogadores.get(i).getTentativas());
                System.out.println("Total de Pontos: " + jogadores.get(i).getTotalPontos());
      }
  }
}


