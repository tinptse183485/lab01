/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action_service;

import data_objects.HotelDao;
import action_service.tool;
import business_objects.Hotel;
import data_objects.File;
import data_objects.IFile;
import data_objects.IHotelDao;
import java.util.ArrayList;
import java.util.Scanner;


public class Service {

    IHotelDao ht = new HotelDao();
    String filepath = "C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Hotel_Management\file.txt";
    File f = new File();

    public Service() {
    }

    /**
     * ADD HOTEL
     */
    public void func1() {

        int tmp = 1;
        while (tmp == 1) {
            if (ht.addHotel() == true) {
                System.out.println("Adding successfully");
                f.writeObjectToFile(filepath, ht);
            } else {
                System.out.println("Adding unsucessfully");
            }
            System.out.println("add continue:1 // back to menu: other");
            Scanner sc = new Scanner(System.in);
            tmp = sc.nextInt();
        }
    }

    /**
     * CHECK EXIST
     */
    public void func2() {
        if (ht.existHotel(tool.getString("Enter ID", "Invalid ID"))) {
            System.out.println("Exist hotel");
        } else {
            System.out.println("No Hotel Found");
        }
    }
    
    public void func3() {
        
    }

}
