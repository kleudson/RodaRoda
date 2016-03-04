package rodaroda;

import rodaroda.Jogadores;

/**
 *
 * @author Kleudson Implementação da Interface Strategy com o método sortear.
 * Este médoto irá definir se a roleta fará um sorteio usando a roleta aleatória
 * ou a roleta viciada. Interface RoletaIF
 */
public interface RoletaIF {

    /**
     *
     * @param jogadores
     * @return
     */
    public String sortear(Jogadores jogadores);
}
