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
public class QueueDemo {

    public QueueDemo() {

    }

    public void queue() {

        //create a queue
        Queue<Double> nums = new LinkedList<>();
        //add elements to nums
        nums.add(12.3);
        nums.add(15.5);
        nums.add(22.8);
        nums.add(2.5);
        nums.add(7.9);

        nums.forEach((value) -> {
            System.out.println(value);
        });
        System.out.println("");
        System.out.println("Before the loop nums is: " + nums);
        System.out.println("");
        int sze = nums.size();
        double tot = 0;
        for (int i = 0; i < sze; i++) {
            double val = nums.poll();
            tot += val;
            System.out.println("The sum of the elements polled is: " + tot);
            System.out.println("");
            System.out.println("After this iteration of the loop nums is: " + nums);
            System.out.println("");
        }
        System.out.println("The average is: " + tot / sze);

        System.out.println("");
        System.out.println("nums is empty: " + nums.isEmpty());
        System.out.println("");
    }
}
