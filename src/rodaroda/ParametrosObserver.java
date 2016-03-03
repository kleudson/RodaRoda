/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import rodaroda.Jogadores;
import rodaroda.Palavras;

/**
 *
 * @author Kleudson
 */
public class ParametrosObserver extends Observer {
    
    Palavras palavra = new Palavras();
    private int qtdeJogadores;
    private int qtdePalavras;
    private int qtdeEtapas;

    //Métodos solicita a quantidade de etapas o jogo terá
//
    public ParametrosObserver(SujeitoAtualizar sujeito) {

        this.subject = sujeito;
        this.subject.addObserver(this);
    }

    ParametrosObserver() {

    }

    public int qtdEtapas() {
        Scanner sc;
        sc = new Scanner(System.in);
        boolean eNumero = false;
        String quantidadeEtapas = "";

        do {
            System.out.println("Informe a Quantidade de Etapas");
            System.out.println("Número Minimo 1 e Máximo 7.");
            quantidadeEtapas = sc.nextLine();
            eNumero = palavra.isNumero(quantidadeEtapas);
            if (eNumero) {
                qtdeEtapas = Integer.parseInt(quantidadeEtapas);
            }
        } while ((qtdeEtapas < 1) || (qtdeEtapas > 7) || (eNumero != true));

        return qtdeEtapas;
    }

    //Métodos solicita a quantidade de palavras o jogo terá
    public int qtdePalavras() {
        Scanner sc;
        sc = new Scanner(System.in);
        boolean eNumero = false;
        String quantidadePalavras = "";

        do {
            System.out.println("Informe a Quantidade de Palavras");
            System.out.println("Número Minimo 1 e Máximo 3.");
            quantidadePalavras = sc.nextLine();
            eNumero = palavra.isNumero(quantidadePalavras);
            if (eNumero) {
                qtdePalavras = Integer.parseInt(quantidadePalavras);
            }
        } while ((qtdePalavras < 1) || (qtdePalavras > 3) || (eNumero != true));

        return qtdePalavras;
    }

//    Método pergunta ao usuário se ele quer começar o jogo utilizando
//    a Roleta Viciada ou Roleta Aleatória.
    public boolean roletaViciada() {
        Scanner sc;
        sc = new Scanner(System.in);
        boolean booleanRoletaViciada = false;
        boolean eAlpha;
        String stringRoletaViciada;

        do {
            System.out.println("*** ATENÇÃO!!! Deseja definir a 'Roleta Viciada'? ***");
            System.out.println("Digite 'S' para SIM e 'N' para NÃO");
            stringRoletaViciada = sc.nextLine().toLowerCase();

            eAlpha = palavra.isAlphaVezDeJogar(stringRoletaViciada);
            if (stringRoletaViciada.equals("s")) {
                booleanRoletaViciada = true;
            } else {
                booleanRoletaViciada = false;
            }
        } while ((stringRoletaViciada.length() != 1) || (eAlpha != true));
        return booleanRoletaViciada;
    }

    //Métodos solicita a quantidade de jogadores o jogo terá
    public int qtdeJogadores() {
        Scanner sc;
        sc = new Scanner(System.in);
        boolean eNumero = false;
        String quantidadeJogadores = "";

        do {
            System.out.println("Informe a Quantidade de jogadores");
            System.out.println("Número Minimo 1 e Máximo 3.");
            quantidadeJogadores = sc.nextLine();
            eNumero = palavra.isNumero(quantidadeJogadores);
            if (eNumero) {
                qtdeJogadores = Integer.parseInt(quantidadeJogadores);
            }
        } while ((qtdeJogadores < 1) || (qtdeJogadores > 3) || (eNumero != true));

        return qtdeJogadores;
    }

    //Métodos responsável por sortear o Tema
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

    //Métodos responsável por carregar o arquivo correto de acordo com o tema escolhido.
    //Pois temos 3 arquivos com 20 palavras cada.

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

    //Métodos responsável por converter char em String

    public String converteVetorCharString(char[] vetorChar) {
        String palavraString = "";
        for (int i = 0; i < vetorChar.length; i++) {
            palavraString = palavraString + vetorChar[i];
        }
        return palavraString;
    }

    //Métodos responsável por exibir ao usuário a frase Perde Tudo;

    public void frasePerdeTudo(int tentativa) {
        if (tentativa < 1) {
            System.out.println("Que Azar Heim, PERDEU TUDO!!!!!!");
        } else {
            System.out.println("Que Azar Heim, PERDEU TUDO!!!!!!");
            System.out.println("Mas não se preocupe, você ainda tem " + tentativa + " tentativa(s).");
        }
    }

    //Métodos responsável por exibir ao usuário a frase Passa a Vez

    public int frasePassaVez(int tentativa) {
        if (tentativa < 1) {
            System.out.println("Que Azar Heim, PASSOU A VEZ!!!");
        } else {
            System.out.println("Que Azar Heim, PASSOU A VEZ!!!");
            System.out.println("Mas não se preocupe, você ainda tem " + tentativa + " tentativa(s).");
        }
        return tentativa;
    }

    //Métodos responsável por exibir ao usuário a frase passa a vez Multiplayer   
    public void frasePassaVezMultiplayer() {
        System.out.println("Que Azar Heim, PASSOU A VEZ!!!");
        System.out.println("");
    }

    //Métodos responsável por exibir ao usuário a pontuação atual

    public void frasePontuacaoAtual(String nome, int pontuacao) {
        System.out.println("######");
        System.out.println("######" + nome + ": " + pontuacao + " Pontos ######");
        System.out.println("######");
        System.out.println("");
    }

    //Métodos responsável por exibir ao usuário a frase Perde Tudo Multiplayer
    public void frasePerdeTudoMultiplayer() {
        System.out.println("Que Azar Heim, PERDEU TUDO!!!!!!");
        System.out.println("");
    }

    //Métodos responsável por exibir ao usuário a frase Letra Incorreta    
    public void fraseLetraIncorreta(int tentativa) {
        if (tentativa < 1) {
            System.out.println("Que pena, essa letra não existe na palavra!!!");
        } else {
            System.out.println("Que pena, essa letra não existe na palavra!!!");
            System.out.println("Mas não se preocupe, você ainda tem " + tentativa + " tentativa(s).");
        }
    }

    //Métodos responsável por exibir ao usuário a Letra Incorreta Multiplayer    
    public void fraseLetraIncorretaMultiplayer() {
        System.out.println("Que pena, essa letra não existe na palavra!!!");
        System.out.println("");
    }

    //Métodos responsável por exibir ao usuário a frase palavra Correta    
    public void frasePalavraCorreta(String nome) {
        System.out.println("");
        System.out.println("*************************************************************************************");
        System.out.println("************* PARABÉNS " + nome.toUpperCase() + ", VOCÊ ACERTOU A PALAVRA!! *************");
        System.out.println("*************************************************************************************");
        System.out.println("");
    }

    //Métodos responsável por exibir ao usuário quem venceu o jogo
    public void fraseCampeao(String nome) {
        System.out.println("*************************************************************************************");
        System.out.println("************* " + nome.toUpperCase() + ", VENCEU O JOGO!!! *************");
        System.out.println("*************************************************************************************");
        System.out.println("");
    }

    //Métodos responsável por exibir ao usuário a de quem é a vez de jogar e a pontuação
    public void fraseVezJogar(String nome, int pontuacao) {
        System.out.println("*****");
        System.out.println("***** " + nome.toUpperCase() + ", É A SUA VEZ DE JOGAR!! *************");
        System.out.println("***** PONTUAÇÃO: " + pontuacao + " Pontos.");
        System.out.println("*****");
    }

    //Métodos responsável por exibir ao usuário a frase da Palavra Incorreta;
    public void frasePalavraIncorreta(int tentativa) {
        if (tentativa < 1) {
            System.out.println("Que pena, você não acertou a palavra!!!");
        } else {
            System.out.println("Que pena, você não acertou a palavra!!!");
            System.out.println("Mas não se preocupe, você ainda tem " + tentativa + " tentativa(s).");
        }
    }

    //Métodos responsável por exibir ao usuário a frase da Palavra Incorreta Multiplayer

    public void frasePalavraIncorretaMultiplayer() {
        System.out.println("Que pena, você não acertou a palavra!!!");
    }

    @Override
    public void atualizarDados(Jogadores jogador, String palavraChave) {
        System.out.println("");

        switch (palavraChave) {
            case "vezJogar":
                fraseVezJogar(jogador.getNome(), jogador.getTotalPontos());
                break;
            case "PerdeTudoMultiplayer":
                frasePerdeTudoMultiplayer();
                break;
            case "PassaVezMultiplayer":
                frasePassaVezMultiplayer();
                break;
            case "PalavraCorreta":
                frasePalavraCorreta(jogador.getNome());
                break;
            case "PalavraIncorretaMultiplayer":
                frasePalavraIncorretaMultiplayer();
                break;
            case "LetraIncorretaMultiplayer":
                fraseLetraIncorretaMultiplayer();
                break;
            case "PontuacaoAtual":
                frasePontuacaoAtual(jogador.getNome().toUpperCase(), jogador.getTotalPontos());
                break;
            case "PerdeTudo":
                frasePerdeTudo(jogador.getTentativas());
                break;
            case "PassaVez":
                frasePassaVez(jogador.getTentativas());
                break;
            case "PalavraIncorreta":
                frasePalavraIncorreta(jogador.getTentativas());
                break;
            case "LetraIncorreta":
                fraseLetraIncorreta(jogador.getTentativas());
                break;
            default:
                System.out.println("");
                System.out.println("ERRO!!!");
                System.out.println("Opção escolhida fora do Switch Case de Parâmetros");
                System.out.println("Informe ao desenvolvedor do Sistema");
                System.out.println("");
        }
    }
}
