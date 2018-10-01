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
public class TreeDemo {

    public TreeDemo() {

    }

    public void tree() {
        //create a treeset
        Set<String> ts = new TreeSet<>();
        //add elements
        ts.add("house");
        ts.add("car");
        ts.add("truck");
        ts.add("bus");
        ts.add("train");

        System.out.println("The TreeSet orders the elements naturaly: " + ts);

        //add more elements
        ts.add("food");
        ts.add("water");

        //search for food
        if (ts.contains("food")) {
            System.out.println("ts now contains food");
        }
        Iterator<String> iterator = ts.iterator();

        while (iterator.hasNext()) {
            String list = iterator.next();
            System.out.println(list);
        }
        System.out.println("");
        //create a treemap
        Map<Integer, String> tm = new TreeMap<>();
        //add key value pairs
        tm.put(1, "boys");
        tm.put(3, "dogs");
        tm.put(5, "girls");
        tm.put(4, "teens");
        tm.put(2, "cats");

        System.out.println("The TreeMap orders the elements naturaly: " + tm);
        System.out.println("");
        //use iterator
        Set<Integer> setKeys = tm.keySet();
        Iterator<Integer> iter = setKeys.iterator();
        
        while(iter.hasNext()) {
            int rank = iter.next();
            String type = tm.get(rank);
            
             System.out.println(type + " = " + rank);
        }
        
        System.out.println("");

    }

}
