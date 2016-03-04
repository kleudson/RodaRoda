/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda;

import rodaroda.Jogadores;

/**
 *
 * @author Kleudson Método principal da classe abstrata Observer. Responsável
 * por atualizar os dados dos Observadores
 */
public abstract class Observer {

    /**
     *
     */
    protected SujeitoAtualizar subject;

    /**
     *
     * @param jogador
     * @param palavraChave
     */
    public abstract void atualizarDados(Jogadores jogador, String palavraChave);
}
