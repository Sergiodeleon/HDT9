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
public class SplayBSTTest {
    
    public SplayBSTTest() {
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
     * Test of add method, of class SplayBST.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word wordObject = new Word("a","Estacionario");
        SplayBST instance = new SplayBST();
        instance.add(wordObject);
    }

    /**
     * Test of get method, of class SplayBST.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word word = new Word("a","Estacionario");
        SplayBST instance = new SplayBST();
        instance.add(word);
        Word expResult = word;
        Word result = instance.get(word);
        assertEquals(expResult, result);
    }
    
}
