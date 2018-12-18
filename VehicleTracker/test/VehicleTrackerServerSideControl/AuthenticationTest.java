/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehicleTrackerServerSideControl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jennings
 */
public class AuthenticationTest {
    
    public AuthenticationTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of authenticate method, of class Authentication.
     */
    @Test
    public void testAuthenticate() throws Exception {
        System.out.println("authenticate");
        String userName = "James";
        String password = "dogcat";
        Authentication instance = new Authentication();
        String expResult = "/VehicleTrackerClient/adminMenu.html";
        String result = instance.authenticate(userName, password);
        assertEquals(expResult, result);
        
    }
    
}
