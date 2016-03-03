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
 * @author Kleudson
 */
public class SujeitoAtualizar  {
    
    public ArrayList<Observer> listaObservadores = new ArrayList<Observer>();
    
    public void setNotificacao(Jogadores jogadores, String palavraChave) {
        notificarObservadores(jogadores, palavraChave);
    }
    
    public void addObserver (Observer observer) {
        this.listaObservadores.add(observer);
    }
    
    public void notificarObservadores (Jogadores jogadores, String palavraChave) {
        for (Observer observer : listaObservadores){
            observer.atualizarDados(jogadores, palavraChave);
        }
    }
}
