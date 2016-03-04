/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda;

import java.util.List;

/**
 *
 * @author Kleudson A Classe configurações é responsável por armazenar as
 * configurações iniciais deste jogo sendo possível recuperar essa informações
 * durante a execução do programa.
 */
public class Configuracoes {

    private int qtdeJogadores;
    private int qtdeEtapas;
    private int qtdePalavras;
    private String tema;
    private boolean roletaViciada;
    private List<String> listNomeJogadores;
    private List<String> listPalavraSorteada;
    private List<String> listPalavrasTema;

    /**
     *
     * @param qtdeJogadores
     * @param qtdeEtapas
     * @param qtdePalavras
     * @param tema
     * @param roletaViciada
     * @param listNomeJogadores
     * @param listPalavraSorteada
     * @param listPalavrasTema
     */
    public void configuracoes(int qtdeJogadores, int qtdeEtapas, int qtdePalavras,
            String tema, boolean roletaViciada, List<String> listNomeJogadores, List<String> listPalavraSorteada, List<String> listPalavrasTema) {

        this.setQtdeJogadores(qtdeJogadores);
        this.setQtdeEtapas(qtdeEtapas);
        this.setQtdePalavras(qtdePalavras);
        this.setTema(tema);
        this.setRoletaViciada(roletaViciada);
        this.setListNomeJogadores(listNomeJogadores);
        this.setListPalavraSorteada(listPalavraSorteada);
        this.setListPalavrasTema(listPalavrasTema);
    }

    /**
     * @return the qtdeJogadores
     */
    public int getQtdeJogadores() {
        return qtdeJogadores;
    }

    /**
     * @param qtdeJogadores the qtdeJogadores to set
     */
    public void setQtdeJogadores(int qtdeJogadores) {
        this.qtdeJogadores = qtdeJogadores;
    }

    /**
     * @return the qtdeEtapas
     */
    public int getQtdeEtapas() {
        return qtdeEtapas;
    }

    /**
     * @param qtdeEtapas the qtdeEtapas to set
     */
    public void setQtdeEtapas(int qtdeEtapas) {
        this.qtdeEtapas = qtdeEtapas;
    }

    /**
     * @return the qtdePalavras
     */
    public int getQtdePalavras() {
        return qtdePalavras;
    }

    /**
     * @param qtdePalavras the qtdePalavras to set
     */
    public void setQtdePalavras(int qtdePalavras) {
        this.qtdePalavras = qtdePalavras;
    }

    /**
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * @return the roletaViciada
     */
    public boolean isRoletaViciada() {
        return roletaViciada;
    }

    /**
     * @param roletaViciada the roletaViciada to set
     */
    public void setRoletaViciada(boolean roletaViciada) {
        this.roletaViciada = roletaViciada;
    }

    /**
     * @return the listNomeJogadores
     */
    public List<String> getListNomeJogadores() {
        return listNomeJogadores;
    }

    /**
     * @param listNomeJogadores the listNomeJogadores to set
     */
    public void setListNomeJogadores(List<String> listNomeJogadores) {
        this.listNomeJogadores = listNomeJogadores;
    }

    /**
     * @return the listPalavraSorteada
     */
    public List<String> getListPalavraSorteada() {
        return listPalavraSorteada;
    }

    /**
     * @param listPalavraSorteada the listPalavraSorteada to set
     */
    public void setListPalavraSorteada(List<String> listPalavraSorteada) {
        this.listPalavraSorteada = listPalavraSorteada;
    }

    /**
     * @return the listPalavrasTema
     */
    public List<String> getListPalavrasTema() {
        return listPalavrasTema;
    }

    /**
     * @param listPalavrasTema the listPalavrasTema to set
     */
    public void setListPalavrasTema(List<String> listPalavrasTema) {
        this.listPalavrasTema = listPalavrasTema;
    }

}
