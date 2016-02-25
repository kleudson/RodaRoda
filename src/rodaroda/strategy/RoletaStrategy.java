/*
 * Implementação do Strategy
   Classe RoletaStrategy executa o Padrão Strategy.
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
