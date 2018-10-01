/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT360.Control;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author jennings
 */
public class SetDemo {

    public SetDemo() {

    }

    public void set() {
        // make a list of ints
        List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
        System.out.println(listNumbers);

        // make a hashset from the list of ints
        Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
        System.out.println(uniqueNumbers);

        // find even numbers in the hashset
        Set<Integer> uniqueOddNums = listNumbers.stream()
                .filter(number -> number % 2 != 0).collect(Collectors.toSet());
        System.out.println(uniqueOddNums);
        System.out.println("");

        //create some TeamMember objects using the TeamMember constructor
        TeamMember a = new TeamMember("Tom", 15, 1);
        TeamMember b = new TeamMember("Joe", 26, 2);
        TeamMember c = new TeamMember("George", 17, 3);
        TeamMember d = new TeamMember("Jason", 12, 4);
        TeamMember e = new TeamMember("Andy", 20, 5);

        //create a hash set of type TeamMember
        Set<TeamMember> tm = new HashSet<>();

        tm.add(a);
        tm.add(b);
        tm.add(c);
        tm.add(d);
        tm.add(e);
        
        System.out.println("print out the team roster.");
               
        //use Iterator
        Iterator<TeamMember> it = tm.iterator();
        while (it.hasNext()) {
            TeamMember mem = it.next();
            System.out.println("name " + mem.name);
            System.out.println("number " + mem.number);
            System.out.println("rank " + mem.rank);
        }
        System.out.println("");
        //create a LinkedHashSet
        Set<TeamMember> tm2 = new LinkedHashSet<>();
        
        tm2.add(a);
        tm2.add(b);
        tm2.add(c);
        tm2.add(d);
        tm2.add(e);
        
        System.out.println("print out the team2 roster.");
               
        //use Iterator
        Iterator<TeamMember> ite = tm2.iterator();
        while (ite.hasNext()) {
            TeamMember mem2 = ite.next();
            System.out.println("name " + mem2.name);
            System.out.println("number " + mem2.number);
            System.out.println("rank " + mem2.rank);
        }
        System.out.println("Note that they are listed by rank 1-5 because that"
                + " is how they go into the list");
        System.out.println("");
    }

}
