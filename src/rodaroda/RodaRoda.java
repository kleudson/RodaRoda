/*
 * 
   
 */
package rodaroda;

import java.util.Scanner;

/**
 *
 * @author Kleudson Classe que inicializa o jogo para 1 Jogador, 2 Jogadores ou
 * 3 Jogadores
 */
public class RodaRoda {

    Palavras palavra = new Palavras();
    SujeitoAtualizar sujeito = new SujeitoAtualizar();
    ParametrosObserver parametro = new ParametrosObserver(sujeito);
/*    
//Métodos responsável por Iniciar o Jogo para um jogador, passando vários parâmetros;
*/
    /**
     *
     * @param jogador
     * @param configuracoes
     */
        public void iniciarJogo(Jogadores jogador, Configuracoes configuracoes) {
        boolean roletaViciada = configuracoes.isRoletaViciada();
        String palavraSorteada = configuracoes.getListPalavraSorteada().get(0);
        String valorSorteadoRoleta = "";
        String palavraCompleta = "";
        String girar = "";
        int tamanhoPalavraGirar = 0;
        boolean eAphaG = false;
        char[] letra;
        char letraTemporaria = 0;
        int tamanhoPalavra = palavraSorteada.length();
        char letrasCertas[] = new char[tamanhoPalavra];
        char[] letrasPalavraSorteada = new char[tamanhoPalavra];
        Scanner sc = new Scanner(System.in);
        RoletaStrategy roletaStrategy = new RoletaStrategy(new RoletaViciada());

        while (jogador.getTentativas() > 0) {

            String palavraFormada = "";
            int letraErrada = 0;

            do {
                System.out.println("Aperte 'G' para Girar a roleta");
                girar = sc.nextLine();
                eAphaG = isAlphaG(girar);
                if (eAphaG) {
                    tamanhoPalavraGirar = girar.length();
                    System.out.println("Roda a Roda! Roda a Roda! Rodando... girando...");
                }
            } while ((tamanhoPalavraGirar < 1) || (tamanhoPalavraGirar > 1) || (eAphaG != true));

            if (roletaViciada) {
                valorSorteadoRoleta = roletaStrategy.executaStrategy(jogador);
            } else {
                roletaStrategy = new RoletaStrategy(new RoletaAleatoria());
                valorSorteadoRoleta = roletaStrategy.executaStrategy(jogador);
            }

            System.out.println("");
            System.out.println("Foi Sorteado: " + valorSorteadoRoleta);

            if (valorSorteadoRoleta.equals("Perde Tudo")) {
                jogador.setTentativas(jogador.getTentativas() - 1);
                jogador.setTotalPontos(0);
                sujeito.setNotificacao(jogador, "PerdeTudo");

            } else if (valorSorteadoRoleta.equals("Passa a Vez")) {
                jogador.setTentativas(jogador.getTentativas() - 1);
                sujeito.setNotificacao(jogador, "PassaVez");
            } else {

                letra = palavra.letrasPalavra();

                palavraCompleta = parametro.converteVetorCharString(letra);

                if (palavraCompleta.length() > 1) {
                    if (palavraCompleta.equals(palavraSorteada)) {
                        sujeito.setNotificacao(jogador, "PalavraCorreta");
                        break;
                    } else {
                        jogador.setTentativas(jogador.getTentativas() - 1);
                        sujeito.setNotificacao(jogador, "PalavraIncorreta");
                        continue;
                    }
                }

                for (int z = 0; z < letra.length; z++) {
                    letraTemporaria = letra[z];
                }

                for (int i = 0; i < tamanhoPalavra; i++) {
                    letrasPalavraSorteada[i] = palavraSorteada.charAt(i);
                }

                for (int x = 0; x < tamanhoPalavra; x++) {
                    if (letraTemporaria == letrasPalavraSorteada[x]) {
                        letrasCertas[x] = letraTemporaria;
                        jogador.setTotalPontos(jogador.getTotalPontos() + Integer.parseInt(valorSorteadoRoleta));
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
                    sujeito.setNotificacao(jogador, "LetraIncorreta");
                    sujeito.setNotificacao(jogador, "PontuacaoAtual");
                    continue;
                }

                if (palavraFormada.equals(palavraSorteada)) {
                    sujeito.setNotificacao(jogador, "PalavraCorreta");
                    break;
                }
                System.out.println("");
            }

            sujeito.setNotificacao(jogador, "PontuacaoAtual");
        }
    }
/*
    //Métodos responsável por Iniciar o Jogo para dois jogadores, passando vários parâmetros necessários;
*/
    /**
     *
     * @param jogador1
     * @param jogador2
     * @param configuracoes
     */
        public void iniciarJogoDois(Jogadores jogador1, Jogadores jogador2, Configuracoes configuracoes) {
        boolean roletaViciada = configuracoes.isRoletaViciada();
        String valorSorteadoRoleta = "";
        String palavraCompleta = "";
        String girar = "";
        String palavraSorteada = configuracoes.getListPalavraSorteada().get(0);
        int tamanhoPalavraGirar = 0;
        boolean eAphaG = false;
        int tamanhoPalavra = palavraSorteada.length();
        char letrasCertas[] = new char[tamanhoPalavra];
        char[] letrasPalavraSorteada = new char[tamanhoPalavra];
        char[] letra;
        char letraTeste = 0;
        int vezJogador = 0;
        boolean fimDeJogo = false;
        Scanner sc = new Scanner(System.in);
        RoletaStrategy roletaStrategy = new RoletaStrategy(new RoletaViciada());

        while (fimDeJogo == false) {

            if (vezJogador == 0) {
                jogador1.setVezDeJogar(true);
                jogador2.setVezDeJogar(false);
                System.out.println("");

                sujeito.setNotificacao(jogador1, "vezJogar");

                String palavraFormada = "";
                int letraErrada = 0;

                do {
                    System.out.println("Aperte 'G' para Girar a roleta");
                    girar = sc.nextLine();
                    eAphaG = isAlphaG(girar);
                    if (eAphaG) {
                        tamanhoPalavraGirar = girar.length();
                        System.out.println("Roda a Roda! Roda a Roda! Rodando... girando...");
                    }
                } while ((tamanhoPalavraGirar < 1) || (tamanhoPalavraGirar > 1) || (eAphaG != true));

                if (roletaViciada) {
                    valorSorteadoRoleta = roletaStrategy.executaStrategy(jogador1);
                } else {
                    roletaStrategy = new RoletaStrategy(new RoletaAleatoria());
                    valorSorteadoRoleta = roletaStrategy.executaStrategy(jogador1);
                }

                System.out.println("");
                System.out.println("Foi Sorteado: " + valorSorteadoRoleta);

                if (valorSorteadoRoleta.equals("Perde Tudo")) {
                    jogador1.setTotalPontos(0);
                    sujeito.setNotificacao(jogador1, "PerdeTudoMultiplayer");
                    vezJogador++;
                    continue;

                } else if (valorSorteadoRoleta.equals("Passa a Vez")) {
                    sujeito.setNotificacao(jogador1, "PassaVezMultiplayer");
                    vezJogador++;
                    continue;
                } else {
                    letra = palavra.letrasPalavra();

                    palavraCompleta = parametro.converteVetorCharString(letra);

                    if (palavraCompleta.length() > 1) {
                        if (palavraCompleta.equals(palavraSorteada)) {
                            sujeito.setNotificacao(jogador1, "PalavraCorreta");
                            break;
                        } else {
                            sujeito.setNotificacao(jogador1, "PalavraIncorretaMultiplayer");
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
                        sujeito.setNotificacao(jogador1, "LetraIncorretaMultiplayer");
                        sujeito.setNotificacao(jogador1, "PontuacaoAtual");
                        vezJogador++;
                        continue;
                    }

                    if (palavraFormada.equals(palavraSorteada)) {
                        sujeito.setNotificacao(jogador1, "PalavraCorreta");
                        break;
                    }
                    System.out.println("");
                }
                sujeito.setNotificacao(jogador1, "PontuacaoAtual");
            } else {
                jogador1.setVezDeJogar(false);
                jogador2.setVezDeJogar(true);
                System.out.println("");
                sujeito.setNotificacao(jogador2, "vezJogar");
                String palavraFormada = "";
                int letraErrada = 0;

                do {
                    System.out.println("Aperte 'G' para Girar a roleta");
                    girar = sc.nextLine();
                    eAphaG = isAlphaG(girar);
                    if (eAphaG) {
                        tamanhoPalavraGirar = girar.length();
                        System.out.println("Roda a Roda! Roda a Roda! Rodando... girando...");
                    }
                } while ((tamanhoPalavraGirar < 1) || (tamanhoPalavraGirar > 1) || (eAphaG != true));

                if (roletaViciada) {
                    valorSorteadoRoleta = roletaStrategy.executaStrategy(jogador2);
                } else {
                    roletaStrategy = new RoletaStrategy(new RoletaAleatoria());
                    valorSorteadoRoleta = roletaStrategy.executaStrategy(jogador2);
                }

                System.out.println("");
                System.out.println("Foi Sorteado: " + valorSorteadoRoleta);

                if (valorSorteadoRoleta.equals("Perde Tudo")) {
                    jogador2.setTotalPontos(0);
                    sujeito.setNotificacao(jogador2, "PerdeTudoMultiplayer");
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
                            sujeito.setNotificacao(jogador2, "PontuacaoAtual");
                            break;
                        } else {
                            sujeito.setNotificacao(jogador2, "PalavraIncorretaMultiplayer");
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
                        sujeito.setNotificacao(jogador2, "LetraIncorretaMultiplayer");
                        sujeito.setNotificacao(jogador2, "PontuacaoAtual");
                        vezJogador--;
                        continue;
                    }

                    if (palavraFormada.equals(palavraSorteada)) {
                        sujeito.setNotificacao(jogador2, "PalavraCorreta");
                        break;
                    }
                    System.out.println("");
                }
                sujeito.setNotificacao(jogador2, "PontuacaoAtual");
            }
        }
    }
/*
    //Métodos responsável por Iniciar o Jogo para três jogadores, passando vários parâmetros necessários;
*/
    /**
     *
     * @param jogador1
     * @param jogador2
     * @param jogador3
     * @param configuracoes
     */
        public void iniciarJogoTres(Jogadores jogador1, Jogadores jogador2, Jogadores jogador3, Configuracoes configuracoes) {
        boolean roletaViciada = configuracoes.isRoletaViciada();
        String palavraSorteada = configuracoes.getListPalavraSorteada().get(0);
        String valorSorteadoRoleta = "";
        String palavraCompleta = "";
        String girar = "";
        int tamanhoPalavraGirar = 0;
        boolean eAphaG = false;
        int tamanhoPalavra = palavraSorteada.length();
        char letrasCertas[] = new char[tamanhoPalavra];
        char[] letrasPalavraSorteada = new char[tamanhoPalavra];
        char[] letra;
        char letraTeste = 0;
        int vezJogador = 0;
        boolean fimDeJogo = false;
        Scanner sc = new Scanner(System.in);
        RoletaStrategy roletaStrategy = new RoletaStrategy(new RoletaViciada());

        while (fimDeJogo == false) {

            if (vezJogador == 0) {
                jogador1.setVezDeJogar(true);
                jogador2.setVezDeJogar(false);
                jogador3.setVezDeJogar(false);
                System.out.println("");

                sujeito.setNotificacao(jogador1, "vezJogar");

                String palavraFormada = "";
                int letraErrada = 0;

                do {
                    System.out.println("Aperte 'G' para Girar a roleta");
                    girar = sc.nextLine();
                    eAphaG = isAlphaG(girar);
                    if (eAphaG) {
                        tamanhoPalavraGirar = girar.length();
                        System.out.println("Roda a Roda! Roda a Roda! Rodando... girando...");
                    }
                } while ((tamanhoPalavraGirar < 1) || (tamanhoPalavraGirar > 1) || (eAphaG != true));

                if (roletaViciada) {
                    valorSorteadoRoleta = roletaStrategy.executaStrategy(jogador1);
                } else {
                    roletaStrategy = new RoletaStrategy(new RoletaAleatoria());
                    valorSorteadoRoleta = roletaStrategy.executaStrategy(jogador1);
                }

                System.out.println("");
                System.out.println("Foi Sorteado: " + valorSorteadoRoleta);

                if (valorSorteadoRoleta.equals("Perde Tudo")) {
                    jogador1.setTotalPontos(0);
                    sujeito.setNotificacao(jogador1, "PerdeTudoMultiplayer");
                    vezJogador++;
                    continue;

                } else if (valorSorteadoRoleta.equals("Passa a Vez")) {
                    sujeito.setNotificacao(jogador1, "PassaVezMultiplayer");
                    vezJogador++;
                    continue;
                } else {
                    letra = palavra.letrasPalavra();

                    palavraCompleta = parametro.converteVetorCharString(letra);

                    if (palavraCompleta.length() > 1) {
                        if (palavraCompleta.equals(palavraSorteada)) {
                            sujeito.setNotificacao(jogador1, "PalavraCorreta");
                            fimDeJogo = true;
                            break;
                        } else {
                            sujeito.setNotificacao(jogador1, "PalavraIncorretaMultiplayer");
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
                        sujeito.setNotificacao(jogador1, "LetraIncorretaMultiplayer");
                        sujeito.setNotificacao(jogador1, "PontuacaoAtual");
                        vezJogador++;
                        continue;
                    }

                    if (palavraFormada.equals(palavraSorteada)) {
                        sujeito.setNotificacao(jogador1, "PalavraCorreta");
                        fimDeJogo = true;
                        break;
                    }
                    System.out.println("");
                }
                sujeito.setNotificacao(jogador1, "PontuacaoAtual");
            } else if (vezJogador == 1) {
                jogador1.setVezDeJogar(false);
                jogador2.setVezDeJogar(true);
                jogador3.setVezDeJogar(false);

                System.out.println("");
                sujeito.setNotificacao(jogador2, "vezJogar");
                String palavraFormada = "";
                int letraErrada = 0;

                do {
                    System.out.println("Aperte 'G' para Girar a roleta");
                    girar = sc.nextLine();
                    eAphaG = isAlphaG(girar);
                    if (eAphaG) {
                        tamanhoPalavraGirar = girar.length();
                        System.out.println("Roda a Roda! Roda a Roda! Rodando... girando...");
                    }
                } while ((tamanhoPalavraGirar < 1) || (tamanhoPalavraGirar > 1) || (eAphaG != true));

                if (roletaViciada) {
                    valorSorteadoRoleta = roletaStrategy.executaStrategy(jogador2);
                } else {
                    roletaStrategy = new RoletaStrategy(new RoletaAleatoria());
                    valorSorteadoRoleta = roletaStrategy.executaStrategy(jogador2);
                }

                System.out.println("");
                System.out.println("Foi Sorteado: " + valorSorteadoRoleta);

                if (valorSorteadoRoleta.equals("Perde Tudo")) {
                    jogador2.setTotalPontos(0);
                    sujeito.setNotificacao(jogador2, "PerdeTudoMultiplayer");
                    vezJogador++;
                    continue;

                } else if (valorSorteadoRoleta.equals("Passa a Vez")) {
                    sujeito.setNotificacao(jogador2, "PassaVezMultiplayer");
                    vezJogador++;
                    continue;
                } else {
                    letra = palavra.letrasPalavra();

                    palavraCompleta = parametro.converteVetorCharString(letra);

                    if (palavraCompleta.length() > 1) {
                        if (palavraCompleta.equals(palavraSorteada)) {
                            sujeito.setNotificacao(jogador2, "PalavraCorreta");
                            fimDeJogo = true;
                            break;
                        } else {
                            sujeito.setNotificacao(jogador2, "PalavraIncorretaMultiplayer");
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
                        sujeito.setNotificacao(jogador2, "LetraIncorretaMultiplayer");
                        sujeito.setNotificacao(jogador2, "PontuacaoAtual");
                        vezJogador++;
                        continue;
                    }

                    if (palavraFormada.equals(palavraSorteada)) {
                        sujeito.setNotificacao(jogador2, "PalavraCorreta");
                        fimDeJogo = true;
                        break;
                    }
                    System.out.println("");
                }
                sujeito.setNotificacao(jogador2, "PontuacaoAtual");
            } else {
                jogador1.setVezDeJogar(false);
                jogador2.setVezDeJogar(false);
                jogador3.setVezDeJogar(true);

                System.out.println("");
                sujeito.setNotificacao(jogador3, "vezJogar");
                String palavraFormada = "";
                int letraErrada = 0;

                do {
                    System.out.println("Aperte 'G' para Girar a roleta");
                    girar = sc.nextLine();
                    eAphaG = isAlphaG(girar);
                    if (eAphaG) {
                        tamanhoPalavraGirar = girar.length();
                        System.out.println("Roda a Roda! Roda a Roda! Rodando... girando...");
                    }
                } while ((tamanhoPalavraGirar < 1) || (tamanhoPalavraGirar > 1) || (eAphaG != true));

                if (roletaViciada) {
                    valorSorteadoRoleta = roletaStrategy.executaStrategy(jogador3);
                } else {
                    roletaStrategy = new RoletaStrategy(new RoletaAleatoria());
                    valorSorteadoRoleta = roletaStrategy.executaStrategy(jogador3);
                }

                System.out.println("");
                System.out.println("Foi Sorteado: " + valorSorteadoRoleta);

                if (valorSorteadoRoleta.equals("Perde Tudo")) {
                    jogador3.setTotalPontos(0);
                    sujeito.setNotificacao(jogador3, "PerdeTudoMultiplayer");
                    vezJogador = vezJogador - 2;
                    continue;

                } else if (valorSorteadoRoleta.equals("Passa a Vez")) {
                    sujeito.setNotificacao(jogador3, "PassaVezMultiplayer");
                    vezJogador = vezJogador - 2;
                    continue;
                } else {
                    letra = palavra.letrasPalavra();

                    palavraCompleta = parametro.converteVetorCharString(letra);

                    if (palavraCompleta.length() > 1) {
                        if (palavraCompleta.equals(palavraSorteada)) {
                            sujeito.setNotificacao(jogador3, "PalavraCorreta");
                            fimDeJogo = true;
                            break;
                        } else {
                            sujeito.setNotificacao(jogador3, "PalavraIncorretaMultiplayer");
                            vezJogador = vezJogador - 2;
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
                        sujeito.setNotificacao(jogador3, "LetraIncorretaMultiplayer");
                        sujeito.setNotificacao(jogador3, "PontuacaoAtual");
                        vezJogador = vezJogador - 2;
                        continue;
                    }

                    if (palavraFormada.equals(palavraSorteada)) {
                        sujeito.setNotificacao(jogador3, "PalavraCorreta");
                        fimDeJogo = true;
                        break;
                    }
                    System.out.println("");
                }
                sujeito.setNotificacao(jogador3, "PontuacaoAtual");
            }

        }
    }
/*
    //Métodos para limitar os caracteres aceitos
*/
    /**
     *
     * @param name
     * @return
     */
        public boolean isAlphaG(String name) {
        return name.matches("[g,G]+");
    }
}
