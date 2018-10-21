/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.pkg2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jennings
 */
public class SomeMath extends Thread {

    /*Random number generator outputs a random between the 2 ints passed to it*/
    private static final Random randomGenerator = new Random();

    private static int randomInRange(int min, int max) {
        return randomGenerator.nextInt((max - min) + 1) + min;
    }

    int sum;
    int total = 0;
    ArrayList<Integer> ar = new ArrayList<>();

    public void value() {

        ar.add(3);
        ar.add(4);
        ar.add(8);
        ar.add(75);
        ar.add(65);
        ar.add(9);
        ar.add(1);
        ar.add(19);
        ar.add(32);
        ar.add(20);

        run();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            
            sum = ar.get(randomInRange(0, 9)) + ar.get(randomInRange(0, 9));
            total = total + sum;
            System.out.println(total);
            System.out.println("Thread Id: " + getName());
            System.out.println("Thread Id: " + Thread.currentThread().getName());
        }
        System.out.println("This ends SomeMath Thread: " + Thread.currentThread().getName());
        System.out.println("");
    }
}
