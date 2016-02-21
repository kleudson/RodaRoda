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

    /**
     *
     * @param nome
     * @param totalPontos
     */
    public Jogadores(String nome, int totalPontos) {
        this.nome = nome;
        this.totalPontos = totalPontos;
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

}
