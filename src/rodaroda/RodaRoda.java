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
public class RodaRoda {

    Roleta roleta = new Roleta();
    Palavras palavra = new Palavras();
    Parametros parametro = new Parametros();

    public void iniciarJogo(int qtdeJogadores, Jogadores jogador, String palavraSorteada) {
        String sorteioRoleta = "";
        String palavraFormadaCompleta = "";
        char[] palavraFormada = new char[palavraSorteada.length()];
        char letra;

        while (jogador.getTentativas() > 0) {

            sorteioRoleta = roleta.sortear();
            System.out.println("");
            System.out.println("Foi Sorteado: " + sorteioRoleta);

            if (sorteioRoleta.equals("Perde Tudo")) {
                jogador.setTentativas(jogador.getTentativas() - 1);
                jogador.setTotalPontos(0);
                parametro.frasePerdeTudo(jogador.getTentativas());

            } else if (sorteioRoleta.equals("Passa a Vez")) {
                jogador.setTentativas(jogador.getTentativas() - 1);
                parametro.frasePassaVez(jogador.getTentativas());
            } else {
                int tentativas = jogador.getTentativas();
                int ultimo tamanhoVetor;
                letra = palavra.letrasPalavra().charAt(0);
                palavraFormada = palavra.compararLetras(letra, palavraSorteada, palavraFormada, tentativas);
                
                

                palavraFormadaCompleta = parametro.converteVetorCharString(palavraFormada);

                if (palavraFormadaCompleta.equals(palavraSorteada)) {
                    parametro.frasePalavraCorreta();
                    break;
                }
                jogador.setTentativas(tentativas);
                jogador.setTotalPontos(jogador.getTotalPontos() + Integer.parseInt(sorteioRoleta));
                System.out.println("");
            }

            System.out.println("A pontuação atual do(a) " + jogador.getNome() + " é: " + jogador.getTotalPontos());
        }
    }
}
