/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcdemo;

/**
 *
 * @author jennings
 */
public class VehicleView {

    public void printVehicleDetails(String vehicleMake, String vehicleModel,
            int vehicleYear, int vehicleMiles) {

        System.out.println("Vehicle: ");
        System.out.println("Make: " + vehicleMake);
        System.out.println("Model: " + vehicleModel);
        System.out.println("Year: " + vehicleYear);
        System.out.println("Miles: " + vehicleMiles);
        System.out.println("");
    }
}
