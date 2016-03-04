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
public class SujeitoAtualizarTest {
    
    public SujeitoAtualizarTest() {
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
     * Test of setNotificacao method, of class SujeitoAtualizar.
     */
    @Test
    public void testSetNotificacao() {
        System.out.println("setNotificacao");
        Jogadores jogadores = null;
        String palavraChave = "";
        SujeitoAtualizar instance = new SujeitoAtualizar();
        instance.setNotificacao(jogadores, palavraChave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addObserver method, of class SujeitoAtualizar.
     */
    @Test
    public void testAddObserver() {
        System.out.println("addObserver");
        Observer observer = null;
        SujeitoAtualizar instance = new SujeitoAtualizar();
        instance.addObserver(observer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notificarObservadores method, of class SujeitoAtualizar.
     */
    @Test
    public void testNotificarObservadores() {
        System.out.println("notificarObservadores");
        Jogadores jogadores = null;
        String palavraChave = "";
        SujeitoAtualizar instance = new SujeitoAtualizar();
        instance.notificarObservadores(jogadores, palavraChave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
