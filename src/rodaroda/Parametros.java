/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda;

import java.util.Scanner;

/**
 *
 * @author Kleudson
 */
public class Parametros {

    private int qtdeJogadores;
    private int qtdePalavras;
    private int qtdeEtapas;

    public int qtdEtapas() {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Informe a Quantidade de Etapas");
        qtdeEtapas = sc.nextInt();

        while ((qtdeEtapas < 1) || (qtdeEtapas > 7)) {
            System.out.println("Por favor, escolha o número de etapas. Minimo 1 e Máximo 7.");
            qtdeEtapas = sc.nextInt();
        }

        return qtdeEtapas;
    }

    public int qtdePalavras() {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Informe a Quantidade de Palavras");
        qtdePalavras = sc.nextInt();

        while ((qtdePalavras < 1) || (qtdePalavras > 3)) {
            System.out.println("Por favor, escolha o número de palavras. Minimo 1 e Máximo 3.");
            qtdePalavras = sc.nextInt();
        }

        return qtdePalavras;
    }

    public int qtdeJogadores() {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Informe a Quantidade de jogadores");
        qtdeJogadores = sc.nextInt();

        while ((qtdeJogadores < 1) || (qtdeJogadores > 3)) {
            System.out.println("Por favor, escolha o número de jogadores. Minimo 1 e Máximo 3.");
            qtdeJogadores = sc.nextInt();
        }

        return qtdeJogadores;
    }

    public String[] Jogadores(int quantidade) {
        Scanner sc = new Scanner(System.in);
        int qtdeRecebida = quantidade;
        String nomeJogadores[] = new String[3];
        String jogadorUm, jogadorDois, jogadorTres;

        for (int i = 0; i < qtdeRecebida; i++) {
            if (qtdeRecebida == 1) {
                System.out.println("Informe o nome do jogador " + (i + 1) + ":");
                jogadorUm = sc.nextLine();
                nomeJogadores[i - 1] = jogadorUm;
            } else if (qtdeRecebida == 2) {
                System.out.println("Informe o nome do jogador " + (i + 1) + ":");
                jogadorUm = sc.nextLine();
                nomeJogadores[i - 1] = jogadorUm;
                i++;

                System.out.println("Informe o nome do jogador " + (i + 1) + ":");
                jogadorDois = sc.nextLine();
                nomeJogadores[i - 1] = jogadorDois;
                i++;

            } else if (qtdeRecebida == 3) {
                System.out.println("Informe o nome do jogador " + (i + 1) + ":");
                jogadorUm = sc.nextLine();
                nomeJogadores[i] = jogadorUm;
                i++;

                System.out.println("Informe o nome do jogador " + (i + 1) + ":");
                jogadorDois = sc.nextLine();
                nomeJogadores[i] = jogadorDois;
                i++;

                System.out.println("Informe o nome do jogador " + (i + 1) + ":");
                jogadorTres = sc.nextLine();
                nomeJogadores[i] = jogadorTres;
                i++;
            }
        }
        return nomeJogadores;
    }
}
