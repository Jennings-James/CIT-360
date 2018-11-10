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
public class MakeListTest {

    public MakeListTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of SomeNums method, of class MakeList.
     */
    @Test
    public void testSomeNums() {
        System.out.println("SomeNums");
        MakeList instance = new MakeList(2, 4, 3, 6, 5);
        instance.someNums();
        int[] expResult = {2, 4, 3, 6, 5};
        int[] result = instance.someNums();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSomeNums2() {
        System.out.println("SomeNums");
        MakeList instance = new MakeList(2, 4, 3, 6, 5);
        instance.someNums();
        int[] result = instance.someNums();
        assertNotNull(result);
    }

}
