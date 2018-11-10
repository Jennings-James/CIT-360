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
public class FileProcessController {
    
    static VehicleModel model = new VehicleModel();
    private VehicleView view;

    public FileProcessController() {
        //this.model = VehicleController.model;
        this.view = VehicleController.view;
    }
    
     public void processFile() {
            HttpDownloader download = new HttpDownloader();
            download.downLoader();
            VehicleController cont = new VehicleController(model,view);
            cont.useVehicleFile();
            cont.updateView();
    }
}
