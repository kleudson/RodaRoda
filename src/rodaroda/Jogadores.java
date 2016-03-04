package rodaroda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kleudson Classe Jgoadores, onde é criado o Objeto Jogadores para 1, 2
 * ou 3 jogadores;
 */
public class Jogadores {

    private String nome;
    private int totalPontos;
    private int tentativas;
    private int qtdeGiros;
    private boolean vezDeJogar;

    /**
     *
     * @param nome Entrada de nome do jogador
     * @param totalPontos Entrada de pontos do jogador
     * @param tentativas Entrada de tentativas do jogador
     * @param qtdeGiros Entrada de giros do jogador
     * @param vezDeJogar Entrada de vez do jogador
     */
    public void jogadores(String nome, int totalPontos, int tentativas, int qtdeGiros, boolean vezDeJogar) {
        this.nome = nome;
        this.totalPontos = totalPontos;
        this.tentativas = tentativas;
        this.qtdeGiros = qtdeGiros;
        this.vezDeJogar = vezDeJogar;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public int getTotalPontos() {
        return totalPontos;
    }

    /**
     *
     * @param totalPontos
     */
    public void setTotalPontos(int totalPontos) {
        this.totalPontos = totalPontos;
    }

    /**
     *
     * @return
     */
    public int getTentativas() {
        return tentativas;
    }

    /**
     *
     * @param tentativas
     */
    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    /**
     *
     * @return
     */
    public int getQtdeGiros() {
        return qtdeGiros;
    }

    /**
     *
     * @param qtdeGiros
     */
    public void setQtdeGiros(int qtdeGiros) {
        this.qtdeGiros = qtdeGiros;
    }

    /**
     *
     * @return
     */
    public boolean getVezDeJogar() {
        return vezDeJogar;
    }

    /**
     *
     * @param vezDeJogar
     */
    public void setVezDeJogar(boolean vezDeJogar) {
        this.vezDeJogar = vezDeJogar;
    }

//    Método cria List de Nomes e retorna esses valores;

    /**
     *
     * @param quantidade
     * @return
     */
        public List<String> nomeDosJogadores(int quantidade) {
        Scanner sc = new Scanner(System.in);
        int qtdeRecebida = quantidade;
        List<String> nomeJogadores = new ArrayList<>();
        int contador = 0;
        String jogador = "";

        while (contador < qtdeRecebida) {
            System.out.println("Informe o nome do jogador " + (contador + 1) + ":");
            jogador = sc.nextLine();
            nomeJogadores.add(jogador);
            contador++;
        }
        return nomeJogadores;
    }

    /**    Método responsável por imprimir o nome e as informações dos participantes
    *      Foi implementado o Padrão Iterator com While para imprimir a lista.
    *      Método responsável para 1 jogador
    */
    /**
     *
     * @param jogadores
     */
        public void imprimirDadosJogadores(List<Jogadores> jogadores) {
        int i = 0;
        Iterator<Jogadores> iteradorJogador = jogadores.iterator();

        while (iteradorJogador.hasNext()) {
            System.out.println("");
            System.out.println("########## JOGADOR 0" + (i + 1) + " ##########");
            System.out.println("Nome: " + jogadores.get(i).getNome());
            System.out.println("Tentativas Restante: " + jogadores.get(i).getTentativas());
            System.out.println("Total de Pontos: " + jogadores.get(i).getTotalPontos());
            iteradorJogador.next();
            i++;
        }
    }

/*      Método responsável por imprimir o nome e as informações dos participantes
 *      Foi implementado o Padrão Iterator com For para imprimir a lista.
 *      Método responsável para mais de um jogador
 */
    /**
     *
     * @param jogadores
     */
        public void imprimirDadosJogadoresMultiplayer(List<Jogadores> jogadores) {
        int i = 0;
        for (Iterator<Jogadores> iteradorFor = jogadores.iterator(); iteradorFor.hasNext();) {
            System.out.println("");
            System.out.println("########## JOGADOR 0" + (i + 1) + " ##########");
            System.out.println("Nome: " + jogadores.get(i).getNome());
            System.out.println("Total de Pontos: " + jogadores.get(i).getTotalPontos());
            iteradorFor.next();
            i++;
        }
    }

}
