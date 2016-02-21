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
    private int totalPontos;
    private int tentativas;

    /**
     *
     * @param nome
     * @param totalPontos
     * @param tentativas
     */
    public Jogadores(String nome, int totalPontos, int tentativas) {
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

}
