/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda.strategy;

import rodaroda.Jogadores;

/**
 *
 * @author Kleudson
 */
public class RoletaStrategy {
    private RoletaIF strategy;
    
    public RoletaStrategy(RoletaIF roletaStrategy){
        this.strategy = roletaStrategy;
    }
    
    public String executaStrategy(Jogadores jogadores) {
        return strategy.sortear(jogadores);
    }
}
