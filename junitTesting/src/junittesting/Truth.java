/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittesting;

/**
 *
 * @author jennings
 */
public class Truth {

    private int number;
    private boolean ans;

    public Truth(int num) {
        number = num;
    }

    public boolean findTruth() {
        ans = number > 0;
        return ans;
    }
}
