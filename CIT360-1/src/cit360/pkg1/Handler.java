package cit360.pkg1;

import java.util.*;

/**
 *
 * @author jennings
 */
public class Handler {

    public Handler() {

    }

    public void handle(String op, int num1, int num2) {

        HashMap<String, ChooseMessage> comands = new HashMap<>();

        comands.put("+", new Add() {
        });
        comands.put("-", new Sub() {
        });
        comands.put("*", new Mult() {
        });
        comands.put("/", new Div() {
        });

        ChooseMessage doit = comands.get(op);

        doit.choose(num1, num2);
    }
}
