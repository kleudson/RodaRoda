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
        String valorSorteadoRoleta = "";
        String palavraCompleta = "";
        int tamanhoPalavra = palavraSorteada.length();
        char letrasCertas[] = new char[tamanhoPalavra];
        char[] letrasPalavraSorteada = new char[tamanhoPalavra];
        char[] letra;
        char letraTeste = 0;

        while (jogador.getTentativas() > 0) {
            String palavraFormada = "";
            int letraErrada = 0;

            valorSorteadoRoleta = roleta.sortear();
            System.out.println("");
            System.out.println("Foi Sorteado: " + valorSorteadoRoleta);

            if (valorSorteadoRoleta.equals("Perde Tudo")) {
                jogador.setTentativas(jogador.getTentativas() - 1);
                jogador.setTotalPontos(0);
                parametro.frasePerdeTudo(jogador.getTentativas());

            } else if (valorSorteadoRoleta.equals("Passa a Vez")) {
                jogador.setTentativas(jogador.getTentativas() - 1);
                parametro.frasePassaVez(jogador.getTentativas());
            } else {
                letra = palavra.letrasPalavra();
                
                palavraCompleta = parametro.converteVetorCharString(letra);                
                
                if (palavraCompleta.length() > 1) {
                    if (palavraCompleta.equals(palavraSorteada)){
                        parametro.frasePalavraCorreta();
                        break;
                    } else {
                        jogador.setTentativas(jogador.getTentativas() -1);
                        parametro.frasePalavraIncorreta(jogador.getTentativas());
                        continue;
                    }
                }
                
                for (int z = 0; z < letra.length; z++) {
                    letraTeste = letra[z];
                }

                for (int i = 0; i < tamanhoPalavra; i++) {
                    letrasPalavraSorteada[i] = palavraSorteada.charAt(i);
                }

                for (int x = 0; x < tamanhoPalavra; x++) {
                    if (letraTeste == letrasPalavraSorteada[x]) {
                        letrasCertas[x] = letraTeste;
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
                    parametro.fraseLetraIncorreta(jogador.getTentativas());
                    System.out.println("A pontuação atual do(a) " + jogador.getNome() + " é: " + jogador.getTotalPontos());
                    continue;                    
                }

                if (palavraFormada.equals(palavraSorteada)) {
                    parametro.frasePalavraCorreta();
                    break;
                }

                jogador.setTotalPontos(jogador.getTotalPontos() + Integer.parseInt(valorSorteadoRoleta));
                System.out.println("");
            }

            System.out.println("A pontuação atual do(a) " + jogador.getNome() + " é: " + jogador.getTotalPontos());
        }
    }
}
