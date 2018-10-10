package cit360.pkg1;

/**
 *
 * @author jennings
 */
public abstract class Mult implements ChooseMessage {

    @Override
    public void choose(Integer num1, Integer num2) {
        Integer tot = num1 * num2;
        DisplayMessage.displayMessage(tot);
    }

}
