/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT360.Control;

import CIT360.Model.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author jennings
 */
public class SetDemoControl {

    public SetDemoControl() {

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

        makeATeam();
    }

    public void makeATeam() {
        //create a hash set of type TeamMemberModel
        Set<TeamMemberModel> tm = new HashSet<>();

        tm.add(new TeamMemberModel("Tom", 15, 1));
        tm.add(new TeamMemberModel("Joe", 26, 2));
        tm.add(new TeamMemberModel("George", 17, 3));
        tm.add(new TeamMemberModel("Jason", 12, 4));
        tm.add(new TeamMemberModel("Andy", 20, 5));

        System.out.println("print out the team roster.");

        //use Iterator
        Iterator<TeamMemberModel> it = tm.iterator();
        while (it.hasNext()) {
            TeamMemberModel mem = it.next();
            System.out.println("name " + mem.getName());
            System.out.println("number " + mem.getNumber());
            System.out.println("rank " + mem.getRank());
        }
        System.out.println("");
        //create a LinkedHashSet
        Set<TeamMemberModel> tm2 = new LinkedHashSet<>();

        tm2.add(new TeamMemberModel("Tom", 15, 1));
        tm2.add(new TeamMemberModel("Joe", 26, 2));
        tm2.add(new TeamMemberModel("George", 17, 3));
        tm2.add(new TeamMemberModel("Jason", 12, 4));
        tm2.add(new TeamMemberModel("Andy", 20, 5));

        System.out.println("print out the team2 roster.");

        //use Iterator
        Iterator<TeamMemberModel> ite = tm2.iterator();
        while (ite.hasNext()) {
            TeamMemberModel mem2 = ite.next();
            System.out.println("name " + mem2.getName());
            System.out.println("number " + mem2.getNumber());
            System.out.println("rank " + mem2.getRank());
        }
        System.out.println("Note that they are listed by rank 1-5 because that"
                + " is how they go into the list");
        System.out.println("");
    }

}
