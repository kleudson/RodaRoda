/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

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

    public List<String> nomeDosJogadores(int quantidade) {
        Scanner sc = new Scanner(System.in);
        int qtdeRecebida = quantidade;
        List<String> nomeJogadores = new ArrayList<>();
        int contador = 0;
        String jogador = "";

        while (contador < qtdeRecebida) {
            System.out.println("Informe o nome do jogador " + (contador + 1) + ":");
            jogador = sc.nextLine();
            nomeJogadores.add(jogador);
            contador++;
        }
        return nomeJogadores;
    }

    public void imprimirDadosJogadores(List<Jogadores> jogadores) {
        int i = 0;
        Iterator<Jogadores> iteradorJogador = jogadores.iterator();

        while (iteradorJogador.hasNext()) {
            System.out.println("");
            System.out.println("########## JOGADOR 0" + (i + 1) + " ##########");
            System.out.println("Nome: " + jogadores.get(i).getNome());
            System.out.println("Total de Pontos: " + jogadores.get(i).getTotalPontos());
            iteradorJogador.next();
            i++;
        }
    }
    
    public void imprimirDadosJogadoresMultiplayer(List<Jogadores> jogadores) {
        int i = 0;        
        for (Iterator <Jogadores> iteradorFor = jogadores.iterator(); iteradorFor.hasNext();){
            System.out.println("");
            System.out.println("########## JOGADOR 0" + (i + 1) + " ##########");
            System.out.println("Nome: " + jogadores.get(i).getNome());
            System.out.println("Total de Pontos: " + jogadores.get(i).getTotalPontos());
            iteradorFor.next();
            i++;
        }
    }
}
