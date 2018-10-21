package cit360.pkg1;

/**
 *
 * @author jennings
 */
public abstract class Mult implements ChooseMessage {

    @Override
    public void choose(int num1, int num2) {
        Integer tot = num1 * num2;
        DisplayMessage.displayMessage(tot);
    }

}
