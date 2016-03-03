/*
 * Implementação do Strategy
   Classe RoletaStrategy executa o Padrão Strategy.
 */
package rodaroda;

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
