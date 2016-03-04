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
public class ObserverTest {
    
    public ObserverTest() {
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
     * Test of atualizarDados method, of class Observer.
     */
    @Test
    public void testAtualizarDados() {
        System.out.println("atualizarDados");
        Jogadores jogador = null;
        String palavraChave = "";
        Observer instance = new ObserverImpl();
        instance.atualizarDados(jogador, palavraChave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ObserverImpl extends Observer {

        public void atualizarDados(Jogadores jogador, String palavraChave) {
        }
    }
    
}
