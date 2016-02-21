/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
package rodaroda;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    public String sortearTema() {
        double numeroAleatorio;
        int numeroSorteado;
        String tema = "";

        numeroAleatorio = Math.random() * 3;
        numeroAleatorio = Math.floor(numeroAleatorio);
        numeroSorteado = (int) numeroAleatorio;

        switch (numeroSorteado) {//Provisório, posteriormente vai pegar de um arquivo de texto em disco.
            case 0:
                tema = "profissao";
                break;
            case 1:
                tema = "cidade";
                break;
            case 2:
                tema = "filme";
                break;
            default:
                System.out.println("Erro no sistema, opção de tema fora de escopo");
        }
        return tema;
    }
    
    public String sortearPalavra(List<String> arrayPalavras){
        String palavraSorteada = "";       
        double numeroAleatorio;
        int numeroSorteado;

        numeroAleatorio = Math.random() * arrayPalavras.size();
        numeroAleatorio = Math.floor(numeroAleatorio);
        numeroSorteado = (int) numeroAleatorio;
        
        palavraSorteada = arrayPalavras.set(numeroSorteado, "");
        
        
        return palavraSorteada;
    }

    public List<String> escolheArquivoTxt(String tema) {
        List<String> palavras = new ArrayList<String>();
        String linha = null;
        String nomeArquivo = null;
        String nomeArquivoCompleto = null;
        FileReader arquivo = null;
        BufferedReader lerArquivo = null;
        nomeArquivo = tema;
        nomeArquivoCompleto = "ArquivosTxt/" + nomeArquivo + ".txt";

        try {
            arquivo = new FileReader(nomeArquivoCompleto);
            lerArquivo = new BufferedReader(arquivo);
            linha = lerArquivo.readLine();
            while (linha != null) {
                palavras.add(linha);
                linha = lerArquivo.readLine();
            }
            lerArquivo.close();
        } catch (IOException e) {
            System.err.printf("Erro na Abertura do Arquivo: " + nomeArquivo, e.getMessage());
        }
        return palavras;
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
        return nomeJogadores;
    }
}
