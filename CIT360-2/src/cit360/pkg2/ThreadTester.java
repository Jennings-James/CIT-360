/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.pkg2;

/**
 *
 * @author jennings
 */
public class ThreadTester {
    static final int NUMBER_THREADS = 100;
    
    public void tester() throws InterruptedException {
        Counter counts = new Counter();
        System.out.println("Initial Counter = " + counts.get());
        
        UpDater[] threads = new UpDater[NUMBER_THREADS];
        
        for (int i = 0; i < NUMBER_THREADS; i++) {
            threads[i] = new UpDater(counts);
            threads[i].start();
        }
        
        for (int i = 0; i < NUMBER_THREADS; i++) {
            threads[i].join();
        }
        System.out.println("Final Counter = " + counts.get());
    }
    
}
