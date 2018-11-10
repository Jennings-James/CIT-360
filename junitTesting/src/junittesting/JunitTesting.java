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
public class JunitTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public void truth() {
        Truth t = new Truth(5);
        t.findTruth();
    }

    public void square() {
        Square s = new Square(5);
        s.area();
        s.perimeter();
    }

    public void makeList() {
        MakeList l = new MakeList(2, 4, 3, 6, 5);
        l.someNums();

    }

    public void words() {
        Words word = new Words("cow");
        word.compareWords();
    }
}
