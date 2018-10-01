/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT360.Control;
import java.util.*;
/**
 *
 * @author jennings
 */
public class MapDemo {
    
    public MapDemo() {
        
    }
    
    
    public void map() {
        
        //create a HashMap
        Map<String, Integer> na = new HashMap();
        
        //put keys and values into the map
        na.put("Tom", 25);
        na.put("Sheri", 31);
        na.put("Travis", 21);
        na.put("Fred", 25);
        
        System.out.println(na);
        System.out.println("");
        
        //does the map contain a specified value
        System.out.println("checking to see if value 25 is present");
        if(na.containsValue(25)) {
            System.out.println("value 25 found");
        }    
        else
            System.out.println("value not found");
        System.out.println("");
        
        System.out.println("checking to see if value 12 is present");
        if(na.containsValue(12)) {
            System.out.println("value 25 found");
        }    
        else
            System.out.println("value not found");
        System.out.println("");
        //replace a value in a key
        System.out.println("map before: " + na);
        
        na.replace("Fred", 27);
        
        System.out.println("map after: " + na);
        System.out.println("");
    }

}
