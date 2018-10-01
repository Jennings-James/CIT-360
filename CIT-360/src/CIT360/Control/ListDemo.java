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
public class ListDemo {

    public ListDemo() {

    }

    public void list() {

        //create an arraylist of type string
        ArrayList<String> ar = new ArrayList<>();

        //add some strings
        ar.add("dog");
        ar.add("cat");
        ar.add("cow");
        ar.add("fish");
        ar.add("bird");
        ar.add("duck");

        System.out.println(ar);//print ar
        System.out.println("");

        //iterate with a for loop
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        System.out.println("");

        //create a new arraylist of ints
        ArrayList<Integer> ar2 = new ArrayList<>();

        //use a for loop to put some ints into the list
        for (int i = 2; i < 100; i++) {
            ar2.add(i);
        }
        System.out.println("ArrayList 2 contains: " + ar2);
        System.out.println("");

        // print out a value using an index
        System.out.println(ar2.get(15));
        System.out.println("");

        //remove some of the numbers
        for (int i = 2; i < 25; i++) {
            ar2.remove(i);
        }// NOT SURE WHY BUT THIS IS REMOVING EVER OTHER ELEMENT FROM THE LIST?
        System.out.println("ArrayList 2 now contains: " + ar2);
        System.out.println("WHY DID THIS REMOVE ONLY THE EVEN NUMBERS?? 22, 24, 26...");
        System.out.println("");

        // make some team members using the TeamMember constructor
        TeamMember a = new TeamMember("Jim", 25, 3);
        TeamMember b = new TeamMember("fred", 27, 5);
        TeamMember c = new TeamMember("Jhon", 21, 2);
        TeamMember d = new TeamMember("Jhon", 30, 7);

        //create arraylist of type TeamMember
        ArrayList<TeamMember> team = new ArrayList<>();

        team.add(a);
        team.add(b);
        team.add(c);
        team.add(d);

        // use iterator
        Iterator<TeamMember> ite = team.iterator();
        while (ite.hasNext()) {
            TeamMember mem = ite.next();
            System.out.println("name " + mem.name);
            System.out.println("number " + mem.number);
            System.out.println("rank " + mem.rank);
        }

    }

}
