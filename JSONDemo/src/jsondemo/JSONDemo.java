/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsondemo;

/**
 *
 * @author jennings
 */
public class JSONDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        VehicleInputView input = new VehicleInputView();
        input.vehicleinput();

        //VehicleModel read = new VehicleModel();
        //read.readVehicleFile();
        VehicleModel model = retriveVehicleFromFile();

        VehicleView view = new VehicleView();

        VehicleController controller = new VehicleController(model, view);

        controller.updateView();

    }

    private static VehicleModel retriveVehicleFromFile() {
        VehicleModel vehicle = new VehicleModel();
        vehicle.readVehicleFile("myVehicle.json");
        vehicle.getMake();
        vehicle.getLine();
        vehicle.getYear();
        vehicle.getMiles();
        return vehicle;
    }

}
