/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda;

import java.util.ArrayList;
import rodaroda.Jogadores;

/**
 *
 * @author Kleudson Classe responsável por criar uma ArrayList de observadores,
 * adicionar observadores e notifica-los. Sempre que for solicitado, esta classe
 * irá percorrer todas as classes observadoras informando da mudança de estado
 * da classe observada.
 */
public class SujeitoAtualizar {

    /**
     *
     */
    public ArrayList<Observer> listaObservadores = new ArrayList<Observer>();

    /**
     *
     * @param jogadores
     * @param palavraChave
     */
    public void setNotificacao(Jogadores jogadores, String palavraChave) {
        notificarObservadores(jogadores, palavraChave);
    }

    /**
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        this.listaObservadores.add(observer);
    }

    /**
     *
     * @param jogadores
     * @param palavraChave
     */
    public void notificarObservadores(Jogadores jogadores, String palavraChave) {
        for (Observer observer : listaObservadores) {
            observer.atualizarDados(jogadores, palavraChave);
        }
    }
}
