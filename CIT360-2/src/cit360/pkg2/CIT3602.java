/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.pkg2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author jennings
 */
public class CIT3602 {

    public CIT3602() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        SomeMath go = new SomeMath();
        go.value();

        System.out.println("THIS ENDS: SomeMath");
        System.out.println("");
       
        for (int i = 0; i < 5; i++) {
            Runnable task = new SomeMath2();
            Thread t = new Thread(task);
            t.start();
        }
        
        System.out.println("THIS ENDS: SomeMath2");
        System.out.println("");

        ExecutorService pool = Executors.newCachedThreadPool();

        pool.execute(new SomeMath3());
        pool.execute(new SomeMath3());
        pool.execute(new SomeMath3());

        pool.shutdown();
        
        System.out.println("THIS ENDS: SomeMath3");
        System.out.println("");
        
        ThreadTester test = new ThreadTester();
        test.tester();
        
        System.out.println("THIS ENDS: AtomicExample");
    }
}
