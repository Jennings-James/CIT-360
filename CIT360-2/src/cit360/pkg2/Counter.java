/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.pkg2;

import java.util.concurrent.atomic.*;

/**
 *
 * @author jennings
 */
public class Counter {
    
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }
    
    public void deincrement() {
        count.decrementAndGet();
    }
    
    public int get() {
        return count.get();
    }
}
