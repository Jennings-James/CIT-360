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
public class MakeList {

    private int[] list;

    public MakeList(int a, int b, int c, int d, int e) {
        this.list = new int[]{a, b, c, d, e};
    }

    public int[] someNums() {
        for (int i = 0; i < list.length; i++) {
            System.out.println("list: " + list[i]);
        }
        return list;
    }
}
