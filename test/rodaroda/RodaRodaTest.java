/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda;

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
public class RodaRodaTest {
    
    public RodaRodaTest() {
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
     * Test of iniciarJogo method, of class RodaRoda.
     */
    @Test
    public void testIniciarJogo() {
        System.out.println("iniciarJogo");
        Jogadores jogador = null;
        Configuracoes configuracoes = null;
        RodaRoda instance = new RodaRoda();
        instance.iniciarJogo(jogador, configuracoes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iniciarJogoDois method, of class RodaRoda.
     */
    @Test
    public void testIniciarJogoDois() {
        System.out.println("iniciarJogoDois");
        Jogadores jogador1 = null;
        Jogadores jogador2 = null;
        Configuracoes configuracoes = null;
        RodaRoda instance = new RodaRoda();
        instance.iniciarJogoDois(jogador1, jogador2, configuracoes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iniciarJogoTres method, of class RodaRoda.
     */
    @Test
    public void testIniciarJogoTres() {
        System.out.println("iniciarJogoTres");
        Jogadores jogador1 = null;
        Jogadores jogador2 = null;
        Jogadores jogador3 = null;
        Configuracoes configuracoes = null;
        RodaRoda instance = new RodaRoda();
        instance.iniciarJogoTres(jogador1, jogador2, jogador3, configuracoes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAlphaG method, of class RodaRoda.
     */
    @Test
    public void testIsAlphaG() {
        System.out.println("isAlphaG");
        String name = "";
        RodaRoda instance = new RodaRoda();
        boolean expResult = false;
        boolean result = instance.isAlphaG(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
