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
public class Square {

    private double sidelength;

    public Square(double len) {
        sidelength = len;
    }

    public double area() {
        return sidelength * sidelength;
    }

    public double perimeter() {
        return sidelength * 4;
    }
}
