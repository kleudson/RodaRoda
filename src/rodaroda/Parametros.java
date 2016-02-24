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

    public List<String> escolheArquivoTxt(String tema) {
        List<String> palavras = new ArrayList<>();
        String linha;
        String nomeArquivo;
        String nomeArquivoCompleto;
        FileReader arquivo;
        BufferedReader lerArquivo;
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

    public String converteVetorCharString(char[] vetorChar) {
        String palavraString = "";
        for (int i = 0; i < vetorChar.length; i++) {
            palavraString = palavraString + vetorChar[i];
        }
        return palavraString;
    }

    public void frasePerdeTudo(int tentativa) {
        if (tentativa < 1) {
            System.out.println("Que Azar Heim, PERDEU TUDO!!!!!!");
        } else {
            System.out.println("Que Azar Heim, PERDEU TUDO!!!!!!");
            System.out.println("Mas não se preocupe, você ainda tem " + tentativa + " tentativa(s).");
        }
    }

    public int frasePassaVez(int tentativa) {
        if (tentativa < 1) {
            System.out.println("Que Azar Heim, PASSOU A VEZ!!!");
        } else {
            System.out.println("Que Azar Heim, PASSOU A VEZ!!!");
            System.out.println("Mas não se preocupe, você ainda tem " + tentativa + " tentativa(s).");
        }
        return tentativa;
    }

    public void frasePalavraErrada(int tentativa) {
        if (tentativa < 1) {
            System.out.println("Que pena, essa letra não existe na palavra!!!");
        } else {
            System.out.println("Que pena, essa letra não existe na palavra!!!");
            System.out.println("Mas não se preocupe, você ainda tem " + tentativa + " tentativa(s).");
        }
    }

    public void frasePalavraCorreta() {
        System.out.println("");
        System.out.println("**************************************************************");
        System.out.println("************* PARABÉNS, VOCÊ ACERTOU A PALAVRA!! *************");
        System.out.println("**************************************************************");
        System.out.println("");
    }
}
