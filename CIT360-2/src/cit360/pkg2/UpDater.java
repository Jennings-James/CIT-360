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
public class UpDater extends Thread {
    private Counter counts;
    
    public UpDater (Counter counts) {
        this.counts = counts;
    }
    
    public void run() {
        try {
            Thread.sleep(100);
        }catch (InterruptedException ex) { ex.printStackTrace(); }
        
        counts.increment();
    }
}
