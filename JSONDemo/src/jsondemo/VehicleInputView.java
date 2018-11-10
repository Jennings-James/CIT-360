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
public class VehicleInputView {

    public void vehicleinput() {

        String make;
        String line;
        String year;
        String miles;
        String color;
        

        VehicleModel model = new VehicleModel();
        VehicleView view = new VehicleView();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter data to store a vehicle\n");
        System.out.println("Make?");
        make = scanner.next();

        System.out.println("Model?");
        line = scanner.next();

        System.out.println("Enter The Two Digit Year");
        year = scanner.next();

        System.out.println("Enter Miles No Tenths");
        miles = scanner.next();

        System.out.println("Color");
        color = scanner.next();
        
        System.out.println("");
        System.out.println("");

        VehicleController controller = new VehicleController(model, view);
        
       

        controller.setVehicleMake(make);
        controller.setVehicleLine(line);
        controller.setVehicleMiles(miles);
        controller.setVehicleYear(year);
        controller.setVehicleColor(color);

        model.makeVehicleFile();
        
        System.out.println(model.makeVehicleFile());
        System.out.println("");
        System.out.println("The Vehicle you entered and saved is:");
        
        
    }
}
