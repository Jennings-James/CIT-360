/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittesting;

import static org.hamcrest.CoreMatchers.containsString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jennings
 */
public class WordsTest {

    public WordsTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of compareWords method, of class Words.
     */
    @Test
    public void testCompareWords() {
        System.out.println("compareWords");
        Words instance = new Words("cow");
        String expResult = "cow";
        String result = instance.compareWords();
        assertSame(expResult, result);

    }

    @Test
    public void testCompareWords2() {
        System.out.println("compareWords");
        Words instance = new Words("dog");
        String expResult = "cow";
        String result = instance.compareWords();
        assertNotSame(expResult, result);

    }

    @Test
    public void testCompareWords3() {
        System.out.println("compareWords");
        Words instance = new Words(null);
        String expResult = "cow";
        String result = instance.compareWords();
        assertNull(expResult, result);

    }

    @Test
    public void testCompareWords4() {
        System.out.println("compareWords");
        Words instance = new Words("cow");
        String expResult = "cow";
        String result = instance.compareWords();
        assertThat(result, containsString(expResult));

    }
}
