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
public class Words {

    private String aWord;
    private String cow = "cow";

    public Words(String word) {
        aWord = word;

    }

    public String compareWords() {
        if (aWord == cow) {
            System.out.println(aWord + " = cow");
        } else {
            System.out.println(aWord + " != cow");
        }
        return aWord;
    }
}
