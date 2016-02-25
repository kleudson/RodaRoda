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
                    if (palavraCompleta.equals(palavraSorteada)) {
                        parametro.frasePalavraCorreta(jogador.getNome());
                        break;
                    } else {
                        jogador.setTentativas(jogador.getTentativas() - 1);
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
                    parametro.frasePalavraCorreta(jogador.getNome());
                    break;
                }

                jogador.setTotalPontos(jogador.getTotalPontos() + Integer.parseInt(valorSorteadoRoleta));
                System.out.println("");
            }

            System.out.println("A pontuação atual do(a) " + jogador.getNome() + " é: " + jogador.getTotalPontos());
        }
    }

    public void iniciarJogoDois(int qtdeJogadores, Jogadores jogador1, Jogadores jogador2, String palavraSorteada) {
        String valorSorteadoRoleta = "";
        String palavraCompleta = "";
        int tamanhoPalavra = palavraSorteada.length();
        char letrasCertas[] = new char[tamanhoPalavra];
        char[] letrasPalavraSorteada = new char[tamanhoPalavra];
        char[] letra;
        char letraTeste = 0;
        int vezJogador = 0;
        boolean fimDeJogo = false;

        while (fimDeJogo == false) {

            if (vezJogador == 0) {
                System.out.println("");
                parametro.fraseVezJogar(jogador1.getNome(), jogador1.getTotalPontos());

                String palavraFormada = "";
                int letraErrada = 0;

                valorSorteadoRoleta = roleta.sortear();
                System.out.println("");
                System.out.println("Foi Sorteado: " + valorSorteadoRoleta);

                if (valorSorteadoRoleta.equals("Perde Tudo")) {
                    jogador1.setTotalPontos(0);
                    parametro.frasePerdeTudoMultiplayer();
                    vezJogador++;
                    continue;

                } else if (valorSorteadoRoleta.equals("Passa a Vez")) {
                    parametro.frasePassaVezMultiplayer();
                    vezJogador++;
                    continue;
                } else {
                    letra = palavra.letrasPalavra();

                    palavraCompleta = parametro.converteVetorCharString(letra);

                    if (palavraCompleta.length() > 1) {
                        if (palavraCompleta.equals(palavraSorteada)) {
                            parametro.frasePalavraCorreta(jogador1.getNome());
                            fimDeJogo = true;
                            break;
                        } else {
                            parametro.frasePalavraIncorretaMultiplayer();
                            vezJogador++;
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
                            jogador1.setTotalPontos(jogador1.getTotalPontos() + Integer.parseInt(valorSorteadoRoleta));
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
                        System.out.println("");
                        parametro.fraseLetraIncorretaMultiplayer();
                        parametro.frasePontuacaoAtual(jogador1.getNome().toUpperCase(), jogador1.getTotalPontos());
                        vezJogador++;
                        continue;
                    }

                    if (palavraFormada.equals(palavraSorteada)) {
                        parametro.frasePalavraCorreta(jogador1.getNome());
                        fimDeJogo = true;
                        break;
                    }
                    System.out.println("");
                }
                parametro.frasePontuacaoAtual(jogador1.getNome().toUpperCase(), jogador1.getTotalPontos());
            } else {
                System.out.println("");
                parametro.fraseVezJogar(jogador2.getNome(), jogador2.getTotalPontos());
                String palavraFormada = "";
                int letraErrada = 0;

                valorSorteadoRoleta = roleta.sortear();
                System.out.println("");
                System.out.println("Foi Sorteado: " + valorSorteadoRoleta);

                if (valorSorteadoRoleta.equals("Perde Tudo")) {
                    jogador2.setTotalPontos(0);
                    parametro.frasePerdeTudoMultiplayer();
                    vezJogador--;
                    continue;

                } else if (valorSorteadoRoleta.equals("Passa a Vez")) {
                    parametro.frasePassaVezMultiplayer();
                    vezJogador--;
                    continue;
                } else {
                    letra = palavra.letrasPalavra();

                    palavraCompleta = parametro.converteVetorCharString(letra);

                    if (palavraCompleta.length() > 1) {
                        if (palavraCompleta.equals(palavraSorteada)) {
                            parametro.frasePalavraCorreta(jogador2.getNome());
                            fimDeJogo = true;
                            break;
                        } else {
                            parametro.frasePalavraIncorretaMultiplayer();
                            vezJogador--;
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
                            jogador2.setTotalPontos(jogador2.getTotalPontos() + Integer.parseInt(valorSorteadoRoleta));
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
                        System.out.println("");
                        parametro.fraseLetraIncorretaMultiplayer();
                        parametro.frasePontuacaoAtual(jogador2.getNome(), jogador2.getTotalPontos());
                        vezJogador--;
                        continue;
                    }

                    if (palavraFormada.equals(palavraSorteada)) {
                        parametro.frasePalavraCorreta(jogador2.getNome());
                        fimDeJogo = true;
                        break;
                    }
                    System.out.println("");
                }
                parametro.frasePontuacaoAtual(jogador2.getNome(), jogador2.getTotalPontos());
            }
        }
    }

    public void iniciarJogoTres(int qtdeJogadores, Jogadores jogador1, Jogadores jogador2, Jogadores jogador3, String palavraSorteada) {
        String valorSorteadoRoleta = "";
        String palavraCompleta = "";
        int tamanhoPalavra = palavraSorteada.length();
        char letrasCertas[] = new char[tamanhoPalavra];
        char[] letrasPalavraSorteada = new char[tamanhoPalavra];
        char[] letra;
        char letraTeste = 0;
        int vezJogador = 0;
        boolean fimDeJogo = false;

        while (fimDeJogo == false) {

            if (vezJogador == 0) {
                System.out.println("");
                parametro.fraseVezJogar(jogador1.getNome(), jogador1.getTotalPontos());

                String palavraFormada = "";
                int letraErrada = 0;

                valorSorteadoRoleta = roleta.sortear();
                System.out.println("");
                System.out.println("Foi Sorteado: " + valorSorteadoRoleta);

                if (valorSorteadoRoleta.equals("Perde Tudo")) {
                    jogador1.setTotalPontos(0);
                    parametro.frasePerdeTudoMultiplayer();
                    vezJogador++;
                    continue;

                } else if (valorSorteadoRoleta.equals("Passa a Vez")) {
                    parametro.frasePassaVezMultiplayer();
                    vezJogador++;
                    continue;
                } else {
                    letra = palavra.letrasPalavra();

                    palavraCompleta = parametro.converteVetorCharString(letra);

                    if (palavraCompleta.length() > 1) {
                        if (palavraCompleta.equals(palavraSorteada)) {
                            parametro.frasePalavraCorreta(jogador1.getNome());
                            fimDeJogo = true;
                            break;
                        } else {
                            parametro.frasePalavraIncorretaMultiplayer();
                            vezJogador++;
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
                            jogador1.setTotalPontos(jogador1.getTotalPontos() + Integer.parseInt(valorSorteadoRoleta));
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
                        System.out.println("");
                        parametro.fraseLetraIncorretaMultiplayer();
                        parametro.frasePontuacaoAtual(jogador1.getNome().toUpperCase(), jogador1.getTotalPontos());
                        vezJogador++;
                        continue;
                    }

                    if (palavraFormada.equals(palavraSorteada)) {
                        parametro.frasePalavraCorreta(jogador1.getNome());
                        fimDeJogo = true;
                        break;
                    }
                    System.out.println("");
                }
                parametro.frasePontuacaoAtual(jogador1.getNome().toUpperCase(), jogador1.getTotalPontos());
            } else if (vezJogador == 1) {
                System.out.println("");
                parametro.fraseVezJogar(jogador2.getNome(), jogador2.getTotalPontos());
                String palavraFormada = "";
                int letraErrada = 0;

                valorSorteadoRoleta = roleta.sortear();
                System.out.println("");
                System.out.println("Foi Sorteado: " + valorSorteadoRoleta);

                if (valorSorteadoRoleta.equals("Perde Tudo")) {
                    jogador2.setTotalPontos(0);
                    parametro.frasePerdeTudoMultiplayer();
                    vezJogador++;
                    continue;

                } else if (valorSorteadoRoleta.equals("Passa a Vez")) {
                    parametro.frasePassaVezMultiplayer();
                    vezJogador++;
                    continue;
                } else {
                    letra = palavra.letrasPalavra();

                    palavraCompleta = parametro.converteVetorCharString(letra);

                    if (palavraCompleta.length() > 1) {
                        if (palavraCompleta.equals(palavraSorteada)) {
                            parametro.frasePalavraCorreta(jogador2.getNome());
                            fimDeJogo = true;
                            break;
                        } else {
                            parametro.frasePalavraIncorretaMultiplayer();
                            vezJogador++;
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
                            jogador2.setTotalPontos(jogador2.getTotalPontos() + Integer.parseInt(valorSorteadoRoleta));
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
                        System.out.println("");
                        parametro.fraseLetraIncorretaMultiplayer();
                        parametro.frasePontuacaoAtual(jogador2.getNome(), jogador2.getTotalPontos());
                        vezJogador++;
                        continue;
                    }

                    if (palavraFormada.equals(palavraSorteada)) {
                        parametro.frasePalavraCorreta(jogador2.getNome());
                        fimDeJogo = true;
                        break;
                    }
                    System.out.println("");
                }
                parametro.frasePontuacaoAtual(jogador2.getNome(), jogador2.getTotalPontos());
            } else {
                System.out.println("");
                parametro.fraseVezJogar(jogador3.getNome(), jogador3.getTotalPontos());
                String palavraFormada = "";
                int letraErrada = 0;

                valorSorteadoRoleta = roleta.sortear();
                System.out.println("");
                System.out.println("Foi Sorteado: " + valorSorteadoRoleta);

                if (valorSorteadoRoleta.equals("Perde Tudo")) {
                    jogador3.setTotalPontos(0);
                    parametro.frasePerdeTudoMultiplayer();
                    vezJogador = vezJogador - 2;
                    continue;

                } else if (valorSorteadoRoleta.equals("Passa a Vez")) {
                    parametro.frasePassaVezMultiplayer();
                    vezJogador = vezJogador - 2;
                    continue;
                } else {
                    letra = palavra.letrasPalavra();

                    palavraCompleta = parametro.converteVetorCharString(letra);

                    if (palavraCompleta.length() > 1) {
                        if (palavraCompleta.equals(palavraSorteada)) {
                            parametro.frasePalavraCorreta(jogador3.getNome());
                            fimDeJogo = true;
                            break;
                        } else {
                            parametro.frasePalavraIncorretaMultiplayer();
                            vezJogador = vezJogador -2;
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
                            jogador3.setTotalPontos(jogador3.getTotalPontos() + Integer.parseInt(valorSorteadoRoleta));
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
                        System.out.println("");
                        parametro.fraseLetraIncorretaMultiplayer();
                        parametro.frasePontuacaoAtual(jogador3.getNome(), jogador3.getTotalPontos());
                        vezJogador = vezJogador -2;
                        continue;
                    }

                    if (palavraFormada.equals(palavraSorteada)) {
                        parametro.frasePalavraCorreta(jogador3.getNome());
                        fimDeJogo = true;
                        break;
                    }
                    System.out.println("");
                }
                parametro.frasePontuacaoAtual(jogador3.getNome(), jogador3.getTotalPontos());
            }
        }
    }
}
