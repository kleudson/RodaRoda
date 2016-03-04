package rodaroda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Kleudson Classe principal Nessa classe são carregadas as informações
 * e onde é iniciado o programa.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomeUm = "";
        String nomeDois = "";
        String nomeTres = "";
        String tema;
        String palavraSorteada = "";
        List<String> listPalavrasSorteada = new ArrayList<>();
        List<String> listNomeJogadores = new ArrayList();
        List<String> listPalavras;
        List<Jogadores> listJogadores = new ArrayList<>();
        int qtdeJogadores, qtdeEtapas, qtdePalavras;
        int totalTentativas = 3;
        int totalPontos = 0;
        int qtdeGiros = 0;
        boolean vezDeJogar = false;
        boolean roletaViciada = false;
        SujeitoAtualizar sujeito = new SujeitoAtualizar();
        Palavras palavra = new Palavras();
        ParametrosObserver parametroObserver = new ParametrosObserver(sujeito);
        Jogadores jogador1 = new Jogadores();
        Jogadores jogador2 = new Jogadores();
        Jogadores jogador3 = new Jogadores();
        RodaRoda rodaRoda = new RodaRoda();
        Configuracoes configuracoes = new Configuracoes();

        //Remover este código depois. apenas testes Observer
        System.out.println("");

        qtdeJogadores = parametroObserver.qtdeJogadores();
        qtdeEtapas = parametroObserver.qtdEtapas();
        qtdePalavras = parametroObserver.qtdePalavras();
        tema = parametroObserver.sortearTema();
        roletaViciada = parametroObserver.roletaViciada();
        listNomeJogadores = jogador1.nomeDosJogadores(qtdeJogadores);
        listPalavras = parametroObserver.escolheArquivoTxt(tema);
        listPalavrasSorteada = palavra.sortearPalavra(listPalavras, qtdePalavras);

/*      Carrega as configurações Iniciais do Jogo e armazena no objeto configurações.
*/
        configuracoes.setQtdeJogadores(qtdeJogadores);
        configuracoes.setQtdeEtapas(qtdeEtapas);
        configuracoes.setQtdePalavras(qtdePalavras);
        configuracoes.setTema(tema);
        configuracoes.setRoletaViciada(roletaViciada);
        configuracoes.setListNomeJogadores(listNomeJogadores);
        configuracoes.setListPalavrasTema(listPalavras);
        configuracoes.setListPalavraSorteada(listPalavrasSorteada);

        System.out.println("");
        System.out.println("Quantidade de jogadores escolhida é: " + qtdeJogadores);
        System.out.println("Quantidade de etapas escolhida é: " + qtdeEtapas);
        System.out.println("Quantidade de palavras escolhida é: " + qtdePalavras);
        System.out.println("O tema escolhido aleatóriamente foi: " + tema);
        System.out.println("");

        /*Inicia o jogo com a quantidade de jogador escolhida pelo usuário.
         */
        if (qtdeJogadores == 1) {
            Iterator<String> iterador = listNomeJogadores.iterator();
            while (iterador.hasNext()) {
                nomeUm = iterador.next();
            }
            jogador1.jogadores(nomeUm, totalPontos, totalTentativas, qtdeGiros, vezDeJogar);
            listJogadores.add(jogador1);

            jogador1.imprimirDadosJogadores(listJogadores);

            System.out.println("");
            System.out.println("Sorteando " + qtdePalavras + " Palavra(s)...");
            System.out.println("");

            Iterator<String> iteradorPalavraSorteada = listPalavrasSorteada.iterator();
            int j = 0;
            while (iteradorPalavraSorteada.hasNext()) {
                String palavraSorteadaIterator = iteradorPalavraSorteada.next();
                System.out.println("Dica: A palavra " + (j + 1) + " sorteada contém " + palavraSorteadaIterator.length() + " letras.");
                j++;
            }

            rodaRoda.iniciarJogo(jogador1, configuracoes);

        } else if (qtdeJogadores == 2) {
            Iterator<String> iterador = listNomeJogadores.iterator();
            while (iterador.hasNext()) {
                nomeUm = iterador.next();
                nomeDois = iterador.next();
            }

            jogador1.jogadores(nomeUm, totalPontos, totalTentativas, qtdeGiros, vezDeJogar);
            jogador2.jogadores(nomeDois, totalPontos, totalTentativas, qtdeGiros, vezDeJogar);

            listJogadores.add(jogador1);
            listJogadores.add(jogador2);

            jogador1.imprimirDadosJogadoresMultiplayer(listJogadores);

            System.out.println("Dica: a palavra contém " + palavraSorteada.length() + " letras.");
            rodaRoda.iniciarJogoDois(jogador1, jogador2, configuracoes);

            jogador1.imprimirDadosJogadoresMultiplayer(listJogadores);

            if (jogador1.getTotalPontos() > jogador2.getTotalPontos()) {
                parametroObserver.fraseCampeao(jogador1.getNome());
            } else {
                parametroObserver.fraseCampeao(jogador2.getNome());
            }

        } else {
            Iterator<String> iterador = listNomeJogadores.iterator();
            while (iterador.hasNext()) {
                nomeUm = iterador.next();
                nomeDois = iterador.next();
                nomeTres = iterador.next();
            }

            jogador1.jogadores(nomeUm, totalPontos, totalTentativas, qtdeGiros, vezDeJogar);
            jogador2.jogadores(nomeDois, totalPontos, totalTentativas, qtdeGiros, vezDeJogar);
            jogador3.jogadores(nomeTres, totalPontos, totalTentativas, qtdeGiros, vezDeJogar);

            listJogadores.add(jogador1);
            listJogadores.add(jogador2);
            listJogadores.add(jogador3);

            jogador1.imprimirDadosJogadoresMultiplayer(listJogadores);

            System.out.println("Dica: a palavra contém " + palavraSorteada.length() + " letras.");

            rodaRoda.iniciarJogoTres(jogador1, jogador2, jogador3, configuracoes);

            jogador1.imprimirDadosJogadoresMultiplayer(listJogadores);

            if ((jogador1.getTotalPontos() > jogador2.getTotalPontos()) && (jogador1.getTotalPontos() > jogador3.getTotalPontos())) {
                parametroObserver.fraseCampeao(jogador1.getNome());
            } else if ((jogador2.getTotalPontos() > jogador1.getTotalPontos()) && (jogador2.getTotalPontos() > jogador3.getTotalPontos())) {
                parametroObserver.fraseCampeao(jogador2.getNome());
            } else {
                parametroObserver.fraseCampeao(jogador3.getNome());
            }
        }

        System.out.println("");
        System.out.println("FIM DE JOGO ");
    }

}
