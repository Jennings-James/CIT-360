/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsondemo;

import java.util.Scanner;

/**
 *
 * @author jennings
 */
public class VehicleView {

    String option;
   
    Scanner scanner = new Scanner(System.in);
     
    public void printVehicleDetails(String vehicleMake, String vehicleModel,
            String vehicleYear, String vehicleMiles, String vehicleColor) {

        System.out.println("Vehicle: ");
        System.out.println("Make: " + vehicleMake);
        System.out.println("Model: " + vehicleModel);
        System.out.println("Year: " + vehicleYear);
        System.out.println("Miles: " + vehicleMiles);
        System.out.println("Color: " + vehicleColor);
        System.out.println("");
        
        System.out.println("Would you like to download a vehicle file from "
                + "the GitHub?  Y/N");
        option = scanner.next();
        if("y".equals(option) | "Y".equals(option)) {
            FileProcessController process = new FileProcessController();
            process.processFile();    
        }
        else {
            System.out.println("Thanks for playing");
        }
    }
   
}
