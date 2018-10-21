/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatedemo;

import StudentServices.StudentInfo;



/**
 *
 * @author jennings
 */
public class HibernateDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String message = StudentInfo.addStudent();
        System.out.println(message);
        
        String nmessage = StudentInfo.getStudent();
        System.out.println(nmessage);
    }
        
}
