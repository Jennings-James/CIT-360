
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jennings
 */
public class Handler {
    
    public Handler() {
        
    }
    
    public void handle(String button) {
        
        HashMap<String, ChooseAction> select = new HashMap<>();
        
        select.put("button1", new DisplayById() {
        });
        select.put("button2", new SearchVehicle() {
        });
        select.put("button3", new MarkSold() {
        });
        select.put("button4", new AddUpdateVehicle() {
        });
        select.put("button5", new RemoveVehicle() {
        });
        select.put("button6", new ManageUser() {
        });
        
        ChooseAction doit = select.get(button);
        
        doit.choose();
    }
}
