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
public class SquareTest {

    public SquareTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of figureIt method, of class Square.
     */
    @Test
    public void testArea() {
        System.out.println("figureIt");
        Square instance = new Square(5);
        double expResult = 25;
        double result = instance.area();
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of perimeter method, of class Square.
     */
    @Test
    public void testPerimeter() {
        System.out.println("perimeter");
        Square instance = new Square(2.2);
        double expResult = 8.8;
        double result = instance.perimeter();
        assertSame(expResult, result);
    }

}
