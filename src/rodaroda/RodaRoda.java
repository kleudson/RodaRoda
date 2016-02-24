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
        int tamanhoPalavra = palavraSorteada.length();
        char letrasCertas[] = new char[tamanhoPalavra];
        char[] letrasPalavraSorteada = new char[tamanhoPalavra];
        char letra;

        while (jogador.getTentativas() > 0) {
            String palavraFormada = "";
            int letraErrada = 0;

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
                letra = palavra.letrasPalavra().charAt(0);

                for (int i = 0; i < tamanhoPalavra; i++) {
                    letrasPalavraSorteada[i] = palavraSorteada.charAt(i);
                }

                for (int x = 0; x < tamanhoPalavra; x++) {
                    if (letra == letrasPalavraSorteada[x]) {
                        letrasCertas[x] = letra;
                    } else {
                        letraErrada++;
                    }

                    if (letrasCertas[x] == letrasPalavraSorteada[x]) {
                        palavraFormada = palavraFormada + letrasCertas[x];
                        System.out.print("  " + letrasCertas[x] + "  ");
                    } else {
                        System.out.print(" __ ");
                    }
                }

                if (letraErrada >= tamanhoPalavra) {
                    jogador.setTentativas(jogador.getTentativas() - 1);
                    System.out.println("");
                    parametro.frasePalavraErrada(jogador.getTentativas());
                }

                if (palavraFormada.equals(palavraSorteada)) {
                    parametro.frasePalavraCorreta();
                    break;
                }

                jogador.setTotalPontos(jogador.getTotalPontos() + Integer.parseInt(sorteioRoleta));
                System.out.println("");
            }

            System.out.println("A pontuação atual do(a) " + jogador.getNome() + " é: " + jogador.getTotalPontos());
        }
    }
}
