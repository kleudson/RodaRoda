/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kleudson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    String tema = "animais";
    String palavra = "cachorro";

    void Menu() {
        System.out.println("M E N U - RODA A RODA - PDS\n");
        System.out.println("1 - Para informar uma letra\n");
        System.out.println("2 - Para tentar adivinhar a palavra\n");
        System.out.println("3 - Sair do jogo\n");
    }

    void Sorte() {
        {
            Scanner sc = new Scanner(System.in);
            char letra = ' ';
            System.out.println("***** SORTE!!! ****");
            System.out.println("Para informar uma letra, digite '1' ou digite '2' para tentar adivinhar a palavra");
            System.out.println("Por favor, escolha uma letra");
            letra = sc.nextLine().charAt(0);
            System.out.println("");
            //totalPontos = totalPontos + Integer.parseInt(sorteado);
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {
                    System.out.print(letra);
                } else {
                    System.out.print(" __ ");
                }
            }
        }
    }

    public static void main(String[] args) {
        String nomeUm;
        String nomeDois;
        String nomeTres;
        String tema;
        String palavraSorteada;
        String[] vetorNomeJogadores;
        List<String> listPalavras;
        List<Jogadores> listJogadores = new ArrayList<>();
        int qtdeJogadores, qtdeEtapas, qtdePalavras;
        int totalTentativas = 3;
        int totalPontos = 0;
        int contador = 0;
        Palavras palavra = new Palavras();
        Parametros parametros = new Parametros();
        Jogadores jogador1 = new Jogadores();
        Jogadores jogador2 = new Jogadores();
        Jogadores jogador3 = new Jogadores();
        RodaRoda rodaRoda = new RodaRoda();

        qtdeJogadores = parametros.qtdeJogadores();
        qtdeEtapas = parametros.qtdEtapas();
        qtdePalavras = parametros.qtdePalavras();
        tema = parametros.sortearTema();

        listPalavras = parametros.escolheArquivoTxt(tema);

        palavraSorteada = palavra.sortearPalavra(listPalavras);

        vetorNomeJogadores = jogador1.nomeDosJogadores(qtdeJogadores);

        System.out.println("");
        System.out.println("Quantidade de jogadores escolhida é: " + qtdeJogadores);
        System.out.println("Quantidade de etapas escolhida é: " + qtdeEtapas);
        System.out.println("Quantidade de palavras escolhida é: " + qtdePalavras);
        System.out.println("O tema escolhido aleatóriamente foi: " + tema);
        System.out.println("");


            if (qtdeJogadores == 1) {
                nomeUm = vetorNomeJogadores[contador];
                jogador1.jogadores(nomeUm, totalPontos, totalTentativas);
                listJogadores.add(jogador1);

                jogador1.imprimirDadosJogadores(listJogadores);

                System.out.println("Dica: a palavra contém " + palavraSorteada.length() + " letras.");
                
                rodaRoda.iniciarJogo(qtdeJogadores, jogador1, palavraSorteada);

            } else if (qtdeJogadores == 2) {

                nomeUm = vetorNomeJogadores[contador];
                contador++;
                nomeDois = vetorNomeJogadores[contador];

                jogador1.jogadores(nomeUm, totalPontos, totalTentativas);
                jogador2.jogadores(nomeDois, totalPontos, totalTentativas);

                listJogadores.add(jogador1);
                listJogadores.add(jogador2);

                jogador1.imprimirDadosJogadores(listJogadores);
            } else {
                nomeUm = vetorNomeJogadores[contador];
                contador++;
                nomeDois = vetorNomeJogadores[contador];
                contador++;
                nomeTres = vetorNomeJogadores[contador];

                jogador1.jogadores(nomeUm, totalPontos, totalTentativas);
                jogador2.jogadores(nomeDois, totalPontos, totalTentativas);
                jogador3.jogadores(nomeTres, totalPontos, totalTentativas);

                listJogadores.add(jogador1);
                listJogadores.add(jogador2);
                listJogadores.add(jogador3);

                jogador1.imprimirDadosJogadores(listJogadores);
            }

        System.out.println("");
        System.out.println("FIM DE JOGO ");
    }

}
