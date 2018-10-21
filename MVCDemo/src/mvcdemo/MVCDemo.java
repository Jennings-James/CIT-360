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
public class MVCDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        VehicleModel model = retriveVehicleFromDatabase();

        VehicleView view = new VehicleView();

        VehicleController controller = new VehicleController(model, view);

        controller.updateView();

        controller.setVehicleMake("Honda");
        controller.setVehicleLine("Civic");
        controller.setVehicleYear(1999);
        controller.setVehicleMiles(150000);

        controller.updateView();
    }

    private static VehicleModel retriveVehicleFromDatabase() {
        VehicleModel vehicle = new VehicleModel();
        vehicle.setMake("Ford");
        vehicle.setLine("Fusion");
        vehicle.setYear(2018);
        vehicle.setMiles(25000);
        return vehicle;
    }
}
