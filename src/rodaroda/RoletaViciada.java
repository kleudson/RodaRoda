package rodaroda;

import rodaroda.Jogadores;

/**
 *
 * @author Kleudson Foi abordado duas estratégias de giro da roleta. Uma Viciada
 * e outra Aleatória. Essa classe é responsável por implementar a roleta
 * Viciada. Sempre que o usuário girar a roleta pela segunda vez, irá passar a
 * vez. Atributo qtdeGiros é monitorado
 */
public class RoletaViciada implements RoletaIF {

    /**
     *
     * @param jogadores
     * @return
     */
    public String sortear(Jogadores jogadores) {
        double numero_aleatorio;
        int numeroSorteado;

        if (jogadores.getQtdeGiros() != 1) {

            jogadores.setQtdeGiros(jogadores.getQtdeGiros() + 1);

            numero_aleatorio = Math.random() * 20;
            numero_aleatorio = Math.floor(numero_aleatorio);
            numeroSorteado = (int) numero_aleatorio;

            String perdeTudo = "Perde Tudo";
            String passaVez = "Passa a Vez";
            String cem = "100";
            String duzentos = "200";
            String quatrocentos = "400";
            String quinhentos = "500";
            String mil = "1000";

            if ((numeroSorteado >= 0) && (numeroSorteado <= 1)) {
                return perdeTudo;
            } else if ((numeroSorteado >= 2) && (numeroSorteado <= 3)) {
                return passaVez;
            } else if ((numeroSorteado >= 4) && (numeroSorteado <= 7)) {
                return cem;
            } else if ((numeroSorteado >= 8) && (numeroSorteado <= 11)) {
                return duzentos;
            } else if ((numeroSorteado >= 12) && (numeroSorteado <= 15)) {
                return quatrocentos;
            } else if ((numeroSorteado >= 16) && (numeroSorteado <= 17)) {
                return quinhentos;
            } else if ((numeroSorteado >= 18) && (numeroSorteado <= 19)) {
                return mil;
            } else {
                return sortear(jogadores);
            }
        } else {
            String passaVez = "Passa a Vez";
            jogadores.setQtdeGiros(0);
            return passaVez;
        }
    }
}
