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
    private String tema;

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
    
    public String tema() {
        double numero_aleatorio;
        int numeroSorteado;
        String tema = "";
        
        numero_aleatorio = Math.random() * 3;
        numero_aleatorio = Math.floor(numero_aleatorio);
        numeroSorteado = (int) numero_aleatorio;
        
        switch (numeroSorteado) {//Provisório, posteriormente vai pegar de um arquivo de texto em disco.
            case 0:
                tema = "Animais";
                break;
            case 1:
                tema = "Carros";
                break;
            case 2: 
                tema = "Profissões";
                break;
            default:
                System.out.println("Erro no sistema, opção de tema fora de escopo");
        }
        return tema;
    }


    public String[] Jogadores(int quantidade) {
        Scanner sc = new Scanner(System.in);
        int qtdeRecebida = quantidade;
        String nomeJogadores[] = new String[qtdeRecebida];
        String jogadorUm, jogadorDois, jogadorTres;

        for (int i = 0; i < qtdeRecebida; i++) {
            if (qtdeRecebida == 1) {
                System.out.println("Informe o nome do jogador " + (i + 1) + ":");
                jogadorUm = sc.nextLine();
                nomeJogadores[i] = jogadorUm;
            } else if (qtdeRecebida == 2) {
                System.out.println("Informe o nome do jogador " + (i + 1) + ":");
                jogadorUm = sc.nextLine();
                nomeJogadores[i] = jogadorUm;
                i++;

                System.out.println("Informe o nome do jogador " + (i + 1) + ":");
                jogadorDois = sc.nextLine();
                nomeJogadores[i] = jogadorDois;
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
//        for (int i = 0; i < nomeJogadores.length; i++){
//            System.out.println("");
//            System.out.println("Jogador "+(i + 1)+" : "+nomeJogadores[i]);
//            System.out.println("");
//        }
        
        
        return nomeJogadores;
    }
}
