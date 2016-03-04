/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kleudson
 */
public class ParametrosObserverTest {
    
    public ParametrosObserverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of qtdEtapas method, of class ParametrosObserver.
     */
    @Test
    public void testQtdEtapas() {
        System.out.println("qtdEtapas");
        ParametrosObserver instance = new ParametrosObserver();
        int expResult = 0;
        int result = instance.qtdEtapas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qtdePalavras method, of class ParametrosObserver.
     */
    @Test
    public void testQtdePalavras() {
        System.out.println("qtdePalavras");
        ParametrosObserver instance = new ParametrosObserver();
        int expResult = 0;
        int result = instance.qtdePalavras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of roletaViciada method, of class ParametrosObserver.
     */
    @Test
    public void testRoletaViciada() {
        System.out.println("roletaViciada");
        ParametrosObserver instance = new ParametrosObserver();
        boolean expResult = false;
        boolean result = instance.roletaViciada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qtdeJogadores method, of class ParametrosObserver.
     */
    @Test
    public void testQtdeJogadores() {
        System.out.println("qtdeJogadores");
        ParametrosObserver instance = new ParametrosObserver();
        int expResult = 0;
        int result = instance.qtdeJogadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortearTema method, of class ParametrosObserver.
     */
    @Test
    public void testSortearTema() {
        System.out.println("sortearTema");
        ParametrosObserver instance = new ParametrosObserver();
        String expResult = "";
        String result = instance.sortearTema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of escolheArquivoTxt method, of class ParametrosObserver.
     */
    @Test
    public void testEscolheArquivoTxt() {
        System.out.println("escolheArquivoTxt");
        String tema = "";
        ParametrosObserver instance = new ParametrosObserver();
        List<String> expResult = null;
        List<String> result = instance.escolheArquivoTxt(tema);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of converteVetorCharString method, of class ParametrosObserver.
     */
    @Test
    public void testConverteVetorCharString() {
        System.out.println("converteVetorCharString");
        char[] vetorChar = null;
        ParametrosObserver instance = new ParametrosObserver();
        String expResult = "";
        String result = instance.converteVetorCharString(vetorChar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of frasePerdeTudo method, of class ParametrosObserver.
     */
    @Test
    public void testFrasePerdeTudo() {
        System.out.println("frasePerdeTudo");
        int tentativa = 0;
        ParametrosObserver instance = new ParametrosObserver();
        instance.frasePerdeTudo(tentativa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of frasePassaVez method, of class ParametrosObserver.
     */
    @Test
    public void testFrasePassaVez() {
        System.out.println("frasePassaVez");
        int tentativa = 0;
        ParametrosObserver instance = new ParametrosObserver();
        int expResult = 0;
        int result = instance.frasePassaVez(tentativa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of frasePassaVezMultiplayer method, of class ParametrosObserver.
     */
    @Test
    public void testFrasePassaVezMultiplayer() {
        System.out.println("frasePassaVezMultiplayer");
        ParametrosObserver instance = new ParametrosObserver();
        instance.frasePassaVezMultiplayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of frasePontuacaoAtual method, of class ParametrosObserver.
     */
    @Test
    public void testFrasePontuacaoAtual() {
        System.out.println("frasePontuacaoAtual");
        String nome = "";
        int pontuacao = 0;
        ParametrosObserver instance = new ParametrosObserver();
        instance.frasePontuacaoAtual(nome, pontuacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of frasePerdeTudoMultiplayer method, of class ParametrosObserver.
     */
    @Test
    public void testFrasePerdeTudoMultiplayer() {
        System.out.println("frasePerdeTudoMultiplayer");
        ParametrosObserver instance = new ParametrosObserver();
        instance.frasePerdeTudoMultiplayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fraseLetraIncorreta method, of class ParametrosObserver.
     */
    @Test
    public void testFraseLetraIncorreta() {
        System.out.println("fraseLetraIncorreta");
        int tentativa = 0;
        ParametrosObserver instance = new ParametrosObserver();
        instance.fraseLetraIncorreta(tentativa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fraseLetraIncorretaMultiplayer method, of class ParametrosObserver.
     */
    @Test
    public void testFraseLetraIncorretaMultiplayer() {
        System.out.println("fraseLetraIncorretaMultiplayer");
        ParametrosObserver instance = new ParametrosObserver();
        instance.fraseLetraIncorretaMultiplayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of frasePalavraCorreta method, of class ParametrosObserver.
     */
    @Test
    public void testFrasePalavraCorreta() {
        System.out.println("frasePalavraCorreta");
        String nome = "";
        ParametrosObserver instance = new ParametrosObserver();
        instance.frasePalavraCorreta(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fraseCampeao method, of class ParametrosObserver.
     */
    @Test
    public void testFraseCampeao() {
        System.out.println("fraseCampeao");
        String nome = "";
        ParametrosObserver instance = new ParametrosObserver();
        instance.fraseCampeao(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fraseVezJogar method, of class ParametrosObserver.
     */
    @Test
    public void testFraseVezJogar() {
        System.out.println("fraseVezJogar");
        String nome = "";
        int pontuacao = 0;
        ParametrosObserver instance = new ParametrosObserver();
        instance.fraseVezJogar(nome, pontuacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of frasePalavraIncorreta method, of class ParametrosObserver.
     */
    @Test
    public void testFrasePalavraIncorreta() {
        System.out.println("frasePalavraIncorreta");
        int tentativa = 0;
        ParametrosObserver instance = new ParametrosObserver();
        instance.frasePalavraIncorreta(tentativa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of frasePalavraIncorretaMultiplayer method, of class ParametrosObserver.
     */
    @Test
    public void testFrasePalavraIncorretaMultiplayer() {
        System.out.println("frasePalavraIncorretaMultiplayer");
        ParametrosObserver instance = new ParametrosObserver();
        instance.frasePalavraIncorretaMultiplayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizarDados method, of class ParametrosObserver.
     */
    @Test
    public void testAtualizarDados() {
        System.out.println("atualizarDados");
        Jogadores jogador = null;
        String palavraChave = "";
        ParametrosObserver instance = new ParametrosObserver();
        instance.atualizarDados(jogador, palavraChave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
