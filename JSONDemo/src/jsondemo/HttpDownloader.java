package jsondemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
 
public class HttpDownloader {
 
    public void downLoader() {
        String fileURL = "https://raw.githubusercontent.com/Jennings-James/Hello-World/master/myVehicle1.json";
        String saveDir = "F:/Download/";
        try {
            HttpDownloadUtility.downloadFile(fileURL, saveDir);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
