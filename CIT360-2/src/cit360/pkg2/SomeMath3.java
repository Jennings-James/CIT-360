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
public class SomeMath3 implements Runnable {

    /*Random number generator outputs a random between the 2 ints passed to it*/
    private static final Random randomGenerator = new Random();

    private static int randomInRange(int min, int max) {
        return randomGenerator.nextInt((max - min) + 1) + min;
    }

    int sum;
    int total = 0;
    ArrayList<Integer> arl = new ArrayList<>();

    @Override
    public void run() {

        arl.add(3);
        arl.add(4);
        arl.add(8);
        arl.add(75);
        arl.add(65);
        arl.add(9);
        arl.add(1);
        arl.add(19);
        arl.add(32);
        arl.add(20);

        for (int i = 0; i < 10; i++) {

            sum = arl.get(randomInRange(0, 9)) + arl.get(randomInRange(0, 9));
            total = total + sum;
            System.out.println(total + " Thread Id: " + Thread.currentThread().getName());
        }
        System.out.println("This ends SomeMath3 Thread: " + Thread.currentThread().getName());
        System.out.println("");

    }
}
