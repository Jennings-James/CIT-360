/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsondemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author jennings
 */
public class VehicleModel {

    private String make;
    private String line;
    private String year;
    private String miles;
    private String color;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String makeVehicleFile() {

        JSONObject obj = new JSONObject();

        obj.put("Make", make);
        obj.put("Model", line);
        obj.put("Year", year);
        obj.put("Miles", miles);
        obj.put("Color", color);

        try (FileWriter file = new FileWriter("myVehicle.json")) {
            file.write(obj.toString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        String message = "Vehicle saved!";
        return message;
    }

    public void readVehicleFile(String fileName) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader(fileName));
            JSONObject jsonObject = (JSONObject) obj;

            setMake((String) jsonObject.get("Make"));
            setLine((String) jsonObject.get("Model"));
            setYear((String) jsonObject.get("Year"));
            setMiles((String) jsonObject.get("Miles"));
            setColor((String) jsonObject.get("Color"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
