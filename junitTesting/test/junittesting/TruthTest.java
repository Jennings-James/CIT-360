/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jennings
 */
public class TruthTest {

    public TruthTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of findTruth method, of class Truth.
     */
    @Test
    public void testFindTruth() {
        System.out.println("findTruth");
        Truth instance = new Truth(5);
        boolean result = instance.findTruth();
        assertTrue(result);
    }

    @Test
    public void testFindTruth2() {
        System.out.println("findTruth");
        Truth instance = new Truth(-1);
        boolean result = instance.findTruth();
        assertFalse(result);
    }
}
