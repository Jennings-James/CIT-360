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
public class VehicleController {

    public static VehicleModel model;
    public static VehicleView view;

    public VehicleController(VehicleModel model, VehicleView view) {

        this.model = model;
        this.view = view;
    }

    public void setVehicleMake(String make) {
        model.setMake(make);
    }

    public String getVehicleMake() {
        return model.getMake();
    }

    public void setVehicleLine(String line) {
        model.setLine(line);
    }

    public String getVehicleLine() {
        return model.getLine();
    }

    public void setVehicleYear(String year) {
        model.setYear(year);
    }

    public String getVehicleYear() {
        return model.getYear();
    }

    public void setVehicleMiles(String miles) {
        model.setMiles(miles);
    }

    public String getVehicleMiles() {
        return model.getMiles();
    }

    public void setVehicleColor(String color) {
        model.setColor(color);
    }

    public String getVehicleColor() {
        return model.getColor();
    }

    public void updateView() {
        view.printVehicleDetails(model.getMake(), model.getLine(),
                model.getYear(), model.getMiles(), model.getColor());
    }
    /*
    public void updateView2() {
        view.printVehicleDetails(model.getMake(), model.getLine(),
                model.getYear(), model.getMiles(), model.getColor());
    }
    */
    public void makeVehicleFile() {
        VehicleModel makeFile = new VehicleModel();
        makeFile.makeVehicleFile();

    }
    
    public void useVehicleFile() {
        VehicleModel mod = FileProcessController.model;
        mod.readVehicleFile("F:/Download/myVehicle1.json");
    }
}
