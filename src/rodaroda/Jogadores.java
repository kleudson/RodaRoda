/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda;
/**
 *
 * @author Kleudson
 */
public class Jogadores {

    private String nome;
    private int pontos;
    private int tentativas;

    /**
     *
     * @param nome
     * @param totalPontos
     * @param tentativas
     */
    public Jogadores(String nome, int totalPontos, int tentativas) {
        this.nome = nome;
        this.pontos = totalPontos;
        this.tentativas = tentativas;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalPontos() {
        return pontos;
    }
    
    public void setTotalPontos(int totalPontos) {
        this.pontos = totalPontos;
    } 
    
    public int getTentativas() {
        return tentativas;
    }
    
    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }
    
    public void imprimirUmJogador(String jogadores[]) {
        int totalPontos = 0;
        int totalTentativas = 3;
        String nomeUm = "";
        
            nomeUm = jogadores[0];
            Jogadores jogador1 = new Jogadores(nomeUm, totalPontos, totalTentativas);

            System.out.println("########## JOGADOR 01 ##########");
            System.out.println("Nome: " + jogador1.getNome());
            System.out.println("Tentativas: " + jogador1.getTentativas());
            System.out.println("Total de Pontos: " + jogador1.getTotalPontos());
            System.out.println("");
    }


  public void imprimirDoisJogadores(String jogadores[]) {
      String nomeUm, nomeDois;  
      int totalPontos = 0;
        int totalTentativas = 3;
        
                nomeUm = jogadores[0];
                i++;
                nomeDois = jogadores[1];

                Jogadores jogador1 = new Jogadores(nomeUm, totalPontos, totalTentativas);
                Jogadores jogador2 = new Jogadores(nomeDois, totalPontos, totalTentativas);

                System.out.println("");
                System.out.println("########## JOGADOR 01 ##########");
                System.out.println("Nome: " + jogador1.getNome());
                System.out.println("Tentativas: " + jogador1.getTentativas());
                System.out.println("Total de Pontos: " + jogador1.getTotalPontos());

                System.out.println("");
                System.out.println("########## JOGADOR 02 ##########");
                System.out.println("Nome: " + jogador2.getNome());
                System.out.println("Tentativas: " + jogador2.getTentativas());
                System.out.println("Total de Pontos: " + jogador2.getTotalPontos());
  }
  
  public void imprimirTresJogadores (String jogadores[]) {
      
      String nomeUm, nomeDois;  
      int totalPontos = 0;
        int totalTentativas = 3;
        
        
                nomeUm = jogadores[0];

                nomeDois = jogadores[1];

                nomeTres = jogadores[2];

                Jogadores jogador1 = new Jogadores(nomeUm, totalPontos, totalTentativas);
                Jogadores jogador2 = new Jogadores(nomeDois, totalPontos, totalTentativas);
                Jogadores jogador3 = new Jogadores(nomeTres, totalPontos, totalTentativas);

                System.out.println("");
                System.out.println("########## JOGADOR 01 ##########");
                System.out.println("Nome: " + jogador1.getNome());
                System.out.println("Tentativas: " + jogador1.getTentativas());
                System.out.println("Total de Pontos: " + jogador1.getTotalPontos());

                System.out.println("");
                System.out.println("########## JOGADOR 02 ##########");
                System.out.println("Nome: " + jogador2.getNome());
                System.out.println("Tentativas: " + jogador2.getTentativas());
                System.out.println("Total de Pontos: " + jogador2.getTotalPontos());

                System.out.println("");
                System.out.println("########## JOGADOR 03 ##########");
                System.out.println("Nome: " + jogador3.getNome());
                System.out.println("Tentativas: " + jogador3.getTentativas());
                System.out.println("Total de Pontos: " + jogador3.getTotalPontos());
  }
}


