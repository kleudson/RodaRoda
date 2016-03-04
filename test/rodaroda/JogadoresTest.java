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
public class JogadoresTest {
    
    public JogadoresTest() {
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
     * Test of jogadores method, of class Jogadores.
     */
    @Test
    public void testJogadores() {
        System.out.println("jogadores");
        String nome = "";
        int totalPontos = 0;
        int tentativas = 0;
        int qtdeGiros = 0;
        boolean vezDeJogar = false;
        Jogadores instance = new Jogadores();
        instance.jogadores(nome, totalPontos, tentativas, qtdeGiros, vezDeJogar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Jogadores.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Jogadores instance = new Jogadores();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Jogadores.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Jogadores instance = new Jogadores();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPontos method, of class Jogadores.
     */
    @Test
    public void testGetTotalPontos() {
        System.out.println("getTotalPontos");
        Jogadores instance = new Jogadores();
        int expResult = 0;
        int result = instance.getTotalPontos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalPontos method, of class Jogadores.
     */
    @Test
    public void testSetTotalPontos() {
        System.out.println("setTotalPontos");
        int totalPontos = 0;
        Jogadores instance = new Jogadores();
        instance.setTotalPontos(totalPontos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTentativas method, of class Jogadores.
     */
    @Test
    public void testGetTentativas() {
        System.out.println("getTentativas");
        Jogadores instance = new Jogadores();
        int expResult = 0;
        int result = instance.getTentativas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTentativas method, of class Jogadores.
     */
    @Test
    public void testSetTentativas() {
        System.out.println("setTentativas");
        int tentativas = 0;
        Jogadores instance = new Jogadores();
        instance.setTentativas(tentativas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQtdeGiros method, of class Jogadores.
     */
    @Test
    public void testGetQtdeGiros() {
        System.out.println("getQtdeGiros");
        Jogadores instance = new Jogadores();
        int expResult = 0;
        int result = instance.getQtdeGiros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQtdeGiros method, of class Jogadores.
     */
    @Test
    public void testSetQtdeGiros() {
        System.out.println("setQtdeGiros");
        int qtdeGiros = 0;
        Jogadores instance = new Jogadores();
        instance.setQtdeGiros(qtdeGiros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVezDeJogar method, of class Jogadores.
     */
    @Test
    public void testGetVezDeJogar() {
        System.out.println("getVezDeJogar");
        Jogadores instance = new Jogadores();
        boolean expResult = false;
        boolean result = instance.getVezDeJogar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVezDeJogar method, of class Jogadores.
     */
    @Test
    public void testSetVezDeJogar() {
        System.out.println("setVezDeJogar");
        boolean vezDeJogar = false;
        Jogadores instance = new Jogadores();
        instance.setVezDeJogar(vezDeJogar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nomeDosJogadores method, of class Jogadores.
     */
    @Test
    public void testNomeDosJogadores() {
        System.out.println("nomeDosJogadores");
        int quantidade = 0;
        Jogadores instance = new Jogadores();
        List<String> expResult = null;
        List<String> result = instance.nomeDosJogadores(quantidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimirDadosJogadores method, of class Jogadores.
     */
    @Test
    public void testImprimirDadosJogadores() {
        System.out.println("imprimirDadosJogadores");
        List<Jogadores> jogadores = null;
        Jogadores instance = new Jogadores();
        instance.imprimirDadosJogadores(jogadores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimirDadosJogadoresMultiplayer method, of class Jogadores.
     */
    @Test
    public void testImprimirDadosJogadoresMultiplayer() {
        System.out.println("imprimirDadosJogadoresMultiplayer");
        List<Jogadores> jogadores = null;
        Jogadores instance = new Jogadores();
        instance.imprimirDadosJogadoresMultiplayer(jogadores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
