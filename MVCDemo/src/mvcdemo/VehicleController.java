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
public class VehicleController {

    private VehicleModel model;
    private VehicleView view;

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

    public void setVehicleYear(int year) {
        model.setYear(year);
    }

    public int getVehicleYear() {
        return model.getYear();
    }

    public void setVehicleMiles(int miles) {
        model.setMiles(miles);
    }

    public int getVehicleMiles() {
        return model.getMiles();
    }

    public void updateView() {
        view.printVehicleDetails(model.getMake(), model.getLine(),
                model.getYear(), model.getMiles());
    }
}
