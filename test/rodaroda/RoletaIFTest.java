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
public class RoletaIFTest {
    
    public RoletaIFTest() {
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
     * Test of sortear method, of class RoletaIF.
     */
    @Test
    public void testSortear() {
        System.out.println("sortear");
        Jogadores jogadores = null;
        RoletaIF instance = new RoletaIFImpl();
        String expResult = "";
        String result = instance.sortear(jogadores);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RoletaIFImpl implements RoletaIF {

        public String sortear(Jogadores jogadores) {
            return "";
        }
    }

}
