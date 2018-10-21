/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.pkg1;

/**
 *
 * @author jennings
 */
public abstract class Sub implements ChooseMessage {

    @Override
    public void choose(int num1, int num2) {
        Integer tot = num1 - num2;
        DisplayMessage.displayMessage(tot);

    }

}
