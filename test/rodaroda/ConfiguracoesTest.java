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
public class ConfiguracoesTest {
    
    public ConfiguracoesTest() {
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
     * Test of configuracoes method, of class Configuracoes.
     */
    @Test
    public void testConfiguracoes() {
        System.out.println("configuracoes");
        int qtdeJogadores = 0;
        int qtdeEtapas = 0;
        int qtdePalavras = 0;
        String tema = "";
        boolean roletaViciada = false;
        List<String> listNomeJogadores = null;
        List<String> listPalavraSorteada = null;
        List<String> listPalavrasTema = null;
        Configuracoes instance = new Configuracoes();
        instance.configuracoes(qtdeJogadores, qtdeEtapas, qtdePalavras, tema, roletaViciada, listNomeJogadores, listPalavraSorteada, listPalavrasTema);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQtdeJogadores method, of class Configuracoes.
     */
    @Test
    public void testGetQtdeJogadores() {
        System.out.println("getQtdeJogadores");
        Configuracoes instance = new Configuracoes();
        int expResult = 0;
        int result = instance.getQtdeJogadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQtdeJogadores method, of class Configuracoes.
     */
    @Test
    public void testSetQtdeJogadores() {
        System.out.println("setQtdeJogadores");
        int qtdeJogadores = 0;
        Configuracoes instance = new Configuracoes();
        instance.setQtdeJogadores(qtdeJogadores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQtdeEtapas method, of class Configuracoes.
     */
    @Test
    public void testGetQtdeEtapas() {
        System.out.println("getQtdeEtapas");
        Configuracoes instance = new Configuracoes();
        int expResult = 0;
        int result = instance.getQtdeEtapas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQtdeEtapas method, of class Configuracoes.
     */
    @Test
    public void testSetQtdeEtapas() {
        System.out.println("setQtdeEtapas");
        int qtdeEtapas = 0;
        Configuracoes instance = new Configuracoes();
        instance.setQtdeEtapas(qtdeEtapas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQtdePalavras method, of class Configuracoes.
     */
    @Test
    public void testGetQtdePalavras() {
        System.out.println("getQtdePalavras");
        Configuracoes instance = new Configuracoes();
        int expResult = 0;
        int result = instance.getQtdePalavras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQtdePalavras method, of class Configuracoes.
     */
    @Test
    public void testSetQtdePalavras() {
        System.out.println("setQtdePalavras");
        int qtdePalavras = 0;
        Configuracoes instance = new Configuracoes();
        instance.setQtdePalavras(qtdePalavras);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTema method, of class Configuracoes.
     */
    @Test
    public void testGetTema() {
        System.out.println("getTema");
        Configuracoes instance = new Configuracoes();
        String expResult = "";
        String result = instance.getTema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTema method, of class Configuracoes.
     */
    @Test
    public void testSetTema() {
        System.out.println("setTema");
        String tema = "";
        Configuracoes instance = new Configuracoes();
        instance.setTema(tema);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRoletaViciada method, of class Configuracoes.
     */
    @Test
    public void testIsRoletaViciada() {
        System.out.println("isRoletaViciada");
        Configuracoes instance = new Configuracoes();
        boolean expResult = false;
        boolean result = instance.isRoletaViciada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoletaViciada method, of class Configuracoes.
     */
    @Test
    public void testSetRoletaViciada() {
        System.out.println("setRoletaViciada");
        boolean roletaViciada = false;
        Configuracoes instance = new Configuracoes();
        instance.setRoletaViciada(roletaViciada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListNomeJogadores method, of class Configuracoes.
     */
    @Test
    public void testGetListNomeJogadores() {
        System.out.println("getListNomeJogadores");
        Configuracoes instance = new Configuracoes();
        List<String> expResult = null;
        List<String> result = instance.getListNomeJogadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListNomeJogadores method, of class Configuracoes.
     */
    @Test
    public void testSetListNomeJogadores() {
        System.out.println("setListNomeJogadores");
        List<String> listNomeJogadores = null;
        Configuracoes instance = new Configuracoes();
        instance.setListNomeJogadores(listNomeJogadores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListPalavraSorteada method, of class Configuracoes.
     */
    @Test
    public void testGetListPalavraSorteada() {
        System.out.println("getListPalavraSorteada");
        Configuracoes instance = new Configuracoes();
        List<String> expResult = null;
        List<String> result = instance.getListPalavraSorteada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListPalavraSorteada method, of class Configuracoes.
     */
    @Test
    public void testSetListPalavraSorteada() {
        System.out.println("setListPalavraSorteada");
        List<String> listPalavraSorteada = null;
        Configuracoes instance = new Configuracoes();
        instance.setListPalavraSorteada(listPalavraSorteada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListPalavrasTema method, of class Configuracoes.
     */
    @Test
    public void testGetListPalavrasTema() {
        System.out.println("getListPalavrasTema");
        Configuracoes instance = new Configuracoes();
        List<String> expResult = null;
        List<String> result = instance.getListPalavrasTema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListPalavrasTema method, of class Configuracoes.
     */
    @Test
    public void testSetListPalavrasTema() {
        System.out.println("setListPalavrasTema");
        List<String> listPalavrasTema = null;
        Configuracoes instance = new Configuracoes();
        instance.setListPalavrasTema(listPalavrasTema);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
