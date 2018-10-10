package cit360.pkg1;

import java.util.Scanner;

/**
 *
 * @author jennings
 */
public class CIT3601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1;
        int num2;
        String op;

        Scanner in = new Scanner(System.in);

        System.out.println("This is a special calculator give it a try");
        System.out.println("");

        System.out.println("Please enter a number: ");
        num1 = Integer.parseInt(in.nextLine());
        System.out.println("Please enter an operation(+, -, *, /): ");
        op = in.nextLine();
        System.out.println("Please enter a second number: ");
        num2 = Integer.parseInt(in.nextLine());

        System.out.println(num1 + " " + op + " " + num2 + " = ");
        Handler handleIt = new Handler();
        handleIt.handle(op, num1, num2);
    }

}
