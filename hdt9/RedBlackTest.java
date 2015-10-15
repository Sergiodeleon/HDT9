/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergio
 */
public class RedBlackTest {
    
    public RedBlackTest() {
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
     * Test of add method, of class RedBlack.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word wordObject = new Word("a","Estacionario");
       
        RedBlack instance = new RedBlack();
        instance.add(wordObject);
    }

    /**
     * Test of get method, of class RedBlack.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word word = new Word("a","Estacionario");
        
        RedBlack instance = new RedBlack();
        instance.add(word);
        Word expResult = null;
        Word result = instance.get(word);
        assertEquals(expResult, result);
    }
    
}
