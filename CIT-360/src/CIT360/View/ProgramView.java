/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT360.View;

import CIT360.View.*;
import CIT360.Control.*;
import java.util.Scanner;

/**
 *
 * @author jennings
 */
public class ProgramView {

    String message;

    public ProgramView() {

        message = "Type the letter of the example to run.\n"
                + "\n"
                + "A-The List Demo\n"
                + "B-The Set Demo\n"
                + "C-The Map Demo\n"
                + "D-The Queue Demo\n"
                + "E-The Tree Demo\n"
                + ""
                + "Z-Exit";

    }

    /**
     * Get the user's input. Keep prompting them until they enter a value.
     *
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a
     * return key)
     * @return
     */
    protected String getUserInput(String prompt, boolean allowEmpty) {

        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputReceived = false;

        while (inputReceived == false) {

            System.out.println(prompt);
            input = keyboard.nextLine();

            // Make sure we avoid a null-pointer error.
            if (input == null) {
                input = "";
            }

            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();

            if (input.equals("") == false || allowEmpty == true) {
                inputReceived = true;
            }
        }

        return input;
    }

    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we
     * don't have to type it ourselves.
     *
     * @param prompt
     * @return
     */
    protected String getUserInput(String prompt) {
        return getUserInput(prompt, false);
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Pick the example you wish to see.");

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs) {

        switch (inputs[0].trim().toUpperCase()) {
            case "A":
                listDemo();
                break;
            case "B":
                setDemo();
                break;
            case "C":
                mapDemo();
                break;
            case "D":
                queueDemo();
                break;
            case "E":
                treeDemo();
                break;
            case "Z":
                System.out.println("See Ya");
                return false;
        }
        return true;
    }

    /**
     * Control this view's display/prompt/action loop until the user chooses and
     * action that causes this view to close.
     */
    public void displayView() {

        boolean keepGoing = true;

        while (keepGoing == true) {

            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }

    //Define the action handeler here.
    private void listDemo() {
        ListDemoControl demo = new ListDemoControl();
        demo.list();
    }

    private void setDemo() {
        SetDemoControl demo = new SetDemoControl();
        demo.set();
    }

    private void mapDemo() {
        MapDemoControl demo = new MapDemoControl();
        demo.map();
    }

    private void queueDemo() {
        QueueDemoControl demo = new QueueDemoControl();
        demo.queue();
    }

    private void treeDemo() {
        TreeDemoControl demo = new TreeDemoControl();
        demo.tree();
    }
}
