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
public class PalavrasTest {
    
    public PalavrasTest() {
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
     * Test of sortearPalavra method, of class Palavras.
     */
    @Test
    public void testSortearPalavra() {
        System.out.println("sortearPalavra");
        List<String> arrayPalavras = null;
        int qtdePalavras = 0;
        Palavras instance = new Palavras();
        List<String> expResult = null;
        List<String> result = instance.sortearPalavra(arrayPalavras, qtdePalavras);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of letrasPalavra method, of class Palavras.
     */
    @Test
    public void testLetrasPalavra() {
        System.out.println("letrasPalavra");
        Palavras instance = new Palavras();
        char[] expResult = null;
        char[] result = instance.letrasPalavra();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAlpha method, of class Palavras.
     */
    @Test
    public void testIsAlpha() {
        System.out.println("isAlpha");
        String name = "";
        Palavras instance = new Palavras();
        boolean expResult = false;
        boolean result = instance.isAlpha(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAlphaVezDeJogar method, of class Palavras.
     */
    @Test
    public void testIsAlphaVezDeJogar() {
        System.out.println("isAlphaVezDeJogar");
        String letra = "";
        Palavras instance = new Palavras();
        boolean expResult = false;
        boolean result = instance.isAlphaVezDeJogar(letra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNumero method, of class Palavras.
     */
    @Test
    public void testIsNumero() {
        System.out.println("isNumero");
        String numero = "";
        Palavras instance = new Palavras();
        boolean expResult = false;
        boolean result = instance.isNumero(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
