/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.pkg1;

import java.util.*;

/**
 *
 * @author jennings
 */
public class DisplayMessage {

    public DisplayMessage() {

    }

    public static void displayMessage(int tot) {
        ArrayList<String> messages = new ArrayList<>();

        messages.add("Think good thoughts");
        messages.add("Have a great day");
        messages.add("Keep the faith");
        messages.add("Love one another");
        messages.add("Do a good turn");
        messages.add("Make someone smile");
        messages.add("Smile!");
        messages.add("Take a walk");
        messages.add("Love your family");
        messages.add("Look for good in others");

        if (tot < -40) {
            System.out.println(messages.get(0));
        } else if (tot < -30) {
            System.out.println(messages.get(1));
        } else if (tot < -20) {
            System.out.println(messages.get(2));
        } else if (tot < -10) {
            System.out.println(messages.get(3));
        } else if (tot < 0) {
            System.out.println(messages.get(4));
        } else if (tot < 10) {
            System.out.println(messages.get(5));
        } else if (tot < 20) {
            System.out.println(messages.get(6));
        } else if (tot < 30) {
            System.out.println(messages.get(7));
        } else if (tot < 40) {
            System.out.println(messages.get(8));
        } else if (tot > 50) {
            System.out.println(messages.get(9));
        } else {
            System.out.println(messages.get(5));
        }
    }
}
