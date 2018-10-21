package cit360.pkg1;

/**
 *
 * @author jennings
 */
public abstract class Div implements ChooseMessage {

    @Override
    public void choose(int num1, int num2) {
        if (num2 != 0) {
            Integer tot = num1 / num2;
            DisplayMessage.displayMessage(tot);
        } else {
            System.out.println("Sorry can not divide by zero");
        }
    }

}
