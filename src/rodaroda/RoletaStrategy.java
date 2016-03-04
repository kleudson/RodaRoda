package rodaroda;

import rodaroda.Jogadores;

/**
 *
 * @author Kleudson Implementação do Strategy Classe RoletaStrategy executa o
 * Padrão Strategy. Responsável pelo método executaStrategy, que inicia o uso do
 * padrão.
 *
 */
public class RoletaStrategy {

    private RoletaIF strategy;

    /**
     *
     * @param roletaStrategy
     */
    public RoletaStrategy(RoletaIF roletaStrategy) {
        this.strategy = roletaStrategy;
    }

    /**
     *
     * @param jogadores
     * @return
     */
    public String executaStrategy(Jogadores jogadores) {
        return strategy.sortear(jogadores);
    }
}
