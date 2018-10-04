/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT360.Model;
import java.util.*;
/**
 *
 * @author jennings
 */
public class TeamMember {
    
    public TeamMember() {
        super();
    }

    private String name;
    private int number;
    private int rank;

    public TeamMember(String name, int number, int rank) {
        this.name = name;
        this.number = number;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    
}